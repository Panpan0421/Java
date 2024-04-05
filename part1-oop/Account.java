package org.example;

public class Account {
    private String id;
    private String name;
    private int balance;

    // Constructors
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0;
    }

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(double amount) {
        balance += amount;

        return balance;
    }

    public int debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
            return balance;
        } else {
            amount -= balance;
            System.out.println("Exceed" + amount);
            return (balance - amount);
        }
    }

    public void transferTo(Account another, int amount) {
        if (amount <= balance) {
            debit(amount);
            another.credit(amount);
        } else {
            amount -= balance;
            System.out.println("Exceed" + amount);
        }
    }

    @Override
    public String toString() {
        return "Account[id=" + id + ", name=" + name + ", balance=" + balance + "]";
    }
}
