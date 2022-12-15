package Transport;

import java.util.ArrayList;
import java.util.List;

public class Car extends Transport implements Competing {
    public enum CarBackType {
        SEDAN("Седан"),
        HATCHBACK("Хэтчбэк"),
        COUPE("Купе"),
        UNIVERSAL("Универсал"),
        SUV("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        VEN("Фургон"),
        MINI_VEM("Минивен");
        private final String backType;

        CarBackType(String backType) {
            this.backType = backType;
        }

        public String getBackType() {
            return backType;
        }
    }

    private double engineVolume;
    private CarBackType carBackType;

    List<DriverB<?>> driverB = new ArrayList<>();

    public Car(String brand, String model, double engineVolume, CarBackType carBackType) {
        super(brand, model);
        this.engineVolume = engineVolume;
        this.carBackType = carBackType;
        this.driverB = driverB;
    }

    public void setCarBackType(CarBackType carBackType) {
        this.carBackType = carBackType;
    }

    public List<?> getDriverB() {
        return driverB;
    }

    @Override
    public String getBrand() {
        return super.getBrand();
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume < 0.0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public void addDriver(DriverB<?> driver) {
        driverB.add(driver);
    }

    public CarBackType getCarBackType() {
        return carBackType;
    }

    @Override
    public void moveStart() {
        System.out.println("Начинаю движение!");
    }

    @Override
    public void moveStop() {
        System.out.println("Останавливаюсь! Финиш.");
    }

    @Override
    public void printType() {
        if (carBackType == null) {
            System.out.println("Недостаточно данныхю");
        } else {
            System.out.println("Тип кузова" + carBackType.getBackType());
        }

    }

    @Override
    public void refill() {
        System.out.println(getBrand() + " можно заправлять бензином, дизелем на заправке или заряжать на специальных" +
                " электроду-парковках, если это электрокар");
        System.out.println("Перед гонкой бак заполнен на %100");

    }

    @Override
    public String toString() {
        return
                "Марка: " + getBrand() + " модель: " + getModel() + ". Оюх1м двигателя: " + engineVolume + " л";
        /*+ "\n" + "Год выпуска: " + getYear() + ". Сборка " + getCountry() + ". " + "\n"
        + getColor() + " цвет." + "Максимальная скорость: " + getMaxSpeed() + " км в час." + "\n"
        + "объем двигателя — " + engineVolume + " Л." + "Коробка передач - " + transmission + ". " + "\n"
        + carBodyType + ". " + " Номер: " + regNumber + ". Количество мест: " + numberOfPlaces*/
    }

    @Override
    public void doPitStop() {
        System.out.println("Машина " + getBrand() + getModel() + " заехала на пит-стоп");
        System.out.println("Машина снова в порядке и возвращается на круг!");
    }

    @Override
    public void getBestRoundTime() {
        System.out.println(getBrand() + " на данный момент показывает лучший результат на круге!");
    }

    @Override
    public void haveMaxSpeed() {
        System.out.println(getBrand() + " показывает лучшую скорость среди легковушек сегодня.");
    }

    @Override
    public void doService() {
        System.out.println("Автомобиль "+getBrand()+ " обслужен");
    }

    @Override
    public void toSponsorRace() {

    }
}

