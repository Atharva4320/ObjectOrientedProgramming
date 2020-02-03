/** Class CandidateExistsException
 * This class extends the built in java exception class and deals with the exception which arises when a
 * candidate already exists in the voting ballot.
 */
public class CandidateExistsException extends Exception{

    private String candidateExists;

    CandidateExistsException(String candidateExists){
        this.candidateExists = candidateExists;
    }
    CandidateExistsException(){}
    /** Method getCandidateExists returns the name of the candidate which already exists in the ballot.
     *
     * @return a String
     */
    public String getCandidateExists() {
        return candidateExists;
    }
}