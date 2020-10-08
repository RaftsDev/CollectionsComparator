package com.company;

import java.util.ArrayList;

public class Theater {
    private final String theaterName;
    public List<Seat> seats = new ArrayList<>();

    public Theater(String theaterName, int numRows, int seatsPerRow) {
        this.theaterName = theaterName;

        int lastRow = 'A' + (numRows-1);
        for(char row = 'A'; row<=lastRow; row++){
            for (int i = 0; i<seatsPerRow; i++){

            }
        }
    }


}
