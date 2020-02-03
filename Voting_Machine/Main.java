/**
 * Class Main this class is used to just run the voting booth machine
 */
public class Main {

    public static void main(String[] args) throws CandidateExistsException, UnknownCandidateException, DuplicateVotesException {
        ElectionData ED2 = new ElectionData();
        // put candidates on the ballot
        /*
        ED2.addCandidate("Black Rabbit");
        ED2.addCandidate("Crystal Palace");
        ED2.addCandidate("Princess Bun Bun");

         */

        ED2.addCandidate("Bob");
        ED2.addCandidate("Henry");
        ED2.addCandidate("Jeff");

        VotingMachine player = new VotingMachine(ED2);
        player.screen();

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Winner: " + ED2.findWinnerMostPoints());

    }


}
