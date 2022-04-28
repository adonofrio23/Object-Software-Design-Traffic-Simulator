package HWWeek9;

public class RoadItem
{
    protected double MileMarker = 0.0;

    public RoadItem(double mm)
    {
        MileMarker = mm;
    }

    public double getMileMarker()
    {
        return MileMarker;
    }

    void setMileMarker(double mm)
    {
        MileMarker = mm;
    }

    // Implement this
    virtual void Save(ISaveDriver *sd, ostream& stream) = 0;
}	