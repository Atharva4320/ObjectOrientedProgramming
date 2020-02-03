import java.util.LinkedList;

import java.util.LinkedList;

/** Interface ISet has the method signatures to process the LLDailyReport CLass
 *
 */
public interface ISet {

    void addElt(DailyWeatherReport aReport);

    double averageTempForMonth(int month, int year);

    double totalRainfallForMonth(int month, int year);

    int size();
// Only for testing
    boolean equals2(LLDailyReport aReportList);
}
