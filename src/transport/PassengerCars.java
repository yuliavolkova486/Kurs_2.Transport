package transport;

public class PassengerCars<T extends DriverB> extends Transport{


    public PassengerCars(String brand, String model, Double engineVolume, T driver) {
        super(brand, model, engineVolume, driver);
    }

    public void startMoving() {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + " начал движение");
    }

    @Override
    public void finishTheMovement() {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + " закончил движение");
    }


    @Override
    public void pitStop() {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + " на пит-стопе");
    }

    @Override
    public void bestLapTime() {
        int minBound = 80;
        int maxBound = 120;
        int theBestTimeInMinutes = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Лучшее время круга для автомобиля в минутах: " + theBestTimeInMinutes);
    }

    @Override
    public void maximumSpeed() {
        int minBound = 40;
        int maxBound = 220;
        int maxSpeed = (int) (minBound + (maxBound - minBound) * Math.random());
        System.out.println("Максимальная скорость для автомобиля: " + maxSpeed);
    }

    public static void getTransportInfo(Transport<?> transport) {
        System.out.println("Водитель категории B " + transport.getDriver().getFullName() + " управляет автомобилем " + transport.getBrand() + " "
                + transport.getModel() + " и будет участвовать в заезде");
    }
}