package game_objects;
import game_states.Main;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import processing.core.PApplet;
import processing.core.PImage;


public class BackgroundScene extends Rectangle{
	
	//Instance Variables
	private PImage image;
	private PApplet parent;
	private float speed = 5;
	public BackgroundScene(PApplet p, float x, float y, int width, int height, PImage i) 
	{
		super(p, x, y, width, height);
		parent = p;
		image = i;	
		
	}

	@Override
	public void draw(boolean drawRect) 
	{
		super.draw(false);
		if (drawRect)
		{
			parent.image(image, getX(), getY());
		}
	}
	
	public void moveLeft()
	{
			x-=speed;
			if (parent.keyPressed && parent.key == 'f'){
				if (speed <= 45){
				speed++;
				}
				//System.out.println(speed);
			}
			//speed++;
	}
	
	public void moveToLastXPosition(float lastXPosition)
	{
		//if (x <= image.width*-1)
		if (x <= -720)
		{
			//x = lastXPosition;
			x = 720;
		}
	}


}
