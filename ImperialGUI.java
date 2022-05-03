package HWWeek9;

import java.util.ArrayList;

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

	public Road CreateRoad(String name, double locX, double locY, double len, Road.Heading hdg /*, ArrayList<RoadItem> RiArray*/)
	{
		return new Road(name, locX/Constants.MetersToMiles, locY/Constants.MetersToMiles, len/Constants.MetersToMiles, hdg /*,RiArray*/);
	}

	public SpeedLimit CreateSpeedLimit(double speed, double location)
	{
		return new SpeedLimit(speed/(Constants.MetersToMiles), location/Constants.MetersToMiles);
	}

	public StopSign CreateStopSign(double location)
	{
		return new StopSign(location/Constants.MetersToMiles);
	}
}