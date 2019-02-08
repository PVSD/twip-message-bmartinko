package com.company;

import java.util.*;

/**
 * Created by bm846 on 2/4/19.
 */
public class messageList {
    private ArrayList<message> log;
    private int numberOfMessages = 0;
    private Object messages;
    public messageList(){

        log = new ArrayList();
    }
    public void add(message z){
        log.add(numberOfMessages, z);
        numberOfMessages++;
        System.out.println("Message sent!");
    }
    public void remove(String x){
        for (int q = 0; q < log.size(); q++) {
            if (log.get(q).getSentMessage().equals(x)) {
                    log.remove(q);
            }
        }
    }
    public void display() {
        for (int h = 0; h < log.size(); h++) {
            System.out.println(log.get(h).getPerson() + ": " + log.get(h).getSentMessage()
                    + ". This message was sent at " + log.get(h).getTimeRecieved());
        }

    } public void clearList(){
        log.clear();
    }
}