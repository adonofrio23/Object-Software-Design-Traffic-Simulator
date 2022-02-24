public abstract class GUI implements ISimInput, ISimOutput
{
	public abstract double getSpeed(Vehicle v);
	public abstract void setSpeedLimit(Vehicle v, double speed);
}