import java.util.Scanner;
public class ConditionMarks {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        System.out.print("Enter your marks: ");
        int marks;
        Scanner sc=new Scanner(System.in);
        marks=sc.nextInt();
        if (marks>=80) {
            System.out.println("Your are a 1st Division");
        }
        else if (marks>=60) {
            System.out.println("Your are a 2nd Division");
        }
        else if (marks>=40) {
            System.out.println("Your are a 3rd Division");
        }
        else{
            System.out.println("You are failed!");
        }
    }
}
