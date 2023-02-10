package transport;

public class DriverC extends Driver{

    public DriverC(String fullName, Boolean license, Integer experience) {
        super(fullName, license, experience);
    }

    @Override
    public void start() {
        System.out.println("Водитель категории C " + getFullName() + " начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Водитель категории C " + getFullName() + " закончил движение");
    }

    @Override
    public void refuel() {
        System.out.println("Водитель категории C " + getFullName() + " заправляется");
    }

    @Override
    public String toString() {
        return "Водитель категории C: " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
