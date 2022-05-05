package TrafficSimulator;

import java.util.ArrayList;
import java.util.List;

public class Simulation
{
    private List<DynamicRoadItem> DynamicRoadItems;

    public Simulation()
    {
        DynamicRoadItems = new ArrayList<DynamicRoadItem>();
    }

    public void AddDynamicRoadItem(DynamicRoadItem dri)
    {
        DynamicRoadItems.add(dri);
    }

    public void Update(int seconds)
    {
        for (DynamicRoadItem dri: DynamicRoadItems)
        {
            dri.Update(seconds);
        }
    }
}	