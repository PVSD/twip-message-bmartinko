package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to the chat! Press 1 to send a message! Press 0 to stop");
        Scanner kbs = new Scanner(System.in);
        int choice = kbs.nextInt();
        if (choice == 1){

        }else if(choice == 0){
            System.out.println("Goodbye!");
        }else{
            System.out.println("Please enter either 0 or 1");
        }

    }
}
