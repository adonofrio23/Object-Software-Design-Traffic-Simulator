import java.util.*;

public class Program {
	public static void main(String[ ] args)  
	{
		ISimOutput simOutput = new MetricOutput();

		Car car = new Car();
		car.setDesiredSpeed(65.0);
		
		Truck truck1 = new Truck(4);
		truck1.setDesiredSpeed(55.0);
		
		Truck truck2 = new Truck(8);
		truck2.setDesiredSpeed(50.0);
		
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		vehicles.add(car);
		vehicles.add(truck1);
		vehicles.add(truck2);
		
		for (int i = 0; i < 11; i++)
		{
			for (Vehicle v:vehicles)
			{
				v.updateSpeed(1);
				String s = v.getClass().toString();
				System.out.println(s + " speed: " + String.format(" %.2f", simOutput.getSpeed(v)) + " mph");
			}
		}
	
	}
}
