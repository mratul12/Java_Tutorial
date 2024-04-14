import java.util.Scanner;
public class String_UserInput {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        System.out.println("What is your name ?");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println("My name is "+name);
    }
}
