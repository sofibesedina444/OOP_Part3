package Transport;

import java.time.LocalDate;

public class Automobile extends Transport {
    private double engineVolume;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int seatsNumber;
    private boolean summerTireType;
    private Key key;
    private Insurance insurance;

    public Automobile(String brand,
                      String model,
                      int year,
                      String country,
                      String color,
                      int maxMovementSpeed,
                      String fuel,
                      double engineVolume,
                      String transmission,
                      String bodyType,
                      String registrationNumber,
                      int seatsNumber,
                      boolean summerTireType,
                      Key key,
                      Insurance insurance) {
        super(brand, model, year, country, color, maxMovementSpeed, fuel);
        setEngineVolume(engineVolume);
        setTransmission(transmission);
        if (bodyType != null && !bodyType.isEmpty()) {
            this.bodyType = bodyType;
        } else {
            this.bodyType = "Седан";
        }
        setRegistrationNumber(registrationNumber);
        if (seatsNumber <= 0) {
            this.seatsNumber = 4;
        } else {
            this.seatsNumber = seatsNumber;
        }
        setSummerTireType(summerTireType);
        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }
        if (insurance == null) {
            this.insurance = new Insurance();
        } else {
            this.insurance = insurance;
        }
    }

    public Automobile(String brand,
                      String model,
                      int year,
                      String country,
                      String color,
                      int maxMovementSpeed,
                      String fuel,
                      double engineVolume) {
        this(brand, model, year, country, color, maxMovementSpeed, fuel, engineVolume,
                "Механический", "Седан", "х000хх000",
                5, true, new Key(), new Insurance());
    }

    public Automobile(String brand,
                      String model,
                      int year,
                      String country,
                      String color,
                      double engineVolume) {
        this(brand, model, year, country, color, 150, "Дизель", engineVolume,
                "Механический", "Седан", "х000хх000",
                5, true, new Key(), new Insurance());
    }

    public Automobile(String brand,
                      String model,
                      int year,
                      String country,
                      String color,
                      String fuel,
                      double engineVolume) {
        this(brand, model, year, country, color, 150, fuel, engineVolume,
                "Механический", "Седан", "х000хх000",
                5, true, new Key(), new Insurance());
    }

    public Automobile(String brand,
                      String model,
                      int year,
                      String country,
                      String color,
                      int maxMovementSpeed,
                      double engineVolume) {
        this(brand, model, year, country, color, maxMovementSpeed, "Дизель", engineVolume,
                "Механический", "Седан", "х000хх000",
                5, true, new Key(), new Insurance());
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission != null && !transmission.isEmpty()) {
            this.transmission = transmission;
        } else {
            this.transmission = "Механический";
        }
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber != null && !registrationNumber.isEmpty()) {
            this.registrationNumber = registrationNumber;
        } else {
            this.registrationNumber = "х000хх000";
        }
    }

    public int getSeatsNumber() {
        return seatsNumber;
    }

    public boolean isSummerTireType() {
        return summerTireType;
    }

    public void setSummerTireType(boolean summerTireType) {
        this.summerTireType = summerTireType;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    @Override
    public String toString() {
        return super.toString() + "," + "\n" +
                "Объем двигателя: " + engineVolume + " л." + "," + "\n" +
                "Тип коробки передач: " + transmission + "," + "\n" +
                "Тип кузова: " + bodyType + "," + "\n" +
                "Регистрационный номер: " + registrationNumber + "," + "\n" +
                "Количество мест: " + seatsNumber + "," + "\n" +
                "Тип резины: " + (isSummerTireType() ? "Летний" : "Зимний") + "," + "\n" +
                "Доступ: " + (getKey().isKeylessEntry() ? "Без ключа" : "При помощи ключа") + "," + "\n" +
                "Запуск двигателя: " + (getKey().isRemoteStart() ? "Удаленный" : "Механический") + "," + "\n" +
                "Номер страховки: " + (getInsurance().getNumber()) + "," + "\n" +
                "Стоимость страховки: " + (getInsurance().getPrice()) + "," + "\n" +
                "Срок действия страховки: " + (getInsurance().getValidity());
    }

    @Override
    public void refill() {
        System.out.println("Вид топлива: " + getFuel() + "\n");
    }

    public void changeTires() {
        summerTireType = !summerTireType;
    }

    public boolean isCorrectRegistrationNumber() {
        if (registrationNumber.length() != 9) {
            return false;
        }
        char[] chars = registrationNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0])
                || !Character.isAlphabetic(chars[4])
                || !Character.isAlphabetic(chars[5])) {
            return false;
        }
        if (!Character.isDigit(chars[1])
                || !Character.isDigit(chars[2])
                || !Character.isDigit(chars[3])
                || !Character.isAlphabetic(chars[6])
                || !Character.isAlphabetic(chars[7])
                || !Character.isAlphabetic(chars[8])) {
            return false;
        }
        return true;
    }

    public static class Key {
        private final boolean remoteStart;
        private final boolean keylessEntry;

        public Key(boolean remoteStart, boolean keylessEntry) {
            this.remoteStart = remoteStart;
            this.keylessEntry = keylessEntry;
        }

        public Key() {
            this(false, false);
        }

        public boolean isRemoteStart() {
            return remoteStart;
        }

        public boolean isKeylessEntry() {
            return keylessEntry;
        }
    }

    public static class Insurance {
        private final LocalDate validity;
        private final double price;
        private final String number;

        public Insurance(LocalDate validity, double price, String number) {
            if (validity == null) {
                this.validity = LocalDate.now().plusDays(365);
            } else {
                this.validity = validity;
            }
            if (number != null && !number.isEmpty()) {
                this.number = number;
            } else {
                this.number = "123456789";
            }
            if (price <= 0) {
                this.price = 15000;
            } else {
                this.price = price;
            }
        }

        public Insurance() {
            this(null, 8500D, null);
        }

        public LocalDate getValidity() {
            return validity;
        }

        public double getPrice() {
            return price;
        }

        public String getNumber() {
            return number;
        }

        public void checkValidityInsurance() {
            if (validity.isBefore(LocalDate.now()) || validity.isEqual(LocalDate.now())) {
                System.out.println("Нужно оформить новую страховку!");
            }
        }

        public void checkNumberInsurance() {
            if (number.length() != 9) {
                System.out.println("Номер страховки некорректный");
            }
        }
    }
}
