package transport;

public abstract class Transport<T extends Driver> implements Competing{
    private final String brand;
    private final String model;
    private final Double engineVolume;
    private final T driver;

    public Transport(String brand, String model, Double engineVolume, T driver) {
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

    public abstract void startMoving();

    public abstract void finishTheMovement();

    public abstract void printType();

    public abstract void passDiagnostics() throws TransportTypeException;

    @Override
    public String toString() {
        return "Марка: " + brand + ", " +
                "модель: " + model + ", " +
                "объём двигателя: " + engineVolume;
    }
}



