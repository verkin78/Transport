package Transport;

    public class DriverC<C extends Freight> {
        private String fullName;
        private boolean driveLicense;
        private int experience;

        public DriverC(String fullName, boolean driveLicense, int experience) {
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
            System.out.println("Грузовик заправляется.");
        }

        public void moveStart(C freight) {
            System.out.println("Водитель " + getFullName() + " на грузовике" + freight.getBrand() + freight.getModel() + "готов" +
                    " участвовать в гонках." + "\n" + "Начинает движение.");
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
