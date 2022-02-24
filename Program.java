import java.util.*;

public class Program {
	public static void main(String[ ] args)  
	{
		GUI gui;

		Scanner input = new Scanner(System.in);
        System.out.print("Enter 'M' for metric or 'I' for Imperial: ");
        char speedUnit = input.next().charAt(0);
        System.out.print("Enter speed limit: ");
        double speedLimit = input.nextDouble();

/*
		Car car = new Car();
		car.setDesiredSpeed(65.0); 
		
		Truck truck1 = new Truck(4);
		truck1.setDesiredSpeed(55.0);
		
		Truck truck2 = new Truck(8);
		truck2.setDesiredSpeed(50.0); 
		
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		vehicles.add(car);
		vehicles.add(truck1);
		vehicles.add(truck2); */

		if(speedUnit == 'M') 
		{
			gui = new MetricGUI();

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
                    System.out.println(s + " speed:" + String.format(" %.2f", gui.getSpeed(v)) + " kph");
                }
            }
        } else if(speedUnit =='I') 
        {
        	gui = new ImperialGUI();


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
                    System.out.println(s + " speed:" + String.format(" %.2f", gui.getSpeed(v)) + " mph");
                }
        	}
        } else 
            System.out.println("Invalid input! Must enter 'I' or 'M'");
	}
}
