import Animal.Animal;
import Animal.Amphibian;
import Animal.Mammal;
import Animal.Herbivore;
import Animal.Predator;
import Animal.Bird;
import Animal.Flightless;
import Animal.Flying;
import Transport.Automobile;
import Transport.Train;
import Transport.Bus;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        //Транспортные средства
        Automobile lada = new Automobile("Lada", "Granta", 2015,
                "Россия", "Желтый", 1.7);
        System.out.println(lada);
        lada.refill();

        Automobile audi = new Automobile("Audi", "A8 50 L TDI quattro", 2020,
                "Германия", "Черный", 3.0);
        audi.setTransmission("Автоматический");
        System.out.println(audi);
        audi.setFuel("Бензин");
        audi.refill();

        Automobile bmw = new Automobile("BMW", "Z8", 2021,
                "Германия", "Черный", 3.0);
        bmw.setSummerTireType(false);
        bmw.setFuel("Бензин");
        System.out.println(bmw);
        bmw.refill();

        Automobile kia = new Automobile("Kia", "Sportage 4-го поколения", 2018,
                "Южная Корея", "Красный", 2.4);
        kia.setRegistrationNumber("К222ОТ783");
        kia.setFuel("Бензин или Дизель");
        System.out.println(kia);
        kia.refill();
        System.out.println(kia.isCorrectRegistrationNumber());
        System.out.println();

        Automobile hyundai = new Automobile("Hyundai", "Avante", 2016,
                "Южная Корея", "Оранжевый", 1.6);
        hyundai.setKey(new Automobile.Key(true, true));
        hyundai.setInsurance(new Automobile.Insurance(LocalDate.now(), 15000D, "98765432"));
        hyundai.setFuel("Электричество");
        System.out.println(hyundai);
        hyundai.refill();
        hyundai.getInsurance().checkNumberInsurance();
        hyundai.getInsurance().checkValidityInsurance();
        System.out.println();


        Train martin = new Train("Ласточка", "B - 901", 2011, "Россия", null, "Бензин", 3500,
                "Белорусский вокзал", "Минск-Пассажирский", 11);
        martin.setTime(LocalTime.of(2, 15));
        martin.setMaxMovementSpeed(301);
        System.out.println(martin);
        martin.refill();

        Train leningrad = new Train("Ленинград", "D - 125", 2019, "Россия", null, 1700,
                "Ленинградкий вокзал", "Ленинград-Пассажирский", 8);
        leningrad.setTime(LocalTime.of(0, 0));
        leningrad.setMaxMovementSpeed(270);
        leningrad.setFuel("Бензин");
        System.out.println(leningrad);
        leningrad.refill();


        Bus liaz = new Bus("ЛиАз", "5292", 2015, "Россия", "Зеленый");
        System.out.println(liaz);
        liaz.refill();

        Bus paz = new Bus("ПАЗ", "4230", 2020, "Россия", null, 120,
                "Дизель");
        System.out.println(paz);
        paz.refill();
        Bus volvo = new Bus("Volvo", "7900", 2011, "Швеция", "Серебрянный",
                200, "Бензин");
        System.out.println(volvo);
        volvo.refill();

        //Животные
        Herbivore gazelle = new Herbivore("Газель", 2, "Наземная", "Растительный");
        System.out.print(gazelle);
        gazelle.eat();
        gazelle.go();
        gazelle.walk();
        gazelle.graze();
        System.out.println();

        Herbivore giraffe = new Herbivore("Жираф", 5, 50, "Растительный");
        System.out.print(giraffe);
        giraffe.eat();
        giraffe.go();
        giraffe.walk();
        giraffe.graze();
        System.out.println();

        Herbivore horse = new Herbivore("Лошадь", 7, "Наземная", 88);
        Herbivore horse1 = new Herbivore("Лошадь", 5, "Наземная", 87);
        System.out.print(horse);
        horse.eat();
        horse.go();
        horse.walk();
        horse.graze();
        System.out.println();


        Predator hyena = new Predator("Гиена", 1, "Наземная", "Животный");
        System.out.print(hyena);
        hyena.eat();
        hyena.go();
        hyena.walk();
        hyena.hunt();
        System.out.println();

        Predator tiger = new Predator("Тигр", 4, 57, "Животный");
        System.out.print(tiger);
        tiger.eat();
        tiger.go();
        tiger.walk();
        tiger.hunt();
        System.out.println();

        Predator bear = new Predator("Медведь", 9, "Наземная", 50);
        Predator bear1 = new Predator("Медведь", 10, "Наземная", 55);
        System.out.print(bear);
        bear.eat();
        bear.go();
        bear.walk();
        bear.hunt();
        System.out.println();


        Amphibian frog = new Amphibian("Лягушка", 3, "Наземная и водная");
        System.out.print(frog);
        frog.eat();
        frog.go();
        frog.hunt();
        System.out.println();

        Amphibian snake = new Amphibian("Уж", 6);
        Amphibian snake1 = new Amphibian("Уж", 7);
        System.out.print(snake);
        snake.eat();
        snake.go();
        snake.hunt();
        System.out.println();


        Flightless peacock = new Flightless("Павлин", 8, "Наземная", "Наземный");
        System.out.print(peacock);
        peacock.eat();
        peacock.go();
        peacock.hunt();
        peacock.walk();
        System.out.println();

        Flightless penguin = new Flightless("Пингвин", 10);
        Flightless penguin1 = new Flightless("Пингвин", 8);
        System.out.print(penguin);
        penguin.eat();
        penguin.go();
        penguin.hunt();
        penguin.walk();
        System.out.println();

        Flightless dodo = new Flightless("Додо", 1, "Наземная", "Наземный");
        System.out.print(dodo);
        dodo.eat();
        dodo.go();
        dodo.hunt();
        dodo.walk();
        System.out.println();


        Flying gull = new Flying("Чайка", 3, "Наземная", "Воздушный");
        System.out.print(gull);
        gull.eat();
        gull.go();
        gull.hunt();
        gull.fly();
        System.out.println();

        Flying albatross = new Flying("Альбатрос", 6);
        System.out.print(albatross);
        albatross.eat();
        albatross.go();
        albatross.hunt();
        albatross.fly();
        System.out.println();

        Flying falcon = new Flying("Сокол", 4);
        Flying falcon1 = new Flying("Сокол", 6);
        System.out.print(falcon);
        falcon.eat();
        falcon.go();
        falcon.hunt();
        falcon.fly();
        System.out.println();

        compareAnimals(horse, horse1);
        compareAnimals(bear, bear1);
        compareAnimals(snake, snake1);
        compareAnimals(penguin, penguin1);
        compareAnimals(falcon, falcon1);
        compareAnimals(giraffe, frog);
        compareAnimals(albatross, albatross);
    }

    public static void compareAnimals(Animal animal1, Animal animal2) {
        System.out.println(animal1.equals(animal2) ? "Животные одинаковые" : "Животные разные");
    }
}