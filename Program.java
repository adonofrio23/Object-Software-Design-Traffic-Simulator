import java.util.*;

public class Program {
	public static void main(String[ ] args)  
	{
		GUI gui;
		gui = new ImperialGUI();

		Scanner input = new Scanner(System.in);
        System.out.print("Enter 'M' for metric or 'I' for Imperial: ");
        char speedUnit = input.next().charAt(0);
        System.out.print("Enter speed limit: ");
        double speedLimit = input.nextDouble();

		if(speedUnit == 'M') 
		{
			gui = new MetricGUI();
        } else if(speedUnit =='I') 
        {
        	gui = new ImperialGUI();	
        } else 
            System.out.println("Invalid input! Must enter 'I' or 'M'");

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
				System.out.print(s + " speed:" + String.format(" %.2f", gui.getSpeed(v)));
				if(speedUnit == 'M') 
				{
					System.out.println(" kph");
        		} else if(speedUnit =='I') 
        		{
        			System.out.println(" mph");
        		}
			}
        }

        
	}
}
