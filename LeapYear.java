package LeapYear;

import java.util.Calendar;
public class LeapYear
{
    public static void main(String[] args)
    {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
            System.out.println("Year " + year + " is a leap year..");
        else
            System.out.println("Year "+year+" is not a leap year..");

    }

}
