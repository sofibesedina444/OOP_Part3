package Animal;

import java.util.Objects;

public class Mammal extends Animal {
    String habitat;
    int movingSpeed;

    public Mammal(String animalName, int animalYear, String habitat, int movingSpeed) {
        super(animalName, animalYear);
        setHabitat(habitat);
        setMovingSpeed(movingSpeed);
    }

    public Mammal(String animalName, int animalYear, int movingSpeed) {
        this(animalName, animalYear, "Наземная", movingSpeed);
    }

    public Mammal(String animalName, int animalYear, String habitat) {
        this(animalName, animalYear, habitat, 0);
    }

    public String getHabitat() {
        return habitat;
    }

    public final void setHabitat(String habitat) {
        if (habitat != null && !habitat.isEmpty()) {
            if (habitat.equalsIgnoreCase("Наземная")) {
                this.habitat = habitat;
            } else {
                this.habitat = "Наземная";
            }
        }
    }

    public int getMovingSpeed() {
        return movingSpeed;
    }

    public final void setMovingSpeed(int movingSpeed) {
        if (movingSpeed > 0) {
            this.movingSpeed = movingSpeed;
        } else {
            this.movingSpeed = 0;
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "Среда обитания: " + getHabitat() + "," + "\n" +
                "Скорость перемещения: " + getMovingSpeed() + " км/ч." + "," +"\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mammal)) return false;
        if (!super.equals(o)) return false;
        Mammal mammal = (Mammal) o;
        return movingSpeed == mammal.movingSpeed && habitat.equals(mammal.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), habitat, movingSpeed);
    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void go() {
        System.out.println("Перемещаюсь по суше и/или в воде");
    }

    public void walk() {
        System.out.println("Гуляю, где хочу");
    }
}
