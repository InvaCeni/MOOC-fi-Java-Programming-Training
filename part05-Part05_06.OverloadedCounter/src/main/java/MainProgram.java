
public class MainProgram {

    public static void main(String[] args) {
        // Create a counter with a start value of 5
        Counter counter1 = new Counter(5);

        // Create a counter with the default start value of 0
        Counter counter2 = new Counter();

        // Print the initial values of the counters
        System.out.println("Counter 1 value: " + counter1.value());
        System.out.println("Counter 2 value: " + counter2.value());

        // Increase the value of counter 1
        counter1.increase();

        // Decrease the value of counter 2
        counter2.decrease();

        // Print the updated values of the counters
        System.out.println("Counter 1 value after increase: " + counter1.value());
        System.out.println("Counter 2 value after decrease: " + counter2.value());
    }
}
