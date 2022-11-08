package All_Java_Codes;

import java.util.Scanner;
public class Prime_or_Composite {
    public static void main(String[] args) {
        System.out.print(" Enter a Number to check weather it's Prime or Composite:  ");
        Scanner SC = new Scanner(System.in);
        int num = SC.nextInt();
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            // condition for non-prime number
            if (num % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
//        if(flag==true) --> we can use this instead of if(!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is a Composite number.");
    }
}