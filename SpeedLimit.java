package HWWeek9;

public class SpeedLimit extends StaticRoadItem
{
    private double SpeedLimit;

    public SpeedLimit(double speed, double location)
    {
        super(location);
        SpeedLimit = speed;
    }

    public double getSpeedLimit()
    {
        return SpeedLimit;
    }
}	