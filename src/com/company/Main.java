package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
	Theater theater = new Theater("MSG",8,12);
	List<>
	printList(theater.getSeats());
	if(theater.reserveSeat("B07")){
        System.out.println("Seat reserved for you");
    }else{
        System.out.println("Seat already reserved for somebody else");
    }

	if(theater.reserveSeat("B07")){
	    System.out.println("Seat reserved for you");
	}else{
	    System.out.println("Seat already reserved for somebody else");
	}

    }

    public static void printList(List<Theater.Seat> list){
		System.out.println("*****************************");
    	for(Theater.Seat seat : list){
			System.out.println(seat.getSeatNumber());
		}
	}
}
