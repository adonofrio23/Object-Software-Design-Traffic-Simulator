public class Vehicle extends DynamicRoadItem
{
	// currentSpeed is a decimal in MPH
	private float currentSpeed;
	// currentDirection is a String. Ex: "N", "S", "SW"
	private String currentDirection;
	// currentLocation is a decimal in degrees
	private float currentLocation;

	public static void main(String[ ] args)  
	{
     	
	}

	// Method used to cause the car to speed up
	public void Accelerate(float toSpeed)
	{

	}

	// Method used to cause the car to slow down
	public void Decelerate(float toSpeed)
	{

	}

	// Method used to turn the car a certain number of degrees in a certain direction
	public void Turn(String direction, float degrees)
	{

	}

	// Constructors
	public Vehicle()
	{


	}
	public Vehicle(float speed, String direction, float location)
	{
		this.currentSpeed = speed;
		this.currentDirection = direction;
		this.currentLocation = location;
	}

	// Setter methods
	public void setCurrentSpeed(float speed)
	{
		currentSpeed = speed;
	}

	public void setCurrentDirection(String direction)
	{
		currentDirection = direction;
	}

	public void setCurrentLocation(float location)
	{
		currentLocation = location;
	}

	// Getter methods
	public float getCurrentSpeed()
	{
		return currentSpeed;
	}

	public String getCurrentDirection()
	{
		return currentDirection;
	}

	public float getCurrentLocation()
	{
		return currentLocation;
	}
}	