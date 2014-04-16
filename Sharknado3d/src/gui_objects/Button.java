package gui_objects;

import java.awt.event.MouseEvent;

import game_objects.Rectangle;
import processing.core.PApplet;
import processing.core.PFont;

public class Button extends Rectangle {

	//Instance Variables
	private static int BUTTON_WIDTH=100;
	private static int BUTTON_HEIGHT=50;
	private PFont font;
	private String buttonText;
	private float buttonStartX, buttonEndX, buttonStartY, buttonEndY;
	private float mouseX, mouseY;
	
	public Button(PApplet parent, float x, float y, float width, float height, String text) 
	{
		super(parent, x, y, BUTTON_WIDTH, BUTTON_HEIGHT);
		font = parent.createFont("Calibri", 16, true);
		buttonText = text;
		buttonStartX = x;
		buttonStartY = y;
		buttonEndX = x + BUTTON_WIDTH;
		buttonEndY = y + BUTTON_HEIGHT;
		mouseX = parent.mouseX;
		mouseY = parent.mouseY;
	}
	
	@Override
	public void draw(boolean drawRect)
	{
		if (drawRect)
		{
			parent.stroke(0);
			parent.fill(255);
			parent.rect(x, y, width, height);
		}
		parent.fill(0);
		parent.textFont(font, 32);
		parent.text(buttonText, x+(BUTTON_WIDTH/5.5f), y+(BUTTON_HEIGHT/1.45f));
	}
	
	public boolean mousePressedAndContains() {
		if (parent.mousePressed && (parent.mouseX>=buttonStartX && parent.mouseX<=buttonEndX) && (parent.mouseY>=buttonStartY && parent.mouseY<=buttonEndY)){
			return true;
		}
		return false;
	}

}