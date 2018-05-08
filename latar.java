import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class latar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class latar extends World
{
    private papan papan;
    
    
    /**
     * Constructor for objects of class latar.
     * 
     */
    public latar()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 500, 1); 
        
        papan = new papan();
        addObject( papan, getWidth() /2, getHeight() - 40 );
        prepare ();
    }
    
    private void prepare()
    {
        hewan hewan = new  hewan();
        addObject(hewan, 326, 199);
        hewan hewan2 = new hewan();
        addObject(hewan2, 534, 248);
        hewan hewan3 = new hewan();
        addObject(hewan3, 531, 135);
        hewan hewan4 = new hewan();
        addObject(hewan4, 262, 392);
        hewan hewan5 = new hewan();
        addObject(hewan5, 458, 253);
        hewan hewan6 = new hewan();
        addObject(hewan6, 476, 248);
        hewan6.setLocation(485, 319);
        hewan.setLocation(398, 83);
        hewan.setLocation(399, 52);
        hewan3.setLocation(447, 75);
        hewan5.setLocation(343, 74);
        hewan3.setLocation(451, 75);
        hewan5.setLocation(352, 75);
        hewan4.setLocation(302, 99);
        hewan2.setLocation(403, 100);
        hewan2.setLocation(399, 99);
        hewan6.setLocation(499, 99);
        hewan6.setLocation(498, 98);
        hewan6.setLocation(498, 99);
        hewan hewan7 = new hewan();
        addObject(hewan7, 259, 123);
        hewan hewan8 = new hewan();
        addObject(hewan8, 361, 123);
        hewan7.setLocation(258, 122);
        hewan8.setLocation(356, 122);
        hewan hewan9 = new hewan();
        addObject(hewan9, 459, 123);
        hewan9.setLocation(459, 123);
        hewan9.setLocation(455, 122);
        hewan hewan10 = new hewan();
        addObject(hewan10, 557, 120);
        hewan10.setLocation(554, 122);
        hewan hewan11 = new hewan();
        addObject(hewan11, 206, 147);
        hewan hewan12 = new hewan();
        addObject(hewan12, 319, 153);
        hewan hewan13 = new hewan();
        addObject(hewan13, 419, 153);
        hewan12.setLocation(313, 149);
        hewan11.setLocation(206, 146);
        hewan12.setLocation(305, 146);
        hewan13.setLocation(404, 146);
        hewan hewan14 = new hewan();
        addObject(hewan14, 506, 147);
        hewan14.setLocation(501, 147);
        hewan14.setLocation(504, 145);
        hewan14.setLocation(503, 146);
        hewan hewan15 = new hewan();
        addObject(hewan15, 604, 148);
        hewan15.setLocation(602, 146);
        hewan hewan16 = new hewan();
        addObject(hewan16, 168, 177);
        hewan16.setLocation(161, 169);
        hewan hewan17 = new hewan();
        addObject(hewan17, 265, 169);
        hewan17.setLocation(260, 169);
        hewan hewan18 = new hewan();
        addObject(hewan18, 363, 169);
        hewan18.setLocation(359, 169);
        hewan hewan19 = new hewan();
        addObject(hewan19, 462, 168);
        hewan19.setLocation(457, 169);
        hewan hewan20 = new hewan();
        addObject(hewan20, 558, 168);
        hewan20.setLocation(557, 169);
        hewan hewan21 = new hewan();
        addObject(hewan21, 600, 170);
        hewan21.setLocation(655, 169);
        
    }
    
}
