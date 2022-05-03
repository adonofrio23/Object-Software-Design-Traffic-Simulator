package HWWeek9;

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

    // How do I send an update message to each dynamic road item?
    public void Update(int seconds)
    {

    }
}	