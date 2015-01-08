import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bola here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball extends Actor
{
    /**
     * Act - do whatever the Bola wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(80);
        //Actor ular = getOneIntersectingObject(Ular.class);
        kena();
        if (isAtEdge())
           {
                getWorld().removeObject(this);
            }
        /**Actor Ular=(Ular)getOneIntersectingObject(Ular.class);
        if(Ular!=null)
        {
            getWorld().removeObject(Ular);
            Dunia dunia = (Dunia)getWorld();
            Counter counter = dunia.getCounter();
            counter.addCounter();
            getWorld().addObject(new Ular(),10,Greenfoot.getRandomNumber(400));
        }*/
        }
   
    /*public void kena()
    {
       if(isTouching(Ular.class))
        {
            removeTouching(Ular.class);
            getWorld().addObject(new Ular(), Greenfoot.getRandomNumber(getWorld().getWidth()+15)+1,20);
        }
    }*/
    public void kena()
    {
        Actor Ular=(Ular)getOneIntersectingObject(Ular.class);
        if(Ular!=null)
        {
            getWorld().removeObject(Ular);
            Dunia dunia = (Dunia)getWorld();
            Counter counter = dunia.getCounter();
            counter.addCounter();
            getWorld().addObject(new Ular(),10,Greenfoot.getRandomNumber(400));
        }
    }
}   