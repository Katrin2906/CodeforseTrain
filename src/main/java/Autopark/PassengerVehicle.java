package Autopark;

public class PassengerVehicle extends Car {
    private Integer seatingAreas;

    public PassengerVehicle(Integer issueYear, String brand, String model, String fuelType,
                            Double fuelConsumption, Integer tankVolume, Integer seatingAreas) {
        super(issueYear, brand, model, fuelType, fuelConsumption, tankVolume);
        this.seatingAreas = seatingAreas;
    }

    public void salonTreatment() {
    }
}
