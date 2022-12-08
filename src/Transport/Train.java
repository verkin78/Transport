package Transport;

public class Train extends Transport {
    private double travelPrice;
    private double travelTime;
    private String firstStationName;
    private String lastStationName;
    private int numberOfCarriages;

    public Train(String brand, String model, int year, String country, String color, int maaxSpeed,
                  String firstStationName, String lastStationName, double travelTime,
                  double travelPrice, int numberOfCarriages) {
        super(brand, model, year, country, color, maaxSpeed);
        if (firstStationName == null || firstStationName.isEmpty()) {
            this.firstStationName = "Default";
        } else {
            this.firstStationName = firstStationName;
        }
        if (lastStationName == null || lastStationName.isEmpty()) {
            this.lastStationName = "Default";
        } else {
            this.lastStationName = lastStationName;
        }
        if (travelTime <= 0) {
            this.travelTime = 0;
        } else {
            this.travelTime = travelTime;
        }
        if (travelPrice <= 0) {
            this.travelPrice = 0;
        } else {
            this.travelPrice = travelPrice;
        }
        if (numberOfCarriages <= 0 || numberOfCarriages > 80) {
            this.numberOfCarriages = 0;
        } else {
            this.numberOfCarriages = numberOfCarriages;
        }
     }

    public double getTravelPrice() {
        return travelPrice;
    }

    public void setTravelPrice(double travelPrice) {
        this.travelPrice = travelPrice;
    }

    public double getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(double travelTime) {
        this.travelTime = travelTime;
    }

    public String getFirstStationName() {
        return firstStationName;
    }

    public void setFirstStationName(String firstStationName) {
        this.firstStationName = firstStationName;
    }

    public String getLastStationName() {
        return lastStationName;
    }

    public void setLastStationName(String lastStationName) {
        this.lastStationName = lastStationName;
    }

    public int getNumberOfCarriages() {
        return numberOfCarriages;
    }

    public void setNumberOfCarriages(int numberOfCarriages) {
        this.numberOfCarriages = numberOfCarriages;
    }

    @Override
    public void  refill() {
        System.out.println("Нужно заправлять дизелем");
    }

    @Override
    public String toString() {
        return
                "Марка: " + getBrand() + " модель: " + getModel() + ". " + "\n"
                        + "Год выпуска: " + getYear() + ". Сборка " + getCountry() + ". " + "\n"
                        + getColor() + " цвет." + "Максимальная скорость: " + getMaxSpeed() + " км в час." + "\n"
                        + "Станция отправления: " + firstStationName + ". Станция прибытия: " + lastStationName + "\n"
                        + "Время в пути: " + travelTime + ". Стоимость поездки: " + travelPrice
                        + " руб. Всего вагонов: " + numberOfCarriages + ".";
    }
}
