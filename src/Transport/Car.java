package Transport;

import java.time.LocalDate;

public class Car extends Transport {
    private double engineVolume;
    private String transmission;
    private String carBodyType;
    private String regNumber;
    private int numberOfPlaces;
    private boolean tiresType;
    private Key key;
    private Insurance insurance;

    public Car(String brand, String model, int year, String country, String color, int maaxSpeed,
               double engineVolume, String transmission, String carBodyType, String regNumber,
               int numberOfPlaces) {
        super(brand, model, year, country, color, maaxSpeed);
        if (engineVolume < 0.0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (transmission == null || transmission == "") {
            this.transmission = "Default";
        } else {
            this.transmission = transmission;
        }
        if (carBodyType == null || carBodyType == "") {
            this.carBodyType = "Default";
        } else {
            this.carBodyType = carBodyType;
        }
        if (regNumber == null || regNumber.isEmpty()) {
            this.regNumber = "Default";
        } else {
            this.regNumber = regNumber;
        }
        if (numberOfPlaces <= 0) {
            this.numberOfPlaces = 0;
        } else {
            this.numberOfPlaces = numberOfPlaces;
        }

        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getCarBodyType() {
        return carBodyType;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public int getNumberOfPlaces() {
        return numberOfPlaces;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public boolean isCorrectNumber(String regNumber) {
        if (regNumber.length() != 9) {
            return false;
        }
        char[] chars = regNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4])
                || !Character.isAlphabetic(chars[5])) {
            return false;
        }
        if (!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3])
                || !Character.isDigit(chars[6]) || !Character.isDigit(chars[7]) || !Character.isDigit(chars[8])) {
            return false;
        }
        return true;
    }

    public boolean changeTire(boolean tiresType) {
        tiresType = !tiresType;
        return tiresType;
    }

    public static class Key {
        private final boolean remoteStart;
        private final boolean keylessEntry;

        public Key(boolean remoteStart, boolean keylessEntry) {
            this.remoteStart = remoteStart;
            this.keylessEntry = keylessEntry;
        }

        public Key() {
            this.remoteStart = false;
            this.keylessEntry = false;
        }

        public boolean isRemoteStart() {
            return remoteStart;
        }

        public boolean isKeylessEntry() {
            return keylessEntry;
        }
    }

    private static class Insurance {
        private LocalDate expireDay;
        private final double cost;
        private final String number;

        public Insurance(LocalDate expireDay, double cost, String number) {
            if (expireDay == null) {
                this.expireDay = LocalDate.now().plusDays(250);
            } else {
                this.expireDay = expireDay;
            }
            this.cost = cost;
            if (number == null) {
                this.number = "123456789";
            } else {
                this.number = number;
            }
        }

        public Insurance() {
            this(null, 110.111, null);
        }

        public LocalDate getExpireDay() {
            return expireDay;
        }

        public void setExpireDay(LocalDate expireDay) {
            this.expireDay = expireDay;
        }

        public double getCost() {
            return cost;
        }


        public String getNumber() {
            return number;
        }

        public void checkInsExp() {
            if (expireDay.isBefore(LocalDate.now()) || expireDay.equals(LocalDate.now())) {
                System.out.println("Срочно продлите страховку");
            } else {
                System.out.println("Всё ок");
            }
        }


        public void checkNumInsur() {
            if (number.length() != 9) {
                System.out.println("Страховка некорректная номер");
            } else {
                System.out.println("Всё ок");
            }
        }

    }

    @Override
    public String toString() {
        return
                "\n" + "Марка: " + getBrand() + " модель: " + getModel() + ". " + "\n"
                        + "Год выпуска: " + getYear() + ". Сборка " + getCountry() + ". " + "\n"
                        + getColor() + " цвет." + "Максимальная скорость: " + getMaxSpeed() + " км в час." + "\n"
                        + "объем двигателя — " + engineVolume + " Л." + "Коробка передач - " + transmission + ". " + "\n"
                        + carBodyType + ". " + " Номер: " + regNumber + ". Количество мест: " + numberOfPlaces;
    }
}
