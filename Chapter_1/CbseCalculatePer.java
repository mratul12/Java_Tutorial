package Chapter_1;
public class CbseCalculatePer {
    public static void main(String[] args) {
        System.out.println("The marks of CBSE Board Student:");
        int Hindi = 90;
        int English = 95;
        int Physics = 89;
        int Computer = 96;
        int Chemestry = 78;
        int sum = Hindi + English + Physics + Computer + Chemestry;
        float Per = sum / 5f;
        System.out.println("Total number of Percentage: " +Per);
    }
}