package HWWeek9;

public class SpeedLimit extends StaticRoadItem
{
    private double SpeedLimit;

    public SpeedLimit(double speed, double location)
    {
        mileMarker = location;
        SpeedLimit = speed;
    }

    public double getSpeedLimit()
    {
        return SpeedLimit;
    }
}	