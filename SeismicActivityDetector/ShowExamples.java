import org.junit.Test;
import java.util.LinkedList;
import static org.junit.Assert.*;

// Brandon Snapperman, Atharva Dikshit
public class ShowExamples
{
    ShowManager1 sm1 = new ShowManager1();
    ShowManager2 sm2 = new ShowManager2();
    LinkedList<Show> shows = new LinkedList<Show>();
    LinkedList<Show> overnightIncShows = new LinkedList<Show>();
    LinkedList<Show> specialShows = new LinkedList<Show>();
    LinkedList<Show> allShows = new LinkedList<Show>();
    LinkedList<Show> correctShows = new LinkedList<Show>();
    LinkedList<Show> emptyList = new LinkedList<Show>();
    LinkedList<Show> overNightOnly = new LinkedList<Show>();
    ShowSummary report1 = new ShowSummary();
    ShowSummary emptyReport = new ShowSummary();

    public ShowExamples()
    {
        LinkedList<Episode> eps1 = new LinkedList<Episode>();
        eps1.add(new Episode("Best of Both Worlds", 88));
        eps1.add(new Episode("The Ultimate Computer", 49));
        eps1.add(new Episode("Trials and Tribble-ations", 43));
        Show s1 = new Show("Star Trek", 1800, eps1, false);
        shows.add(s1);
        allShows.add(s1);
        specialShows.add(s1);
        overnightIncShows.add(s1);
        correctShows.add(s1);
        report1.primetime.add(s1);

        LinkedList<Episode> eps2 = new LinkedList<Episode>();
        eps2.add(new Episode("Fear of a Bot Planet", 23));
        eps2.add(new Episode("The Why of Fry", 21));
        eps2.add(new Episode("Roswell that Ends Well", 23));
        eps2.add(new Episode("Meanwhile", 22));
        Show s2 = new Show("Futurama", 1900, eps2, false);
        shows.add(s2);
        overnightIncShows.add(s2);
        specialShows.add(s2);
        allShows.add(s2);
        correctShows.add(s2);
        report1.primetime.add(s2);

        LinkedList<Episode> eps3 = new LinkedList<Episode>();
        eps3.add(new Episode("Yakko's World", 4));
        eps3.add(new Episode("Hello Nice Warners", 8));
        eps3.add(new Episode("Where Rodents Dare", 9));
        Show s3 = new Show("Animaniacs", 1630, eps3, false);
        shows.add(s3);
        overnightIncShows.add(s3);
        specialShows.add(s3);
        allShows.add(s3);
        correctShows.add(s3);
        report1.daytime.add(s3);

        LinkedList<Episode> eps4 = new LinkedList<Episode>();
        eps4.add(new Episode("The Letter W", 59));
        eps4.add(new Episode("The Letter P", 57));
        eps4.add(new Episode("The Letter I", 58));
        Show s4 = new Show("Sesame Street", 900, eps4, false);
        shows.add(s4);
        overnightIncShows.add(s4);
        specialShows.add(s4);
        allShows.add(s4);
        correctShows.add(s4);
        report1.daytime.add(s4);

        LinkedList<Episode> SPeps = new LinkedList<Episode>();
        SPeps.add(new Episode("First Special", 59));
        SPeps.add(new Episode("Second Special", 57));
        SPeps.add(new Episode("Third Special", 58));
        Show SP1 = new Show("Special S1",1300,SPeps,true);
        allShows.add(SP1);
        specialShows.add(SP1);

        LinkedList <Episode> oNight = new LinkedList<Episode>();
        oNight.add(new Episode("AC 1",67));
        oNight.add(new Episode ("AC 2",58));
        oNight.add(new Episode ("AC 3",63));
        Show overNight = new Show ("AC S1", 0300,oNight,false);
        allShows.add(overNight);
        overNightOnly.add(overNight);
    }

    @Test
    public void instructorTestOrganizeShows(){
        ShowSummary report2 = sm1.organizeShows(shows);
        assertEquals(report1, report2);}
    @Test
    public void instructorTestOrganizeShows2(){
        ShowSummary report2 = sm2.organizeShows(shows);
        assertEquals(report1, report2);}

    @Test
    public void testOrganizeShowsEmpty1(){
        ShowSummary report2 = sm1.organizeShows(emptyList);
        assertEquals(emptyReport, report2);}
    @Test
    public void testOrganizeShowsEmpty2(){
        ShowSummary report2 = sm2.organizeShows(emptyList);
        assertEquals(emptyReport, report2);}






    @Test
    public void testOrganizeShowsOverNightOnly1(){
        ShowSummary report2 = sm1.organizeShows(overNightOnly);
        assertEquals(emptyReport, report2);}
    @Test
    public void testOrganizeShowsOverNightOnly2(){
        ShowSummary report2 = sm2.organizeShows(overNightOnly);
        assertEquals(emptyReport, report2);}





    @Test
    public void overnightShowTest() {
        assertEquals(correctShows,sm1.orgShowsCleanHelper(overnightIncShows));}
    @Test
    public void specialShowTest() {
        assertEquals(correctShows,sm1.orgShowsCleanHelper(specialShows));}
    @Test
    public void allShowTest() {
        assertEquals(correctShows,sm1.orgShowsCleanHelper(allShows));}

    @Test
    public void TestOrganizeShowsIncOverNight1(){
        ShowSummary report2 = sm1.organizeShows(overnightIncShows);
        assertEquals(report1, report2);}
    @Test
    public void TestOrganizeShowsIncOverNight2(){
        ShowSummary report2 = sm2.organizeShows(overnightIncShows);
        assertEquals(report1, report2);}

    @Test
    public void TestOrganizeShowsIncSpecial1(){
        ShowSummary report2 = sm1.organizeShows(specialShows);
        assertEquals(report1, report2);}
    @Test
    public void TestOrganizeShowsIncSpecial2(){
        ShowSummary report2 = sm2.organizeShows(specialShows);
        assertEquals(report1, report2);}

    @Test
    public void TestOrganizeShowsIncAllShows1(){
        ShowSummary report2 = sm1.organizeShows(allShows);
        assertEquals(report1, report2);}
    @Test
    public void TestOrganizeShowsIncAllShows2(){
        ShowSummary report2 = sm2.organizeShows(allShows);
        assertEquals(report1, report2);}

}

//                                          SubTasks
/*
 * - remove all specials and over night shows from the raw data list (cleaning)
 * - sorts the cleaned data into 3 lists, representing the 3 acceptable time slots, depending on their broadcast time (Parsing)
 * - create a showSummary object using the 3 list created before and return the newly created showSummary object
 *
 */