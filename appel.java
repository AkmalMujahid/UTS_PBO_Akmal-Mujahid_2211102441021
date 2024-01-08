import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class appel extends Actor
{
    
     public void addedToWorld(World Latar)
    {
        setGambar(10);
    }
    
    private void setGambar(int d)
    {
        GreenfootImage image=new GreenfootImage("apple2.png");
        
        setImage(image);
    }
    public void act()
    {
        // Add your action code here.
    }
}
