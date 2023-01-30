package transport;

public class TheBuses<T extends DriverD> extends Transport{


    public TheBuses(String brand, String model, Double engineVolume, T driver) {
        super(brand, model, engineVolume, driver);
    }

    public void startMoving() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " начал движение" );
    }

    @Override
    public void finishTheMovement() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " закончил движение");
    }


    @Override
    public void pitStop() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " на пит-стопе");
    }

    @Override
    public void bestLapTime() {
        int minBound = 100;
        int maxBound = 150;
        int theBestTimeInMinutes = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Лучшее время круга для автобуса в минутах: " + theBestTimeInMinutes);
    }

    @Override
    public void maximumSpeed() {
        int minBound = 30;
        int maxBound = 120;
        int maxSpeed = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Максимальная скорость для автобуса: " + maxSpeed);
    }

    public static void getTransportInfo(Transport<?> transport) {
        System.out.println("Водитель категории D " + transport.getDriver().getFullName() + " управляет автобусом " + transport.getBrand() + " "
                + transport.getModel() + " и будет участвовать в заезде");
    }
}
