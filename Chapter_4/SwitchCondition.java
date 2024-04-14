import java.util.Scanner;
public class SwitchCondition {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        System.out.println("Enter your age");
        int age;
        Scanner sc=new Scanner(System.in);
        age=sc.nextInt();
        switch (age) {
            case 21:
                System.out.println("you are going to become an Adult");
                break;
            
            case 23:
                System.out.println("you are going to join a job");
                break;
            
            case 60:
                System.out.println("you are going to get retired!");
                break;
            
            default:
            System.out.println("Enjoy your life");
        }

        System.out.println("Enter your name:");
        String var;
        var=sc.next();
        switch (var) {
            case "Shubham" -> {
                System.out.println("you are going to become an Adult");}
                // break;
            case "Atul" -> {
                System.out.println("you are going to join a job");}
                // break;
            case "Sanu" -> {
                System.out.println("you are going to get retired!"); }
                // break;
            default -> {
                System.out.println("Enjoy your life");}
                // break;
        }
    }
}
