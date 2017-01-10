import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Bullet extends Actor
{
    int z = 180;
    ScoreBoard sb;
    public Bullet(ScoreBoard s)
    {
     sb=s;   
   }
    public void act() 
    {
        z--;
        if (z==0) 
        {
          setLocation(getX(),getY()-1);
          if (getY()==0) {
            getWorld().removeObject(this);
            
         
        
        
          }else 
          {
            gegner g=(gegner)(getOneIntersectingObject(gegner.class));
            
            if(g!=null){
            sb.scoren(10);
            getWorld().removeObject(g);
            getWorld().removeObject(this);
           } 
           z = 180;
        }
 
    }  
   }
}