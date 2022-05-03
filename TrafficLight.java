package HWWeek9;

import HWWeek9.DynamicRoadItem;

public class TrafficLight extends DynamicRoadItem
{
    private int redTime;
    private int yellowTime;
    private int greenTime;
    private int timeOn;
    // Color? Do I need to make a color class?

    public TrafficLight(int r, int y, int g, /* Color */ double mm)
    {
        redTime = r;
        yellowTime = y;
        greenTime = g;
        // Color = ?
        MileMarker = mm;
    }

    // Override Update method. How?
}	