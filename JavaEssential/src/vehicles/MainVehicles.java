package vehicles;

public class MainVehicles {

	public static void main(String[] args) {
		Vehicles vehicle = null;
		for (Vehicles temp : vehicle.values()) {
			System.out.println(temp.toSting());
		}
		System.out.println(vehicle.BMW.toSting());

	}

}
