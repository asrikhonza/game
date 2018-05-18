import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hewan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hewan extends Actor
{
    /**
     * Act - do whatever the hewan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public hewan()
    {
        GreenfootImage gambar = getImage();
        gambar.scale(gambar.getWidth(), gambar.getHeight()+5);
        setImage(gambar);
    }
    
    public void act() 
    {
        
    }
}
