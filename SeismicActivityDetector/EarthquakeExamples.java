import static org.junit.Assert.*;
import org.junit.Test;
import java.util.LinkedList;

// Brandon Snapperman, Atharva Dikshit
public class EarthquakeExamples {
    Earthquake1 E1 = new Earthquake1();
    Earthquake2 E2 = new Earthquake2();
    LinkedList<Double> noData = new LinkedList<Double>();
    LinkedList<Double> weirdData = new LinkedList<Double>();
    LinkedList<Double> dataInFront = new LinkedList<Double>();
    LinkedList<Double> dataInEnd = new LinkedList<Double>();
    LinkedList<Double> weirdEmpty = new LinkedList<Double>();
    LinkedList<Double> dateRepeat = new LinkedList<Double>();
    LinkedList<Double> badData = new LinkedList<Double>();
    LinkedList<MaxHzReport> NovReports = new LinkedList<MaxHzReport>();
    LinkedList<MaxHzReport> NovReports2 = new LinkedList<MaxHzReport>();
    LinkedList<MaxHzReport> NovReports3 = new LinkedList<MaxHzReport>();

    public EarthquakeExamples() {

        dataInEnd.add(20151013.0);
        dataInEnd.add(10.0);
        dataInEnd.add(5.0);
        dataInEnd.add(20151020.0);
        dataInEnd.add(40.0);
        dataInEnd.add(50.0);
        dataInEnd.add(45.0);
        dataInEnd.add(20151101.0);
        dataInEnd.add(6.0);

        dataInFront.add(20151101.0);
        dataInFront.add(6.0);
        dataInFront.add(20151013.0);
        dataInFront.add(10.0);
        dataInFront.add(5.0);
        dataInFront.add(20151020.0);
        dataInFront.add(40.0);
        dataInFront.add(50.0);
        dataInFront.add(45.0);

        weirdData.add(10.0);
        weirdData.add(20151013.0);
        weirdData.add(10.0);
        weirdData.add(5.0);
        weirdData.add(20151101.0);
        weirdData.add(6.0);
        weirdData.add(20151020.0);
        weirdData.add(40.0);
        weirdData.add(50.0);
        weirdData.add(45.0);

        weirdEmpty.add(10.0);
        weirdEmpty.add(20151013.0);
        weirdEmpty.add(10.0);
        weirdEmpty.add(5.0);
        weirdEmpty.add(20151020.0);
        weirdEmpty.add(40.0);
        weirdEmpty.add(50.0);
        weirdEmpty.add(45.0);

        dateRepeat.add(20151101.0);
        dateRepeat.add(10.0);
        dateRepeat.add(20151013.0);
        dateRepeat.add(10.0);
        dateRepeat.add(5.0);
        dateRepeat.add(20151020.0);
        dateRepeat.add(40.0);
        dateRepeat.add(50.0);
        dateRepeat.add(45.0);
        dateRepeat.add(20151101.0);
        dateRepeat.add(6.0);

        badData.add(20151013.0);
        badData.add(10.0);
        badData.add(5.0);
        badData.add(20151120.0);
        badData.add(-10.0);
        badData.add(40.0);
        badData.add(50.0);
        badData.add(45.0);
        badData.add(20151125.0);
        badData.add(6.0);

        NovReports.add(new MaxHzReport(20151101.0,6.0));

        NovReports2.add(new MaxHzReport(20151120.0,50.0));
        NovReports2.add(new MaxHzReport(20151125.0,6.0));
    }

    @Test
    public void instructorTestEQ() {
        assertEquals(NovReports, E1.dailyMaxForMonth(dataInEnd, 11));}
    @Test
    public void instructorTestEQ2() {
        assertEquals(NovReports, E2.dailyMaxForMonth(dataInEnd, 11));}

    @Test
    public void testdataInFront1() {
        assertEquals(NovReports, E1.dailyMaxForMonth(dataInFront, 11));}
    @Test
    public void testdataInFront2() {
        assertEquals(NovReports, E2.dailyMaxForMonth(dataInFront, 11));}

    @Test
    public void testweirdData1() {
        assertEquals(NovReports, E1.dailyMaxForMonth(weirdData, 11));}
    @Test
    public void testweirdData2() {
        assertEquals(NovReports, E2.dailyMaxForMonth(weirdData, 11));}

    @Test
    public void testweirdEmpty1() {
        assertEquals(NovReports3, E1.dailyMaxForMonth(weirdEmpty, 11));}
    @Test
    public void testweidEmpty2() {
        assertEquals(NovReports3, E2.dailyMaxForMonth(weirdEmpty, 11));}

    @Test
    public void testbadData1() {
        assertEquals(NovReports2, E1.dailyMaxForMonth(badData, 11));}
    @Test
    public void testbadData2() {
        assertEquals(NovReports2, E2.dailyMaxForMonth(badData, 11));}

}

//                                          SubTasks
/*
 * - find a date value
 * - confirm if the date is the correct month
 * - store the correct date
 * - find and store the biggest valid data reading for the correct date
 * - create a report object by using the stored: correct date and largest reading
 * - add the new report object to the list of report objects
 * - return the completed list of report objects
 *
 */