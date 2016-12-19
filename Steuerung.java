import java.util.*;
import greenfoot.*;
import java.awt.Color;


public class Steuerung extends Actor
{
    World meineWelt;
    MouseInfo MI;
    raumschiff Enterprise = new raumschiff();
    gegner Invader = new gegner();
    Bullet meineKugel;
    boolean Freigabe=true;
    int z = 26;
    public void act()
    {
        MI=Greenfoot.getMouseInfo();
        if (MI!=null)
        {
            Enterprise.setLocation(MI.getX(),560);
            if ((MI.getButton()==1)&&(Freigabe== true))
            {
                shoot();
                z= 26;
                Freigabe = false;
            }
        } 
        z--;
        if (z<0) {
            Freigabe = true;
        }

    }
    public void addedToWorld(World w)
    {
        w.addObject(Enterprise,300,363);
        w.addObject(Invader,100,100);
        meineWelt=w;
    }
    public void shoot()
    {
      if (Freigabe== true) {
              meineKugel = new Bullet();
              meineWelt.addObject(meineKugel,Enterprise.getX(),570);
        }
    }
    
} 

