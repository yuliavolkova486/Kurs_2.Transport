package transport;

public class PassengerCars<T extends DriverB> extends Transport{

    private BodyType bodyType;
    enum BodyType {
        TYPE1("Седан"),
        TYPE2("Хетчбэк"),
        TYPE3("Купе"),
        TYPE4("Универсал"),
        TYPE5("Внедорожник"),
        TYPE6("Кроссовер"),
        TYPE7("Пикап"),
        TYPE8("Фургон"),
        TYPE9("Минивэн");

                      private final String name;

                      BodyType(String name) {
                          this.name = name;
                      }

                      @Override
                      public String toString() {
                      return " Тип кузова: " + name;
                      }
    }

    public PassengerCars(String brand, String model, Double engineVolume, T driver, BodyType bodyType) {
        super(brand, model, engineVolume, driver);
        this.setBodyType(bodyType);
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public void startMoving() {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + " начал движение");
    }

    @Override
    public void finishTheMovement() {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + " закончил движение");
    }

    @Override
    public void printType() {
        if (getBodyType() == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Легковой автомобиль: " + super.toString() +  getBodyType());
        }
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