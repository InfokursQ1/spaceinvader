import java.util.*;
import greenfoot.*;
import java.awt.Color;

public class gegner extends Actor
{
  double lebenspunkte=1;
  int Zähler = 480;
  int z = 200;
  int dy=1;
  public gegner()
    {
        setImage("EinInvader.png");
    }
    public void act()
  {
         z--;
        if (z==0)
        {
        z=200;
       
        setLocation(getX()+dy,getY());
        Zähler--;
    
        if(Zähler==0)   
        {
            Zähler=480;
            dy=-dy;
            setLocation(getX(),getY()+5);
        }    
       }
  }  
}