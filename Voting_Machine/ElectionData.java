import java.util.HashMap;
import java.util.LinkedList;

/** Class ElectionData handles operations needed to operate an election like processing votes
 *
 */
class ElectionData {
    private LinkedList<String> ballot = new LinkedList<String>();
    private LinkedList<LinkedList<String>> votes = new LinkedList<LinkedList<String>>();

    // HashMaps
    private HashMap<String, LinkedList<Integer>> candidateRankings = new HashMap<String, LinkedList<Integer>>(); // stores number of first choice votes for each candidates

    ElectionData() {

    }

    ElectionData(LinkedList<String> ballot, LinkedList<LinkedList<String>> votes, HashMap<String, LinkedList<Integer>> candidateRankings) {
        this.ballot = ballot;
        this.votes = votes;
        this.candidateRankings = candidateRankings;

    }

    /**Method printBallot prints out all the candidates in the ballot.
     *
     */
    public void printBallot() {
        System.out.println("The candidates are ");
        for (String s : ballot) {
            System.out.println(s);
        }
    }

    /**Method processVote takes in three strings, which represent votes, and adds the votes to the HashMap which keeps
     * track of the rankings. Also if any of the votes throw an error that is anticapated it will be thrown to another
     * place to be caught and resolved.
     *
     * @param choice1 String
     * @param choice2 String
     * @param choice3 String
     * @throws DuplicateVotesException if someone votes for the same candidate in more than one section throw
     * @throws UnknownCandidateException if the person being voted on doesn't exist in the ballot throw
     */
    public void processVote(String choice1, String choice2, String choice3) throws DuplicateVotesException, UnknownCandidateException {
        if (!ballot.contains(choice1)) {
            throw new UnknownCandidateException(choice1);
        }
        else if (!ballot.contains(choice2)) {
            throw new UnknownCandidateException(choice2);
        }
        else if (!ballot.contains(choice3)) {
            throw new UnknownCandidateException(choice3);
        }
        else if (choice1.equals(choice2) || choice1.equals(choice3)) {
            throw new DuplicateVotesException(choice1);
        }
        else if (choice2.equals(choice3) || choice2.equals(choice1)) {
            throw new DuplicateVotesException(choice2);
        }
        else if (choice3.equals(choice1) || choice3.equals(choice2)) {
            throw new DuplicateVotesException(choice3);
        }
        else if (!ballot.contains(choice1)) {
            throw new UnknownCandidateException(choice1);
        }
        else if (!ballot.contains(choice2)) {
            throw new UnknownCandidateException(choice2);
        }
        else if (!ballot.contains(choice3)) {
            throw new UnknownCandidateException(choice3);
        }

        this.candidateRankings.put(choice1, reRanking(choice1, 0));
        this.candidateRankings.put(choice2, reRanking(choice2, 1));
        this.candidateRankings.put(choice3, reRanking(choice3, 2));
    }

    /**Method reRanking takes in a String, part of a vote/candidate/key, and an Integer, which part of the vote/level of
     * preference, and produces a new LinkedList<Integer> which is an updated account of a candidate's vote data.
     *                                                             maybe put this word here>> 'total' ^
     * Method reRanking is a helper method for the processVote method
     *
     * @param aChoice String
     * @param numChoice int
     * @return LinkedList<Integer>
     */
    private LinkedList<Integer> reRanking(String aChoice, int numChoice) {
        LinkedList<Integer> ranking = new LinkedList<Integer>();

        for(int i = 0; i < this.candidateRankings.get(aChoice).size(); i++){
            if(numChoice==i){
                ranking.add(this.candidateRankings.get(aChoice).get(numChoice) + 1);
            }
            else {
                ranking.add(this.candidateRankings.get(aChoice).get(i));
            }
        }
        return ranking;
    }

    /**Method addCandidate takes in a String, a new candidate, and it adds it to the ballot and HashMap.
     *
     * @param candidate String
     * @throws CandidateExistsException
     */
    public void addCandidate(String candidate) throws CandidateExistsException {
        if (this.ballot.contains(candidate)) {
            throw new CandidateExistsException(candidate);
        } else {
            LinkedList<Integer> aNewLL = new LinkedList<Integer>();
            aNewLL.add(0);
            aNewLL.add(0);
            aNewLL.add(0);
            this.ballot.add(candidate);
            this.candidateRankings.put(candidate, aNewLL);
        }
    }

    /**Method findWinnerMostFirstVotes produces the candidate with more than 50% first choice votes, but if there is no
     * candidate up to scratch it will return 'Runoff Required'.
     *
     * @return String
     */
    public String findWinnerMostFirstVotes() {
        int sum = 0;
        for (String aCand : this.ballot) {
            sum += this.candidateRankings.get(aCand).get(0);
        }

        int fiftyPercent = sum / 2;
        for (String aCand : this.ballot) {
            if (this.candidateRankings.get(aCand).getFirst() > fiftyPercent) {
                return aCand;
            }
        }
        return "Runoff Required";
    }

    /**Method getPoints takes in a String, a candidate, and produces an Integer which is the candidate's final score.
     *
     * @param aCand String
     * @return int
     */
    private int getPoints(String aCand) {
        int tPoints = 0;
        tPoints = (this.candidateRankings.get(aCand).getFirst() * 3) + (this.candidateRankings.get(aCand).get(1) * 2) + (this.candidateRankings.get(aCand).get(2) * 1);
        return tPoints;
    }

    /**Method findWinnerMostPoints produces a String, the final winner candidate.
     *
     * @return String winner
     */
    public String findWinnerMostPoints() {
        String ans = ballot.getFirst();
        for (int i = 1; i < ballot.size(); i++) {
            if (getPoints(ans) <= getPoints(ballot.get(i))) {
                ans = ballot.get(i);
            }
        }
        return ans;
    }


}