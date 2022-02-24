import java.util.*;

public class Program {
	public static void main(String[ ] args)  
	{
		GUI gui;
		gui = null;
		char speedUnit = ' ';
		double speedLimit = 0;
		String units = "";
		Scanner input = new Scanner(System.in);

		while (speedUnit != 'M' && speedUnit != 'I')
		{
        	System.out.print("Enter 'M' for metric or 'I' for Imperial: ");
        	speedUnit = input.next().charAt(0);
        	if(speedUnit == 'M') 
			{
				gui = new MetricGUI();
				units = "kph";
        	} else if(speedUnit =='I') 
        	{
        		gui = new ImperialGUI();
        		units = "mph";	
        	} else 
            	System.out.println("Invalid input! Must enter 'I' or 'M'");  	
		}

		System.out.print("Enter speed limit: ");
        speedLimit = input.nextDouble();

        Car car = new Car();
		gui.setSpeedLimit(car, speedLimit);

		Truck truck1 = new Truck(4);
		gui.setSpeedLimit(truck1, speedLimit);
		
		Truck truck2 = new Truck(8);
		gui.setSpeedLimit(truck2, speedLimit);

		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		vehicles.add(car);
		vehicles.add(truck1);
		vehicles.add(truck2); 

		for (int i = 0; i < 11; i++) 
		{
			for (Vehicle v : vehicles) 
			{
				v.updateSpeed(1);
				String s = v.getClass().toString();
				System.out.println(s + " speed:" + String.format(" %.2f", gui.getSpeed(v)) + " " + units);
			}
        }
    }
}
