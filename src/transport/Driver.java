package transport;

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
        return "Водитель: "
                + fullName + ", " +
                "Лицензия: " + license +
                ", Стаж: " + experience;
    }
}
