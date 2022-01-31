public class Truck extends Vehicle
{
	// loadWeight is a decimal in pounds or another applicable weight unit
	float loadWeight;

	public static void main(String[ ] args)  
	{
    
	}


	// Constructors
	public Truck()
	{
		super();
	}
	public Truck(float speed, String direction, float location, float weight)
	{
		super(speed, direction, location);
		loadWeight = weight;
	}

	// Setter methods
	public void SetLoadWeight(float weight)
	{
		loadWeight = weight;
	}

	// Getter methods
	public float getLoadWeight()
	{
		return loadWeight;
	}
}	