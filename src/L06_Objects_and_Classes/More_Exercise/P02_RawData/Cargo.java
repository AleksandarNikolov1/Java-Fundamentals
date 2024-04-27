package L06_Objects_and_Classes.More_Exercise.P02_RawData;

public class Cargo {
    private int weight ;
    private String type;

    public Cargo(int weight, String type) {
        this.weight = weight;
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
