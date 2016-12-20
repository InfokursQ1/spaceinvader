import java.util.*;
import greenfoot.*;
import java.awt.Color;


public class Steuerung extends Actor
{
    World meineWelt;
    MouseInfo MI;
    raumschiff Enterprise = new raumschiff();
    gegner [] Invader = new gegner[20];
    Bullet meineKugel;
    boolean Freigabe=true;
    int z = 800;
    public void act()
    {
        
        MI=Greenfoot.getMouseInfo();
        if (MI!=null)
        {
            Enterprise.setLocation(MI.getX(),560);
            if ((MI.getButton()==1)&&(Freigabe== true))
            {
                shoot();
                z= 800;
                Freigabe = false;
            }
         
        z--;
        if (MI.getButton()==0) {
            Freigabe = true;
        }
        }
    }
    public void addedToWorld(World w)
    {
        w.addObject(Enterprise,300,363);
        for(int i=0;i<14;i++)
        {
         Invader[i]= new gegner();
         w.addObject(Invader[i],i*50+50,70);
        }
        for(int i=0;i<14;i++)
        {
         Invader[i]= new gegner();
         w.addObject(Invader[i],i*50+50,140);
        }
        for(int i=0;i<14;i++)
        {
         Invader[i]= new gegner();
         w.addObject(Invader[i],i*50+50,210);
        }
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

