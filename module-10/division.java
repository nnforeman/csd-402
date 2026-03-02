/*
Name: Natasha Foreman
Course: CSD 402 – Java for Programmers
Date: March 1st, 2026
Assignment: Module 10
Purpose: Write a program using to apply abstraction and inheritance concepts.
*/

public abstract class Division {

    protected String divisionName;
    protected int accountNumber;

    // Constructor requiring both fields
    public Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    // Abstract method
    public abstract void display();
}