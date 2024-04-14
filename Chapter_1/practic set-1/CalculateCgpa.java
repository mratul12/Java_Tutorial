// Q.2 Write a program to calculate CGPA using marks of three subjects (out of 100)

public class CalculateCgpa {
    public static void main(String[] args) {
        System.out.println("There are Three subject marks");
        int  English = 95;
        int  Math = 91;
        int Computer = 89;
        int Sum=English+Math+Computer;
        float Cgpa=Sum/30f;
        System.out.println("Total Marks of CGPA: " +Cgpa);

    }
}
