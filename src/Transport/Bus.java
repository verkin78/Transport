package Transport;

public class Bus extends Transport {
    public Bus(String brand, String model, int year, String country, String color, int maxSpeed) {
        super(brand, model, year, country, color, maxSpeed);
    }

    @Override
    public void refill() {
        System.out.println("Можно заправлять бензином или дизелем на заправке");
}

    @Override
    public String toString() {
        return
                "Марка: " + getBrand() + " модель: " + getModel() + ". " + "\n"
                        + "Год выпуска: " + getYear() + ". Сборка " + getCountry() + ". " + "\n"
                        + getColor() + " цвет." + "Максимальная скорость: " + getMaxSpeed() + " км в час.";
    }
}

