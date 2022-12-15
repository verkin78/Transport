package Transport;

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
