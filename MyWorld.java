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
        super(600, 400, 1);
        addObject(meineSteuerung,0,0);
    }
}
