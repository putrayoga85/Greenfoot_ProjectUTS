import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tulip here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ular extends Actor
{
    /**
     * Act - do whatever the Tulip wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

  public void act() 
  {
        // bola memantul
    move(20);
    if(isAtEdge())
    {
      turn(90);
    }      
  } 
} 
