import Transport.Car;
import Transport.Transport;

public class Main {
    public static void main(String[] args) {
        System.out.println("Про машины");
        Car car1 = new Car("Lada", "Granta", 2015, "Россия(и)", "Желтый(того)",
                290,1.7, "механическая", "легковая",
                "с035ов277", 3);
        Car car2 = new Car("Audi ", "A8 50 L TDI quattro", 2020, "Германии(я)", "черный",
                300, 3.0, "автомат", "седан", "в077ин326",
                5);
        Car car3 = new Car("BMW", "Z8", 2021, "Германия", "черный", 295,
                3.0, "автомат", "седан", "о077иу327", 5);
        Car car4 = new Car("Kia", "Sportage 4-го поколения", 2018, "Южной Корее(Южная Корея)",
                "красный", 240,2.4, "автомат", "легковая",
                "о445ва973", 4);
        Car car5 = new Car("Hyundai", "Avante", 2016, "Южная корея(Южной Корее)", "оранжевый",
                260,1.6, "автомат", "легковая", "у18мн746",
                4);
        Car car6 = new Car(null, null, -1990, "", "",
                150,1.2, null, null, null, 0);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
        System.out.println(car6);
        System.out.println();

    }
}