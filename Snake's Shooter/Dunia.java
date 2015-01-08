import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dunia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dunia extends World
{
   Counter counter = new Counter();
   Nyawaku nyawaku = new Nyawaku();
   Bom bom = new Bom();
   //Waktu waaktu = new Waktu();
   
    static GreenfootSound myMusic = new GreenfootSound ("Backsound2.mp3");
    boolean a=false;

    /**
     * Constructor for objects of class Dunia.
     * 
     */
    public Dunia()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare_ular();
        prepare_lobster();
        prepare_bom();
        //Greenfoot.delay();
        
        
    }
    
    public void act()
    {
        if(getObjects(Bom.class).isEmpty()) BomMuncul(); //Membuat objek ikan baru jika di world tidak ada
        //if(getObjects(Bomb.class).isEmpty()) BombMuncul();
    }
    
    public void BomMuncul()
    {   
        if(Greenfoot.getRandomNumber(1) < 2)
        {  
            addObject(new Bom(), Greenfoot.getRandomNumber(600), 10); //membuat objek baru dengan lokasi x random antara 1-500 dan lokasi y 10
            addObject(new Bom(), Greenfoot.getRandomNumber(600), 50);
        } 
    }
    
    public Counter getCounter()
    {
        return counter;
    }
    
    public Nyawaku getNyawaku()
    {
        return nyawaku;
    }
    
    private void prepare_ular()
    {
        addObject(counter, 100,40);
        Ular ularX = new Ular();
        addObject(ularX, Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
        Ular ularY = new Ular();
        addObject(ularY, Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
        Ular ularZ = new Ular();
        addObject(ularZ, Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
    }
    
    private void prepare_lobster()
    {
       addObject(nyawaku, 500,50);
       Lobster lobster = new Lobster();
       addObject(lobster, Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
    }
    
    private void prepare_bom()
    {
       Bom bom = new Bom();
       addObject(bom, Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
       Bom bom2 = new Bom();
       addObject(bom2, Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
    }
    
    private void Bom()
    {
        if(Greenfoot.getRandomNumber(1) < 2) 
        {  
            addObject(new Bom(), Greenfoot.getRandomNumber(500), 30);
             addObject(new Bom(), Greenfoot.getRandomNumber(500), 30);
        } 
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