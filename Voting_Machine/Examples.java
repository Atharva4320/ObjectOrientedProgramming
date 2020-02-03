import static org.junit.Assert.*;
import org.junit.Test;

// Brandon Snapperman, Atharva Dikshit
public class Examples {

    // method to set up a ballot and cast votes

    ElectionData ClearWinnerData() throws CandidateExistsException {
        ElectionData ED = new ElectionData();
        // put candidates on the ballot
        ED.addCandidate("gompei");
        ED.addCandidate("husky");
        ED.addCandidate("ziggy");
        // cast votes
        try {
            ED.processVote("gompei", "husky", "ziggy");
            ED.processVote("gompei", "ziggy", "husky");
            ED.processVote("husky", "gompei", "ziggy");

        } catch (Exception e) {}
        return(ED);
    }

    ElectionData ThreeWayTieData() throws CandidateExistsException {
        ElectionData ED = new ElectionData();
        // put candidates on the ballot
        ED.addCandidate("Bob");
        ED.addCandidate("Grey");
        ED.addCandidate("Harry");
        // cast votes
        try {
            ED.processVote("Bob", "Harry", "Grey");
            ED.processVote("Grey", "Bob", "Harry");
            ED.processVote("Harry", "Grey", "Bob");

        } catch (Exception e) {}
        return(ED);
    }

    ElectionData ThreeWayTieData2() throws CandidateExistsException {
        ElectionData ED = new ElectionData();
        // put candidates on the ballot
        ED.addCandidate("Bob");
        ED.addCandidate("Harry");
        ED.addCandidate("Grey");
        // cast votes
        try {
            ED.processVote("Bob", "Harry", "Grey");
            ED.processVote("Grey", "Bob", "Harry");
            ED.processVote("Harry", "Grey", "Bob");

        } catch (Exception e) {}
        return(ED);
    }

    ElectionData ThreeWayTieData3() throws CandidateExistsException {
        ElectionData ED = new ElectionData();
        // put candidates on the ballot
        ED.addCandidate("Grey");
        ED.addCandidate("Harry");
        ED.addCandidate("Bob");
        // cast votes
        try {
            ED.processVote("Bob", "Harry", "Grey");
            ED.processVote("Grey", "Bob", "Harry");
            ED.processVote("Harry", "Grey", "Bob");

        } catch (Exception e) {}
        return(ED);
    }

    ElectionData TwoWayTieData() throws CandidateExistsException {
        ElectionData ED = new ElectionData();
        // put candidates on the ballot
        ED.addCandidate("gompei");
        ED.addCandidate("husky");
        ED.addCandidate("ziggy");
        // cast votes
        try {
            ED.processVote("gompei", "husky", "ziggy");
            ED.processVote("husky", "gompei", "ziggy");

        } catch (Exception e) {}
        return(ED);
    }

    ElectionData TwoWayTieData2() throws CandidateExistsException {
        ElectionData ED = new ElectionData();
        // put candidates on the ballot
        ED.addCandidate("husky");
        ED.addCandidate("ziggy");
        ED.addCandidate("gompei");
        // cast votes
        try {
            ED.processVote("gompei", "husky", "ziggy");
            ED.processVote("husky", "gompei", "ziggy");

        } catch (Exception e) {}
        return(ED);
    }


// Tests findWinnerMostFirstVotes() method


    // tests output of findWinnerMostFirstVotes method if the data imported gives a clear winner
    @Test
    public void testMostFirstChoiceClearWinner () throws CandidateExistsException {
        assertEquals ("gompei", ClearWinnerData().findWinnerMostFirstVotes());
    }
    //  tests output of findWinnerMostFirstVotes method if there is a 3 way tie with all the Candidate with less than 50%
    @Test
    public void testMostFirstChoice3WayTie () throws CandidateExistsException {
        assertEquals ("Runoff Required", ThreeWayTieData().findWinnerMostFirstVotes());
    }
    // tests output of findWinnerMostFirstVotes method if there is a 2 way tie with all the Candidate at 50%
    @Test
    public void testMostFirstChoice2WayTie () throws CandidateExistsException {
        assertEquals ("Runoff Required", TwoWayTieData().findWinnerMostFirstVotes());
    }


// Tests findWinnerMostPoints method

     // tests output of findWinnerMostPoints method if there is a clear winner
    @Test
    public void testMostPointsClearWinner () throws CandidateExistsException {
        assertEquals ("gompei", ClearWinnerData().findWinnerMostPoints());
    }
    // tests output of findWinnerMostPoints method if there is a 3 way tie
    @Test
    public void testMostPoints3WayTie () throws CandidateExistsException {
        assertEquals ("Harry", ThreeWayTieData().findWinnerMostPoints());
    }
    //Same voting process as above but the order in which the candidates where added is different
    @Test
    public void testMostPoints3WayTie2 () throws CandidateExistsException {
        assertEquals ("Grey", ThreeWayTieData2().findWinnerMostPoints());
    }
    //Same voting process as above but the order in which the candidates where added is different
    @Test
    public void testMostPoints3WayTie3 () throws CandidateExistsException {
        assertEquals ("Bob", ThreeWayTieData3().findWinnerMostPoints());
    }
    // tests output of findWinnerMostPoints method if there is a 2 way tie
    @Test
    public void testMostPoints2WayTie () throws CandidateExistsException {
        assertEquals ("husky", TwoWayTieData().findWinnerMostPoints());
    }

    //Same voting process as above but the order in which the candidates where added is different
    @Test
    public void testMostPoints2WayTie2 () throws CandidateExistsException {
        assertEquals ("gompei", TwoWayTieData2().findWinnerMostPoints());
    }

//*************************************************************************************************************

// Tests for CandidateExistsException being thrown
    @Test(expected = CandidateExistsException.class)
    public void testCandExistExcep() throws CandidateExistsException{
        ThreeWayTieData().addCandidate("Bob");
    }

// Tests for DuplicateVotesException being thrown
    @Test(expected = DuplicateVotesException.class)
    public void testDupVoteExcep() throws DuplicateVotesException, CandidateExistsException, UnknownCandidateException {
        ThreeWayTieData().processVote("Bob", "Bob", "Grey");
    }

// Tests for UnknownCandidateException being thrown
    @Test(expected = UnknownCandidateException.class)
    public void testUnknownCandExcep() throws DuplicateVotesException, CandidateExistsException, UnknownCandidateException {
        ThreeWayTieData().processVote("John Doe", "Bob", "Grey");
    }



//**********************************************************************************************************************

//======================================================================================================================

    ElectionData Setup2() throws CandidateExistsException {
        ElectionData ED2 = new ElectionData();
        // put candidates on the ballot
        ED2.addCandidate("Bob");
        ED2.addCandidate("John");
        ED2.addCandidate("Henry");

        // cast votes

        try {
            ED2.processVote("Bob", "John", "Henry");
            ED2.processVote("John", "Bob", "Henry");
            ED2.processVote("Bob", "Henry", "John");
            ED2.processVote("Bob", "Henry", "John");
            ED2.processVote("Henry", "Bob", "John");
            ED2.processVote("Bob", "John", "Henry");
            ED2.processVote("Bob", "Henry", "John");
            ED2.processVote("John", "Bob", "Henry");
            ED2.processVote("John", "Henry", "Bob");
            ED2.processVote("Henry", "Bob", "John");


        } catch (Exception e) {
        }
        return (ED2);
    }

    // Tests for findMostFirstWinner() Method with Bob getting 50% of votes (as first choice), John getting 30% of votes
    // (as first choice), Harry getting 20% of votes (as first choice).
    @Test
    public void testForMostWinner2() throws CandidateExistsException {
        assertEquals("Runoff Required", Setup2().findWinnerMostFirstVotes());
    }

    // Tests for findWinnerMostPoints() Method with Bob getting the most points.
    @Test
    public void testForWinnerMostPoints2() throws CandidateExistsException {
        assertEquals("Bob", Setup2().findWinnerMostPoints());
    }
//======================================================================================================================

    ElectionData Setup3() throws CandidateExistsException {
        ElectionData ED3 = new ElectionData();
        // put candidates on the ballot
        ED3.addCandidate("Kelly");
        ED3.addCandidate("Ashley");
        ED3.addCandidate("Harry");

        // cast votes

        try {
            ED3.processVote("Ashley", "Kelly", "Harry");
            ED3.processVote("Harry", "Ashley", "Kelly");
            ED3.processVote("Kelly", "Harry", "Ashley");
            ED3.processVote("Ashley", "Kelly", "Harry");
            ED3.processVote("Ashley", "Kelly", "Harry");


        } catch (Exception e) {
        }
        return (ED3);
    }


    // Tests for findMostFirstWinner() Method with Ashley getting 60% of votes (as first choice), Kelly getting
    // 20% of votes (as first choice), Harry getting 20% of votes (as first choice).
    @Test
    public void testForMostWinner3() throws CandidateExistsException {
        assertEquals("Ashley", Setup3().findWinnerMostFirstVotes());
    }

    // Tests for findWinnerMostPoints() Method with Ashley getting the most points.
    @Test
    public void testForWinnerMostPoints3() throws CandidateExistsException {
        assertEquals("Ashley", Setup3().findWinnerMostPoints());
    }

//======================================================================================================================

    // SETUP 4 //

    ElectionData Setup4_1() throws CandidateExistsException {
        ElectionData ED3 = new ElectionData();
        // put candidates on the ballot
        ED3.addCandidate("Jackson");
        ED3.addCandidate("Peter");
        ED3.addCandidate("Aron");

        // cast votes

        try {
            ED3.processVote("Jackson", "Aron", "Peter");
            ED3.processVote("Peter", "Jackson", "Aron");
            ED3.processVote("Aron", "Peter", "Jackson");


        } catch (Exception e) {
        }
        return (ED3);
    }

    // Tests for findMostFirstWinner() Method with every candidate getting 1 vote as first choice.
    @Test
    public void testForMostWinner4() throws CandidateExistsException {
        assertEquals("Runoff Required", Setup4_1().findWinnerMostFirstVotes());
    }

    // Tests for findWinnerMostPoints () Method with all three candidates getting the same points.(Answer depends on
    // the order of the candidates in ballot).
    @Test
    public void testForMostPoints4_1() throws CandidateExistsException {
        assertEquals("Aron", Setup4_1().findWinnerMostPoints());
    }
//----------------------------------------------------------------------------------------------------------------------

    ElectionData Setup4_2() throws CandidateExistsException {
        ElectionData ED3 = new ElectionData();
        // put candidates on the ballot

        // Same candidates in ballot but in different order.
        ED3.addCandidate("Aron");
        ED3.addCandidate("Jackson");
        ED3.addCandidate("Peter");


        // cast votes

        try {
            ED3.processVote("Jackson", "Aron", "Peter");
            ED3.processVote("Peter", "Jackson", "Aron");
            ED3.processVote("Aron", "Peter", "Jackson");


        } catch (Exception e) {
        }
        return (ED3);
    }

    // Tests for findWinnerMostPoints () Method with all three candidates getting the same points.(Answer depends on
    // the order of the candidates in ballot).
    @Test
    public void testForMostPoints4_2() throws CandidateExistsException {
        assertEquals("Peter", Setup4_2().findWinnerMostPoints());
    }

    //------------------------------------------------------------------------------------------------------------------

    ElectionData Setup4_3() throws CandidateExistsException {
        ElectionData ED3 = new ElectionData();
        // put candidates on the ballot

        // Same candidates in ballot but in different order.
        ED3.addCandidate("Peter");
        ED3.addCandidate("Aron");
        ED3.addCandidate("Jackson");


        // cast votes

        try {
            ED3.processVote("Jackson", "Aron", "Peter");
            ED3.processVote("Peter", "Jackson", "Aron");
            ED3.processVote("Aron", "Peter", "Jackson");


        } catch (Exception e) {
        }
        return (ED3);
    }

    // Tests for findWinnerMostPoints () Method with all three candidates getting the same points.(Answer depends on the
    // order of the candidates in ballot).
    @Test
    public void testForMostPoints4_3() throws CandidateExistsException {
        assertEquals("Jackson", Setup4_3().findWinnerMostPoints());
    }
//======================================================================================================================

    // TESTS FOR EXCEPTIONS:


//  1) Tests for CandidateExistsExceptions Class:-

    // Tests addCandidate() Method and checks whether the method throws a CandidateExistsException exception.
    @Test(expected = CandidateExistsException.class)
    public void testIfBobAlreadyExistsInBallot() throws CandidateExistsException {
        Setup2().addCandidate("Bob");
    }

    // Tests addCandidate() Method and checks whether the method throws a CandidateExistsException exception.
    @Test(expected = CandidateExistsException.class)
    public void testIfAshleyAlreadyExistsInBallot() throws CandidateExistsException {
        Setup3().addCandidate("Ashley");
    }
//----------------------------------------------------------------------------------------------------------------------

//  2) Tests for UnknownCandidateException Class:-

    // Tests processVote() Method and checks whether the method throws a UnknownCandidateException exception.
    @Test(expected = UnknownCandidateException.class)
    public void testIfJackIsAnUnknownCandidate() throws CandidateExistsException,UnknownCandidateException,DuplicateVotesException {
        Setup2().processVote("Bob","John","Jack");
    }

    // Tests processVote() Method and checks whether the method throws a UnknownCandidateException exception.
    @Test(expected = UnknownCandidateException.class)
    public void testIfHeatherIsAnUnknownCandidate() throws CandidateExistsException,UnknownCandidateException,DuplicateVotesException {
        Setup3().processVote("Heather","Ashley","Kelly");
    }
//----------------------------------------------------------------------------------------------------------------------

//  3) Tests for DuplicateVoteException Class :-

    // Tests processVote() Method and checks whether the method throws a DuplicateVotesException exception.
    @Test(expected = DuplicateVotesException.class)
    public void testIfBobWasVotedTwice() throws CandidateExistsException,UnknownCandidateException,DuplicateVotesException {
        Setup2().processVote("Bob","John","Bob");
    }

    // Tests processVote() Method and checks whether the method throws a UnknownCandidateException exception.
    @Test(expected = DuplicateVotesException.class)
    public void testIfKellyWasVotedTwice() throws CandidateExistsException,UnknownCandidateException,DuplicateVotesException {
        Setup3().processVote("Kelly","Kelly","Ashley");
    }

//======================================================================================================================






    String CandExistExcepData() throws CandidateExistsException {
        ElectionData ED = new ElectionData();
        // put candidates on the ballot
        try {
            ED.addCandidate("Grey");
            ED.addCandidate("Harry");
            ED.addCandidate("Bob");
            ED.addCandidate("Harry");
        }
        catch (CandidateExistsException e){
            String a = "The Candidate " + e.getCandidateExists() + " already exists in the ballot!";
            System.out.println("The Candidate " + e.getCandidateExists() + " already exists in the ballot!");
            return a;
        }
        return "No exception thrown";
    }

    CandidateExistsException CandExistExcepData2() throws CandidateExistsException {
        ElectionData ED = new ElectionData();
        CandidateExistsException EDX = new CandidateExistsException();
        // put candidates on the ballot
        try {
            ED.addCandidate("Grey");
            ED.addCandidate("Harry");
            ED.addCandidate("Bob");
            ED.addCandidate("Harry");
        }
        catch (CandidateExistsException e){
            return e;
        }
        return EDX;
    }

    @Test
    public void testCandExistExcep1() throws CandidateExistsException {
        assertEquals ("The Candidate Harry already exists in the ballot!", CandExistExcepData());
    }

    @Test(expected = CandidateExistsException.class)
    public void testCandExistExcep2() throws CandidateExistsException
    {
        ElectionData ED = new ElectionData();
        ED.addCandidate("Grey");
        ED.addCandidate("Harry");
        ED.addCandidate("Bob");
        ED.addCandidate("Harry");
    }

}
