public abstract class Transport {
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

    public abstract void startMove();
    public abstract void stopMove();
}
