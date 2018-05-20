import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bola here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ball extends Actor
{
    int x=3;
    int y=3;
    
    private boolean stuck = true;
    public void act()
    {
        if(!stuck)
        {
            gerak();
        }
        gerak();
        kanan();
        kiri();
        atas();
        papan();
        hewan();
    }
    
    /**
     * Act - do whatever the bola wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public ball()
    {
        GreenfootImage img=getImage();
        img.scale(img.getWidth()-20,img.getHeight()-20);
        setImage(img);
    }
    
    public void gerak()
    {
        setLocation(getX()+x,getY()+y);
    }
    public void kanan()
    {
        if(getX()>=getWorld().getWidth()-getImage().getWidth()/2){
            x=x-1;
        }
        }
    public void kiri()
    {
        if(getX()<=getImage().getWidth()/2){
            x=x+1;
        }
    }
    public void atas()
    {
        Actor hewan=getOneIntersectingObject(hewan.class);
        if(getY()<=getImage().getHeight()/2){
            y= -y;
        }
        //if(teddybear !=null){
        //    ((MyWorld)getWorld()).tambah();
         //   getWorld().removeObject(teddybear);
        //}
        
    }
    public void papan()
    {
        Actor papan=getOneIntersectingObject(papan.class);
        if(papan !=null){
            y=y-1;
        }
        if(getY()>=getWorld().getHeight()-getImage().getHeight()/2){
            Greenfoot.stop();
            Greenfoot.playSound("fall.mp3");
        }
        
    }
    public void hewan()
    {
      Actor hewan = getOneIntersectingObject(hewan.class);
        if (hewan !=null){
        y = -y;
        int offset = getX() - hewan.getX();
        x = x + (offset/10); 
        if (x > 1) {
                x = 1;
        }
        if (x < -1) {
                x = -1;
        }
        if(hewan !=null){
            ((latar)getWorld()).tambah();
            getWorld().removeObject(hewan);
            Greenfoot.playSound("kumbang.mp3");
        }
      }
        
    }
   
   
}
