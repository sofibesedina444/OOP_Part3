package Animal;

import java.util.Objects;

public abstract class Animal {
    private String animalName;
    private int animalYear;

    public Animal(String animalName, int animalYear) {
        setAnimalName(animalName);
        setAnimalYear(animalYear);
    }

    public String getAnimalName() {
        return animalName;
    }

    public final void setAnimalName(String animalName) {
        if (animalName != null && !animalName.isEmpty()) {
            this.animalName = animalName;
        } else {
            this.animalName = "Животное";
        }
    }

    public int getAnimalYear() {
        return animalYear;
    }

    public final void setAnimalYear(int animalYear) {
        if (animalYear > 0) {
            this.animalYear = animalYear;
        } else {
            this.animalYear = 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return animalYear == animal.animalYear && Objects.equals(animalName, animal.animalName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(animalName, animalYear);
    }

    @Override
    public String toString() {
        return "Название вида: " + getAnimalName() + "," + "\n" +
                "Возраст животного: " + getAnimalYear() + "," + "\n";
    }

    public abstract void eat();

    public abstract void sleep();

    public abstract void go();
}
