package Exam;

import java.util.Scanner;
    public abstract class AccountManager {
        private String customerCode;
        private String customerName;
        private int accountNumber;
        private long amount;

        public abstract void inputData();
        public abstract void displayData();
        public abstract void depositAndWithdraw(long money, int type);

        @Override
        public String toString() {
            return "Account{" +
                    "customerCode='" + customerCode + '\'' +
                    ", customerName='" + customerName + '\'' +
                    ", accountNumber=" + accountNumber +
                    ", amount=" + amount +
                    '}';
        }

        public String getCustomerCode() {
            return customerCode;
        }

        public void setCustomerCode(String customerCode) {
            this.customerCode = customerCode;
        }

        public String getCustomerName() {
            return customerName;
        }

        public void setCustomerName(String customerName) {
            this.customerName = customerName;
        }

        public int getAccountNumber() {
            return accountNumber;
        }

        public void setAccountNumber(int accountNumber) {
            this.accountNumber = accountNumber;
        }

        public long getAmount() {
            return amount;
        }

        public void setAmount(long amount) {
            this.amount = amount;
        }
    }
