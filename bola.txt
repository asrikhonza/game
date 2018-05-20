import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bola here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bola extends Actor
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
        papankayu();
        teddy();
    
    if (isTouching(garis.class)){
    Greenfoot.stop ();
    getWorld().addObject(new GameOver(),
    getWorld().getWidth()/2,
    getWorld().getHeight()/2);
}
    }
    
    

   
    /**
     * Act - do whatever the bola wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public bola()
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
        Actor teddybear=getOneIntersectingObject(teddy.class);
        if(getY()<=getImage().getHeight()/2){
            y= -y;
        }
        //if(teddybear !=null){
        //    ((MyWorld)getWorld()).tambah();
         //   getWorld().removeObject(teddybear);
        //}
        
    }
    public void papankayu()
    {
        Actor kayu=getOneIntersectingObject(papan.class);
        if(kayu !=null){
            y=y-1;
        }
        if(getY()>=getWorld().getHeight()-getImage().getHeight()/2){
            Greenfoot.stop();
            Greenfoot.playSound("fall.mp3");
            Greenfoot.playSound("GameOver.mp3");
        }
        
    }
    public void teddy()
    {
      Actor teddy = getOneIntersectingObject(teddy.class);
        if (teddy !=null){
        y = -y;
        int offset = getX() - teddy.getX();
        x = x + (offset/10); 
        if (x > 1) {
                x = 1;
        }
        if (x < -1) {
                x = -1;
        }
        if(teddy !=null){
            ((MyWorld)getWorld()).tambah();
            getWorld().removeObject(teddy);
            Greenfoot.playSound("coins.mp3");
        }
      }
        
    }
   
   
}
