package Animal;

import java.util.Objects;

public class Amphibian extends Animal {
    String habitat;

    public Amphibian(String animalName, int animalYear, String habitat) {
        super(animalName, animalYear);
        setHabitat(habitat);
    }

    public Amphibian(String animalName, int animalYear) {
        this(animalName, animalYear, "Наземная и водная");
    }

    public String getHabitat() {
        return habitat;
    }

    public final void setHabitat(String habitat) {
        if (habitat != null && !habitat.isEmpty()) {
            if (habitat.equalsIgnoreCase("Наземная") || habitat.equalsIgnoreCase("Водная")) {
                this.habitat = habitat;
            } else {
                this.habitat = "Водная";
            }
        }
    }

    @Override
    public String toString() {
        return "Земноводные:" + "\n" +
                super.toString() +
                "Среда обитания: " + getHabitat() + "," +"\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Amphibian)) return false;
        if (!super.equals(o)) return false;
        Amphibian amphibian = (Amphibian) o;
        return habitat.equals(amphibian.habitat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), habitat);
    }

    @Override
    public void eat() {
        System.out.println("Питаюсь мелкими животными - в основном насекомыми и беспозвоночными");
    }

    @Override
    public void sleep() {

    }

    @Override
    public void go() {
        System.out.println("Перемещаюсь по суше и в воде");
    }

    public void hunt() {
        System.out.println("Охочусь на суше и в воде");
    }
}
