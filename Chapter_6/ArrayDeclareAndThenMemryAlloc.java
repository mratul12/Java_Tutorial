public class ArrayDeclareAndThenMemryAlloc {
    public static void main(String[] args) {
        /* Classroom of 500 students - you have to store marks of these 500 students.
        you have 2 options:
        1. create 500 variables
        2. use arrays (recommended)
        */
        // 2. Declaration and then memory allocation.
        
        int [] mark;
        mark = new int[5];
        mark [0] = 96;
        mark [1] = 80;
        mark [2] = 70;
        mark [3] = 46;
        mark [4] = 66;
        // mark [5] =96; - throws an error
        System.out.println(mark[3]);
    }
}
