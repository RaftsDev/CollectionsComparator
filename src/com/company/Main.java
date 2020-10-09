package com.company;

public class Main {

    public static void main(String[] args) {
	Theater theater = new Theater("MSG",8,12);
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
}
