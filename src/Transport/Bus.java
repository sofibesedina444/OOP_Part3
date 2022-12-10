package Transport;

public class Bus extends Transport {

    public Bus(String brand,
               String model,
               int year,
               String country,
               String color,
               int maxMovementSpeed,
               String fuel) {
        super(brand, model, year, country, color, maxMovementSpeed, fuel);
    }

    public Bus(String brand, String model, int year, String country, String color) {
        this(brand, model, year, country, color, 150);
    }

    public Bus(String brand, String model, int year, String country, String color, int maxMovementSpeed) {
        this(brand, model, year, country, color, maxMovementSpeed, "Дизель");
    }

    @Override
    public void refill() {
        if (fuel.equalsIgnoreCase("Электричество")) {
            this.fuel = "Дизель";
        }
        System.out.println("Вид топлива: " + getFuel() + "\n");
    }
}
