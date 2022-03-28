import java.util.*;

public class Map
{
    private List<Road> roads;

    public Map()
    {
        roads = new ArrayList<Road>();
    }

    public void AddRoad(Road road)
    {
        roads.add(road);
    }

    public void Print(IPrintDriver pd, Object o)
    {
        for(Road road : roads)
        {
            road.Print(pd, o);
        }
    }
}