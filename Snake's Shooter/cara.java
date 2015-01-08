import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cara here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cara extends World
{

    /**
     * Constructor for objects of class cara.
     * 
     */
    public cara()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);  
        mulai Mulai=new mulai();
        addObject(Mulai,494,345);
        
        kata2 Kata = new kata2();
        addObject(Kata,301,186);
    }
}
