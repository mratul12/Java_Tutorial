public class Practice_3Q_3 {
    public static void main(String[] args) {
        String letter=new String("Dear <|name|>, Thanks a lot!");
        letter=letter.replace("<|name|>", "Atul");
        System.out.println(letter);
    }
}
