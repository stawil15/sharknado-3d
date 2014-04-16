package game_objects;

import processing.core.*;


public class Rectangle {

	//Instance Variables
	protected PApplet parent;
	protected float x, y, width, height;
	protected boolean isRunning;
	protected float xVelocity, yVelocity;
	protected float capSpeed = 50;
	
	//Constructor
	public Rectangle(PApplet parent, float x, float y, float width, float height) 
	{
		super();
		this.parent = parent;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		isRunning = true;
		//xVelocity = System.currentTimeMillis()*1000;
		
	}

	public void draw(boolean drawRect)
	{
		if (drawRect)
		{
			parent.rect(x, y, width, height);
		}
		
	}
	
	
	/*public boolean contains(Point boundingBox){
		
	}*/
	
	public PApplet getParent() 
	{
		return parent;
	}
	
	public void setParent(PApplet parent) 
	{
		this.parent = parent;
	}
	
	public float getX() 
	{
		return x;
	}
	
	public void setX(float x) 
	{
		this.x = x;
	}
	
	public float getY() 
	{
		return y;
	}
	
	public void setY(float y) 
	{
		this.y = y;
	}
	
	public float getWidth() 
	{
		return width;
	}
	
	public void setWidth(float width) 
	{
		this.width = width;
	}
	
	public float getHeight() 
	{
		return height;
	}
	
	public void setHeight(float height) 
	{
		this.height = height;
	}
}
