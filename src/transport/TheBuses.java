package transport;

public class TheBuses<T extends DriverD> extends Transport{

    private Capacity capacity;

    enum Capacity {
        EXTRA_SMALL(null, 10),
        SMALL(null, 25),
        MIDDLE(40, 50),
        LARGE(60, 80),
        EXTRA_LARGE(100, 120);

        private Integer downCapacity;
        private Integer upCapacity;

        Capacity(Integer downCapacity, Integer upCapacity) {
            this.downCapacity = downCapacity;
            this.upCapacity = upCapacity;
        }

        public Integer getDownCapacity() {
            return downCapacity;
        }

        public void setDownCapacity(Integer downCapacity) {
            this.downCapacity = downCapacity;
        }

        public Integer getUpCapacity() {
            return upCapacity;
        }

        public void setUpCapacity(Integer upCapacity) {
            this.upCapacity = upCapacity;
        }

        @Override
        public String toString() {
            if (getDownCapacity() == null) {
                return " Вместимость: до " + getUpCapacity() + " мест";
            } else if (getUpCapacity() == null) {
                return " Вместимость: от " + getDownCapacity() + " мест";
            } else {
                return " Вместимость: от " + getDownCapacity() + " мест до "
                        + getUpCapacity() + " мест";
            }
        }
    }



    public TheBuses(String brand, String model, Double engineVolume, T driver, Capacity capacity) {
        super(brand, model, engineVolume, driver);
        this.capacity = capacity;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    public void startMoving() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " начал движение" );
    }

    @Override
    public void finishTheMovement() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " закончил движение");
    }

    @Override
    public void printType() {
        if (getCapacity() == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Автобус: " + super.toString() + getCapacity());
        }
    }

    @Override
    public void passDiagnostics() {
        try {
            throw new TransportTypeException();
        } catch (TransportTypeException e) {
            System.err.println("Автобусы не проходят диагностику!!!");
        }
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
