import java.util.*;
import greenfoot.*;
import java.awt.Color;

/**
 * 
 */
public class MyWorld extends World
{
   Steuerung meineSteuerung= new Steuerung();
    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {   
        super(800, 600, 1);
        Greenfoot.setSpeed(100);
        setBackground("Mars.png");
        addObject(meineSteuerung,0,0);
    }
}
