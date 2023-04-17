package Exam;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Account {

    private String customerCode;
    private String customerName;
    private int accNumber;
    private long amount;

    public void input() {
        Scanner scanner = new Scanner(System.in);
        boolean isCustomerCodeValid = false;
        boolean isAccNumberValid = false;
        while (!isCustomerCodeValid) {
            System.out.print("Enter customer Code: ");
            String customerCodeInput = scanner.nextLine();
            if (customerCodeInput.length() != 5) {
                System.out.println("customer Code must be 5 characters long");
                continue;
            }
            isCustomerCodeValid = true;
            customerCode = customerCodeInput;
        }
        System.out.print("Enter customer Name: ");
        customerName = scanner.nextLine();
        while (!isAccNumberValid) {
            System.out.print("Enter Account Number: ");
            String accNumberInput = scanner.nextLine();
            Pattern pattern = Pattern.compile("[0-9]+");
            Matcher matcher = pattern.matcher(accNumberInput);
            if (!matcher.matches()) {
                System.out.println("Account Number must be a number");
                continue;
            }
            if (accNumberInput.length() != 6) {
                System.out.println("Account Number must be 6 digits");
                continue;
            }
            if (!accNumberInput.startsWith("100")) {
                System.out.println("Account Number must start with 100");
                continue;
            }
            isAccNumberValid = true;
            accNumber = Integer.parseInt(accNumberInput);
        }
    }

    public void depositAndWithdraw(long amount, int type) {
        if (type == 0) {
            if (amount < 0) {
                System.out.println("Amount must be a positive number");
                return;
            }
            this.amount += amount;
            return;
        }
        if (amount > 0 && amount < this.amount) {
            this.amount -= amount;
            return;
        }
        System.out.println("Non-sufficient funds");
    }

    @Override
    public String toString() {
        return String.format("customerCode = %s customerName = %s accNumber = %d amount = %d", customerCode, customerName, accNumber, amount);
    }
}
