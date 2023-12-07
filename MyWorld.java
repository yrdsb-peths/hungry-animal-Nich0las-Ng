import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    /*
     * Ivan Mak: you could add your own feature to the game in order to deviate
     * it from the original tutorial game
     * 
     * otherwise the game functions pretty well 8/10 cuz i like the texture changes
     */
    public int score = 0;
    Label scoreLabel;
    int level = 1;
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
        addObject(elephant, 300, 350);
        
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
        
        if(score % 10 == 0)
        {
            level += 1;
        }
    }
    
    //creates a second apple
    public void createOrange(){
        Orange orange = new Orange();
        orange.setSpeed(level);
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(orange, x, y);
    }
}
