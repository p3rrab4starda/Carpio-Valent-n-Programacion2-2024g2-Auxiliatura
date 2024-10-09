package Vehicle;

public class electricVehicle extends vehicle{
    private double batteryCapacity;
    private int range;

    public electricVehicle(String brand, String model, double price, double batteryCapacity) {
        super(brand, model, price);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
    public electricVehicle(String brand, String model, double price, double batteryCapacity, int range) {
        super(brand, model, price);
        this.batteryCapacity = batteryCapacity;
        this.range = range;
    }
    
    public void displayRange() {
        System.out.println("Range: " + range + " km");
    }
    
}
