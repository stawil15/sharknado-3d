package game_objects;

import processing.core.PApplet;
import processing.core.PImage;

public class PotHole extends Rectangle{
	
	//Instance Variables
	private PImage image;
	private PApplet parent;
	private final static int POTHOLE_WIDTH=56;
	private final static int POTHOLE_HEIGHT=36;
	private float randomX;
	
	private float potX1, potY1, potWidth, potHeight, potX2,potY2;
	
	public PotHole(PApplet p, float x, float y, float width, float height, PImage i) 
	{
		super(p, x, y, width, height);
		parent = p;
		image = i;
		potX1 = this.getX();
		potY1 = this.getY();
		potWidth = this.getWidth();
		potHeight = this.getHeight();
		potX2 = potX1+potWidth;
		potY2 = potY1+potHeight;
	}

	@Override
	public void draw(boolean drawRect) 
	{
		super.draw(false);
		if (drawRect)
		{
			parent.image(image, getPotX1(), getPotY1());
		}
	}
	
	public float getPotY1() {
		return potY1;
	}

	public void setPotY1(float potY1) {
		this.potY1 = potY1;
	}

	public float getPotY2() {
		return potY2;
	}

	public void setPotY2(float potY2) {
		this.potY2 = potY2;
	}

	public void moveLeft()
	{
		
			x-=5;
			potX1-=5;
			potX2-=5;
			}
	
	public void moveToLastXPosition()
	{
		//modify y too
		//if (x <= image.width*-1)
		
		if (x <= -800)
		{
			//x = lastXPosition;
			
			randomX = parent.random(1440,720);
			x = randomX;
			this.setPotX1(randomX);
			potX1 =this.getPotX1();
			potX2 =potX1+potWidth;
		}
	}

	public float getPotX1() {
		return potX1;
	}

	public void setPotX1(float potX1) {
		this.potX1 = potX1;
	}

	public float getPotX2() {
		return potX2;
	}

	public void setPotX2(float potX2) {
		this.potX2 = potX2;
	}

	public static int getPotholeWidth() {
		return POTHOLE_WIDTH;
	}

	public static int getPotholeHeight() {
		return POTHOLE_HEIGHT;
	}


	}
	