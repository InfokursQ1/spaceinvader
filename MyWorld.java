import java.util.*;
import greenfoot.*;
import java.awt.Color;

public class MyWorld extends World
{
   Steuerung meineSteuerung= new Steuerung();
    
   public MyWorld()
   {
        super(800, 600, 1);
        setBackground("Mars.png");
        addObject(meineSteuerung,0,0);
   }//na wie gehts
}
