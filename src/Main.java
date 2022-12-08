import Transport.Bus;
import Transport.Car;
import Transport.Train;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n" + "Про машины" + "\n");
        Car car1 = new Car("Lada", "Granta", 2015, "Россия(и)", "Желтый(того)",
                290, 1.7, "механическая", "легковая",
                "с035ов277", 3);
        Car car2 = new Car("Audi ", "A8 50 L TDI quattro", 2020, "Германии(я)", "черный",
                300, 3.0, "автомат", "седан", "в077ин326",
                5);
        Car car3 = new Car("BMW", "Z8", 2021, "Германия", "черный", 295,
                3.0, "автомат", "седан", "о077иу327", 5);
        Car car4 = new Car("Kia", "Sportage 4-го поколения", 2018, "Южной Корее(Южная Корея)",
                "красный", 240, 2.4, "автомат", "легковая",
                "о445ва973", 4);
        Car car5 = new Car("Hyundai", "Avante", 2016, "Южная корея(Южной Корее)", "оранжевый",
                260, 1.6, "автомат", "легковая", "у18мн746",
                4);
        Car car6 = new Car(null, null, -1990, "", "",
                150, 1.2, null, null, null, 0);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
        System.out.println(car6);
        car6.refill();

        System.out.println("\n" + "Про поезда" + "\n");
        Train lastochka = new Train("Ласточка", "B-901", 2011, "", "", 301,
                "Белорусский вокзал", "Минск-Пассажирский", 0, 3500,
                11);
        Train leningrad = new Train("Ленинград", "D-125", 2019, "", "", 270,
                "Ленинградский вокзал", "Ленинград-Пассажирский", 0, 1700,
                8);
        Train train = new Train(null, null, 0, null, null, 0,
                null, null, 0, 0, 0);

        System.out.println(lastochka);
        System.out.println(leningrad);
        train.refill();

        System.out.println("\n" + "Про автобусы" + "\n");
        Bus volvo = new Bus("Volvo", "VL20", 2017, "Швеция", "Серебристо-серый",
                300);
        Bus liaz = new Bus("ЛиАЗ", "л17-3", 2009, "Россия", "Сине-голубой",
                290);
        Bus hyundai = new Bus("Hyundai", "h5.d21", 2020, "Япония", "Белый с полосами",
                295);
        Bus bus = new Bus(null, null, 0, null, null, 0);

        System.out.println(volvo);
        System.out.println(liaz);
        System.out.println(hyundai);
        System.out.println(bus);
        bus.refill();
    }
}