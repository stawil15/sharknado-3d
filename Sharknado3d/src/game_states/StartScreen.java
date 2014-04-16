package game_states;
import game_objects.BackgroundScene;
import gui_objects.Button;
import processing.core.*;
import javax.swing.JFrame;

public class StartScreen {

	//Instance Variables
	private Main parent;
	private Button[] target;
	private BackgroundScene b;
	private PFont font;
	private String buttonText;
//	private PFrame dialog;
	
	public StartScreen(Main p) 
	{
		parent = p;
		parent.frame.setTitle("Welcome to Sharknado");
		parent.size(640,480);
		target = new Button[3];
		for(int i=0; i<target.length; i++) {
			if (i==0)
			{
				buttonText = "INFO";
			}
			else if (i==1)
			{
				buttonText = "PLAY";
			}
			else if (i==2)
			{
				buttonText = "QUIT";
			}
		target[i] = new Button(parent, 30 + (i*140), parent.height-80, parent.WIDTH, parent.HEIGHT, buttonText);
//		target[0] = new Button(parent, 30, parent.height-80, parent.WIDTH, parent.HEIGHT, "INFO");
//		target[1] = new Button(parent, (parent.width/2)-50, parent.height-80, parent.WIDTH, parent.HEIGHT, "PLAY");
//		target[2] = new Button(parent, parent.width-130, parent.height-80, parent.WIDTH, parent.HEIGHT, "QUIT");
		b = new BackgroundScene(parent, 0, 0, parent.WIDTH, parent.HEIGHT, parent.loadImage("startScreenBackground.png"));
//		infoScreen = new InfoScreen();
	}}
	

	public void draw()
	{
		parent.background(0);
		b.draw(true);
		for(int i=0; i<target.length; i++) {
			if (i==0)
			{
				buttonText = "INFO";
			}
			else if (i==1)
			{
				buttonText = "PLAY";
			}
			else if (i==2)
			{
				buttonText = "QUIT";
			}
			target[i].draw(true);
			

			if (target[i].mousePressedAndContains() && i==0)
			{
//				if (dialog == null)
//				{
//					dialog = new PFrame();
//					dialog.show();
//				}
			}
			else if (target[i].mousePressedAndContains() && i==1)
			{
				parent.loadGame();
			
			}
			else if (target[i].mousePressedAndContains() && i==2 )
			{
				parent.exit();
			}
		}
	}
}