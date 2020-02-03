import java.util.LinkedList;

/** Class Reading has time (Time), tempInF (double), rainfall (double) as its parameters. It also contains getRainfall()
 * method, getTempInF() method, getTime() method.
 *
 */
public class Reading {
    private Time time;
    private double tempInF;
    private double rainfall;


    public Reading (Time time, double tempInF,double rainfall) {
        this.time = time;
        this.tempInF = tempInF;
        this.rainfall = rainfall;
    }

    /** Method getRainfall returns a double which is the rainfall data from the Readings Class
     *
     * @return a double
     */
    public double getRainfall() {
        return rainfall;
    }

    /** Method getTempInF returns a double which is the temperature data from the Readings Class
     *
     * @return a double
     */
    public double getTempInF() {
        return tempInF;
    }

    /**Method getTime returns time which is the time data from the Readings Class
     *
     * This is not required for the assignment this is an extra part of code
     * This is used to help clean the data so that multiple reading's with the
     * same time code are not recoded more than once.
     *
     * @return time
     */
    public Time getTime() {
        return time;// This is not required for the assignment this is an extra part of code
// This is used to help clean the data so that multiple reading's with the same time code are not recoded more than once.
    }

}