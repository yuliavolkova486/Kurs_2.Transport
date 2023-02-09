package transport;


import java.util.Objects;

public class Mechanic {
    private  String fullName;
    private  String company;

    public Mechanic(String fullName, String company) {
        this.fullName = fullName;
        this.company = company;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        if (fullName == null || fullName.isEmpty()) {
            fullName = "Not specified";
        }
        this.fullName = fullName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        if (company == null || company.isEmpty()) {
            company = "Not specified";
        }
        this.company = company;
    }

    public static <T extends Transport> void performMaintenance(T Transport) {
        System.out.println(Transport.toString() + " проводится техобслуживание: " + Transport.getMechanics());
    }


    public static <T extends Transport> void fixTheCar(T t) {
        System.out.println(t.toString() + " ответственный при поломке - " + t.getMechanics());
    }

    @Override
    public String toString() {
        return " Механик: "
                + fullName +
                ", Компания: " + company;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic mechanic = (Mechanic) o;
        return Objects.equals(fullName, mechanic.fullName) && Objects.equals(company, mechanic.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, company);
    }
}
