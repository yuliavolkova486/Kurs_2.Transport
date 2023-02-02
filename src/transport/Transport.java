package transport;

public abstract class Transport<T extends Driver> implements Competing{
    private final String brand;
    private final String model;
    private final Double engineVolume;
    private final T driver;

    private boolean diagnosticsPassed;

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

    public boolean isDiagnosticsPassed() {
        return diagnosticsPassed;
    }

    public void setDiagnosticsPassed(boolean diagnosticsPassed) {
        this.diagnosticsPassed = diagnosticsPassed;
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
}



