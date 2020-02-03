import static org.junit.Assert.*;
import org.junit.Test;

import java.util.GregorianCalendar;
import java.util.LinkedList;

// Brandon Snapperman, Atharva Dikshit

public class Examples {
// notes above each test to say what it tests for and add more test cases
    //like testing for empty on avg temp for the month and total monthly rainfall

    GregorianCalendar date1 = new GregorianCalendar(2019,3,24);
    GregorianCalendar date2 = new GregorianCalendar(2019,4,23);
    GregorianCalendar date3 = new GregorianCalendar(2019,5,24);
    GregorianCalendar date4 = new GregorianCalendar(2019,6,23);

    Time time1 = new Time (12,30);
    Time time2 = new Time (6,10);
    Time time3 = new Time (8,45);
    Time time4 = new Time (7,25);
    Time time5 = new Time (16,54);

    Time time6 = new Time (15,23);
    Time time7 = new Time (20,20);
    Time time8 = new Time (18,23);
    Time time9 = new Time (14,55);
    Time time10 = new Time (22,14);

    Reading reading1 = new Reading(time1,54,20);
    Reading reading2 = new Reading(time2,45,23);
    Reading reading3 = new Reading(time3,65,12);
    Reading reading4 = new Reading(time4,25,19);
    Reading reading5 = new Reading(time5,85,40);

    Reading reading6 = new Reading(time6,45,12);
    Reading reading7 = new Reading(time7,65,43);
    Reading reading8 = new Reading(time8,78,27);
    Reading reading9 = new Reading(time9,73,18);
    Reading reading10 = new Reading(time10,42,53);

    Reading duplicate1 = new Reading (time4, 37,49); // Correct readings with duplicate time
    Reading duplicate2 = new Reading (time8, 29,56); // Correct readings with duplicate time

    Reading invReadings1 = new Reading(time1,-128,34);// Incorrect readings
    Reading invReadings2 = new Reading(time3,0,550);// Incorrect readings
    Reading invReadings3 = new Reading(time5,140,1000);// Incorrect readings

    Reading invReadings4 = new Reading(time7,-130,34);// Incorrect readings
    Reading invReadings5 = new Reading(time9,24,850);// Incorrect readings


    LinkedList<DailyWeatherReport> report1 = new LinkedList<DailyWeatherReport>();
    LinkedList<DailyWeatherReport> report100 = new LinkedList<DailyWeatherReport>();

    LinkedList<DailyWeatherReport> report11 = new LinkedList<DailyWeatherReport>();


    ISet report10 = new LLDailyReport(report1);
    ISet report101 = new LLDailyReport(report100);

    LinkedList <Reading> readingList1 = new LinkedList<Reading>(); // List with good data
    LinkedList <Reading> readingList2 = new LinkedList<Reading>(); // List with good data

    LinkedList <Reading> emptyList = new LinkedList<Reading>(); // Empty list

    LinkedList <Reading> duplicateReadingsL1 = new LinkedList<Reading>(); // List with duplicate data
    LinkedList <Reading> duplicateReadingsL2 = new LinkedList<Reading>(); // List with duplicate data

    LinkedList <Reading> allReadingList1 = new LinkedList<Reading>(); // List with both good and bad readings
    LinkedList <Reading> allReadingList2 = new LinkedList<Reading>(); // List with both good and bad readings

    LinkedList <Reading> incorrectReadingList1 = new LinkedList<Reading>(); // List with invalid and duplicate  readings
    LinkedList <Reading> incorrectReadingList2 = new LinkedList<Reading>(); // List with invalid and duplicate readings

    WeatherMonitor WM1 = new WeatherMonitor(report10);
    WeatherMonitor WM100 = new WeatherMonitor(report101);

    LinkedList <Reading> correctList1 = new LinkedList<Reading>();
    LinkedList <Reading> correctList2 = new LinkedList<Reading>();





    LinkedList<DailyWeatherReport> report12 = new LinkedList<DailyWeatherReport>();
    LinkedList<DailyWeatherReport> report20 = new LinkedList<DailyWeatherReport>();

    GregorianCalendar date10 = new GregorianCalendar(2016, 11, 17);

    ISet listReport11 = new LLDailyReport(report12);
    ISet listReport20 = new LLDailyReport(report20);

    LinkedList <Reading> readingList12 = new LinkedList<Reading>();
    LinkedList <Reading> readingList22 = new LinkedList<Reading>();
    LinkedList <Reading> readingList3 = new LinkedList<Reading>();

    WeatherMonitor WM10 = new WeatherMonitor(listReport11);

    LinkedList<Double> temps1 = new LinkedList<Double>();
    LinkedList<Double> rain1 = new LinkedList<Double>();

    public Examples() {
        readingList1.add(reading1); // adding reading1 to LinkedList (readingList1).
        readingList1.add(reading2); // adding reading2 to LinkedList (readingList1).
        readingList1.add(reading3); // adding reading3 to LinkedList (readingList1).
        readingList1.add(reading4); // adding reading4 to LinkedList (readingList1).
        readingList1.add(reading5); // adding reading5 to LinkedList (readingList1).

        readingList2.add(reading6); // adding reading6 to LinkedList (readingList2).
        readingList2.add(reading7); // adding reading7 to LinkedList (readingList2).
        readingList2.add(reading8); // adding reading8 to LinkedList (readingList2).
        readingList2.add(reading9); // adding reading9 to LinkedList (readingList2).
        readingList2.add(reading10); // adding reading10 to LinkedList (readingList2).

        duplicateReadingsL1.add(reading1); // adding reading1 to LinkedList (duplicateReadingsL1).
        duplicateReadingsL1.add(reading2); // adding reading2 to LinkedList (duplicateReadingsL1).
        duplicateReadingsL1.add(reading3); // adding reading3 to LinkedList (duplicateReadingsL1).
        duplicateReadingsL1.add(reading4); // adding reading4 to LinkedList (duplicateReadingsL1).
        duplicateReadingsL1.add(reading5); // adding reading5 to LinkedList (duplicateReadingsL1).
        duplicateReadingsL1.add(duplicate1); // adding duplicate1 to LinkedList (duplicateReadingsL1).

        duplicateReadingsL2.add(reading6); // adding reading6 to LinkedList (duplicateReadingsL2).
        duplicateReadingsL2.add(reading7); // adding reading7 to LinkedList (duplicateReadingsL2).
        duplicateReadingsL2.add(reading8); // adding reading8 to LinkedList (duplicateReadingsL2).
        duplicateReadingsL2.add(reading9); // adding reading9 to LinkedList (duplicateReadingsL2).
        duplicateReadingsL2.add(reading10); // adding reading10 to LinkedList (duplicateReadingsL2).
        duplicateReadingsL2.add(duplicate2); // adding duplicate2 to LinkedList (duplicateReadingsL2).

        allReadingList1.add(reading1); // adding reading1 to LinkedList (duplicateReadingsL1).
        allReadingList1.add(reading2);// adding reading2 to LinkedList (duplicateReadingsL1).
        allReadingList1.add(reading3); // adding reading3 to LinkedList (duplicateReadingsL1).
        allReadingList1.add(reading4); // adding reading4 to LinkedList (duplicateReadingsL1).
        allReadingList1.add(reading5); // adding reading5 to LinkedList (duplicateReadingsL1).
        allReadingList1.add(invReadings1); // adding invReadings1 to LinkedList (duplicateReadingsL1).
        allReadingList1.add(invReadings2); // adding invReadings2 to LinkedList (duplicateReadingsL1).
        allReadingList1.add(invReadings3); // adding invReadings3 to LinkedList (duplicateReadingsL1).

        allReadingList2.add(reading6); // adding reading6 to LinkedList (allReadingList2).
        allReadingList2.add(reading7); // adding reading7 to LinkedList (allReadingList2).
        allReadingList2.add(reading8); // adding reading8 to LinkedList (allReadingList2).
        allReadingList2.add(reading9); // adding reading9 to LinkedList (allReadingList2).
        allReadingList2.add(reading10); // adding reading10 to LinkedList (allReadingList2).
        allReadingList2.add(invReadings4); // adding invReadings4 to LinkedList (allReadingList2).
        allReadingList2.add(invReadings5); // adding invReadings5 to LinkedList (allReadingList2).


        correctList1.add(duplicate1);
        correctList2.add(duplicate2);


        WM1.addDailyReport(date1,readingList1); // creating a DailyWeatherReport of good readings (readingList1) and adding it to a LinkedList.
        WM1.addDailyReport(date2,readingList2); // creating a DailyWeatherReport of good readings (readingList2) and adding it to a LinkedList.
        WM1.addDailyReport(date3,duplicateReadingsL1); // creating a DailyWeatherReport of duplicate readings (duplicateReadingsL1) and adding it to a LinkedList.
        WM1.addDailyReport(date4,allReadingList2); // creating a DailyWeatherReport of all readings (allReadingList2) and adding it to a LinkedList.


        temps1.add(54.0);
        temps1.add(45.0);
        temps1.add(65.0);
        temps1.add(25.0);
        temps1.add(85.0);

        rain1.add(20.0);
        rain1.add(23.0);
        rain1.add(12.0);
        rain1.add(19.0);
        rain1.add(40.0);

        DailyWeatherReport dailyReport11 = new DailyWeatherReport(date10, temps1, rain1);

        report20.add(dailyReport11);

    }
    //LinkedList<DailyWeatherReport> report2;
    // This tests if the addDailyReport method works by checking the LLDailyReport object of the changed weatherMonitor
    // object and a hard coded answer to be tested against.
    @Test
    public void testingAddDailyReport1(){
        WM10.addDailyReport(date10, readingList1);
        boolean a = true;
        LLDailyReport llReport1 = new LLDailyReport(report11);
        LLDailyReport llReport2 = new LLDailyReport(report20);
        if(llReport2.equals2(llReport1)){
            a = true;
        }
        else{
            a = false;
        }
        assertTrue(a);
    }

//====================================================================================================================//

    // Tests for CleanerHelper Method:-


    // The below emptyListCleaner() Test tests the CleanerHelper method against an empty list.
    @Test
    public void emptyListCleaner () {
        assertEquals(emptyList, WM1.cleanerHelper(emptyList));
    }


    // The below correctListCleaner1() Test tests the CleanerHelper method against a list with good reading data (readingList1).
    @Test
    public void correctListCleaner1 () {
        assertEquals(readingList1,WM1.cleanerHelper(readingList1));
    }


    // The below correctListCleaner2() Test tests the CleanerHelper method against a list with good reading data (readingList2).
    @Test
    public void correctListCleaner2 () {
        assertEquals(readingList2,WM1.cleanerHelper(readingList2));
    }


    // The below duplicateListCleaner1() Test tests the CleanerHelper method against a list with duplicate reading data (duplicateReadingsL1).
    @Test
    public void duplicateListCleaner1 () {
        assertEquals(readingList1,WM1.cleanerHelper(duplicateReadingsL1));
    }


    // The below duplicateListCleaner2() Test tests the CleanerHelper method against a list with duplicate reading data (duplicateReadingsL2).
    @Test
    public void duplicateListCleaner2 () {
        assertEquals (readingList2,WM1.cleanerHelper(duplicateReadingsL2));
    }


    // The below allReadingsListCleaner1() Test tests the CleanerHelper method against a list with all reading data - this list includes
    // duplicate data, incorrect data and good data (allReadingList1).
    @Test
    public void allReadingsListCleaner1 () {
        assertEquals(readingList1,WM1.cleanerHelper(allReadingList1));
    }


    // The below allReadingsListCleaner2() Test tests the CleanerHelper method against a list with all reading data - this list includes
    // duplicate data, incorrect data and good data (allReadingList2).
    @Test
    public void allReadingListCleaner2 () {
        assertEquals(readingList2,WM1.cleanerHelper(allReadingList2));
    }
//--------------------------------------------------------------------------------------------------------------------//

    // Tests for averageTempForMonth Method :-


    // The below avgTempTest1 () Test tests the averageTempForMonth() Method to give an average temperature for March (month = 3).
    // The readings data used is of readingList1 (i.e the good readings).
    @Test
    public void avgTempTest1 () {
        assertEquals(54.8,WM1.averageTempForMonth(3,2019),0.1);
    }


    // The below avgTempTest2 () Test tests the averageTempForMonth() Method to give an average temperature for April (month = 4).
    // The readings data used is of readingList2 (i.e the good readings).
    @Test
    public void avgTempTest2 () {
        assertEquals(60.6,WM1.averageTempForMonth(4,2019),0.1);
    }


    // The below avgTempTest3 () Test tests the averageTempForMonth() Method to give an average temperature for May (month = 5).
    // The readings data used is of duplicateReadingL1 (i.e the data including good and duplicate readings).
    @Test
    public void avgTempTest3 () {
        assertEquals(54.8,WM1.averageTempForMonth(5,2019),0.1);
    }


    // The below avgTempTest4 () Test tests the averageTempForMonth() Method to give an average temperature for June (month = 6).
    // The readings data used is of allReadingList2 (i.e the data including good, duplicate and incorrect readings).
    @Test
    public void avgTempTest4 () {
        assertEquals(60.6,WM1.averageTempForMonth(6,2019),0.1);
    }

    // The method tests what happens when you have a list of good data but none of it is relevant meaning none of the
    // data is in the specified month or year
    // The impossible value -998 stands for the situation mentioned above.
    @Test
    public void avgTempTest5 () {
        assertEquals(-998,WM1.averageTempForMonth(1,2019),0.1);
    }


    // The method tests what happens when you have an empty list no data
    // The impossible value -999 stands for empty list found can't find total so output -999
    @Test
    public void avgTempTest6 () {
        assertEquals(-999,WM100.averageTempForMonth(1,2019),0.1);
    }

//--------------------------------------------------------------------------------------------------------------------//

    // Tests for totalRainfallForMonth Method :-


    // the below totalRainfallTest1() Test tests the totalRainfallForMonth() Method to give the total rainfall for March (month = 3).
    // the reading data used is of readingList1 (i.e the good readings).
    @Test
    public void totalRainfallTest1 () {
        assertEquals(114, WM1.totalRainfallForMonth(3,2019),0.1);
    }


    // the below totalRainfallTest2() Test tests the totalRainfallForMonth() Method to give the total rainfall for April (month = 4).
    // the reading data used is of readingList2 (i.e the good readings).
    @Test
    public void totalRainfallTest2 () {
        assertEquals(153, WM1.totalRainfallForMonth(4,2019),0.1);
    }


    // the below totalRainfallTest3() Test tests the totalRainfallForMonth() Method to give the total rainfall for May (month = 5).
    // the reading data used is of duplicateReadingL1 (i.e the data includes duplicate and good readings).
    @Test
    public void totalRainfallTest3 () {
        assertEquals(114,WM1.totalRainfallForMonth(5,2019),01);
    }


    // the below totalRainfallTest4() Test tests the totalRainfallForMonth() Method to give the total rainfall for June (month = 6).
    // the reading data used is of allReadingList2 (i.e the data includes duplicate, incorrect and good readings).
    @Test
    public void totalRainfallTest4 () {
        assertEquals(153,WM1.totalRainfallForMonth(6,2019),0.1);
    }


    // The method tests what happens when you have a list of good data but none of it is relevant meaning none of the
    // data is in the specified month or year
    // The impossible value -998 stands for the situation mentioned above.
    @Test
    public void totalRainfallTest5 () {
        assertEquals(-998,WM1.totalRainfallForMonth(1,2019),0.1);
    }

    // The method tests what happens when you have an empty list no data
    // The impossible value -999 stands for empty list found can't find total so output -999
    @Test
    public void totalRainfallTest6 () {
        assertEquals(-999,WM100.totalRainfallForMonth(1,2019),0.1);
    }
}