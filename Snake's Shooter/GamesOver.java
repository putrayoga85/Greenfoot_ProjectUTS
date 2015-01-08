 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class GamesOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GamesOver extends Actor
{

    /**
     * Act - do whatever the GamesOver wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public GamesOver() 
    {
        //getWorld().addObject(new Bola(), Greenfoot.getRandomNumber(getWorld().getWidth()-15)+10,1);
        setImage(new GreenfootImage("YOU LOSE !!!",50, Color.BLUE, Color.RED));
        
    }    

}
