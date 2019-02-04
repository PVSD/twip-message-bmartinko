package com.company;

/**
 * Created by bm846 on 2/4/19.
 */
public class message {
    private String sentMessage = "";
    private int person;
    private long timeRecieved;
    private message(int i, String m, long tR){
        sentMessage = m;
        person = i;
        timeRecieved = tR;
    }

}
