import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bom extends Actor
{
    /**
     * Act - do whatever the Bom wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setLocation(getX(), getY()+10);
      BomMuncul();
    }    
    
     public boolean atWorldEdge() //mengecek apakah objek telah sampai ujung bawah dunia
    { 
        if(getY() > getWorld().getHeight()-2) //mengecek jika posisi objek secara vertikal (y) > batas bawah dunia
            return true; //jika ia maka nilai true dan akan generate objek baru
        else
            return false;
    } 
    
    public void BomMuncul()
    { 
        if (atWorldEdge()) //jika objek berada di bawah world
        { 
            getWorld().removeObject(this); //remove objek
        } 
    }
}
