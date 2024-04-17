
public class Main {

    public static void main(String[] args) {
        Stack s = new Stack();
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        s.add("Value");
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        String taken = s.take();
        System.out.println(s.isEmpty());
        System.out.println(s.values());
        System.out.println(taken);

        Stack s2 = new Stack();
        s2.add("1");
        s2.add("2");
        s2.add("3");
        s2.add("4");
        s2.add("5");

        while (!s2.isEmpty()) {
            System.out.println(s2.take());
        }
    }
}
