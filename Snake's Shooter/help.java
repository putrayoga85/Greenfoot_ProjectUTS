import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class help here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class help extends Actor
{
    /**
     * Act - do whatever the help wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if (Greenfoot.mouseClicked(this)) {
            //Greenfoot.playSound("button.mp3");
             Greenfoot.playSound("button-3.mp3");
            cara Cara = new cara();  
            Greenfoot.setWorld(Cara);
        }
    }  
     public help() {
        GreenfootImage image = getImage();
        image.scale(100, 100);
        setImage(image);
    }
    }    
