package HWWeek9;

public class RoadItem
{
    protected RoadItem previousItem;
    protected RoadItem nextItem;

    protected double MileMarker = 0.0;
    // protected Object type;
    private Road currentRoad;

    public double GetMileMarker()
    {
        return MileMarker;
    }

    public void SetMileMarker(double distance)
    {
        MileMarker = distance;
    }

    public Road GetCurrentRoad()
    {
        return currentRoad;
    }

    public void SetCurrentRoad(Road road)
    {
        currentRoad = road;
    }

    public RoadItem GetPrevious()
    {
        return previousItem;
    }
    public RoadItem GetNext()
    {
        return nextItem;
    }

    public void SetPrevious(RoadItem item)
    {
        previousItem = item;
    }

    public void SetNext(RoadItem item)
    {
        nextItem = item;
    }

    // Implement this
    //virtual void Save(ISaveDriver *sd, ostream& stream) = 0;
}	