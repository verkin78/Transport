package Transport;

import java.util.Objects;

public class Mechanic<T extends Transport> {
    private String firstName;
    private String lastName;
    private String company;

    public Mechanic(String firstName, String lastName, String company) {
        setFirstName(firstName);
        setLastName(lastName);
        setCompany(company);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic<?> mechanic = (Mechanic<?>) o;
        if (firstName.equals(mechanic.firstName) &&
                lastName.equals(mechanic.lastName) && company.equals(mechanic.company)) {
            throw new UnsupportedOperationException("Одинаковые механики");
        }
        return firstName.equals(mechanic.firstName) &&
                lastName.equals(mechanic.lastName) && company.equals(mechanic.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, company);
    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void doService(Transport transport) {
        System.out.println("Механик " + getFirstName() + getLastName() + " отремантировал "
                + transport.getBrand());
    }

    public void repareTransport(Transport transport) {
        System.out.println(transport.getBrand() + transport.getModel() + " отремонтированю");
    }
}
