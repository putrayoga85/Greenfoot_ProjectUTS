import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Lebah here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lobster extends Actor
{
    /**
     * Act - do whatever the Lebah wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int a=0;
    private int b=0;
    public void act() 
    {
        // Add your action code here
        move(5);
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(),getY()-2);
            setRotation(-90);
        }
       
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-2,getY());
            setRotation(-180);
        }
        
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+2,getY());
            setRotation(0);
        }
        
         if (Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(),getY()+2);
            setRotation(+90); 
        }
        
        if ("space".equals(Greenfoot.getKey()))
        {
               fire(); 
               Greenfoot.playSound("Laser.mp3");
        }
        
        Actor Bom=(Bom)getOneIntersectingObject(Bom.class);
        if(Bom!=null)
        {
            getWorld().removeObject(Bom);
            Dunia dunia = (Dunia)getWorld();
            Nyawaku nyawaku = dunia.getNyawaku();
            nyawaku.minNyawaku();
            getWorld().addObject(new Bom(),10,Greenfoot.getRandomNumber(400));
        }
       /*Actor Ular=(Ular)getOneIntersectingObject(Ular.class);
        if(Ular!=null)
        {
            getWorld().removeObject(Ular);
            Dunia dunia = (Dunia)getWorld();
            Counter counter = dunia.getCounter();
            counter.addCounter();
            getWorld().addObject(new Ular(),10,Greenfoot.getRandomNumber(400));
        }*/
    }
   
        public void fire()
        {
              Ball ball =  new Ball();
              getWorld().addObject(ball, getX(), getY());
              ball.setRotation(getRotation());
        }
        
     }
