public class MetricOutput implements ISimOutput
{
	public double getSpeed(Vehicle v)
    {
    	return v.getCurrentSpeed() * 1.6;
    }
}