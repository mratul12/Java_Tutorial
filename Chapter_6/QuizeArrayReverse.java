// Quick Quiz: Displaying the Array in Reverse Order (for loop)

public class QuizeArrayReverse {
    public static void main(String [] args) {
        int [] marks = {89,56,34,56};
        for(int i=marks.length-1; i>=0; i--){
            System.out.println(marks[i]);
        }
    }
}
