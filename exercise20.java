/*
 * UCF COP3330 FALL 2021 Assignment 1 Solution
 * Copyright 2021 Alex Vorakrajangthiti
 */

import java.util.Scanner;

public class exercise20 {
    public static void main(String[] args) {
        System.out.print("What is the order amount? ");
        Scanner scanner = new Scanner(System.in);
        String orderamount = scanner.nextLine();
        double order = Double.parseDouble(orderamount);

        System.out.printf("What state do you live in? ");
        Scanner scanner1 = new Scanner(System.in);
        String state = scanner1.nextLine();

        if (state.equals("Wisconsin")) {
            double WIStateTax = 0.05, WIEau = 0.05 + 0.0005, WIDunn = 0.05 + 0.004;
            double WISalesTax = 0.05 * order, WIEauTax = WIEau * order, WIDunnTax = WIDunn * order;
            System.out.printf("What county do you live in? ");
            Scanner scanner2 = new Scanner(System.in);
            String county = scanner2.nextLine();
            switch (county) {
                case "Eau Claire":
                    System.out.printf("The tax is $%.2f\nThe total is $%.2f.", WIEauTax, (WIEauTax + 1) * order);
                    break;
                case "Dunn":
                    System.out.printf("The tax is $%.2f\nThe total is $%.2f.", WIDunnTax, (WIDunnTax + 1) * order);
                    break;
                default:
                    System.out.printf("The tax is $%.2f\nThe total is $%.2f.", WISalesTax, (WISalesTax + 1) * order);
            }
        } else if (state.equals("Illinois")) {
            double ILTax = 0.08;
            double ILOrder = ILTax*order;
            System.out.printf("The tax is $%.2f\nThe total is $%.2f.", ILOrder, ILOrder +order);
        }
        else {
            System.out.printf("There is no tax. The total is $%.2f.",order);
        }
    }
}
