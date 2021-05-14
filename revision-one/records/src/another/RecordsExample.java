package another;

public class RecordsExample {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("Mercedes", "UX 1238 A95");
        Vehicle vehicle2 = new Vehicle("Mercedes", "UX 1238 A95");

        System.out.println(vehicle.brand());
        System.out.println(vehicle.licensePlate());
        System.out.println(vehicle.brandAsLowerCase());
        System.out.println(Vehicle.brandAsUpperCase(vehicle));
        System.out.println(vehicle);
        System.out.println(vehicle2);
        System.out.println(vehicle.equals(vehicle2)); // illustrates auto-creation of equals
        System.out.println(vehicle == vehicle2);
    }
}

// Note multiple constructors

record Vehicle(String brand, String licensePlate) {

    public Vehicle(String brand) {
        this(brand, null);
    }

    public String brandAsLowerCase() {
        return brand().toLowerCase();
    }

    public static String brandAsUpperCase(Vehicle vehicle) {
        return vehicle.brand.toUpperCase();
    }
}