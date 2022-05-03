package HWWeek9;

import java.util.ArrayList;

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

	public Road CreateRoad(String name, double locX, double locY, double len, Road.Heading hdg /*, ArrayList<RoadItem> RiArray*/)
	{
		return new Road(name, locX/Constants.MetersToKm, locY/Constants.MetersToKm, len/Constants.MetersToKm, hdg /*, RiArray*/);
	}

	public SpeedLimit CreateSpeedLimit(double speed, double location)
	{
		return new SpeedLimit(speed/(Constants.MpsToKph), location/Constants.MetersToKm);
	}

	public StopSign CreateStopSign(double location)
	{
		return new StopSign(location/Constants.MetersToKm);
	}
}