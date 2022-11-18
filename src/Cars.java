public class Cars extends Transport {
    public Cars(String brand, String model, Double volumeEngine) {
        super(brand, model, volumeEngine);
    }

    @Override
    public void startMove() {
    }

    @Override
    public void stopMove() {
    }

    @Override
    public void pitStop() {
        System.out.println("ПитСтоп " + getBrand());
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга: "+getBrand());
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость " + getBrand());
    }
}
