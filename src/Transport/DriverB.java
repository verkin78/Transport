package Transport;

public class DriverB<B extends Car> {
    private String fullName;
    private boolean driveLicense;
    private int experience;

    public DriverB(String fullName, boolean driveLicense, int experience) {
        this.fullName = fullName;
        this.driveLicense = driveLicense;
        this.experience = experience;
    }

    public String getFullName() {
        return fullName;
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
