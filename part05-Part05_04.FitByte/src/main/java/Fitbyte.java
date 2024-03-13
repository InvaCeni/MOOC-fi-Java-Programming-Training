public class Fitbyte {

    private int age;
    private int restingHeartRate;

    public Fitbyte (int age, int restingHeartRate){
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }
    // Method to calculate maximum heart rate
    private double maximumHeartRate() {
        return 206.3 - (0.711 * age);
    }

    // Method to calculate target heart rate
    public double targetHeartRate(double percentageOfMaximum) {
        return ((maximumHeartRate() - restingHeartRate) * percentageOfMaximum) + restingHeartRate;
    }
}
