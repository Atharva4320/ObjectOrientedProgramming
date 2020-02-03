import static org.junit.Assert.*;
import org.junit.Test;

import java.util.LinkedList;

// Brandon Snapperman, Atharva Dikshit

public class Examples {

// Rugby Section_____________________________________________________________________________
    RugbyTeam rugbyTeam_1 = new RugbyTeam("USA", "red, white, and blue", true, 8, 2);
    RugbyTeam rugbyTeam_2 = new RugbyTeam("Spain", "orange", false, 8, 6);
    RugbyTeam rugbyTeam_3 = new RugbyTeam("Russia", "red", true, 8, 6);
    RugbyTeam rugbyTeam_4 = new RugbyTeam("U.K.", "black", false, 8, 6);
    RugbyTeam rugbyTeam_5 = new RugbyTeam("Mexico", "brown", true, 8, 6);
    RugbyTeam rugbyTeam_6 = new RugbyTeam("India", "green", false, 8, 6);
    RugbyTeam rugbyTeam_7 = new RugbyTeam("Canada", "red and white", true, 8, 6);
    RugbyTeam rugbyTeam_8 = new RugbyTeam("China", "maroon", false, 8, 6);
// Round 1
    RugbyResult rugbyResult_1R1 = new RugbyResult(rugbyTeam_1, rugbyTeam_2, 15.2, 10.5);
    RugbyResult rugbyResult_2R1 = new RugbyResult(rugbyTeam_3, rugbyTeam_4, 15.2, 10.5);
    RugbyResult rugbyResult_3R1 = new RugbyResult(rugbyTeam_5, rugbyTeam_6, 15.2, 10.5);
    RugbyResult rugbyResult_4R1 = new RugbyResult(rugbyTeam_7, rugbyTeam_8, 15.2, 10.5);

    Match rugbyMatch_1R1 = new Match(rugbyTeam_1, rugbyTeam_2, rugbyResult_1R1);
    Match rugbyMatch_2R1 = new Match(rugbyTeam_3, rugbyTeam_4, rugbyResult_2R1);
    Match rugbyMatch_3R1 = new Match(rugbyTeam_5, rugbyTeam_6, rugbyResult_3R1);
    Match rugbyMatch_4R1 = new Match(rugbyTeam_7, rugbyTeam_8, rugbyResult_4R1);
// Round 2
    RugbyResult rugbyResult_1R2 = new RugbyResult(rugbyTeam_1, rugbyTeam_3, 15.2, 10.5);
    RugbyResult rugbyResult_2R2 = new RugbyResult(rugbyTeam_5, rugbyTeam_7, 15.2, 10.5);

    Match rugbyMatch_1R2 = new Match(rugbyTeam_1, rugbyTeam_3, rugbyResult_1R2);
    Match rugbyMatch_2R2 = new Match(rugbyTeam_5, rugbyTeam_7, rugbyResult_2R2);
// Round 3
    RugbyResult rugbyResult_1R3 = new RugbyResult(rugbyTeam_1, rugbyTeam_5, 15.2, 10.5);

    Match rugbyMatch_1R3 = new Match(rugbyTeam_1, rugbyTeam_5, rugbyResult_1R3);

// Robotics Section_________________________________________________________________________________
    RoboticsTeam robotsTeam_1 = new RoboticsTeam("WPI","goat cheese", 7);
    RoboticsTeam robotsTeam_2 = new RoboticsTeam("MIT","paper and glasses", 3);
    RoboticsTeam robotsTeam_3 = new RoboticsTeam("MERSER","football", 7);
    RoboticsTeam robotsTeam_4 = new RoboticsTeam("NYU","pizza", 3);
    RoboticsTeam robotsTeam_5 = new RoboticsTeam("YALE","british", 7);
    RoboticsTeam robotsTeam_6 = new RoboticsTeam("RIT","floating building", 3);
    RoboticsTeam robotsTeam_7 = new RoboticsTeam("Hardvard","lawer", 7);
    RoboticsTeam robotsTeam_8 = new RoboticsTeam("Clemson","tiger", 3);

    // Round 1
    RoboticsResult robotsResult_1R1 = new RoboticsResult(robotsTeam_1, robotsTeam_2, 10, 5, false, 3.2, 2, true);
    RoboticsResult robotsResult_2R1 = new RoboticsResult(robotsTeam_3, robotsTeam_4, 10, 5, true, 3.2, 2, false);
    RoboticsResult robotsResult_3R1 = new RoboticsResult(robotsTeam_5, robotsTeam_6, 10, 5, false, 3.2, 2, true);
    RoboticsResult robotsResult_4R1 = new RoboticsResult(robotsTeam_7, robotsTeam_8, 10, 5, true, 3.2, 2, false);

    Match roboticsMatch_1R1 = new Match(robotsTeam_1, robotsTeam_2, robotsResult_1R1);
    Match roboticsMatch_2R1 = new Match(robotsTeam_3, robotsTeam_4, robotsResult_2R1);
    Match roboticsMatch_3R1 = new Match(robotsTeam_5, robotsTeam_6, robotsResult_3R1);
    Match roboticsMatch_4R1 = new Match(robotsTeam_7, robotsTeam_8, robotsResult_4R1);
    // Round 2
    RoboticsResult robotsResult_1R2 = new RoboticsResult(robotsTeam_1, robotsTeam_3, 10, 5, false, 3.2, 2, true);
    RoboticsResult robotsResult_2R2 = new RoboticsResult(robotsTeam_5, robotsTeam_7, 10, 5, true, 3.2, 2, false);

    Match roboticsMatch_1R2 = new Match(robotsTeam_1, robotsTeam_3, robotsResult_1R2);
    Match roboticsMatch_2R2 = new Match(robotsTeam_5, robotsTeam_7, robotsResult_2R2);
    // Round 3
    RoboticsResult robotsResult_1R3 = new RoboticsResult(robotsTeam_1, robotsTeam_5, 10, 5, false, 3.2, 2, true);

    Match roboticsMatch_1R3 = new Match(robotsTeam_1, robotsTeam_5, robotsResult_1R3);

    // this is the way to make your list data
    LinkedList<Match> roboticsMatchesR1 = new LinkedList<Match>();
    LinkedList<Match> roboticsMatchesR2 = new LinkedList<Match>();
    LinkedList<Match> roboticsMatchesR3 = new LinkedList<Match>();
    LinkedList<IContestant> roboticsWinnersOfR1Matches = new LinkedList<IContestant>();
    LinkedList<IContestant> roboticsWinnersOfR2Matches = new LinkedList<IContestant>();
    LinkedList<IContestant> roboticsWinnersOfR3Matches = new LinkedList<IContestant>();
    LinkedList<IWinner> roboticsRoundsList = new LinkedList<IWinner>();
// Rugby Section_____________________________________________________________________________
    // this is the way to make your list data
    LinkedList<Match> rugbyMatchesR1 = new LinkedList<Match>();
    LinkedList<Match> rugbyMatchesR2 = new LinkedList<Match>();
    LinkedList<Match> rugbyMatchesR3 = new LinkedList<Match>();
    LinkedList<IContestant> rugbyWinnersOfR1Matches = new LinkedList<IContestant>();
    LinkedList<IContestant> rugbyWinnersOfR2Matches = new LinkedList<IContestant>();
    LinkedList<IContestant> rugbyWinnersOfR3Matches = new LinkedList<IContestant>();
    LinkedList<IWinner> rugbyRoundsList = new LinkedList<IWinner>();
    public Examples(){

        roboticsMatchesR1.add(roboticsMatch_1R1);
        roboticsMatchesR1.add(roboticsMatch_2R1);
        roboticsMatchesR1.add(roboticsMatch_3R1);
        roboticsMatchesR1.add(roboticsMatch_4R1);

        roboticsMatchesR2.add(roboticsMatch_1R2);
        roboticsMatchesR2.add(roboticsMatch_2R2);

        roboticsMatchesR3.add(roboticsMatch_1R3);

        roboticsWinnersOfR1Matches.add(robotsTeam_1);
        roboticsWinnersOfR1Matches.add(robotsTeam_3);
        roboticsWinnersOfR1Matches.add(robotsTeam_5);
        roboticsWinnersOfR1Matches.add(robotsTeam_7);

        roboticsWinnersOfR2Matches.add(robotsTeam_1);
        roboticsWinnersOfR2Matches.add(robotsTeam_5);

        roboticsWinnersOfR3Matches.add(robotsTeam_1);

        roboticsR1iR = new InitRound(roboticsMatchesR1);
        roboticsR2aR = new AdvancedRound(roboticsMatchesR2, roboticsWinnersOfR1Matches);
        roboticsR3aR = new AdvancedRound(roboticsMatchesR3, roboticsWinnersOfR2Matches);

        roboticsRoundsList.add(roboticsR1iR);
        roboticsRoundsList.add(roboticsR2aR);
        roboticsRoundsList.add(roboticsR3aR);
// Rugby Section_____________________________________________________________________________

        rugbyMatchesR1.add(rugbyMatch_1R1);
        rugbyMatchesR1.add(rugbyMatch_2R1);
        rugbyMatchesR1.add(rugbyMatch_3R1);
        rugbyMatchesR1.add(rugbyMatch_4R1);

        rugbyMatchesR2.add(rugbyMatch_1R2);
        rugbyMatchesR2.add(rugbyMatch_2R2);

        rugbyMatchesR3.add(rugbyMatch_1R3);

        rugbyWinnersOfR1Matches.add(rugbyTeam_1);
        rugbyWinnersOfR1Matches.add(rugbyTeam_3);
        rugbyWinnersOfR1Matches.add(rugbyTeam_5);
        rugbyWinnersOfR1Matches.add(rugbyTeam_7);

        rugbyWinnersOfR2Matches.add(rugbyTeam_1);
        rugbyWinnersOfR2Matches.add(rugbyTeam_5);

        rugbyWinnersOfR3Matches.add(rugbyTeam_1);

        rugbyR1iR = new InitRound(rugbyMatchesR1);
        rugbyR2aR = new AdvancedRound(rugbyMatchesR2, rugbyWinnersOfR1Matches);
        rugbyR3aR = new AdvancedRound(rugbyMatchesR3, rugbyWinnersOfR2Matches);

        rugbyRoundsList.add(rugbyR1iR);
        rugbyRoundsList.add(rugbyR2aR);
        rugbyRoundsList.add(rugbyR3aR);

         roboticsTournament = new Tournament(roboticsRoundsList);

         rugbyTournament = new Tournament(rugbyRoundsList);

//=====================================================================================================
// For Examples part 2


    }

    InitRound roboticsR1iR;
    AdvancedRound roboticsR2aR;
    AdvancedRound roboticsR3aR;
    Tournament roboticsTournament;

    InitRound rugbyR1iR;
    AdvancedRound rugbyR2aR;
    AdvancedRound rugbyR3aR;
    Tournament rugbyTournament;

// Robotics Section_____________________________________________________________________________
    //finalWinnerIsValid for Robotics
    @Test
    public void testRobotics1TrueFinalWinnerIsValid(){assertTrue(roboticsTournament.finalWinnerIsValid(robotsTeam_1));}
    @Test
    public void testRobotics2TrueFinalWinnerIsValid(){assertTrue(roboticsTournament.finalWinnerIsValid(robotsTeam_5));}
    @Test
    public void testRobotics3FalseFinalWinnerIsValid(){assertFalse(roboticsTournament.finalWinnerIsValid(robotsTeam_2));}

    //isWinner for Robotics
    @Test
    public void testRoboticsRound1TrueIsWinner(){assertTrue(roboticsR1iR.isWinner(robotsTeam_1));}
    @Test
    public void testRoboticsRound1FalseIsWinner(){assertFalse(roboticsR1iR.isWinner(robotsTeam_2));}
    @Test
    public void testRoboticsRound2True1IsWinner(){assertTrue(roboticsR2aR.isWinner(robotsTeam_1));}
    @Test
    public void testRoboticsRound2True2IsWinner(){assertTrue(roboticsR2aR.isWinner(robotsTeam_3));}
    @Test
    public void testRoboticsRound2FalseIsWinner(){assertFalse(roboticsR2aR.isWinner(robotsTeam_2));}
    @Test
    public void testRoboticsRound3True1IsWinner(){assertTrue(roboticsR3aR.isWinner(robotsTeam_1));}
    @Test
    public void testRoboticsRound3True2IsWinner(){assertTrue(roboticsR3aR.isWinner(robotsTeam_5));}
    @Test
    public void testRoboticsRound3FalseIsWinner(){assertFalse(roboticsR3aR.isWinner(robotsTeam_3));}

    //getMatchWinners for Robotics
    @Test
    public void testRoboticsRound3GetMatchWinners(){assertEquals(roboticsWinnersOfR3Matches, roboticsR3aR.getMatchWinners());}
    @Test
    public void testRoboticsRound2GetMatchWinners(){assertEquals(roboticsWinnersOfR2Matches, roboticsR2aR.getMatchWinners());}
    @Test
    public void testRoboticsRound1GetMatchWinners(){assertEquals(roboticsWinnersOfR1Matches, roboticsR1iR.getMatchWinners());}

    //getNumWinners for Robotics
    @Test
    public void testRoboticsRound3GetNumWinners(){assertEquals(1, roboticsR3aR.getNumWinners());}
    @Test
    public void testRoboticsRound2GetNumWinners(){assertEquals(2, roboticsR2aR.getNumWinners());}
    @Test
    public void testRoboticsRound1GetNumWinners(){assertEquals(4, roboticsR1iR.getNumWinners());}

// Rugby Section_____________________________________________________________________________
    //finalWinnerIsValid for Rugby
    @Test
    public void testRugby1TrueFinalWinnerIsValid(){assertTrue(rugbyTournament.finalWinnerIsValid(rugbyTeam_1));}
    @Test
    public void testRugby2TrueFinalWinnerIsValid(){assertTrue(rugbyTournament.finalWinnerIsValid(rugbyTeam_5));}
    @Test
    public void testRugby3FalseFinalWinnerIsValid(){assertFalse(rugbyTournament.finalWinnerIsValid(rugbyTeam_2));}

    //isWinner for Rugby
    @Test
    public void testRugbyRound1TrueIsWinner(){assertTrue(rugbyR1iR.isWinner(rugbyTeam_1));}
    @Test
    public void testRugbyRound1FalseIsWinner(){assertFalse(rugbyR1iR.isWinner(rugbyTeam_2));}
    @Test
    public void testRugbyRound2True1IsWinner(){assertTrue(rugbyR2aR.isWinner(rugbyTeam_1));}
    @Test
    public void testRugbyRound2True2IsWinner(){assertTrue(rugbyR2aR.isWinner(rugbyTeam_3));}
    @Test
    public void testRugbyRound2FalseIsWinner(){assertFalse(rugbyR2aR.isWinner(rugbyTeam_2));}
    @Test
    public void testRugbyRound3True1IsWinner(){assertTrue(rugbyR3aR.isWinner(rugbyTeam_1));}
    @Test
    public void testRugbyRound3True2IsWinner(){assertTrue(rugbyR3aR.isWinner(rugbyTeam_5));}
    @Test
    public void testRugbyRound3FalseIsWinner(){assertFalse(rugbyR3aR.isWinner(rugbyTeam_3));}

    //getMatchWinners for Rugby
    @Test
    public void testRugbyRound3GetMatchWinners(){assertEquals(rugbyWinnersOfR3Matches, rugbyR3aR.getMatchWinners());}
    @Test
    public void testRugbyRound2GetMatchWinners(){assertEquals(rugbyWinnersOfR2Matches, rugbyR2aR.getMatchWinners());}
    @Test
    public void testRugbyRound1GetMatchWinners(){assertEquals(rugbyWinnersOfR1Matches, rugbyR1iR.getMatchWinners());}

    //getNumWinners for Rugby
    @Test
    public void testRugbyRound3GetNumWinners(){assertEquals(1, rugbyR3aR.getNumWinners());}
    @Test
    public void testRugbyRound2GetNumWinners(){assertEquals(2, rugbyR2aR.getNumWinners());}
    @Test
    public void testRugbyRound1GetNumWinners(){assertEquals(4, rugbyR1iR.getNumWinners());}





    RugbyTeam rugbyTeam1 = new RugbyTeam("USA", "maroon", true, 8, 6);
    RugbyTeam rugbyTeam2 = new RugbyTeam("Spain", "yellow", true, 4, 6);
    RugbyTeam rugbyTeam3 = new RugbyTeam("Russia", "blue", false, 7, 6);
    RugbyTeam rugbyTeam4 = new RugbyTeam("UK", "white", false, 6, 6);

    RugbyResult rugbyResultCheck1 = new RugbyResult(rugbyTeam1, rugbyTeam2, 15.2,10.5);
    RugbyResult rugbyResultCheck2 = new RugbyResult(rugbyTeam2, rugbyTeam1, 10.5,15.2);
    RugbyResult rugbyResultCheck3 = new RugbyResult(rugbyTeam2, rugbyTeam3, 10.5,10.5);
    RugbyResult rugbyResultCheck4 = new RugbyResult(rugbyTeam3, rugbyTeam4, 15.2,0);
    RugbyResult rugbyResultCheck5 = new RugbyResult(rugbyTeam1, rugbyTeam2, 149.9,10.5);
    RugbyResult rugbyResultCheck6 = new RugbyResult(rugbyTeam3, rugbyTeam4, 160,10);
    RugbyResult rugbyResultCheck7 = new RugbyResult(rugbyTeam3, rugbyTeam4, 15,160);
    RugbyResult rugbyResultCheck8 = new RugbyResult(rugbyTeam3, rugbyTeam4, 160,160);
    RugbyResult rugbyResultCheck9 = new RugbyResult(rugbyTeam3, rugbyTeam4, 0,0);


    RoboticsTeam robotsTeam1 = new RoboticsTeam("WPI","goat cheese", 7);
    RoboticsTeam robotsTeam2 = new RoboticsTeam("MIT","paper and glasses", 3);
    RoboticsTeam robotsTeam3 = new RoboticsTeam("MERSER","football", 7);
    RoboticsTeam robotsTeam4 = new RoboticsTeam("NYU","pizza", 0);

    RoboticsResult robotsResultCheck1 = new RoboticsResult(robotsTeam1, robotsTeam2, 10, 5, false, 3.2, 2, false);
    RoboticsResult robotsResultCheck2 = new RoboticsResult(robotsTeam2, robotsTeam1, 3.2, 2, false, 10, 5, false);
    RoboticsResult robotsResultCheck3 = new RoboticsResult(robotsTeam1, robotsTeam2, 3.1, 5, true, 3.2, 2, false);
    //for testing isValid() method
    RoboticsResult robotsResultCheck4 = new RoboticsResult(robotsTeam1, robotsTeam2, 16, 7, true, 3.2, 2, false);
    RoboticsResult robotsResultCheck5 = new RoboticsResult(robotsTeam1, robotsTeam2, 3.1, 8, true, 3.2, 2, false);
    RoboticsResult robotsResultCheck6 = new RoboticsResult(robotsTeam1, robotsTeam2, 17, 7,true, 3.2, 2, false);
    RoboticsResult robotsResultCheck7 = new RoboticsResult(robotsTeam1, robotsTeam2, 17, 8, true, 3.2, 2, false);
    RoboticsResult robotsResultCheck8 = new RoboticsResult(robotsTeam1, robotsTeam2, 0, 0, true, 0, 0, false);
    RoboticsResult robotsResultCheck9 = new RoboticsResult(robotsTeam1, robotsTeam3, 10, 1, false, 10, 1, true);
    RoboticsResult robotsResultCheck10 = new RoboticsResult(robotsTeam1, robotsTeam3, 10, 1, false, 10, 1, false);


    Match rugbyMatchCheck1 = new Match(rugbyTeam1, rugbyTeam2, rugbyResultCheck1); // valid and first team(team1) wins
    Match rugbyMatchCheck2 = new Match(rugbyTeam2, rugbyTeam1, rugbyResultCheck2); // valid and second team(team1) wins
    Match rugbyMatchCheck3 = new Match(rugbyTeam3, rugbyTeam4, rugbyResultCheck6); // check valid to get null
    Match rugbyMatchCheck4 = new Match(rugbyTeam2, rugbyTeam3, rugbyResultCheck3); // check getScore with tie
    Match rugbyMatchCheck5 = new Match(rugbyTeam3, rugbyTeam4, rugbyResultCheck8); // check valid, getScore and null
    Match rugbyMatchCheck6 = new Match(rugbyTeam3, rugbyTeam4, rugbyResultCheck9); // check when all zero

    // 1, 2, 3, 6, 9
    Match robotsMatchCheck1 = new Match(robotsTeam1, robotsTeam2, robotsResultCheck1); // valid and team1 wins
    Match robotsMatchCheck2 = new Match(robotsTeam2, robotsTeam1, robotsResultCheck2); //
    Match robotsMatchCheck3 = new Match(robotsTeam1, robotsTeam2, robotsResultCheck3); //
    Match robotsMatchCheck4 = new Match(robotsTeam1, robotsTeam2, robotsResultCheck6); //
    Match robotsMatchCheck5 = new Match(robotsTeam1, robotsTeam3, robotsResultCheck9); //
    Match robotsMatchCheck6 = new Match(robotsTeam1, robotsTeam3, robotsResultCheck10);


    double tester = robotsResultCheck1.getScore(4.5, 5, false);
    double expectedVal = 9.5;


    //getScore for RBE
    @Test
    public void testGetScore() {assertEquals(expectedVal, tester, 0);} // this assertEquals compares the expected value and the
    //given value (the value made by the code) and if they are equal within the variation/deviation parameters set by the  delta value.

    //winner RBE
    @Test //RBE team1 vs team2. team1 wins
    public void testRBEResult1Winner() {assertEquals(robotsTeam1, robotsMatchCheck1.winner());}
    @Test //RBE team2 vs team1. team1 wins
    public void testRBEResult2Winner() {assertEquals(robotsTeam1, robotsMatchCheck2.winner());}
    @Test //RBE team1 vs team2. team2 wins
    public void testRBEResult3Winner() {assertEquals(robotsTeam2, robotsMatchCheck3.winner());}
    @Test //RBE team1 vs team2. team1 wins but invalid so null
    public void testRBEResult4Winner() {assertEquals(null, robotsMatchCheck4.winner());}
    @Test //RBE team1 vs team3. team1 wins
    public void testRBEResult5Winner() {assertEquals(robotsTeam1, robotsMatchCheck5.winner());}
    @Test //RBE team1 vs team3. tie so this returns the second team which in this case is team3
    public void testRBEResult6Winner() {assertEquals(robotsTeam3, robotsMatchCheck6.winner());}


    //winner Rug
    @Test //Rug team1 vs team2. team1 wins
    public void testRugResult1Winner() {assertEquals(rugbyTeam1, rugbyMatchCheck1.winner());}
    @Test //Rug team2 vs team1. team1 wins
    public void testRugResult2Winner() {assertEquals(rugbyTeam1, rugbyMatchCheck2.winner());}
    @Test //Rug team3 vs team4. team3 wins but invalid so null
    public void testRugResult3Winner() {assertEquals(null, rugbyMatchCheck3.winner());}
    @Test //Rug team3 vs team4. tie but the score make them invalid first so the code does not get to the getWinner.
    public void testRugResult5Winner() {assertEquals(null, rugbyMatchCheck5.winner());}
    @Test //Rug team2 vs team3. tie so this returns the second team which in this case is team3
    public void testRugResult4Winner() {assertEquals(rugbyTeam3, rugbyMatchCheck4.winner());}
    @Test //Rug team3 vs team4. tie so this returns the second team which in this case is team4
    public void testRugResult6Winner() {assertEquals(rugbyTeam4, rugbyMatchCheck6.winner());}


    //getWinner Rug
    @Test //Rug team1 vs team2. team1 wins
    public void testRugResult1GetWinner() {assertEquals(rugbyTeam1, rugbyResultCheck1.getWinner());}
    @Test //Rug team3 vs team4. team3 wins but technically team3 is not valid. This shows the limitations of the getWinner method.
    public void testRugResult6GetWinner() {assertEquals(rugbyTeam3, rugbyResultCheck6.getWinner());}
    @Test //Rug team2 vs team1. team1 wins
    public void testRugResult2GetWinner() {assertEquals(rugbyTeam1, rugbyResultCheck2.getWinner());}
    @Test //Rug team2 vs team3. tie so this returns the second team
    public void testRugResult3GetWinner() {assertEquals(rugbyTeam3, rugbyResultCheck3.getWinner());}

    //getWinner RBE
    @Test //RBE team1 vs team2. team1 wins
    public void testRBEResult1GetWinner() {assertEquals(robotsTeam1, robotsResultCheck1.getWinner());} // for this expectEquals it is
    // comparing the expected object to the object produced by the code you are testing
    @Test //RBE team1 vs team2. team1 wins but technically team1 is not valid. This shows the limitations of the getWinner method.
    public void testRBEResult6GetWinner() {assertEquals(robotsTeam1, robotsResultCheck6.getWinner());}
    @Test //RBE team2 vs team1. team1 wins
    public void testRBEResult2GetWinner() {assertEquals(robotsTeam1, robotsResultCheck2.getWinner());}
    @Test //RBE team1 vs team3. team1 wins because it did not fall
    public void testRBEResult9GetWinner() {assertEquals(robotsTeam1, robotsResultCheck9.getWinner());}
    @Test //RBE team1 vs team2. team2 wins because team1 fell if not team1 would have won
    public void testRBEResult3GetWinner() {assertEquals(robotsTeam2, robotsResultCheck3.getWinner());}
    @Test //RBE team1 vs team3. tie so this returns the second team which in this case is team3
    public void testRBEResult10GetWinner() {assertEquals(robotsTeam3, robotsResultCheck10.getWinner());}

    //expectToBeat Rug
    @Test //will team1 beat team2 yes because team1 has better track record
    public void testRugTrueBothHakaExpectToBeat() {assertTrue(rugbyTeam1.expectToBeat(rugbyTeam2));}
    @Test //will team1 beat team2 yes because team1 has haka
    public void testRugTrueOneHakaExpectToBeat() {assertTrue(rugbyTeam1.expectToBeat(rugbyTeam3));}
    @Test //will team2 loose team1 yes because team1 has haka
    public void testRugFalseOneHakaExpectToBeat() {assertFalse(rugbyTeam3.expectToBeat(rugbyTeam1));}
    @Test //will team3 beat team4 yes because team3 has better track record
    public void testRugTrueZeroHakaExpectToBeat() {assertTrue(rugbyTeam3.expectToBeat(rugbyTeam4));}
    @Test //will team4 loose team3 yes because team3 has better track record
    public void testRugFalseZeroHakaExpectToBeat() {assertFalse(rugbyTeam4.expectToBeat(rugbyTeam3));}

    //expectedToBeat RBE
    @Test //will team1 beat team2 yes because team1 has better track record
    public void testRBETrueT1winExpectToBeat() {assertTrue(robotsTeam1.expectToBeat(robotsTeam2));}
    @Test //will team2 loose team1 yes because team1 has better track record
    public void testRBEFalseT2looseExpectToBeat() {assertFalse(robotsTeam2.expectToBeat(robotsTeam1));}
    @Test //will team1 loose team3 not really because team1 and team3 have the same track record so unclear or false
    public void testRBEFalseDRAWExpectToBeat() {assertFalse(robotsTeam1.expectToBeat(robotsTeam3));}
    @Test //will team1 beat team4 yes because team1 has better track record. special because team4 has zero track record
    public void testRBETrueT4looseExpectToBeat() {assertTrue(robotsTeam1.expectToBeat(robotsTeam4));}

    //isValid for RBE
    @Test
    public void testRBEForTrueIsValid() {assertTrue(robotsResultCheck1.isValid());}
    @Test
    public void testRBEForTrueLimitIsValid() {assertTrue(robotsResultCheck4.isValid());}
    @Test
    public void testRBEForFalseTaskIsValid() {assertFalse(robotsResultCheck5.isValid());}
    @Test
    public void testRBEForFalsePointsIsValid() {assertFalse(robotsResultCheck6.isValid());}
    @Test
    public void testRBEForFalseBothIsValid() {assertFalse(robotsResultCheck7.isValid());}
    @Test
    public void testRBEForTrueBothZeroIsValid() {assertTrue(robotsResultCheck8.isValid());}

    //isValid for rugby
    @Test
    public void testRugForTrueNormalIsValid() {assertTrue(rugbyResultCheck1.isValid());}
    @Test
    public void testRugForTrueLimitIsValid() {assertTrue(rugbyResultCheck5.isValid());}
    @Test
    public void testRugForFalseSingleIsValid() {assertFalse(rugbyResultCheck7.isValid());}
    @Test
    public void testRugForFalseBothIsValid() {assertFalse(rugbyResultCheck8.isValid());}

    /* Rugby Team Examples */

    RugbyTeam WPIRugby = new RugbyTeam("WPI", "red", true, 7, 3);
    RugbyTeam MITRugby = new RugbyTeam("MIT", "blue", false, 6, 4);
    RugbyTeam KURugby = new RugbyTeam("KU", "black", false, 8, 2);
    RugbyTeam MBSRugby = new RugbyTeam("MBS", "grey", true, 9, 1);
    RugbyTeam invalidTeam1Rugby = new RugbyTeam("X", "brown", true, 1, 9);
    RugbyTeam invalidTeam2Rugby = new RugbyTeam("Y", "yellow", false, 6, 4);
    RugbyTeam RMARugby = new RugbyTeam("RMA","pink",true,7,3);
    RugbyTeam BARRugby = new RugbyTeam("BAR","Purple",true,7,3);
    RugbyTeam edgeRugbyTeam1 = new RugbyTeam("A","orange",false,4,6);
    RugbyTeam edgeRugbyTeam2 = new RugbyTeam("B","white",false,5,5);


    /*----------------------------------------------------------------------------------------------------------------*/

    /*Robotics Team Examples */

    RoboticsTeam WPIRobot = new RoboticsTeam("WPI","robotic arm", 9);
    RoboticsTeam MITRobot = new RoboticsTeam("MIT","water spray", 6);
    RoboticsTeam KURobot = new RoboticsTeam("KU","revolving cutter", 4);
    RoboticsTeam MBSRobot = new RoboticsTeam("MSB","4 bar linkage", 4);
    RoboticsTeam invalidTeam1Robotics = new RoboticsTeam("X","cutter", 1);
    RoboticsTeam invalidTeam2Robotics = new RoboticsTeam("Y","slicer", 4);
    /*----------------------------------------------------------------------------------------------------------------*/

    /* Rugby Result Examples */

    RugbyResult WPIvMIT_Rugby = new RugbyResult(WPIRugby, MITRugby, 16.4,12.8);
    RugbyResult MITvKU_Rugby= new RugbyResult(MITRugby, KURugby, 11.3,13);
    RugbyResult KUvMBS_Rugby = new RugbyResult(KURugby, MBSRugby, 13,11);
    RugbyResult MBSvWPI_Rugby = new RugbyResult(MBSRugby, WPIRugby, 10,13.8);
    RugbyResult invalidResultRugby = new RugbyResult (invalidTeam1Rugby, invalidTeam2Rugby,155,160);
    RugbyResult invalidResultRugby1 = new RugbyResult (invalidTeam1Rugby, invalidTeam2Rugby,140,160);
    RugbyResult invalidResultRugby2 = new RugbyResult (invalidTeam1Rugby, invalidTeam2Rugby,155,140);
    RugbyResult edgeRugbyResult1 = new RugbyResult (edgeRugbyTeam1, edgeRugbyTeam2,149,149.2);
    RugbyResult edgeRugbyResult2 = new RugbyResult (edgeRugbyTeam1, edgeRugbyTeam2,151,150.8);

    /*----------------------------------------------------------------------------------------------------------------*/

    /* Robotics Result Examples */

    RoboticsResult WPIvMIT_Robot = new RoboticsResult(WPIRobot, MITRobot, 9, 5, false, 6, 4, true);
    RoboticsResult MITvKU_Robot = new RoboticsResult(MITRobot, KURobot, 8, 5, true, 4, 3, false);
    RoboticsResult KUvMBS_Robot = new RoboticsResult(KURobot, MBSRobot, 7, 3, true, 7, 4, true);
    RoboticsResult MBSvWPI_Robot = new RoboticsResult(MBSRobot, WPIRobot, 6, 4, false, 8, 5, false);
    RoboticsResult invalidResultRobotics = new RoboticsResult(invalidTeam1Robotics, invalidTeam2Robotics, 4, 9, false, 28, 3, false);
    /*----------------------------------------------------------------------------------------------------------------*/

    /* Rugby Match Examples */

    Match WPIvMIT_RugbyMatch = new Match(WPIRugby, MITRugby, WPIvMIT_Rugby);
    Match MITvKU_RugbyMatch = new Match(MITRugby, KURugby, MITvKU_Rugby);
    Match KUvMBS_RugbyMatch = new Match(KURugby, MBSRugby, KUvMBS_Rugby);
    Match MBSvWPI_RugbyMatch = new Match(MBSRugby, WPIRugby, MBSvWPI_Rugby);
    Match invalidRugbyMatch = new Match(invalidTeam1Rugby,invalidTeam2Rugby,invalidResultRugby);

    /*----------------------------------------------------------------------------------------------------------------*/

    /* Robotics Match Examples */

    Match WPIvMIT_RobotMatch = new Match(WPIRobot, MITRobot, WPIvMIT_Robot);
    Match MITvKU_RobotMatch = new Match(MITRobot, KURobot, MITvKU_Robot);
    Match KUvMBS_RobotMatch = new Match(KURobot, MBSRobot, KUvMBS_Robot);
    Match MBSvWPI_RobotMatch = new Match(MBSRobot, WPIRobot, MBSvWPI_Robot);
    Match invalidRobotMatch = new Match (invalidTeam1Robotics,invalidTeam2Robotics,invalidResultRobotics);

    /*================================================================================================================*/

    /* TEST CASES */

    // isValid() Test Cases:-

    /* Rugby Team */
    @Test
    public void WPIvMITRugbyValidResult() {
        assertTrue(WPIvMIT_Rugby.isValid());
    }
    @Test
    public void MITvKURugbyValidResult() {
        assertTrue(MITvKU_Rugby.isValid());
    }
    @Test
    public void KUvMBSRugbyValidResult() {
        assertTrue(KUvMBS_Rugby.isValid());
    }
    @Test
    public void MBSvWPIRugbyValidResult() {
        assertTrue(MBSvWPI_Rugby.isValid());
    }
    @Test
    public void invalidRugbyResult() {
        assertFalse(invalidResultRugby.isValid());
    }
    @Test
    public void edgeCaseRugbyResult1() {
        assertTrue(edgeRugbyResult1.isValid());
    }
    @Test
    public void edgeCaseRugbyResult2() {
        assertFalse(edgeRugbyResult2.isValid());
    }

    /* Robotics Team */
    @Test
    public void WPIvMITRoboticsValidResults() {
        assertTrue(WPIvMIT_Robot.isValid());
    }
    @Test
    public void MITvKURoboticsValidResults() {
        assertTrue(MITvKU_Robot.isValid());
    }
    @Test
    public void KUvMBSRoboticsValidResults() {
        assertTrue(KUvMBS_Robot.isValid());
    }
    @Test
    public void MBSvWPIRoboticsValidResult() {
        assertTrue(MBSvWPI_Robot.isValid());
    }
    @Test
    public void invalidRoboticsResult() {
        assertFalse(invalidResultRobotics.isValid());
    }


    /*----------------------------------------------------------------------------------------------------------------*/

    // getScore() Test Cases:-

    @Test
    public void WPIvMITRoboticsScore_WPI() {
        assertEquals(14, WPIvMIT_Robot.getScore(9, 5, false), 0.1);
    }
    @Test
    public void WPIvMITRoboticsScore_MIT() {
        assertEquals(5, WPIvMIT_Robot.getScore(6, 4, true), 0.1);
    }
    @Test
    public void MITvKURoboticsScore_MIT() {
        assertEquals(8, MITvKU_Robot.getScore(8, 5, true), 0.1);
    }
    @Test
    public void MITVKURoboticsScore_KU() {
        assertEquals(7, MITvKU_Robot.getScore(4, 3, false), 0.1);
    }
    @Test
    public void KUvMBSRoboticsScore_KU() {
        assertEquals(5, KUvMBS_Robot.getScore(7, 3, true), 0.1);
    }
    @Test
    public void KUvMBSRoboticsScore_MBS() {
        assertEquals(6, KUvMBS_Robot.getScore(7, 4, true), 0.1);
    }
    @Test
    public void MBSvWPIRoboticsScore_MBS() {
        assertEquals(10, MBSvWPI_Robot.getScore(6, 4, false), 0.1);
    }
    @Test
    public void MBSvWPIRoboticsScore_WPI() {
        assertEquals(13, MBSvWPI_Robot.getScore(8, 5, false), 0.1);
    }
    /*----------------------------------------------------------------------------------------------------------------*/

    // getWinner() Test Cases:-

    /* Rugby Team */
    @Test
    public void WPIvMITRugbyWinner() {
        assertEquals(WPIRugby,WPIvMIT_Rugby.getWinner());
    }
    @Test
    public void MITvKURugbyWinner() {
        assertEquals(KURugby,MITvKU_Rugby.getWinner());
    }
    @Test
    public void KUvMBSRugbyWinner() {
        assertEquals(KURugby,KUvMBS_Rugby.getWinner());
    }
    @Test
    public void MBSvWPIRugbyWinner() {
        assertEquals(WPIRugby,MBSvWPI_Rugby.getWinner());
    }

    /* Robotics Team */
    @Test
    public void WPIvMITRoboticsWinner() {
        assertEquals(WPIRobot,WPIvMIT_Robot.getWinner());
    }
    /*@Test
      public void MITvKURoboticsWinner() {
        assertEquals(MITRobot,MITvKU_Robot.getWinner());
    }*/
    @Test
    public void KUvMBSRoboticsWinner() {
        assertEquals(MBSRobot,KUvMBS_Robot.getWinner());
    }
    @Test
    public void MBSvWPIRoboticsWinner() {
        assertEquals(WPIRobot,MBSvWPI_Robot.getWinner());
    }
    /*----------------------------------------------------------------------------------------------------------------*/

    // winner() Test Cases:-

    /* Rugby Team */
    @Test
    public void WPIvMITRugby_matchWinner() {
        assertEquals(WPIRugby,WPIvMIT_RugbyMatch.winner());
    }
    @Test
    public void MITvKURugby_matchWinner() {
        assertEquals(KURugby,MITvKU_RugbyMatch.winner());
    }
    @Test
    public void KUvMBSRugby_matchWinner() {
        assertEquals(KURugby,KUvMBS_RugbyMatch.winner());
    }
    @Test
    public void MBSvWPIRugby_matchWinner() {
        assertEquals(WPIRugby,MBSvWPI_RugbyMatch.winner());
    }
    @Test
    public void invalidRugby_matchWinner() {
        assertEquals(null,invalidRugbyMatch.winner());
    }

    /* Robotics Team */
    @Test
    public void WPIvMITRobotics_matchWinner() {
        assertEquals(WPIRobot,WPIvMIT_RobotMatch.winner());
    }
    /* @Test
     public void MITvKURobotics_matchWinner() {
         assertEquals(MITRobot,MITvKU_RobotMatch.winner());
     }*/
    @Test
    public void KUvMBSRobotics_matchWinner() {
        assertEquals(MBSRobot,KUvMBS_RobotMatch.winner());
    }
    @Test
    public void MBSvWPIRobotics_matchWinner() {
        assertEquals(WPIRobot,MBSvWPI_RobotMatch.winner());
    }
    @Test
    public void invalidRobotics_matchWinner() {
        assertEquals(null,invalidRobotMatch.winner());
    }
    /*----------------------------------------------------------------------------------------------------------------*/

    // expectToBeat() Test Cases:-

    /* Rugby Team */
    @Test
    public void WPIExpectedToBeatMITInRugby () {
        assertTrue(WPIRugby.expectToBeat(MITRugby));
    }
    @Test
    public void MITExpectedToBeatKUInRugby () {
        assertFalse(MITRugby.expectToBeat(KURugby));
    }
    @Test
    public void KUExpectedToBeatMBSInRugby () {
        assertFalse(KURugby.expectToBeat(MBSRugby));
    }
    @Test
    public void MBSExpectedToBeatWPIInRugby () {
        assertTrue(MBSRugby.expectToBeat(WPIRugby));
    }
    @Test
    public void RMAExpectedToBeatBARInRugby () {
        assertFalse(RMARugby.expectToBeat(BARRugby));
    }

    /* Robotics Team*/
    @Test
    public void WPIExpectedToBeatMITInRobotics () {
        assertTrue(WPIRobot.expectToBeat(MITRobot));
    }
    @Test
    public void KUExpectedToBeatMITInRobotics () {
        assertFalse(KURobot.expectToBeat(MITRobot));
    }
    @Test
    public void KUExpectedToBeatMBSInRobotics () {
        assertFalse(KURobot.expectToBeat(MBSRobot));
    }


}
