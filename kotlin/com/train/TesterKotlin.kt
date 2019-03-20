package com.train

import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    println("Please enter number of tickets: ")
    val ticket = scan.nextInt()
    println("How many round-trip tickets: ")
    val trip = scan.nextInt()
    TicketKt().tickets(ticket, trip)
}

class TicketKt {
    fun tickets(tickets:Int, roundTrip:Int) {
        println("Total tickets: $tickets")
        println("Round-trip: $roundTrip")
        val tripSingle =  (tickets - roundTrip) * 1000
        val tripBack = (2000 * 0.9f) * roundTrip
        val tripTotal = tripSingle + tripBack
        println("Total: $tripTotal")

    }
}