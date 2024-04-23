
import java.util.ArrayList;

class SimpleCollection {
    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public String longest() {
        if (this.elements.isEmpty()) {
            return null;
        }

        String longestString = this.elements.get(0);
        for (String element : this.elements) {
            if (element.length() > longestString.length()) {
                longestString = element;
            }
        }
        return longestString;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("The collection ").append(this.name).append(" ");
        if (this.elements.isEmpty()) {
            sb.append("is empty.");
        } else {
            sb.append("has ").append(this.elements.size()).append(" element").append(this.elements.size() > 1 ? "s" : "").append(":\n");
            for (String element : this.elements) {
                sb.append(element).append("\n");
            }
        }
        return sb.toString().trim(); // Trim whitespace at the end
    }
}