package Transport;

import java.util.Objects;

public class Sponsor <T extends Transport> {
    private String sponsorName;
    private int supportSum;

    public Sponsor(String sponsorName, int supportSum) {
        setSponsorName(sponsorName);
        setSupportSum(supportSum);
    }

    public String getSponsorName() {
        return sponsorName;
    }

    public void setSponsorName(String fullName) {
        if (sponsorName == null || sponsorName.isEmpty()) {
            this.sponsorName = "Некорректные данные";
        } else {
            this.sponsorName = sponsorName;
        }
    }

    public int getSupportSum() {
        return supportSum;
    }

    public void setSupportSum(int supportSum) {
        if (supportSum != 0) {
            this.supportSum = supportSum;
        } else {
            throw new IllegalArgumentException("Сумма поддержки указана некорректно");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sponsor<?> sponsor = (Sponsor<?>) o;
        if (supportSum == sponsor.supportSum && sponsorName.equals(sponsor.sponsorName)) {
            throw new UnsupportedOperationException("Нет одинаковым спонсорам");
        }
        return supportSum == sponsor.supportSum && sponsorName.equals(sponsor.sponsorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sponsorName, supportSum);
    }

    @Override
    public String toString() {
        return "Sponsor{" +
                "sponsorName='" + sponsorName + '\'' +
                ", supportSum=" + supportSum +
                '}';
    }

    public void toSponsorRace(T transport) {
        System.out.println("Автомобиль " + transport.getBrand() + transport.getModel() + " поддержан спонсором "
        + sponsorName + " в сумме " + supportSum + "руб.");
    }
}
