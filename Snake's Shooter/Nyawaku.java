import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Nyawaku here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Nyawaku extends Actor
{
    /**
     * Act - do whatever the Nyawaku wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int nyawaku = 2;
     GreenfootSound myMusic = new GreenfootSound("Backsound3.mp3");
    public void act() 
    {
        // Add your action code here.
        setImage(new GreenfootImage("Perjuangan Hidup : " +(nyawaku+1), 25, Color.RED, Color.GRAY));
    }    
    
    public void minNyawaku()
    {
        if(nyawaku==0)
        {
            Greenfoot.stop();
            setImage(new GreenfootImage("Perjuangan Hidup  : " + (nyawaku-nyawaku), 25, Color.RED, Color.YELLOW));
            getWorld().addObject(new GamesOver(),300,200);
            
        }
        else
        {
            nyawaku--;
            myMusic.stop();
        }
    }
}
