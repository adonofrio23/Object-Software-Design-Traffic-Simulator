public class MetricGUI extends GUI
{
	public double getSpeed(Vehicle v)
	{
		return((v.getCurrentSpeed()) * (Constants.MpsToKph));
	}

	public void setSpeedLimit(Vehicle v, double s) 
	{ 
		v.setDesiredSpeed(s/(Constants.MpsToKph)); 
	}
}