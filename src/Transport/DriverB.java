package Transport;

public class DriverB<B extends Car> {
    private String fullName;
    private boolean driveLicense;
    private int experience;
    private DriverLicense driverLicense;

    public DriverB(String fullName, boolean driveLicense, int experience, DriverLicense driverLicense) {
        this.fullName = fullName;
        this.driveLicense = driveLicense;
        this.experience = experience;
        this.driverLicense = driverLicense;
    }

    public String getFullName() {
        return fullName;
    }

    public void setDriverLicense(DriverLicense driverLicense) {
        if (driverLicense != DriverLicense.DRIVER_B) {
            throw new IllegalArgumentException("Некорректные данные");
        }else {
            this.driverLicense = driverLicense;
        }

    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean isDriveLicense() {
        return driveLicense;
    }

    public void setDriveLicense(boolean driveLicense) {
        this.driveLicense = driveLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "DriverB{" +
                "fullName='" + fullName + '\'' +
                ", experience=" + experience +
                ", driverLicense=" + driverLicense +
                '}';
    }

    public void refill() {
        System.out.println("Машина заправляется.");
    }

    public void moveStart(B car) {
        System.out.println("Водитель " + getFullName() + " на машине" + car.getBrand() +
                car.getModel() + "готов" +
                " участвовать в гонках.");
        car.printType();
        moveStop();
        refill();
    }

    public void moveStop() {
        System.out.println("Водитель останавливается.");
    }

    public DriverB() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
