public class Cube {

    private int edgeLength;

    // Constructor
    public Cube(int edgeLength) {
        this.edgeLength = edgeLength;
    }

    // Method to calculate volume
    public int volume() {
        return edgeLength * edgeLength * edgeLength;
    }

    // toString method to represent Cube object as a string
    public String toString() {
        return "The length of the edge is " + edgeLength + " and the volume " + volume();
    }
}