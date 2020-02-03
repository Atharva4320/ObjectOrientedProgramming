/** Class DuplicateVotesException
 * This class extends the built in java exception class and deals with the exception which arises when a
 * person votes more than once for the same candidate at one time.
 */
public class DuplicateVotesException extends Exception{

    private String duplicateCandidate;

    DuplicateVotesException(String duplicateCandidate){
        this.duplicateCandidate = duplicateCandidate;
    }

    /** Method getDuplicateVotes returns the name of the candidate for which the voter has casted multiple
     * votes for the same candidate.
     *
     * @return a String
     */
    public String getDuplicateVotes() {
        return duplicateCandidate;
    }
}