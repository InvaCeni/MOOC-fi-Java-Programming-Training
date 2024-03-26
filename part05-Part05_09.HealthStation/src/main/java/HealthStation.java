
public class HealthStation {
    private int weighingCount; // Instance variable to count the number of weighings

    public HealthStation() {
        this.weighingCount = 0; // Initialize the weighing count to 0 in the constructor
    }

    public int weigh(Person person) {
        // Increase the weighing count each time the weigh method is called
        this.weighingCount++;
        // Return the weight of the person passed as the parameter
        return person.getWeight();
    }

    public void feed(Person person) {
        // Increase the weight of the parameter person by one
        person.setWeight(person.getWeight() + 1);
    }

    public int weighings() {
        // Return the number of weighings performed by the health station
        return this.weighingCount;
    }

}
