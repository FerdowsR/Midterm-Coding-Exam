package design;

import java.time.Month;

public enum Months {
    January, February, March, April, May, June, July, August, September, October, November, December;

    public static void main(String[] arg) {

        // get all the months
        Month[] months;
        months = Month.values();

        //print every month
        for (Month month : months) {
            System.out.println(month);
        }

    }


}