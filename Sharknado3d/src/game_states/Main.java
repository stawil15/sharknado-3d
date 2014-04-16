package game_states;
import javax.media.opengl.GL;

import ddf.minim.*;
import game_objects.BackgroundScene;
import game_states.*;
import processing.core.PApplet;
import processing.core.PImage;
import processing.core.PFont;
import processing.opengl.PGraphicsOpenGL;


public class Main extends PApplet{

	//Instance Variables
	public BackgroundScene backgroundImg;
	public Game gameScreen;
	public StartScreen startScreen;
	public boolean isRunning;
	public PImage image;
	Minim minim;
	AudioPlayer player;
	PFont font;
	int count = 0;
	PGraphicsOpenGL pgl;
	GL gl;
	
	public static void main(String[] args) 
	{
		PApplet.main(new String[] {"game_states.Main"});
	}

	public void setup()
	{
		size(640,480, P3D);
		gameScreen = new Game(this);
		startScreen = new StartScreen(this);
		//minim = new Minim(this);
		//player = minim.loadFile("Kirby64TheCrystalShardsFactoryInspection.mp3");
		//player.loop();
		//Text
		font = createFont("GAME_OVER.TTF", 80, true);
	}


	public void draw()
	{
		background(255);
		if (!isRunning)
		{
			startScreen.draw();

			//Greeting message
			textFont(font, 40);
			fill(0);
			text("''This game will make your JAWS drop.''", 20, 40);
		}
		else
		{
			gameScreen.draw();	
		}
	}

	public void loadGame()
	{
		isRunning = true;
	}

	public Game getGame()
	{
		return gameScreen;
	}
}
