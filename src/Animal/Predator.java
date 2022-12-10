package Animal;

import java.util.Objects;

public final class Predator extends Mammal {

    String typeFood;

    public Predator(String animalName, int animalYear, String habitat, int movingSpeed, String typeFood) {
        super(animalName, animalYear, habitat, movingSpeed);
        setTypeFood(typeFood);
    }

    public Predator(String animalName, int animalYear, int movingSpeed, String typeFood) {
        this(animalName, animalYear, "Наземная", movingSpeed, typeFood);
    }

    public Predator(String animalName, int animalYear, String habitat, String typeFood) {
        this(animalName, animalYear, habitat, 0, typeFood);
    }

    public Predator(String animalName, int animalYear, String habitat, int movingSpeed) {
        this(animalName, animalYear, habitat, movingSpeed, "Животный");
    }

    public String getTypeFood() {
        return typeFood;
    }

    public void setTypeFood(String typeFood) {
        if (typeFood != null && !typeFood.isEmpty()) {
            if (typeFood.equalsIgnoreCase("Животный")) {
                this.typeFood = typeFood;
            } else {
                this.typeFood = "Животный";
            }
        }
    }

    @Override
    public String toString() {
        return "Млекопитающие:" + "\n" +
                "Хищники:" + "\n" +
                super.toString() +
                "Тип пищи: " + getTypeFood() + "," +"\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Predator)) return false;
        if (!super.equals(o)) return false;
        Predator predator = (Predator) o;
        return typeFood.equals(predator.typeFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeFood);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Питаюсь животной пищей - четвероногими");
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

    public void hunt() {
        System.out.println("Охочусь на суше и в воде");
    }
}
