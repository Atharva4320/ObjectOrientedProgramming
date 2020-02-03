/**Class Time has hours (integer) and minutes (integer) as its parameter. It contains isSame method.
 *
 */
public class Time {

    private int hours;
    private int minutes;

    public Time (int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    /** Method isSame takes in a time, compares whether the input time is same as the object's time and outputs a
     *  boolean value (True if the time is same and false otherwise)
     *
     * @param aTime - time
     * @return a boolean value
     */
    public boolean isSame(Time aTime){
        if(this.hours == aTime.hours && this.minutes == aTime.minutes){
            return true;
        }
        else {
            return false;
        }
    }


}