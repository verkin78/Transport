package Transport;

public class DriverD<D extends Bus> {
    private String fullName;
    private boolean driveLicense;
    private int experience;
    private DriverLicense driverLicense;

    public DriverD(String fullName, boolean driveLicense, int experience,DriverLicense driverLicense) {
        this.fullName = fullName;
        this.driveLicense = driveLicense;
        this.experience = experience;
        setDriverLicense(driverLicense);
    }

    public void setDriverLicense(DriverLicense driverLicense) {
        if (driverLicense != DriverLicense.DRIVER_D) {
            throw new IllegalArgumentException("Некорректные данные");
        }else {
            this.driverLicense = driverLicense;
        }
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "DriverD{" +
                "fullName='" + fullName + '\'' +
                ", experience=" + experience +
                ", driverLicense=" + driverLicense +
                '}';
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

    public void refill() {
        System.out.println("Автобус заправляется.");
    }

    public void moveStart(D bus) {
        System.out.println("Водитель " + getFullName() + " на автобусе" + bus.getBrand() + bus.getModel() + "готов" +
                " участвовать в гонках.");
        bus.printType();
        moveStop();
        refill();
    }

    public void moveStop() {
        System.out.println("Водитель останавливается.");
    }

    public DriverD() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
