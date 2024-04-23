
public class Main {
    public static void main(String[] args) {
        SimpleCollection s = new SimpleCollection("alphabet");
        System.out.println(s);

        System.out.println();

        s.add("a");
        System.out.println(s);

        System.out.println();

        s.add("b");
        System.out.println(s);

        System.out.println();

        s.add("c");
        System.out.println(s);

        System.out.println();

        SimpleCollection s2 = new SimpleCollection("characters");
        System.out.println(s2);

        System.out.println();

        s2.add("magneto");
        System.out.println(s2);

        System.out.println();

        s2.add("mystique");
        System.out.println(s2);

        System.out.println();

        s2.add("phoenix");
        System.out.println(s2);
    }
}