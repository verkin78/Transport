package Transport;

public class Car extends Transport implements Competing {
    public enum CarBackType {
        SEDAN ("Седан"),
        HATCHBACK ("Хэтчбэк"),
        COUPE ("Купе"),
        UNIVERSAL ("Универсал"),
        SUV ("Внедорожник"),
        CROSSOVER ("Кроссовер"),
        PICKUP ("Пикап"),
        VEN ("Фургон"),
        MINI_VEM ("Минивен");
        private final String backType;

        CarBackType(String backType) {
            this.backType = backType;
        }

        public System getBackType() {
            return backType;
        }
    }

    private double engineVolume;
    private CarBackType carBackType;

    public Car(String brand, String model, double engineVolume, CarBackType carBackType1) {
        super(brand, model);
        this.engineVolume = engineVolume;
        this.carBackType = carBackType1;
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
}

