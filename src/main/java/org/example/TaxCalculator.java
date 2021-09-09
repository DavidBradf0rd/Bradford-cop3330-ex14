package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 David Bradford
 */

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double oa, total, tax;

        System.out.print("What is the order amount? ");
        oa = Double.parseDouble(input.nextLine());
        System.out.print("What is the state? ");
        String state = input.nextLine();
        System.out.print("The subtotal is $" +String.format("%.2f",oa) + ".");

        tax = oa * 0.055;
        total = oa + tax;

        if (state.toLowerCase().equals("wi")) {
            System.out.println("\n"+"The tax is $" + tax + "." + "\n" + "The total is $" + total + ".");
        }
    }
}
