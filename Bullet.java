import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Bullet extends Actor
{
    int z = 1000;
    public void act() 
    {
        z--;
        if (z==0) {
        setLocation(getX(),getY()-15);
        if (getY()==0) {
            getWorld().removeObject(this);
            
         
        
        
        }else {
        gegner g=(gegner)(getOneIntersectingObject(gegner.class));
            getWorld().removeObject(g);
            
        } 
        
        z = 1000;
        }
 
    }   
    
}
