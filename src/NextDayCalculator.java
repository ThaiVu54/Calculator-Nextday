public class NextDayCalculator {

    public static final String CONCATENATION = "/";

    public static String getNextDay(int day, int month, int year){
        int lastOfMonth = 31;
        int startOfMonth = 1;
        if (day== lastOfMonth){
            day=startOfMonth;
            month++;
        }
        else {
            day++;
        }
        return day + CONCATENATION + month + CONCATENATION+ year;
    }
}
