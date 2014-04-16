package game_states;


import game_objects.BackgroundScene;
import gui_objects.Button;
import processing.core.*;

public class FinishedScreen extends PApplet {

	private Main parent;
	private Button retryButton, quitButton;
	private BackgroundScene b;
	private PFont font;
	private int width, height;
	
	
	

	public FinishedScreen(Main p) 
	{
		parent = p;
		parent.frame.setTitle("Game Over");
		parent.size(640,480);
		retryButton = new Button(parent, 40, 300, 150, 75, "RETRY");
		quitButton = new Button(parent, 500, 300, 150, 75, "QUIT");
		b = new BackgroundScene(parent, 0, 0, parent.WIDTH, parent.HEIGHT, parent.loadImage("RejectedGameOver!.jpg"));
		width = 150;
		height = 75;
	
	}

	public void draw(int score, String rank) {

		b.draw(true);
		parent.textFont(parent.font, 40);
		parent.fill(255,255,255);
		parent.text("Calories Burned: " + score, 60, 40);
		parent.text("Overall "+ rank, 60, 70);
		retryButton.draw(true);
		quitButton.draw(true);
		
		
		if (retryButton.mousePressedAndContains())
		{
			//System.out.println("RETRY BUTTON CONTAINS MOUSE");
//			b.draw(false);
//			retryButton.draw(false);
//			quitButton.draw(false);
//			parent.isRunning = true;
			parent.loadGame();
		}
		else if (quitButton.mousePressedAndContains())
		{
			//System.out.println("QUIT BUTTON CONTAINS MOUSE");
			parent.exit();
		}
		
	}
}