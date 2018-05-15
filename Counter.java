import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int value = 0;
    private int target = 0;
    private String text;
    private int stringLength;
    
    public Counter()
    {
        this("");
    }

    public Counter(String prefix)
    {
        text = prefix;
        stringLength = (text.length() + 2) * 16;

        setImage(new GreenfootImage(stringLength, 24));
        GreenfootImage image = getImage();
        Font font = image.getFont();
        image.setFont(font.deriveFont(24.0F));
        
        updateImage();
    }
    public void updateImage() {
        if(value < target) {
            value++;
            updateImage();
        }
        else if(value > target) {
            value--;
            updateImage();
        }
    }  
}
