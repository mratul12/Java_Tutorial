// Q.5 Write a Java program to detect whether a number entered by the user is integer or not.

import java.util.Scanner;

public class InputIntegerNUmUsr {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        System.out.println("Enter the value os check True & False");
        Scanner sc=new Scanner(System.in);
        System.out.println(sc.hasNextDouble());
    }
}
