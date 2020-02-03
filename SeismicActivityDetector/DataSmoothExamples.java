import static org.junit.Assert.*;
import org.junit.Test;
import java.util.LinkedList;

// Brandon Snapperman, Atharva Dikshit
public class DataSmoothExamples {
    LinkedList<Show> shows = new LinkedList<Show>();
    LinkedList<Double> showResults = new LinkedList<Double>();
    LinkedList<Show> mTshows = new LinkedList<Show>();
    LinkedList<Double> mTshowResults = new LinkedList<Double>();
    DataSmooth1 D1 = new DataSmooth1();
    DataSmooth2 D2 = new DataSmooth2();
    LinkedList<Episode> eps1 = new LinkedList<Episode>();
    LinkedList<Episode> eps2 = new LinkedList<Episode>();
    LinkedList<Episode> eps3 = new LinkedList<Episode>();
    LinkedList<Episode> eps4 = new LinkedList<Episode>();

    public DataSmoothExamples() {
        // LinkedList<Episode> eps1 = new LinkedList<Episode>();
        eps1.add(new Episode("Best of Both Worlds", 88));
        eps1.add(new Episode("The Ultimate Computer", 49));
        eps1.add(new Episode("Trials and Tribble-ations", 43));
        shows.add(new Show("Star Trek", 1800, eps1, false));

        // LinkedList<Episode> eps2 = new LinkedList<Episode>();
        eps2.add(new Episode("Fear of a Bot Planet", 23));
        eps2.add(new Episode("The Why of Fry", 21));
        eps2.add(new Episode("Roswell that Ends Well", 23));
        eps2.add(new Episode("Meanwhile", 22));
        shows.add(new Show("Futurama", 1900, eps2, false));

        // LinkedList<Episode> eps3 = new LinkedList<Episode>();
        eps3.add(new Episode("Yakko's World", 4));
        eps3.add(new Episode("Hello Nice Warners", 8));
        eps3.add(new Episode("Where Rodents Dare", 9));
        shows.add(new Show("Animaniacs", 1630, eps3, false));

        // LinkedList<Episode> eps4 = new LinkedList<Episode>();
        eps4.add(new Episode("The Letter W", 59));
        eps4.add(new Episode("The Letter P", 57));
        eps4.add(new Episode("The Letter I", 58));
        shows.add(new Show("Sesame Street", 900, eps4, false));

        showResults.add(60.0);
        showResults.add(29.75);
        showResults.add(29.08333);
        showResults.add(58.0);
    }

   // double a = 0/3;
    @Test
    public void instructorTestDS1() {
        LinkedList<Double> runtimes = D1.dataSmooth(shows);

        for (int i = 0; i < runtimes.size(); i++) {
            assertEquals(runtimes.get(i), showResults.get(i), .01);
        }
    }

    @Test
    public void instructorTestDS2() {
        LinkedList<Double> runtimes = D2.dataSmooth(shows);
        // System.out.println (runtimes);
        for (int i = 0; i < runtimes.size(); i++) {
            assertEquals(runtimes.get(i), showResults.get(i), .01);
        }
    }

    @Test
    public void tesyEmptyDS1() {
        LinkedList<Double> runtimes = D1.dataSmooth(mTshows);

        for (int i = 0; i < runtimes.size(); i++) {
            assertEquals(runtimes.get(i), mTshowResults.get(i), .01);
        }
    }

    @Test
    public void testEmptyDS2() {
        LinkedList<Double> runtimes = D2.dataSmooth(mTshows);
        // System.out.println (runtimes);
        for (int i = 0; i < runtimes.size(); i++) {
            assertEquals(runtimes.get(i), mTshowResults.get(i), .01);
        }
    }


    @Test
    public void episode1AvgRuntime1() {
        assertEquals(60.0, D1.dataSmoothHelper(eps1), 0.1);}
    @Test
    public void episode1AvgRuntime2() {
        assertEquals(60.0, D2.dataSmoothHelper(eps1), 0.1);}

    @Test
    public void episode2AvgRuntime1() {
        assertEquals(22.25, D1.dataSmoothHelper(eps2), 0.1);}
    @Test
    public void episode2AvgRuntime2() {
        assertEquals(22.25, D2.dataSmoothHelper(eps2), 0.1);}

    @Test
    public void episode3AvgRuntime1() {
        assertEquals(7.0, D1.dataSmoothHelper(eps3), 0.1);}
    @Test
    public void episode3AvgRuntime2() {
        assertEquals(7.0, D2.dataSmoothHelper(eps3), 0.1);}

    @Test
    public void episode4AvgRuntime1() {
        assertEquals(58, D1.dataSmoothHelper(eps4), 0.1);}
    @Test
    public void episode4AvgRuntime2() {
        assertEquals(58, D2.dataSmoothHelper(eps4), 0.1);}

}


//                                          SubTasks
/*
 * - get the average runtime for each show
 * - after getting all the average runtimes data from all the shows
 * - smooth all the runtime data by taking the show before and after and adding them to the current show and dividing the
 *   total(sum of all 3 runtime averages) by three you will get one smoothed data point to go in the current shows position
 *   in the answer list
 * - the smoothing does not apply to the first and last show
 * - return the answer list
 *
 */