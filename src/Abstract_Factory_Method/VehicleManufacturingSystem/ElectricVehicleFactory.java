package Abstract_Factory_Method.VehicleManufacturingSystem;

// Electric Vehicle Factory
class ElectricVehicleFactory implements VehicleFactory {
    public Car createCar() {
        return new ElectricCar();
    }

    public Bike createBike() {
        return new ElectricBike();
    }
}
