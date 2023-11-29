import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public int score = 0;
    Label scoreLabel;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        
        //create elephant object
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 300);
        
        //create a label
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        
        Orange orange = new Orange();
        addObject(orange, 300, 0);
    }
    
    //the end screen
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
    }
    
    //Increase score
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
    }
    
    //creates a second apple
    public void createOrange(){
        Orange orange = new Orange();
        int x = Greenfoot.getRandomNumber(600);
        addObject(orange, x, 0);
    }
}
