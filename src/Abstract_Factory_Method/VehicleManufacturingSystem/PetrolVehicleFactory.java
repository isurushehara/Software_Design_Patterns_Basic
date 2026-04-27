package Abstract_Factory_Method.VehicleManufacturingSystem;

// Petrol Vehicle Factory
class PetrolVehicleFactory implements VehicleFactory {
    public Car createCar() {
        return new PetrolCar();
    }

    public Bike createBike() {
        return new PetrolBike();
    }
}
