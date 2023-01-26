package transport;

public class Trucks<T extends DriverC> extends Transport{
    public Trucks(String brand, String model, Double engineVolume, T driver) {
        super(brand, model, engineVolume, driver);
    }


    public void startMoving() {
        System.out.println("Грузовик " + getBrand() + " " + getModel() + " начал движение" );
    }

    @Override
    public void finishTheMovement() {
        System.out.println("Грузовик " + getBrand() + " " + getModel() + " закончил движение");
    }


    @Override
    public void pitStop() {
        System.out.println("Грузовик " + getBrand() + " " + getModel() + " на пит-стопе");
    }

    @Override
    public void bestLapTime() {
        int minBound = 120;
        int maxBound = 180;
        int theBestTimeInMinutes = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Лучшее время круга для грузовика в минутах: " + theBestTimeInMinutes);
    }

    @Override
    public void maximumSpeed() {
        int minBound = 30;
        int maxBound = 90;
        int maxSpeed = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Максимальная скорость для грузовика: " + maxSpeed);
    }

    public static void getTransportInfo(Transport<?> transport) {
        System.out.println("Водитель категории C " + transport.getDriver().getFullName() + " управляет грузовиком " + transport.getBrand() + " "
                + transport.getModel() + " и будет участвовать в заезде");
    }
}
