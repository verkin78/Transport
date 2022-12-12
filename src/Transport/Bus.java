package Transport;

public class Bus extends Transport implements Competing {

    public enum Capacity {
        SUPER_SMALL,
        SMALL,
        MEDIUM,
        BIG,
        SUPER_BIG;
    }


    private double engineVolume;

    public Bus(String brand, String model, double engineVolume) {
        super(brand, model);
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

    public Bus(String brand, String model) {
        super(brand, model);
    }

    @Override
    public String getBrand() {
        return super.getBrand();
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
        System.out.println(getBrand() + " можно заправлять бензином или дизелем на заправке");
        System.out.println("Перед гонкой бак заполнен на %100");

    }

    @Override
    public String toString() {
        return
                "Марка: " + getBrand() + " модель: " + getModel() + ". Оюх1м двигателя: " + engineVolume + " л";
        /*+ "\n" + "Год выпуска: " + getYear() + ". Сборка " + getCountry() + ". " + "\n"
                        + getColor() + " цвет." + "Максимальная скорость: " + getMaxSpeed() + " км в час."*/
    }

    @Override
    public void doPitStop() {
        System.out.println("Автобус " + getBrand() + getModel() + " заехал на пит-стоп");
        System.out.println("Машина снова в порядке и возвращается на круг!");
    }

    @Override
    public void getBestRoundTime() {
        System.out.println(getBrand() + " на данный момент показывает лучший результат на круге!");
    }

    @Override
    public void haveMaxSpeed() {
        System.out.println(getBrand() + " показывает лучшую скорость среди автобусов сегодня.");
    }
}

