package Animal;

import java.util.Objects;

public final class Flightless extends Bird {
    String typeMovement;

    public Flightless(String animalName, int animalYear, String habitat, String typeMovement) {
        super(animalName, animalYear, habitat);
        setTypeMovement(typeMovement);
    }

    public Flightless(String animalName, int animalYear) {
        this(animalName, animalYear, "Наземная", "Наземный");
    }

    public String getTypeMovement() {
        return typeMovement;
    }

    public void setTypeMovement(String typeMovement) {
        if (typeMovement != null && !typeMovement.isEmpty()) {
            if (typeMovement.equalsIgnoreCase("Наземный")) {
                this.typeMovement = typeMovement;
            } else {
                this.typeMovement = "Наземный";
            }
        }
    }

    @Override
    public String toString() {
        return "Птицы:" + "\n" +
                "Нелетающие:" + "\n" +
                super.toString() +
                "Тип передвижения: " + getTypeMovement() + "," +"\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flightless)) return false;
        if (!super.equals(o)) return false;
        Flightless that = (Flightless) o;
        return typeMovement.equals(that.typeMovement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeMovement);
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public void go() {
        super.go();
        System.out.println("Перемещаюсь по суше или по воде");
    }

    @Override
    public void hunt() {
        super.hunt();
    }

    public void walk() {
        System.out.println("Гуляю по суше");
    }
}

