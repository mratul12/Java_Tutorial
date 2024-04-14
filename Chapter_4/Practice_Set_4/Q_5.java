package Practice_Set_4;

import java.util.Scanner;
public class Q_5 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        System.out.println("Enter a year:");
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if(year%400==0 || (year%4==0 && year%100!=0)){
            System.out.println("This year is Leap year");
        }
        else{
            System.out.println("This year is not Leap Year");
        }
    }
}
