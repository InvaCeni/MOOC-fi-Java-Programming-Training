public class Product {
    private final String name;
    private final String location;
    private final int weight;

    // Original constructor
    public Product(String name, String location, int weight) {
        this.name = name;
        this.location = location;
        this.weight = weight;
    }

    // New constructor with name only
    public Product(String name) {
        this(name, "shelf", 1);
    }

    // New constructor with name and location
    public Product(String name, String location) {
        this(name, location, 1);
    }

    // New constructor with name and weight
    public Product(String name, int weight) {
        this(name, "shelf", weight);
    }

    // Getters and toString method remain the same
    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.weight + " kg) can be found from the " + this.location;
    }
}