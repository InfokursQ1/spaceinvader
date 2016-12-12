import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Bullet extends Actor
{
    public void act() 
    {
        setLocation(getX(),getY()-5);
        if (getY()==0) {
            getWorld().removeObject(this);
        
        
        }
    }    
}
