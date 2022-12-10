package Transport;
import java.time.LocalTime;

public class Train extends Transport {
    private int cost;
    private LocalTime time;
    private final String departureStationName;
    private final String endStationName;
    private int wagonsNumber;

    public Train(String brand,
                 String model,
                 int year,
                 String country,
                 String color,
                 int maxMovementSpeed,
                 String fuel,
                 int cost,
                 String departureStationName,
                 String endStationName,
                 int wagonsNumber) {
        super(brand, model, year, country, color, maxMovementSpeed, fuel);
        setCost(cost);
        setTime(time);
        if (departureStationName != null && !departureStationName.isEmpty()) {
            this.departureStationName = departureStationName;
        } else {
            this.departureStationName = "Вокзальная";
        }
        if (endStationName != null && !endStationName.isEmpty()) {
            this.endStationName = endStationName;
        } else {
            this.endStationName = "Пригородная";
        }
        setWagonsNumber(wagonsNumber);
    }

    public Train(String brand,
                 String model,
                 int year,
                 String country,
                 String color,
                 int maxMovementSpeed,
                 int cost,
                 String departureStationName,
                 String endStationName,
                 int wagonsNumber) {
        this(brand, model, year, country, color, maxMovementSpeed,"Дизель", cost, departureStationName,
                endStationName, wagonsNumber);
    }

    public Train(String brand,
                 String model,
                 int year,
                 String country,
                 String color,
                 String fuel,
                 int cost,
                 String departureStationName,
                 String endStationName,
                 int wagonsNumber) {
        this(brand, model, year, country, color, 150, fuel, cost, departureStationName,
                endStationName, wagonsNumber);
    }

    public Train(String brand,
                 String model,
                 int year,
                 String country,
                 String color,
                 int cost,
                 String departureStationName,
                 String endStationName,
                 int wagonsNumber) {
        this(brand, model, year, country, color, 150, "Дизель", cost, departureStationName,
                endStationName, wagonsNumber);
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        if (cost > 0) {
            this.cost = cost;
        } else {
            this.cost = 4000;
        }
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        if (time != LocalTime.of(0, 0)) {
            this.time = time;
        } else {
            this.time = LocalTime.of(4, 30);
        }
    }

    public String getDepartureStationName() {
        return departureStationName;
    }

    public String getEndStationName() {
        return endStationName;
    }

    public int getWagonsNumber() {
        return wagonsNumber;
    }

    public void setWagonsNumber(int wagonsNumber) {
        if (wagonsNumber > 0) {
            this.wagonsNumber = wagonsNumber;
        } else {
            this.wagonsNumber = 10;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "," + "\n" +
                "Цена поездки: " + cost + "руб." + "," + "\n" +
                "Время поездки: " + time + "," + "\n" +
                "Название станции отбытия: " + departureStationName + "," + "\n" +
                "Название конечной станции: " + endStationName + "," + "\n" +
                "Количество вагонов: " + wagonsNumber;
    }

    @Override
    public void refill() {
            if (!fuel.equals("Дизель")) {
                this.fuel = "Дизель";
        }
        System.out.println("Вид топлива: " + getFuel() + "\n");
    }
}
