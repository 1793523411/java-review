package three.demo;
import java.io.*;

public class Year
{
    public static void main(String[ ] args) throws IOException{
        int year,month;
        boolean IsLeapYear;
        System.out.println("Enter the year:");
        BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
        year=(new Integer(in.readLine())).intValue();
        IsLeapYear=((year%4==0 && year%100 != 0)||(year%400 == 0));
        if (IsLeapYear)
        {
            System.out.print(year);
            System.out.println( "is a leap year");
        }
        else
        {
            System.out.print(year);
            System.out.println( " is not a leap year");
        }
        System.out.println("计算每个月的天📔📔数");
        month=(new Integer(in.readLine())).intValue();
        System.out.println("该月有"+(daysInMonth(month))+"天");

    }

    static int daysInMonth(int month) {
        if (month == 2)
            return(28);
        else if ((month==4)||(month==6)||(month==9)||(month==11))
            return(30);
        else  return(31);
    }

    static int daysInMonth2(int month) {
        int    days;
        switch(month) {
            case 2: days = 28; break;
            case 4:
            case 6:
            case 9:
            case 11: days = 30; break;
            default: days = 31;
        }
        return(days);
    }


}
