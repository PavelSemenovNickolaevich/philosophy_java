package practice.task9.car;

/**
 * 2. Создать абстрактный класс Car, представляющий собой
 * автомобиль.
 * Добавить в него поля: марка, модель, год выпуска + несколько
 * своих.
 * Создать 4 класса, являющихся наследниками Car.
 * Переопределить во всех 3-х классах методы equals(), hashCode() и
 * toString()
 * Создать класс Garage, хранящий в себе HashMap автомобилей,
 * в котором ключом является объект автомобиля, значением -
 * количество точно таких автомобилей в гараже.
 * Добавить в класс Garage методы для парковки, выезда авто, а также
 * для получения количества определенного вида автомобилей.
 * Продемонстрировать работу гаража.
 */

public class Main {

    public static void main(String[] args) {
        Garage garage = new Garage();
        garage.park(new Truck(Model.STATION_WAGON,Color.BLACK, Brand.MERCEDES, 1990, 2000 ));
        garage.park(new RacingCar(Model.SEDAN,Color.RED, Brand.VOLVO, 2000, 170 ));
        garage.park(new Bus(Model.CROSSOVER,Color.GREEN, Brand.AUDI, 2010, 56 ));
        garage.park(new Bus(Model.CROSSOVER,Color.GREEN, Brand.AUDI, 2010, 56 ));

        System.out.println(garage);


        System.out.println(garage.getCarByModel(Model.CROSSOVER));
        System.out.println(garage.getCarCountByBrand(Brand.VOLVO));



    }
}
