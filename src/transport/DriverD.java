package transport;

public class DriverD extends Driver {

    public DriverD(String fullName, Boolean license, Integer experience) {
        super(fullName, license, experience);
    }

    @Override
    public void start() {
        System.out.println("Водитель категории D " + getFullName() + " начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Водитель категории D " + getFullName() + " закончил движение");
    }

    @Override
    public void refuel() {
        System.out.println("Водитель категории D " + getFullName() + " заправляется");
    }
}
