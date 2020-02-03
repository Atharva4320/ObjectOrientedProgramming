/** Class UnknownCandidateException
 * This class extends the built in java exception class and deals with the exception which arises when a
 * candidate does not exist in the voting ballot.
 */
public class UnknownCandidateException extends Exception {

    private String unknownCandidate;

    UnknownCandidateException(String unknownCandidate) {
        this.unknownCandidate = unknownCandidate;
    }

    /** Method getUnknownCandidate returns the name of the candidate which does not exist in the ballot.
     *
     * @return a String
     */
    public String getUnknownCandidate() {
        return unknownCandidate;
    }
}