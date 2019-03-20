package com.train;

class Ticket {
    Ticket(int tickets, int roundTrip) {
        System.out.println("Total tickets: " + tickets);
        System.out.println("Round-trip: " + roundTrip);
        int tripSingle = (tickets - roundTrip) * 1000;
        float tripBack = (2000 * 0.9f) * roundTrip;
        int tripTotal = (int) (tripSingle + tripBack);
        System.out.println("Total: " + tripTotal);
    }
}
