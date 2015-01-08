import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class awal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Awal extends World
{
    static GreenfootSound myMusic = new GreenfootSound ("Backsound3.mp3");
    boolean a=false;
    /**
     * Constructor for objects of class awal.
     * 
     */
    public Awal()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        mulai Mulai=new mulai();
        addObject(Mulai,113,323);
        help Help=new help();
        addObject(Help,471,323);

       judul jdl=new judul();
        addObject(jdl,296,53);
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
   public void started()
    {
        myMusic.play();
        

   }
   
   public void StopMusic (boolean input)
   {
       if(a=true)
       {
           myMusic.stop();
        }
    
    }
    
    public void PlayMusic (boolean input)
   {
       if(a=true)
       {
           myMusic.play();
        }
    
    }
}
