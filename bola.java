import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bola here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bola extends Actor
{
    /**
     * Act - do whatever the ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int deltaX;
    private int deltaY;
    
    private boolean stuck = true;
    public void act() 
    {
        if(!stuck)
        {
            move();
        }
        
    }   
    
    public void move()
    {
        setLocation (getX() + deltaX, getY() + deltaY);
        checkpapan();
        checkWalls();
        checkhewan();
    }
    
    private void checkWalls()
    {
        if (getX() == 0 || getX() == getWorld().getWidth()-1){
            deltaX = -deltaX;
        }
        if (getY() == 0){
            deltaY = -deltaY;
        }
    
    }
    
    private void checkpapan()
    {
        Actor papan = getOneIntersectingObject(papan.class);
        if(papan !=null) {
            deltaY = -deltaY;
            int offset = getX() - papan.getX();
            deltaX = deltaX + (offset/10);
            if (deltaX >7){
                deltaX=7;
            }
            if (deltaX<-7){
                deltaX=-7;
            }
        }
    }
    private void checkhewan()
    {
      Actor hewan = getOneIntersectingObject(hewan.class);
        if (hewan !=null){
        deltaY = - deltaY;
        int offset = getX() - hewan.getX();
        deltaX = deltaX + (offset/10); 
        if (deltaX > 7) {
                deltaX = 7;
        }
        if (deltaX < -7) {
                deltaX = -7;
        }
      }
       World world;
       world = getWorld();
       world.removeObject(hewan);
    }
    public void release()
      {
        deltaX = 0;
        deltaY = -5;
        stuck = false;
      }
}



    