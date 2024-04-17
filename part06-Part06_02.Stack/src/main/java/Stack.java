import java.util.ArrayList;

public class Stack {

    private ArrayList<String> stack;

    public Stack() {
        this.stack = new ArrayList<>();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void add(String value) {
        stack.add(value);
    }

    public ArrayList<String> values() {
        return new ArrayList<>(stack);
    }

    public String take() {
        if (!isEmpty()) {
            int lastIndex = stack.size() - 1;
            return stack.remove(lastIndex);
        } else {
            return null; // or throw an exception if you prefer
        }
    }
}