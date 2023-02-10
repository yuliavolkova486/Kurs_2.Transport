package transport;

import java.util.Objects;

public abstract class Driver{
    private final String fullName;
    private final Boolean license;
    private final Integer experience;

    public Driver(String fullName, Boolean license, Integer experience) {
        this.fullName = fullName;
        this.license = license;
        this.experience = experience;
    }

    public String getFullName() {
        return fullName;
    }

    public abstract void start();

    public abstract void stop();

    public abstract void refuel();

    @Override
    public String toString() {
        return fullName + ", " +
                "Лицензия: " + license +
                ", Стаж: " + experience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return Objects.equals(fullName, driver.fullName) && Objects.equals(license, driver.license)
                && Objects.equals(experience, driver.experience);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, license, experience);
    }
}
