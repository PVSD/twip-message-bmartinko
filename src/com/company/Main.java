package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        int ender = 0;
        messageList start = new messageList();

        while (ender == 0) {
            System.out.println("Welcome to the chat! Press 1 to send a message! Press 0 to stop");
            Scanner kbs = new Scanner(System.in);
            int choice = kbs.nextInt();
            if (choice == 1) {
                System.out.println("Please enter the name of the person:");
                Scanner choiceA = new Scanner(System.in);
                String name = choiceA.nextLine();
                System.out.println("Now enter the message!");
                Scanner messageRecord = new Scanner(System.in);
                String messageSend = messageRecord.nextLine();
                if (messageSend.equalsIgnoreCase("exit")) {
                    System.out.println("See Ya!");
                    ender += 1;
                } else if (messageSend.equalsIgnoreCase("display")) {
                    start.display();
                    System.out.println("Would you like to send another message? If so, press 1. Otherwise, press 0");
                    Scanner endingB = new Scanner(System.in);
                    int endingChoiceB = endingB.nextInt();
                    if (endingChoiceB == 0) {
                        System.out.println("Begone!");
                        ender += 1;
                    }
                }else if (messageSend.equalsIgnoreCase("remove")) {
                    System.out.println("Type in the exact message to be removed");
                    Scanner remover = new Scanner(System.in);
                    String removedText = remover.nextLine();
                    start.remove(removedText);
                }
                else {
                    start.add(new message(name, messageSend));
                    System.out.println("Would you like to send another message? If so, press 1. Otherwise, press 0");
                    Scanner ending = new Scanner(System.in);
                    int endingChoice = ending.nextInt();
                    if (endingChoice == 0) {
                        System.out.println("Begone!");
                        ender += 1;

                    }
                }
            }else if (choice == 0) {
                System.out.println("Goodbye!");
                ender += 1;
            } else {
                System.out.println("Please enter either 0 or 1");
            }

        }
    }
}