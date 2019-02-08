package com.company;
import java.time.*;

/**
 * Created by bm846 on 2/4/19.
 */
public class message {
    private String sentMessage = "";
    private String person;
    private String timeRecieved;
    public message(String i, String m){
        sentMessage = m;
        person = i;
        timeRecieved = determineTime();
    }
    public String determineTime(){
        LocalDateTime est = LocalDateTime.now();
        String date = est.toString().substring(0, 10);
        String time = est.toString().substring(11, 19);
        String z = date + ", " + time;
        return z;
    }

    public String getSentMessage(){
        return sentMessage;
    }
    public String getPerson(){
        return person;
    }
    public String getTimeRecieved(){
        return timeRecieved;
    }
}