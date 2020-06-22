package come.codewithiqra;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        int max = c.getMaximum(Calendar.DAY_OF_WEEK);
        System.out.println("Maximum days in a week: ");

        int max1 = c.getMaximum(Calendar.YEAR);
        System.out.println("Maximum Year: ");

        int max2 = c.getMaximum(Calendar.WEEK_OF_YEAR);
        System.out.println("MAximum Week in a year:");
    }
}
