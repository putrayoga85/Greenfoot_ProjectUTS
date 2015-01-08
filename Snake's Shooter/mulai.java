import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mulai here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mulai extends Actor
{
    /**
     * Act - do whatever the mulai wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if (Greenfoot.mouseClicked(this)) {
            //Greenfoot.playSound("button.mp3");
            Greenfoot.playSound("button-3.mp3");
            Dunia dunia = new Dunia();  
            Greenfoot.setWorld(dunia);

            Awal awal = new Awal();
            awal.StopMusic(true);
            
            Dunia PlaymyMusicDunia = new Dunia();
            PlaymyMusicDunia.PlayMusic(true);
        }
    } 
     public mulai() {
        GreenfootImage image = getImage();
        image.scale(100, 100);
        setImage(image);
    }
}
