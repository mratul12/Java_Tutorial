package Chapter_1;

import java.util.Scanner;
public class Lec_05_TalkingInpu {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        System.out.println("Talking input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a=sc.nextInt();
        System.out.println("Enter number 2");
        int b=sc.nextInt();
        int sum=a+b;
        System.out.print("The sum of these numbers is:- ");
        System.out.println(sum);
        // Boolean b1 = sc.hasNextInt();
        // System.out.println(b1);
        // String str=sc.nextLine();
        // System.out.println(str);
        
    }
    
}
