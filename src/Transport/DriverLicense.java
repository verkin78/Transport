package Transport;

public enum DriverLicense {
    DRIVER_B("B"),
    DRIVER_C("C"),
    DRIVER_D("D");
    private final String license;

    DriverLicense(String license) {
        this.license = license;
    }

    public String getLicense() {
        return license;
    }
}
