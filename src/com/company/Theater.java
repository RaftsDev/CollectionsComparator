package com.company;

import java.util.ArrayList;
import java.util.List;

public class Theater {
    private final String theatreName;
    //private Collection<Seat> seats = new HashSet<>(); //Not sorted in order
    //private Collection<Seat> seats = new TreeSet<>(); //Error
    public List<Seat> seats = new ArrayList<>();

    public Theater(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;

        int lastRow = 'A' + (numRows - 1);
        System.out.println("numRows: " + numRows + " lastRow: " + lastRow);
        for (char row = 'A'; row <= lastRow; row++) {
            System.out.println("row= " + row);
            for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                Seat seat = new Seat(row + String.format("%02d", seatNum));
                seats.add(seat);
            }
        }
    }

    public String getTheatreName() {
        return theatreName;
    }

    public boolean reserveSeat(String seatNumber) {

    }


        // for testing
        public void getSeats() {
            for (Seat seat : seats) {
                System.out.println(seat.getSeatNumber());
            }
        }

        public class Seat implements Comparable<Seat> {
            private final String seatNumber;
            private boolean reserved = false;

            public Seat(String seatNumber) {
                this.seatNumber = seatNumber;
            }

            @Override
            public int compareTo(Seat seat) {
                return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
            }

            public boolean reserve() {
                if (!this.reserved) {
                    this.reserved = true;
                    System.out.println("Seat " + seatNumber + " reserved");
                    return true;
                } else {
                    return false;
                }
            }

            public boolean cancel() {
                if (this.reserved) {
                    this.reserved = false;
                    System.out.println("Reservation of seat " + seatNumber + " cancelled");
                    return true;
                } else {
                    return false;
                }
            }

            public String getSeatNumber() {
                return seatNumber;
            }

        }
    }

