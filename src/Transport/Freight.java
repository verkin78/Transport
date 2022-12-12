package Transport;

public class Freight extends Transport implements Competing {


    public enum Weight {
        N1(0.0D, 3.5D),
        N2(3.5D, 12.0D),
        N3(12.0D, null);
        private Double from;
        private Double to;

        Weight(Double from, Double to) {
            this.from = from;
            this.to = to;
        }

        public Double getFrom() {
            return from;
        }

        public void setFrom(Double from) {
            this.from = from;
        }

        public Double getTo() {
            return to;
        }

        public void setTo(Double to) {
            this.to = to;
        }
    }

    private double engineVolume;
    private Weight weight;

    public Freight(String brand, String model, double engineVolume, Weight weight) {
        super(brand, model);
        setEngineVolume(engineVolume);
        this.weight = weight;
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

    public Weight getWeight() {
        return weight;
    }

    public Freight(String brand, String model) {
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
        if (weight == null) {
            System.out.println("Недостаточно данных");
        } else {
            String from = weight.getFrom() == null ? "" : " от" + weight.getFrom();
            String to = weight.getTo() == null ? "" : " до" + weight.getTo();
            System.out.println("Грузоподхёмность " + from + to);
        }
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
    }

    @Override
    public void doPitStop() {
        System.out.println("Грузовик " + getBrand() + getModel() + " заехал на пит-стоп");
        System.out.println("Машина снова в порядке и возвращается на круг!");
    }

    @Override
    public void getBestRoundTime() {
        System.out.println(getBrand() + " на данный момент показывает лучший результат на круге!");
    }

    @Override
    public void haveMaxSpeed() {
        System.out.println(getBrand() + " показывает лучшую скорость среди грузовиков сегодня.");
    }
}
