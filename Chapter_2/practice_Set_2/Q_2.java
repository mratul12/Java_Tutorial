// Q.2 Write a Java program to encript a grade by adding 8 to it. Decript it to show the currect grade.

package Chapter_2.practice_Set_2;

public class Q_2 {
    public static void main(String[] args) {
        char a='A';
        // encrypt
        a=(char)(a+8);
        System.out.println(a);

        // Decript
        a=(char)(a-8);
        System.out.println(a);
    }
}
