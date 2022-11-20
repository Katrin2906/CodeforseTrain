package Autopark;

public class DualPurposeVehicle extends Truck {
    private Integer seatingAreas;

    public DualPurposeVehicle(Integer issueYear, String brand, String model, String fuelType, Double fuelConsumption,
                              Integer tankVolume, Long loadCapacity, Boolean fridge, Boolean awning, Long bodyVolume, Integer seatingAreas) {
        super(issueYear, brand, model, fuelType, fuelConsumption, tankVolume, loadCapacity, fridge, awning, bodyVolume);
        this.seatingAreas = seatingAreas;
    }

    public void salonTreatment() {
    }
}
