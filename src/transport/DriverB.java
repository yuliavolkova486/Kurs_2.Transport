package transport;

public class DriverB extends Driver{
    public DriverB(String fullName, Boolean license, Integer experience) {
        super(fullName, license, experience);
    }

    @Override
    public void start() {
        System.out.println("Водитель категории B " + getFullName() + " начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Водитель категории B " + getFullName() + " закончил движение");
    }

    @Override
    public void refuel() {
        System.out.println("Водитель категории B " + getFullName() + " заправляется");
    }
}
