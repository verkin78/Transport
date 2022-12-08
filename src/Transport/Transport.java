package Transport;

import java.time.LocalDate;

public class Transport {
    protected String brand;
    protected String model;
    protected final int year;
    protected final String country;
    protected String color;
    protected int maxSpeed;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Transport(String brand, String model, int year, String country, String color, int maxSpeed) {
        if (brand == null || brand.isEmpty()) {
            this.brand = "Default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty()) {
            this.model = "Default";
        } else {
            this.model = model;
        }

        if (year < 1900 || year > LocalDate.now().getYear()) {
            this.year = 0;
        } else {
            this.year = year;
        }
        if (country == null || country.isEmpty()) {
            this.country = "Default";
        } else {
            this.country = country;
        }
        if (color == null || color.isEmpty()) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (maxSpeed <= 0) {
            this.maxSpeed = 0;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }

    @Override
    public String toString () {
        return
                "Марка: " + brand + " " + model + ".  Год выпуска: " + year + "\n"
                        + ". Сборка " + country + ". " + color + " цвет. " + "\n"
                        + "Максимальная скорость: " + maxSpeed + "км в час.";
    }
}