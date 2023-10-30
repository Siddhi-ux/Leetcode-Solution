import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Solution {
    public int daysBetweenDates(String date1, String date2) {
        LocalDate d1 = LocalDate.parse(date1);
        LocalDate d2 = LocalDate.parse(date2);
        long daysBetween = Math.abs(ChronoUnit.DAYS.between(d1, d2));
        return (int) daysBetween;
    }
}
