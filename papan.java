import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class papan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class papan extends Actor
{
    private bola bola; 
    
    /**
     * Act - do whatever the papan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void addedToWorld(World world)
    {
        bola();
    } 
    
    public void act() 
    {
        if ( Greenfoot.isKeyDown("left"))
        {
            move(-9);
        }
        if( Greenfoot.isKeyDown("right"))
        {
            move(+9);
        }
        
        if (havebola()  && Greenfoot.isKeyDown("space"))
        {
            releasebola();
        }
    }
    
    public void move(int dist)
    {
        setLocation (getX() + dist, getY());
        if (bola !=null){
            bola.move (dist);
        }
    }
    
    public void bola()
    {
        bola = new bola();
        getWorld().addObject (bola,getX(), getY()-20);
    }
    
    public boolean havebola()
    {
       return bola != null;
    }
    
    public void releasebola()
    {
        bola.release();
        bola = null;
    }

}

