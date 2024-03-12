
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Timer timer = new Timer();

        for (int i = 0; i < 1000; i++) {
            System.out.println(timer);
            timer.advance();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}