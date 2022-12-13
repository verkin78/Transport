package Transport;

public class Bus extends Transport implements Competing {

    public enum Capacity {
        SUPER_SMALL(1,10),
        SMALL(10,25),
        MEDIUM(20,40),
        BIG(40,60),
        SUPER_BIG(60,80);

        private final int from;
        private final int to;

        Capacity(int from, int to) {
            this.from = from;
            this.to = to;
        }

        public int getFrom() {
            return from;
        }

        public int getTo() {
            return to;
        }
    }


    private double engineVolume;
    private Capacity capacity;


    public Bus(String brand, String model, double engineVolume,Capacity capacity) {
        super(brand, model);
        setEngineVolume(engineVolume);
        this.capacity = capacity;
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

    public Capacity getCapacity() {
        return capacity;
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
        if (capacity == null) {
            System.out.println("Недостаточно данныъ");
        }else {
            System.out.println("Вместимость автобуса: от" + capacity.getFrom()+ " до " +
                    capacity.getTo() + " человек");
        }

    }

    @Override
    public void doService() {
        System.out.println("Автобус" + getBrand() + getModel() + " не нуждается в обслуживании");

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

