package Exam;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Account extends AccountManager {

    @Override
    public void inputData() {
        this.inputCustomerCode();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter customer name: ");
        this.setCustomerName(input.nextLine());
        this.inputAccountNumber();
        this.inputAmount();


        System.out.println("Successfully added");


    }

    private void inputCustomerCode() {
        Scanner input = new Scanner(System.in);
        String inputCustomerCode = input.nextLine();

        while (true) {
            System.out.print("Enter customer code: ");
            if (inputCustomerCode.length() == 5) {
                this.setCustomerCode(inputCustomerCode);
                break;
            } else {
                System.out.println("Error, please enter customer code again");
            }
        }



    }

    private void inputAccountNumber() {
        Scanner input = new Scanner(System.in);
        int inputNumber = 0;
        do {
            System.out.print("Enter amount: ");
            try {
                inputNumber = input.nextInt();
                if (inputNumber <= 0) {
                    System.out.println("Please enter a non-negative value for the account number");
                }
            } catch (InputMismatchException error) {
                System.out.println("Error, please enter account number again");
                input.next();
            }
        } while (inputNumber <= 0);
        this.setAccountNumber(inputNumber);

    }

    private void inputAmount() {
        Scanner input = new Scanner(System.in);
        long inputNumber = 0;
        do {
            System.out.print("Enter amount: ");
            try {
                inputNumber = input.nextLong();
                if (inputNumber <= 0) {
                    System.out.println("Please enter a non-negative value for the amount");
                }
            } catch (InputMismatchException error) {
                System.out.println("Error, please enter amount again");
                input.next();
            }
        } while (inputNumber <= 0);
        this.setAmount(inputNumber);
    }

    @Override
    public void displayData() {

    }

    @Override
    public void depositAndWithdraw(long money, int type) {

    }


}