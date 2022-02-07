public class Truck extends Vehicle
{
	// loadWeight is an integer in tons
	private int loadWeight;

	// Constructors
	public Truck(int weight)
	{
		loadWeight = weight;
	}
	
	protected void Accelerate(int secondsDelta)
	{
		if (loadWeight <= 5)
			setCurrentSpeed(getCurrentSpeed() + Constants.AccRateEmpty * secondsDelta * Constants.MpsToMph);
		else
			setCurrentSpeed(getCurrentSpeed() + Constants.AccRateFull * secondsDelta * Constants.MpsToMph);
	}
	
	protected void Decelerate(int secondsDelta)
	{
		if (loadWeight <= 5)
			setCurrentSpeed(getCurrentSpeed() + Constants.DecRateEmpty * secondsDelta * Constants.MpsToMph);
		else
			setCurrentSpeed(getCurrentSpeed() + Constants.DecRateFull * secondsDelta * Constants.MpsToMph);
	}
	
	// Setter methods
	public void SetLoadWeight(int weight)
	{
		loadWeight = weight;
	}

	// Getter methods
	public int getLoadWeight()
	{
		return loadWeight;
	}
}	