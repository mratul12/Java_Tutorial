package Practice_Set_4;

import java.util.Scanner;
public class Account {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        System.out.println("Enter your Account Number:");
        Scanner sc=new Scanner(System.in);
        long account=sc.nextLong();
        if(account==40930100009420L){
            System.out.println("Your Name is Atul Dubey");
            System.out.println("Your Total Amount is: 12000.rs");
        }
        else{
            System.out.println("please try again");
        }
        
    }
}
