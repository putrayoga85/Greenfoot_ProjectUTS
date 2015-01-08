import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
import java.awt.Color;
/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int counter=0;
    private int totalCount=0;
    public void act()
    {
        // Add your action code here.
        setImage(new GreenfootImage("Ular : " +counter, 25, Color.YELLOW, Color.BLACK));
    }    
    
    public void addCounter()
    { 
        if(counter<10)
        {
            counter++;
             
        }else{
            Greenfoot.stop();
            getWorld().addObject(new menang(),300,200);
        }
    }    
}
