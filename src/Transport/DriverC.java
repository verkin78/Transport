package Transport;

    public class DriverC<C extends Freight> {
        private String fullName;
        private boolean driveLicense;
        private int experience;
        private DriverLicense driverLicense;

        public DriverC(String fullName, boolean driveLicense, int experience, DriverLicense driverLicense) {
            this.fullName = fullName;
            this.driveLicense = driveLicense;
            this.experience = experience;
            setDriverLicense(driverLicense);
        }

        public void setDriverLicense(DriverLicense driverLicense) {
            if (driverLicense != DriverLicense.DRIVER_C) {
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
            return "DriverC{" +
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
            System.out.println("Грузовик заправляется.");
        }

        public void moveStart(C freight) {
            System.out.println("Водитель " + getFullName() + " на грузовике" + freight.getBrand() + freight.getModel() + "готов" +
                    " участвовать в гонках." + "Начинает движение.");
            freight.printType();
            moveStop();
            refill();
        }

        public void moveStop() {
            System.out.println("Водитель останавливается.");
        }

        public DriverC() {
            super();
        }

        @Override
        public int hashCode() {
            return super.hashCode();
        }
}
