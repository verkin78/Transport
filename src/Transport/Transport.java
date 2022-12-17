package Transport;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public abstract class Transport {
    private String brand;
    private String model;

    Set<Sponsor<?>> sponsors = new HashSet<>();

    Set<Mechanic<?>> mechanics = new HashSet<>();


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

    public Set<Sponsor<?>> getSponsors() {
        return sponsors;
    }

    public void setSponsors(Set<Sponsor<?>> sponsors) {
        this.sponsors = sponsors;
    }

    public Set<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public void setMechanics(Set<Mechanic<?>> mechanics) {
        this.mechanics = mechanics;
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
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        if (brand.equals(transport.brand) &&
                model.equals(transport.model) &&
                sponsors.equals(transport.sponsors) &&
                mechanics.equals(transport.mechanics)) {
            throw new UnsupportedOperationException("Одинаковый транспорт!!!");
        }
        return brand.equals(transport.brand) &&
                model.equals(transport.model) &&
                sponsors.equals(transport.sponsors) &&
                mechanics.equals(transport.mechanics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, sponsors, mechanics);
    }

    public static void startService(Transport... transports) {
        for (Transport transport : transports) {
            transport.doService();
        }
    }

}

