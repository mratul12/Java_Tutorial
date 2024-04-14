// Q.3 Write a Java program which asks the user to enter his/her name and greets them with "Hello <name>, have a good day" text.

import java.util.Scanner;

public class AskUserImpu {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        System.out.println("What is Your Name ? ");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println("Hello "+name+", have a Good Day...");
    }
}
