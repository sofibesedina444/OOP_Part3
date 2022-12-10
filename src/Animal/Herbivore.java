package Animal;

import java.util.Objects;

public final class Herbivore extends Mammal {

    String typeFood;

    public Herbivore(String animalName, int animalYear, String habitat, int movingSpeed, String typeFood) {
        super(animalName, animalYear, habitat, movingSpeed);
        setTypeFood(typeFood);
    }

    public Herbivore(String animalName, int animalYear, int movingSpeed, String typeFood) {
        this(animalName, animalYear, "Наземная", movingSpeed, typeFood);
    }

    public Herbivore(String animalName, int animalYear, String habitat, String typeFood) {
        this(animalName, animalYear, habitat, 0, typeFood);
    }

    public Herbivore(String animalName, int animalYear, String habitat, int movingSpeed) {
        this(animalName, animalYear, habitat, movingSpeed, "Растительный");
    }


    public String getTypeFood() {
        return typeFood;
    }

    public void setTypeFood(String typeFood) {
        if (typeFood != null && !typeFood.isEmpty()) {
            if (typeFood.equalsIgnoreCase("Растительный")) {
                this.typeFood = typeFood;
            } else {
                this.typeFood = "Растительный";
            }
        }
    }

    @Override
    public String toString() {
        return "Млекопитающие:" + "\n" +
                "Травоядные:" + "\n" +
                super.toString() +
                "Тип пищи: " + getTypeFood() + "," +"\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Herbivore)) return false;
        if (!super.equals(o)) return false;
        Herbivore herbivore = (Herbivore) o;
        return typeFood.equals(herbivore.typeFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeFood);
    }

    @Override
    public void eat() {
        System.out.println("Питаюсь растительной пищей - травой");
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public void go() {
        super.go();
    }

    @Override
    public void walk() {
        super.walk();
    }

    public void graze() {
        System.out.println("Пасусь в степи");
    }
}
