package All_Java_Codes;
import java.util.Scanner;

public class temperatureConverter {
    static float C2F(float c){
        float f;
        f = c * 9/5+ 32;
        System.out.println(c + "°C" + " = " + f +"°F");
        return f;
    }
    static float F2C(float f){
        float c;
        c = (f +32) * 9/5;
        System.out.println(f + "" + " = " + c + " °C ");
        return c;
    }
    static float K2C(float k){
        float c;
        c = (float) (k - 273.15);
        System.out.println(k + "K" + " = " + c + "°C");
        return c;
    }
    static float K2F(float k){
        float f;
        f = (float)(k - 273.15)* 9/5 +32 ;
        System.out.println(k + "K" + " = " + f + "°F");
        return f;
    }


    static void TempConverter() {
        System.out.println(" -- Temperature Converter --");
        Scanner SC = new Scanner(System.in);
        System.out.println("1. Celsius To Fahrenheit: ");
        System.out.println("2. Fahrenheit To Celsius: ");
        System.out.println("3. Kelvin To Celsius: ");
        System.out.println("4. Kelvin To Fahrenheit: ");
        System.out.print("Enter Your choice: ");
        int x = SC.nextInt();
        switch(x){
            case 1:
                System.out.println(" You Have Chosen --> 1. Celsius To Fahrenheit");
                System.out.print(" Enter the value: ");
                float y = SC.nextInt();
                C2F(y);
                break;

            case 2:
                System.out.println(" You Have Chosen --> 2. Fahrenheit To Celsius");
                System.out.print(" Enter the value: ");
                float y1 = SC.nextInt();
                F2C(y1);
                break;

            case 3:
                System.out.println(" You Have Chosen --> 3. Kelvin To Celsius");
                System.out.print(" Enter the value: ");
                float y2 = SC.nextInt();
                K2C(y2);
                break;

            case 4:
                System.out.println(" You Have Chosen --> 4. Kelvin To Fahrenheit");
                System.out.print(" Enter the value: ");
                float y3 = SC.nextInt();
                K2F(y3);
                break;

            default:
                System.out.println(" Enter the Correct Choice.");
                break;

        }

    }

    public static void main(String[] args) {

        TempConverter();
    }
}