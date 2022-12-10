package Transport;

public abstract class Transport {

    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private String color;
    private int maxMovementSpeed;
    String fuel;

    public Transport(String brand,
                     String model,
                     int year,
                     String country,
                     String color,
                     int maxMovementSpeed,
                     String fuel) {
        if (brand != null && !brand.isEmpty()) {
            this.brand = brand;
        } else {
            this.brand = "default";
        }
        if (model != null && !model.isEmpty()) {
            this.model = model;
        } else {
            this.model = "default";
        }
        if (year <= 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (country != null && !country.isEmpty()) {
            this.country = country;
        } else {
            this.country = "default";
        }
        setColor(color);
        setMaxMovementSpeed(maxMovementSpeed);
        setFuel(fuel);
    }

    public Transport(String brand, String model, int year, String country, String color) {
        this(brand, model, year, country, color, 150,"Дизель");
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color != null && !color.isEmpty()) {
            this.color = color;
        } else {
            this.color = "Белый";
        }
    }

    public int getMaxMovementSpeed() {
        return maxMovementSpeed;
    }

    public void setMaxMovementSpeed(int maxMovementSpeed) {
        if (maxMovementSpeed > 0) {
            this.maxMovementSpeed = maxMovementSpeed;
        }
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        if (fuel != null && !fuel.isEmpty()) {
            if (fuel.equalsIgnoreCase("Бензин")) {
                this.fuel = fuel;
            } else if (fuel.equalsIgnoreCase("Электричество")) {
                this.fuel = fuel;
            } else {
                this.fuel = "Дизель";
            }
        }
    }

    @Override
    public String toString() {
        String separator = " ";
        return "Бренд и модель: " + getBrand() + separator + getModel() + "," + "\n" +
                "Год выпуска: " + getYear() + "," + "\n" +
                "Страна сборки: " + getCountry() + "," + "\n" +
                "Цвет кузова: " + getColor() + "," + "\n" +
                "Максимальная скорость передвижения: " + getMaxMovementSpeed();
    }

    public abstract void refill();

}

