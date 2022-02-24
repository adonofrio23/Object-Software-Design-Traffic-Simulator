public class ImperialGUI extends GUI
{
	public double getSpeed(Vehicle v) 
	{ 
		return ((v.getCurrentSpeed()) * (Constants.MpsToMph)); 
	}

	public void setSpeedLimit(Vehicle v, double s) 
	{ 
		v.setDesiredSpeed(s/(Constants.MpsToMph)); 
	}
}