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

		while (speedUnit != 'M' && speedUnit != 'm' && speedUnit != 'I' && speedUnit != 'i')
		{
        	System.out.print("Enter 'M' for metric or 'I' for Imperial: ");
        	speedUnit = input.next().charAt(0);
        	if(speedUnit == 'M' || speedUnit == 'm') 
			{
				gui = new MetricGUI();
				units = "kph";
        	} else if(speedUnit =='I' || speedUnit == 'i') 
        	{
        		gui = new ImperialGUI();
        		units = "mph";	
        	} else 
            	System.out.println("Invalid input! Must enter 'I' or 'M'");  	
		}

		boolean validSpeedLimit = false;
		while (validSpeedLimit == false)
		{
			System.out.print("Enter speed limit: ");
        	speedLimit = input.nextDouble();
        	if (speedLimit < 0)
        		System.out.println("Invalid speed limit! Must be > 0.");
        	else
        		validSpeedLimit = true;
        }

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
