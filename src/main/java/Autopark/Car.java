package Autopark;

public abstract class Car {
    private Integer issueYear;
    private String brand;
    private String model;
    private String fuelType;
    private Double fuelConsumption;
    private Integer tankVolume;
    private Integer fuelVolume;

    public Car(Integer issueYear, String brand, String model, String fuelType, Double fuelConsumption, Integer tankVolume) {
        this.issueYear = issueYear;
        this.brand = brand;
        this.model = model;
        this.fuelType = fuelType;
        this.fuelConsumption = fuelConsumption;
        this.tankVolume = tankVolume;
    }

    public Integer CarFill(Integer fuelVolume) throws Exception {
        if (fuelVolume <= tankVolume) {
            return fuelVolume;
        } else {
            throw new Exception();
        }
    }

    public void repair() {
    }

}
