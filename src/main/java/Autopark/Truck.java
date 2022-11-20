package Autopark;

public class Truck extends Car {
    private Long loadCapacity;
    private Boolean fridge;
    private Boolean awning;
    private Boolean tank;
    private Long bodyVolume;

    public Truck(Integer issueYear, String brand, String model, String fuelType, Double fuelConsumption,
                 Integer tankVolume, Long loadCapacity, Boolean fridge, Boolean awning, Long bodyVolume, Boolean tank) {
        super(issueYear, brand, model, fuelType, fuelConsumption, tankVolume);
        this.loadCapacity = loadCapacity;
        this.fridge = fridge;
        this.awning = awning;
        this.bodyVolume = bodyVolume;
        this.tank=tank;
    }

    public void sealUp() {
    }

}
