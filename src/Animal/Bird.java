package Animal;

import java.util.Objects;

public class Bird extends Animal{
    String habitat;

    public Bird(String animalName, int animalYear, String habitat) {
        super(animalName, animalYear);
        setHabitat(habitat);
    }

    public Bird(String animalName, int animalYear) {
        this(animalName, animalYear, "Наземная");
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

    @Override
    public String toString() {
        return super.toString() +
                "Среда обитания: " + getHabitat() + "," + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bird)) return false;
        if (!super.equals(o)) return false;
        Bird bird = (Bird) o;
        return habitat.equals(bird.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), habitat);
    }

    @Override
    public void eat() {
        System.out.println("Могу питаться разнообразными растительными и/или животными кормами");
    }

    @Override
    public void sleep() {

    }

    @Override
    public void go() {

    }

    public void hunt() {
        System.out.println("Охочусь на суше и в воздухе");
    }
}
