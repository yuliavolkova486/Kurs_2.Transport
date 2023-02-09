package transport;

import java.util.List;
import java.util.Objects;

public abstract class Transport<T extends Driver> implements Competing {
    private final String brand;
    private final String model;
    private final Double engineVolume;
    private final T driver;

    private List<Mechanic> mechanics;


    public Transport(String brand, String model, Double engineVolume, T driver, List<Mechanic> mechanics) {
        if (brand == null || brand.isEmpty()) {
            brand = "Not specified";
        }
        this.brand = brand;
        if (model == null || model.isEmpty()) {
            model = "Not specified";
        }
        this.model = model;
        if (engineVolume <= 0) {
            engineVolume = 1.6;
        }
        this.engineVolume = engineVolume;
        this.driver = driver;
        this.mechanics = mechanics;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Driver getDriver() {
        return driver;
    }

    public List<Mechanic> getMechanics() {
        return mechanics;
    }

    public void setMechanics(List<Mechanic> mechanics) {
        this.mechanics = mechanics;
    }

    public abstract void startMoving();

    public abstract void finishTheMovement();

    public abstract void printType();

    public abstract boolean passDiagnostics() throws TransportTypeException;

    @Override
    public String toString() {
        return "Марка: " + brand + ", " +
                "модель: " + model + ", " +
                "объём двигателя: " + engineVolume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport<?> transport = (Transport<?>) o;
        return Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model)
                && Objects.equals(engineVolume, transport.engineVolume)
                && Objects.equals(driver, transport.driver)
                && Objects.equals(mechanics, transport.mechanics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, driver, mechanics);
    }

    public boolean checkTransportNeedService()  {
        try {
            passDiagnostics();
        } catch (TransportTypeException e) {
            return false;
        }
        return true;
    }

    public static void printFullNameDriver(Transport transport, Driver driver) {
        System.out.println(transport.toString() + ", Водитель: " + driver.getFullName());
    }
}



