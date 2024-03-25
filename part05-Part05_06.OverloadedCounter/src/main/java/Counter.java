public class Counter {
    private int value;

    // Constructor with parameter to set start value
    public Counter(int startValue) {
        this.value = startValue;
    }

    // Default constructor sets start value to 0
    public Counter() {
        this.value = 0;
    }

    // Method to return the current value of the counter
    public int value() {
        return this.value;
    }

    // Method to increase the value by 1
    public void increase() {
        this.value++;
    }

    // Method to decrease the value by 1
    public void decrease() {
        this.value--;
    }

    // Method to increase the value by a specified amount
    public void increase(int increaseBy) {
        if (increaseBy >= 0) {
            this.value += increaseBy;
        }
    }

    // Method to decrease the value by a specified amount
    public void decrease(int decreaseBy) {
        if (decreaseBy >= 0) {
            this.value -= decreaseBy;
        }
    }
}




