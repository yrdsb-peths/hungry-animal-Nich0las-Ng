import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * TitleScreen
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("Hungry Elephant", 60);
    Label moveLabel = new Label("use A and D to move", 40);
    Label startLabel = new Label("Press <<SPACE>> to start", 40);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        prepare();
    }

    /**
     * The main world act loop
     */
    public void act()
    {
        //Start the game if user presses the space bar
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,509,149);
        elephant.setLocation(507,142);
        elephant.setLocation(491,110);
        Label label = new Label("use A and D to move", 40);
        addObject(label,getWidth() / 2,285);
        label.setLocation(getWidth() / 2,266);
        label.setLocation(getWidth() / 2,215);
        Label label2 = new Label("Press <<SPACE>> to start", 40);
        addObject(label2,getWidth() / 2,317);
        label2.setLocation(getWidth() / 2,312);
        label.setLocation(getWidth() / 2,232);
        elephant.setLocation(520,122);
        Label label3 = new Label("Hungry Elephant", 60);
        addObject(label3,190,130);
        label3.setLocation(262,131);
    }
}
