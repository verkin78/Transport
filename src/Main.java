import Transport.*;

import java.util.Set;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n" + "В гонках участвуют:" + "\n");
        Car lada = new Car("Lada", "Granta", 1.7, Car.CarBackType.SEDAN);

        Car audi = new Car("Audi ", "A8 50 L TDI quattro", 2.0, Car.CarBackType.SEDAN);

        Car bmw = new Car("BMW", "Z8", 2.1, Car.CarBackType.SEDAN);

        Car kia = new Car("Kia", "Sportage 4-го поколения", 1.4, Car.CarBackType.SEDAN);



        Bus volvo = new Bus("Volvo", "VL20", 3.0, Bus.Capacity.BIG);
        //2017, "Швеция", "Серебристо-серый", 300, 3,//
        Bus liaz = new Bus("ЛиАЗ", "л17-3", 2.8, Bus.Capacity.SUPER_SMALL);
        //2009, "Россия", "Сине-голубой", 290//
        Bus hyundai = new Bus("Hyundai", "h5.d21", 3.1, Bus.Capacity.SUPER_BIG);
        //2020, "Япония", "Белый с полосами", 295//
        Bus daiwoo = new Bus("Daiwoo", "d35-0", 2.9, Bus.Capacity.MEDIUM);
        //Bus bus = new Bus(null, null, 0, null, null, 0);//


        Freight gaz = new Freight("ГАЗ", "г410", 2.5, Freight.Weight.N2);
        Freight mercedes = new Freight("Mercedes", "M701s", 3.1, Freight.Weight.N3);
        Freight kraz = new Freight("КРАЗ", "Кр867", 2.7, Freight.Weight.N1);
        Freight man = new Freight("Man", "m3n25", 2.9, Freight.Weight.N2);
        Freight freight = new Freight("", "", 0, Freight.Weight.N1);

        ;

        System.out.println("\n" + "В гонках участвуют следующие водители:" + "\n");
        DriverB<Car> ivan = new DriverB("Иванов Иван Иванович", true,
                7, DriverLicense.DRIVER_B);
        DriverB<Car> andrey = new DriverB("Андреев Андрей Андреевич", true,
                9, DriverLicense.DRIVER_B);
        DriverC<Freight> vasily = new DriverC("Васильев Василий Васильевич", true, 15,
                DriverLicense.DRIVER_C);
        DriverC<Freight> sergey = new DriverC("Сергеев Сергей Сергеевич", true,
                8, DriverLicense.DRIVER_C);
        DriverD<Bus> pavel = new DriverD("Павлов Павел Павлович",
                true, 10, DriverLicense.DRIVER_D);
        DriverD<Bus> petr = new DriverD("Петров Пётр Петрович",true,
                10, DriverLicense.DRIVER_D);

        ivan.moveStart(audi);
        vasily.moveStart(mercedes);
        pavel.moveStart(daiwoo);
        andrey.moveStart(bmw);
        sergey.moveStart(kraz);
        petr.moveStart(volvo);

        Transport.startService(kia, kraz, daiwoo);

        Set<Transport> race = Set.of(audi, kraz, daiwoo, volvo, mercedes, bmw);

        Sponsor<Car> ivan12 = new Sponsor<Car>("Иванов иван", 12345);
        audi.addSponsor(ivan12);
        printInfo(race);
    }

    public static void printInfo(Set<Transport> race) {
        for (Transport transport : race) {
            System.out.println(transport.getBrand() + transport.getModel() + transport.getSponsors()
                    + transport.getMechanics());
        }
    }

}
