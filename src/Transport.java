import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public abstract class Transport implements Competing{
    private String brand;
    private String model;
    private Double volumeEngine;
    private List<Transport> transport;
    private final List<Driver<?>> drivers = new ArrayList<>();
    private final List<Mehanic<?>> mehanics = new ArrayList<>();
    private final List<Sponsor> sponsors = new ArrayList<>();



    public Transport(String brand,
                     String model,
                     Double volumeEngine) {
        if (brand != null && !brand.isEmpty() && !brand.isBlank()) {
            this.brand = brand;
        } else {
            this.brand = "default";
        }
        if (model != null && !brand.isEmpty() && !brand.isBlank()) {
            this.model = model;
        } else {
            this.model = "default";
        }
        if (volumeEngine != null) {
            this.volumeEngine = volumeEngine;
        } else {
            this.volumeEngine = 1.5;
        }
    }

    public void addDriver(Driver<?>...driver) {
        this.drivers.addAll(Arrays.asList(driver));
    }

    public void addMehanic(Mehanic<?>...mehanic) {
        this.mehanics.addAll(Arrays.asList(mehanic));
    }

    public void addSponsor(Sponsor...sponsor) {
        this.sponsors.addAll(Arrays.asList(sponsor));
    }

    public List<Transport> getTransport() {
        return transport;
    }

    public List<Driver<?>> getDrivers() {
        return drivers;
    }

    public List<Mehanic<?>> getMehanics() {
        return mehanics;
    }

    public List<Sponsor> getSponsors() {
        return sponsors;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand != null && !brand.isEmpty() && !brand.isBlank()) {
            this.brand = brand;
        } else {
            this.brand = "default";
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model != null && !brand.isEmpty() && !brand.isBlank()) {
            this.model = model;
        } else {
            this.model = "default";
        }
    }

    public Double getVolumeEngine() {
        return volumeEngine;
    }

    public void setVolumeEngine(Double volumeEngine) {
        if (volumeEngine != null) {
            this.volumeEngine = volumeEngine;
        } else {
            this.volumeEngine = 1.5;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Objects.equals(brand, transport.brand)
                && Objects.equals(model, transport.model)
                && Objects.equals(volumeEngine, transport.volumeEngine);
    }


    @Override
    public int hashCode() {
        return Objects.hash(brand, model, volumeEngine);
    }

    public abstract void startMove();
    public abstract void stopMove();

    public abstract void checkType();

    public abstract boolean checkDiagnostic();

    @Override
    public String toString() {
        return " Марка: " + brand +
                ", модель: " + model +
                ", объем двигателя: " + volumeEngine;
    }
}
