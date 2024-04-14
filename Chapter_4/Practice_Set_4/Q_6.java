package Practice_Set_4;

import java.util.Scanner;
public class Q_6 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a website name:");
        String website=sc.next();
        if(website.endsWith(".com")){
            System.out.println("This is a Commercial website");
        }
        else if(website.endsWith(".org")){
            System.out.println("This is an Organizational Website");
        }
        else if(website.endsWith(".in")){
            System.out.println("This is an Indian Website");
        }
        else{
            System.out.println("Invalid!");
        }
    }

}
