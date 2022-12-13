import Transport.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n" + "В гонках участвуют следующие легковые автомобли:" + "\n");
        Car lada = new Car("Lada", "Granta", 1.7, Car.CarBackType.SEDAN);
        //2015, "Россия(и)", "Желтый(того)", 290,  "механическая", "легковая", "с035ов277", 3//
        Car audi = new Car("Audi ", "A8 50 L TDI quattro", 2.0, Car.CarBackType.SEDAN);
        //2020, "Германии(я)", "черный", 300, 3.0, "автомат", "седан", "в077ин326", 5//
        Car bmw = new Car("BMW", "Z8", 2.1, Car.CarBackType.SEDAN);
        //2021, "Германия", "черный", 295, "автомат", "седан", "о077иу327", 5//
        Car kia = new Car("Kia", "Sportage 4-го поколения", 1.4, Car.CarBackType.SEDAN);
        //2018, "Южной Корее(Южная Корея)", "красный", 240, 2.4, "автомат", "легковая", "о445ва973", 4//
        /*Car hyundai = new Car("Hyundai", "Avante", 2016, "Южная корея(Южной Корее)", "оранжевый",
                260, 1.6, "автомат", "легковая", "у18мн746",
                4);
        Car car = new Car(null, null, -1990, "", "",
                150, 1.2, null, null, null, 0);*/

        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);

        bmw.doPitStop();
        audi.getBestRoundTime();
        kia.refill();
        lada.haveMaxSpeed();



        Bus volvo = new Bus("Volvo", "VL20", 3.0, Bus.Capacity.BIG);
        //2017, "Швеция", "Серебристо-серый", 300, 3,//
        Bus liaz = new Bus("ЛиАЗ", "л17-3", 2.8, Bus.Capacity.SUPER_SMALL);
        //2009, "Россия", "Сине-голубой", 290//
        Bus hyundai = new Bus("Hyundai", "h5.d21", 3.1, Bus.Capacity.SUPER_BIG);
        //2020, "Япония", "Белый с полосами", 295//
        Bus daiwoo = new Bus("Daiwoo", "d35-0", 2.9, Bus.Capacity.MEDIUM);
        //Bus bus = new Bus(null, null, 0, null, null, 0);//




        System.out.println("\n" + "В гонках участвуют следующие грузовые автомобли:" + "\n");
        Freight gaz = new Freight("ГАЗ", "г410", 2.5, Freight.Weight.N2);
        Freight mercedes = new Freight("Mercedes", "M701s", 3.1, Freight.Weight.N3);
        Freight kraz = new Freight("КРАЗ", "Кр867", 2.7, Freight.Weight.N1);
        Freight man = new Freight("Man", "m3n25", 2.9, Freight.Weight.N2);
        Freight freight = new Freight("", "", 0, Freight.Weight.N1);

;

        System.out.println("\n" + "В гонках участвуют следующие водители:" + "\n");
        DriverB <Car> ivan = new DriverB("Иванов Иван Иванович",
                true, 12,DriverLicense.DRIVER_B);
        DriverC <Freight> vasily = new DriverC("Васильев Василий Васильевич", true, 15,
                DriverLicense.DRIVER_C);
        DriverD <Bus> pavel = new DriverD("Павлов Павел Павлович",
                true, 10,DriverLicense.DRIVER_D);

        ivan.moveStart(audi);
        vasily.moveStart(mercedes);
        pavel.moveStart(daiwoo);

        Transport.startService(kia,kraz,daiwoo);

    }
}
