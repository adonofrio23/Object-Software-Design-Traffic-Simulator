package HWWeek9;

import java.util.ArrayList;

public interface ISimInput
{
	void setSpeedLimit(Vehicle v, double speed);
	public Road CreateRoad(String name, double locX, double locY, double len, Road.Heading hdg /*, ArrayList<RoadItem> RiArray */);
	public SpeedLimit CreateSpeedLimit(double speed, double location);
	public StopSign CreateStopSign(double location);
	public TrafficLight CreateTrafficLight(int rTime, int yTime, int gTime, TrafficLight.Color lit, String name, double location);
}