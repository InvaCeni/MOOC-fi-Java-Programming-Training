import java.util.ArrayList;

public class Hold {
    private int maximumWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (totalWeight() + suitcase.totalWeight() <= maximumWeight) {
            this.suitcases.add(suitcase);
        }
    }

    public String toString() {
        if (this.suitcases.isEmpty()) {
            return "no suitcases (0 kg)";
        } else if (this.suitcases.size() == 1) {
            return "1 suitcase (" + totalWeight() + " kg)";
        } else {
            return this.suitcases.size() + " suitcases (" + totalWeight() + " kg)";
        }
    }

    public void printItems() {
        for (Suitcase suitcase : this.suitcases) {
            suitcase.printItems();
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Suitcase suitcase : this.suitcases) {
            totalWeight += suitcase.totalWeight();
        }
        return totalWeight;
    }
}

