package L06_Objects_and_Classes.Exercise.P06_VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        List<Car> cars = new ArrayList<>();
        List<Truck> trucks = new ArrayList<>();


        while (!input.equals("End")) {

            String[] tokens = input.split("\\s+");

            String type = tokens[0];
            String model = tokens[1];
            String color = tokens[2];
            int hp = Integer.parseInt(tokens[3]);

            if (type.equals("car")) {
                Car car = new Car(type, model, color, hp);
                cars.add(car);
            } else if (type.equals("truck")) {
                Truck truck = new Truck(type, model, color, hp);
                trucks.add(truck);
            }

            input = sc.nextLine();

        }

        String vehicleModel = sc.nextLine();

        while (!vehicleModel.equals("Close the Catalogue")) {

            for (Car car : cars) {
                if (car.getModel().equals(vehicleModel)) {
                    System.out.print(car.toString());
                }
            }

            for (Truck truck : trucks) {
                if (truck.getModel().equals(vehicleModel)) {
                    System.out.print(truck.toString());
                }
            }

            vehicleModel = sc.nextLine();


        }

        double avgCarsHp = Car.getAverageHp(cars);
        double avgTrucksHp = Truck.getAverageHp(trucks);

        if (cars.isEmpty())
            avgCarsHp = 0.0;

        if (trucks.isEmpty())
            avgTrucksHp = 0.0;

        System.out.printf("Cars have average horsepower of: %.2f.%n", avgCarsHp);
        System.out.printf("Trucks have average horsepower of: %.2f.%n", avgTrucksHp);
    }
}
