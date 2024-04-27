package L06_Objects_and_Classes.Exercise.P06_VehicleCatalogue;

import java.util.List;

public abstract class Vehicle {

    private String type;
    private String model;
    private String color;
    private int hp;

    public Vehicle(String type, String model, String color, int hp) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.hp = hp;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public int getHp() {
        return hp;
    }

    public static <T extends Vehicle> double getAverageHp(List<T> vehicles){
        double sum = 0;

        for (T vehicle : vehicles) {
            sum += vehicle.getHp();
        }

        return sum / (double) vehicles.size();
    }

    @Override
    public String toString() {
        return String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %d%n",
                this.getClass().getSimpleName(), this.model, this.color, this.hp);
    }
}
