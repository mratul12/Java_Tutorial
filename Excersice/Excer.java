package Excersice;

import java.util.Scanner;
public class Excer {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        System.out.println("Enter the Student Marks");
        Scanner sc=new Scanner(System.in);
        System.out.print("English: ");
        int English=sc.nextInt();
        System.out.print("Computer: ");
        int Computer=sc.nextInt();
        System.out.print("Math: ");
        int Math=sc.nextInt();
        System.out.print("Physics: ");
        int Physics=sc.nextInt();
        System.out.print("Chemestry: ");
        int Chemestry=sc.nextInt();
        float cgpa=(English+Computer+Math+Physics+Chemestry)/50f;
        System.out.println("There are total marks of CGPA: " +cgpa);
    }
}
