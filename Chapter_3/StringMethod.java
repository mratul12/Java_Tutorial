public class StringMethod {
    public static void main(String[] args) {
        String name="Atul";
        // String name=new String("Atul");
        System.out.println(name);

        int value=name.length();
        System.out.println(value);

        System.out.println(name.toLowerCase());

        System.out.println(name.toUpperCase());

        String name2="  Dubey  ";
        System.out.println(name2);
        String trim=name2.trim();
        System.out.println(trim);

        System.out.println(name.substring(3));

        System.out.println(name.substring(1,4));

        System.out.println(name.replace('t', 'S'));

        System.out.println(name.replace("tul","nuj"));

        System.out.println(name.startsWith("Atu"));
        System.out.println(name.startsWith("Anu"));

        System.out.println(name.endsWith("ul"));
        System.out.println(name.endsWith("uj"));

        System.out.println(name.charAt(0));

        String Crs="Seematiwari";
        System.out.println(Crs.indexOf("ma"));
        System.out.println(Crs.indexOf("i",7));

        System.out.println(Crs.lastIndexOf("a"));
        System.out.println(Crs.lastIndexOf("a", 7));

        System.out.println(Crs.equals(Crs));
        System.out.println(Crs.equals("Seema"));

        System.out.println(Crs.equalsIgnoreCase("seeMatIwARi"));

        System.out.println("I am excape sequence \\ double quote ");
        System.out.println("I am excape sequence \'double quote\'");
        System.out.println("I am excape sequence \"double quote\"");
        System.out.println("I am excape sequence \t double quote ");
        System.out.println("I am excape sequence \n double quote ");
    }
}
