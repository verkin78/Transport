package Transport;

import java.util.ArrayList;
import java.util.List;

public abstract class Transport {
    private String brand;
    private String model;

    List<Sponsor<?>> sponsors = new ArrayList<>();

    List<Mechanic<?>> mechanics = new ArrayList<>();

    public Transport(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.sponsors = sponsors;
        this.mechanics = mechanics;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public List<?> getSponsors() {
        return sponsors;
    }

    public List<?> getMechanics() {
        return mechanics;
    }

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

    public abstract void refill();

    public abstract void moveStart();

    public abstract void moveStop();

    public abstract void printType();

    public abstract void doService();

    public abstract void toSponsorRace();

   public void addMechanic(Mechanic<?> mechanic) {
        mechanics.add(mechanic);
    }

    public void addSponsor(Sponsor<?> sponsor) {
        sponsors.add(sponsor);
    }


    @Override
    public String toString() {
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

