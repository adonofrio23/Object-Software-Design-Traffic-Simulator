public class Car extends Vehicle
{
	protected void Accelerate(int secondsDelta)
	{
		setCurrentSpeed(getCurrentSpeed() + Constants.AccRate * secondsDelta * Constants.MpsToMph);
	}
	
	protected void Decelerate(int secondsDelta)
	{
		setCurrentSpeed(getCurrentSpeed() + Constants.DecRate * secondsDelta * Constants.MpsToMph);
	}
	
	// Constructors
	public Car()
	{
		super();
	}
	public Car(float speed, String direction, float location)
	{
		super(speed, direction, location);
	}
}	