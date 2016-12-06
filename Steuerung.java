import java.util.*;
import greenfoot.*;
import java.awt.Color;


public class Steuerung extends Actor
{
    MouseInfo MI;
    raumschiff Enterprise = new raumschiff();
    public void act()
    {
        MI=Greenfoot.getMouseInfo();
        if (MI!=null)
        {
            Enterprise.setLocation(MI.getX(),363);
        }
    }
    public void addedToWorld(World w)
    {
        w.addObject(Enterprise,300,363);
    }
} 

