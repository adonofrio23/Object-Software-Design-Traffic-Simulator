package TrafficSimulator;

public abstract class GUI implements ISimInput, ISimOutput
{
	public abstract double getSpeed(Vehicle v);
	public abstract void setSpeedLimit(Vehicle v, double speed);
	public abstract Road CreateRoad(String name, double locX, double locY, double len, Road.Heading hdg);
	public abstract SpeedLimit CreateSpeedLimit(double speed, double location);
	public abstract StopSign CreateStopSign(double location);
	public abstract TrafficLight CreateTrafficLight(int rTime, int yTime, int gTime, TrafficLight.Color lit, String name, double location);
}