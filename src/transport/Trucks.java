package transport;

import java.util.List;

public class Trucks<T extends DriverC> extends Transport{

    private LoadCapacity loadCapacity;

    enum LoadCapacity {
        N1(null, 3.5f),
        N2(3.5f, 12f),
        N3(12f, null);

        private Float downLoadCapacity;
        private Float upLoadCapacity;

        LoadCapacity(Float downLoadCapacity, Float upLoadCapacity) {
            this.downLoadCapacity = downLoadCapacity;
            this.upLoadCapacity = upLoadCapacity;
        }

        public Float getDownLoadCapacity() {
            return downLoadCapacity;
        }

        public void setDownLoadCapacity(Float downLoadCapacity) {
            this.downLoadCapacity = downLoadCapacity;
        }

        public Float getUpLoadCapacity() {
            return upLoadCapacity;
        }

        public void setUpLoadCapacity(Float upLoadCapacity) {
            this.upLoadCapacity = upLoadCapacity;
        }

        @Override
        public String toString() {
            if (getDownLoadCapacity() == null) {
                return " Грузоподьемность: до " + getUpLoadCapacity() + " тонн";
            } else if (getUpLoadCapacity() == null) {
                return " Грузоподьемность: от " + getDownLoadCapacity() + " тонн";
            } else {
                return " Грузоподьемность: от " + getDownLoadCapacity() + " тонн до "
                        + getUpLoadCapacity() + " тонн";
            }
        }
    }

    public Trucks(String brand, String model, Double engineVolume, Driver driver, List list, LoadCapacity loadCapacity) {
        super(brand, model, engineVolume, driver, list);
        this.loadCapacity = loadCapacity;
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }


    public void startMoving() {
        System.out.println("Грузовик " + getBrand() + " " + getModel() + " начал движение" );
    }

    @Override
    public void finishTheMovement() {
        System.out.println("Грузовик " + getBrand() + " " + getModel() + " закончил движение");
    }

    @Override
    public void printType() {
        if (getLoadCapacity() == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Грузовик: " + super.toString() + getLoadCapacity());
        }
    }

    @Override
    public boolean passDiagnostics() {
        System.out.println("Грузовик " + getBrand() + " " + getModel() + " может проходить диагностику");
        return true;
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

    @Override
    public String toString() {
        return "Грузовик: " + super.toString();
    }
}
