package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ticket = 0;
        int trip = 0;
        while (true) {
            System.out.println("Please enter number of tickets: ");
            ticket = scanner.nextInt();
            if (ticket == -1) break;
            System.out.println("How many round-trip tickets: ");
            trip = scanner.nextInt();
            new Ticket(ticket, trip);
        }
    }
}
