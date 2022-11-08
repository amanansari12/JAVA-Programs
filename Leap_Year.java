package All_Java_Codes;
import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        System.out.print(" Enter the Year: ");
        Scanner SC = new Scanner(System.in);
        int year = SC.nextInt();
        if((year%4==0) && (year%100!=0) || (year%400==0)){
            System.out.println(year + " is a Leap Year");
        }
        else{
            System.out.println(year + " is Not a Leap Year");
        }
    }

}

