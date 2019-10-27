import static org.junit.Assert.*;
import org.junit.Test;

public class Examples {

    public Examples(){}

    /* Rugby Team Examples */

    RugbyTeam WPIRugby = new RugbyTeam("WPI", "red", true, 7, 3);
    RugbyTeam MITRugby = new RugbyTeam("MIT", "blue", false, 6, 4);
    RugbyTeam KURugby = new RugbyTeam("KU", "black", false, 8, 2);
    RugbyTeam MBSRugby = new RugbyTeam("MBS", "grey", true, 9, 1);
    RugbyTeam invalidTeam1Rugby = new RugbyTeam("X", "brown", true, 1, 9);
    RugbyTeam invalidTeam2Rugby = new RugbyTeam("Y", "yellow", false, 6, 4);
    RugbyTeam RMARugby = new RugbyTeam("RMA","pink",true,7,3);
    RugbyTeam BARRugby = new RugbyTeam("BAR","Purple",true,7,3);

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
    Match MITvKU_RobotMatch = new Match(MITRugby, KURobot, MITvKU_Robot);
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

    /* Robotics Team*/
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

    /* Robotics Team*/
    @Test
    public void WPIvMITRoboticsWinner() {
        assertEquals(WPIRobot,WPIvMIT_Robot.getWinner());
    }
    @Test
    public void MITvKURoboticsWinner() {
        assertEquals(MITRobot,MITvKU_Robot.getWinner());
    }
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

    /* Rugby Team*/
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

    /* Robotics Team*/
    @Test
    public void WPIvMITRobotics_matchWinner() {
        assertEquals(WPIRobot,WPIvMIT_RobotMatch.winner());
    }
    @Test
    public void MITvKURobotics_matchWinner() {
        assertEquals(MITRobot,MITvKU_RobotMatch.winner());
    }
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

    /* Rugby Team*/
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

