import java.util.Scanner;

public class text_Based_Bank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userInput;
        int size = 0;
        double[] accountBalances = new double[250];
        String[] accountNames = new String[250];
//        for (;true;){
        while(true){
            System.out.println("Bank Admin Menu");
            System.out.println("Please Enter a Menu Option: ");
            System.out.println("(1): Add Customer to Bank");
            System.out.println("(2): Change Account Name");
            System.out.println("(3): Check account Balance");
            System.out.println("(4): Modify account Balance");
            System.out.println("(5): Summary of all accounts");
            System.out.println("(-1): Quit");

            System.out.println("Please Enter your Choice: ");
            userInput = input.nextInt();
            if (userInput == 1){
                System.out.println("Bank add customer Menu:");
                System.out.println("Please Enter the account Balance:");
                double balance = input.nextDouble();
                accountBalances[size] = balance;
                System.out.println("Please Enter the account name");
                input.nextLine();  // Clear Buffer! check Documentation for More Information
                String name = input.nextLine();
                accountNames[size] = name;
                System.out.println("Customer ID is: " + size);
                size = size+1;
            }
            else if (userInput == 2){
                System.out.println("Bank change name Menu");
                System.out.println("Please Enter the Customer ID to change their name");
                int index = input.nextInt();
                System.out.println("What is  customer new name");
                input.nextLine();
                accountNames[index] = input.nextLine();
                System.out.println("The Customer name is changed to " + accountNames[index]);
            }
            else if (userInput == 3){
                System.out.println("Bank Check balance menu");
                System.out.println("Please Enter the Customer ID to check their account balance");
                int index = input.nextInt();
                double balance = accountBalances[index];
                System.out.println("This Customer has $" + balance + " in their account");
            }
            else if (userInput == 4){
                System.out.println("Bank Modify balance menu");
                System.out.println("Please Enter the Customer ID to modify their account balance");
                int index = input.nextInt();
                System.out.println("Please Input your new account balance: ");
                accountBalances[index] = input.nextDouble();
                System.out.println("The new account balance of Customer " + accountNames[index] + " is $"+ accountBalances[index]);
            }
            else if (userInput == 5){
                System.out.println("Bank all Summary menu");
                double total = 0;
                for (int i = 0; i < size; i++) {
                    total = total + accountBalances[i];
                    System.out.println(accountNames[i] + " has $" + accountBalances[i] + " in their account");
                }
                System.out.println("In total, there is $" + total + " in the bank");
            }
            else if (userInput == -1){
                System.exit(-1);
            }
            else {
                System.out.println("ERROR! Invalid Input");
            }
        }

    }
}
