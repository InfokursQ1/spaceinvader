import java.util.*;
import greenfoot.*;
import java.awt.Color;


public class Steuerung extends Actor
{
    World meineWelt;
    MouseInfo MI;
    raumschiff Enterprise = new raumschiff();
    Bullet meineKugel;
    public void act()
    {
        MI=Greenfoot.getMouseInfo();
        if (MI!=null)
        {
            Enterprise.setLocation(MI.getX(),363);
            if (MI.getButton()==1)
            {
                shoot();
            }
        } 
    }
    public void addedToWorld(World w)
    {
        w.addObject(Enterprise,300,363);
        meineWelt=w;
    }
    public void shoot()
    {
      meineKugel = new Bullet();
      meineWelt.addObject(meineKugel,Enterprise.getX(),363);
      
      
    }
    
} 

