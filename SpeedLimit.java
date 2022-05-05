package TrafficSimulator;

public class SpeedLimit extends StaticRoadItem
{
    protected double SpeedLimit;

    public SpeedLimit(double speed, double location)
    {
        MileMarker = location;
        SpeedLimit = speed;
    }

    public double getSpeedLimit()
    {
        return SpeedLimit;
    }
}	