import java.util.Objects;

public abstract class Transport implements Competing{
    private String brand;
    private String model;
    private Double volumeEngine;

    public Transport(String brand, String model, Double volumeEngine) {
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

}
