package HWWeek9;

import HWWeek9.StaticRoadItem;

public class StopSign extends StaticRoadItem
{

    StopSign(double mm)
    {
        super(mm);
    }
    // Figure out how to implement this
    void Save(ISaveDriver *sd, ostream& stream) override;

}	