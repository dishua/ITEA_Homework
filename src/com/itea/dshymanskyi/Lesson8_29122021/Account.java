package com.itea.dshymanskyi.Lesson8_29122021;

import java.util.ArrayList;

public class Account<T> {
    private final T id;
    ArrayList<Transaction> accountTransactions;

    private class Transaction {
        private final double transactionAmount;
        private int transactionID = 0;

        public Transaction(double transactionAmount) {
            this.transactionID++;
            this.transactionAmount = transactionAmount;
        }

        public int getTransactionID() {
            return transactionID;
        }

        @Override
        public String toString() {
            return "Transaction{" +
                    "transactionAmount=" + transactionAmount +
                    ", transactionID=" + transactionID +
                    '}';
        }
    }

    public Account(T id, ArrayList<Transaction> accountTransactions) {
        this.id = id;
        this.accountTransactions = accountTransactions;
    }

    public T getId() {
        return id;
    }

    public void withdrawal(double transactionAmount) {
        if (getBalance() < transactionAmount) {
            System.out.println("No money");
            return;
        }
        Transaction transaction = new Transaction(-transactionAmount);
        accountTransactions.add(transaction);
    }

    public void deposit(double transactionAmount) {
        Transaction transaction = new Transaction(transactionAmount);
        accountTransactions.add(transaction);
    }

    public double getBalance() {
        double balance = 0;
        for (Transaction transaction : accountTransactions) {
            balance += transaction.transactionAmount;
        }
        return balance;
    }

    public String getListOfTransactions() {
        for (Transaction transaction : accountTransactions) {
            System.out.println(transaction.toString());
        }
        return null;
    }

}

