import java.util.*;
public class KilomToMileUsrInpu {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        System.out.println("Enter the kilometer");
        Scanner sc = new Scanner(System.in);
        double Kilometer = sc.nextDouble();
        double Mile = Kilometer*0.621;
        System.out.println("The conversion of Kilometer to Mile: "+Mile);
    }
}
