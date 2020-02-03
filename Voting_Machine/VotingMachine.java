import java.util.Scanner;

/**Class VotingMachine is an interactive piece of code that allows someone to vote in a election
 *
 */
public class VotingMachine {
    private Scanner keyboard;
    ElectionData eData;

    public VotingMachine(ElectionData eData) {
        keyboard = new Scanner(System.in);
        this.eData = eData;
    }

    /**Method screen is where the player is interacting with the voting machine
     * Takes in user input and runs it through the voting machine
     */
    public void screen() {
        //eData.printBallot();
        System.out.print("=====================================================================\n");
        System.out.println("Welcome to the Electronic Voting Ballot!");
        eData.printBallot();
        System.out.println("Please enter your first choice: ");
        String cand1 = keyboard.nextLine();
        System.out.println("You voted for " + cand1 + " as your first choice.");
        System.out.println("Please enter your second choice: ");
        String cand2 = keyboard.nextLine();
        System.out.println("You voted for " + cand2 + " as your second choice.");
        System.out.println("Please enter your third choice: ");
        String cand3 = keyboard.nextLine();
        System.out.println("You voted for " + cand3 + " a your third choice.");

        processVoteScreen(cand1, cand2, cand3);

/*
//==================================================================================================================
        //This segment of code allows the voting machine to recurse as many times as needed by user input

        System.out.println("Are you the last voter? (Please enter Y/N)");
        String ans = keyboard.next();
        if (ans.equals("Y") || ans.equals("y")) {
            if (eData.findWinnerMostPoints().equals("Runoff Required")) {
                System.out.println(eData.findWinnerMostPoints() + " Please vote one more time to help decide a winner.");
                keyboard.nextLine(); // we need this so that it will clear/ grab anything that was missed before hand
                screen();
            } else {
                System.out.println("Winner is: " + eData.findWinnerMostPoints());
            }
        } else {
            keyboard.nextLine(); // we need this so that it will clear/ grab anything that was missed before hand
            screen();
        }


 */



    }

    /**Method processVoteScreen takes in three String imputes from the player which make up one voting session, and imputes
     * them into the processVote method in ElectionData to process the vote. And it also catches all the thrown arguments
     * in try catch blocks.
     *
     * Takes in user input and runs it through the processVote method to register each vote and it will catch all the
     * exceptions thrown and try some material
     *
     * @param choice1 String
     * @param choice2 String
     * @param choice3 String
     */
    private void processVoteScreen(String choice1, String choice2, String choice3) {
        try {
            eData.processVote(choice1, choice2, choice3);
        } catch (UnknownCandidateException e) {
            System.out.println("Sorry, the candidate " + e.getUnknownCandidate() + " doesn't exist. Would you like to add " + e.getUnknownCandidate() + " to the ballot? (Please enter Y/N)");
            String answer = keyboard.next();
            if (answer.equals("Y") || answer.equals("y")) {
                try {
                    this.addWriteIn(e.getUnknownCandidate());
                    System.out.println("The Candidate " + e.getUnknownCandidate() + " is successfully added to the ballot");
                    this.processVoteScreen(choice1, choice2, choice3);

                } catch (CandidateExistsException ex) {
                    System.out.println("The Candidate " + ex.getCandidateExists() + " already exists in the ballot!");
                }
            } else {
                keyboard.nextLine(); // we need this so that it will clear/ grab anything that was missed before hand
                screen();
            }
        } catch (DuplicateVotesException e) {
            System.out.println("The candidate " + e.getDuplicateVotes() + " can not be voted for more than once!");
            //keyboard.nextLine(); // we need this so that it will clear/ grab anything that was missed before hand
            screen();
        }

    }

    /**Method addWriteIn takes in a String, a candidate's name, and it adds it to the ballot and HashMap of the
     * ElectionData object it is modifying.
     * @param candName
     * @throws CandidateExistsException
     */
    public void addWriteIn(String candName) throws CandidateExistsException {
        this.eData.addCandidate(candName);
    }
}