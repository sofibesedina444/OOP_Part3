package Animal;

import java.util.Objects;

public final class Flying extends Bird {
    String typeMovement;

    public Flying(String animalName, int animalYear, String habitat, String typeMovement) {
        super(animalName, animalYear, habitat);
        setTypeMovement(typeMovement);
    }

    public Flying(String animalName, int animalYear) {
        this(animalName, animalYear, "Наземная", "Воздушный");
    }

    public String getTypeMovement() {
        return typeMovement;
    }

    public void setTypeMovement(String typeMovement) {
        if (typeMovement != null && !typeMovement.isEmpty()) {
            if (typeMovement.equalsIgnoreCase("Воздушный")) {
                this.typeMovement = typeMovement;
            } else {
                this.typeMovement = "Воздушный";
            }
        }
    }

    @Override
    public String toString() {
        return "Птицы:" + "\n" +
                "Летающие:" + "\n" +
                super.toString() +
                "Тип передвижения: " + getTypeMovement() + "," +"\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flying)) return false;
        if (!super.equals(o)) return false;
        Flying flying = (Flying) o;
        return typeMovement.equals(flying.typeMovement);
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
        System.out.println("Перемещаюсь по воздуху, суше или воде");
    }

    @Override
    public void hunt() {
        super.hunt();
    }

    public void fly() {
        System.out.println("Летаю по воздуху");
    }
}
