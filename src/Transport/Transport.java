package Transport;

public abstract class Transport {
    private String brand;
    private String model;
    /*private final int year;
    private final String country;
    private String color;
    private int maxSpeed;*/

    public Transport(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    /*public int getYear() {
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
    }*/

    public void setBrand(String brand) {
        if (brand == null || brand.isEmpty()) {
            this.brand = "Default";
        } else {
            this.brand = brand;
        }
    }

    public void setModel(String model) {
        if (model == null || model.isEmpty()) {
            this.model = "Default";
        } else {
            this.model = model;
        }
    }

    /*public void setColor(String color) {
        this.color = color;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }*/

   // public Transport(String brand, String model, int year, String country, String color, int maxSpeed) {
        /*if (year < 1900 || year > LocalDate.now().getYear()) {
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
        }*/


    public abstract void refill();

    public abstract void moveStart();

    public abstract void moveStop();

    public abstract void printType();

    public abstract void  doService();


    @Override
    public String toString () {
        return
                "Марка: " + brand + " " + model + ". ";
        /*... Год выпуска: " + year + "\n"
        + ". Сборка " + country + ". " + color + " цвет. " + "\n"
        + "Максимальная скорость: " + maxSpeed + "км в час."*/
    }

    public static void startService(Transport... transports) {
        for (Transport transport : transports) {
            transport.doService();
        }
    }
}

