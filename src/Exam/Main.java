package Exam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AccountManager accountManager = null;
        String Choose;

        do {
            mainMenu();
            Choose = input.nextLine();
            switch (Choose) {
                case "1":
                    System.out.println("1: Add Account");
                    accountManager = new Account();
                    accountManager.inputData();
                    break;
                case "2":
                    System.out.println("2: Display");
                    break;
                case "3":
                    System.out.println("3: Deposit or Withdraw");
                    break;
                case "4":
                    System.out.println("4: Exit");
                    break;

                default:
                    System.out.println("Number is not available, please try again");
                    break;
            }
        } while (!Choose.equals("4"));
    }

    private static void mainMenu() {
        System.out.println("====");
        System.out.println("====Menu====");
        System.out.println("1. Add Account");
        System.out.println("2. Display");
        System.out.println("3. Deposit or Withdraw");
        System.out.println("4. Exit");
        System.out.print("Please choose [1 - 4]: ");
    }
}
