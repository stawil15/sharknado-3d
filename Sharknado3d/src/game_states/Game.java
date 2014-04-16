package game_states;
import processing.core.*;

public class Game {

	protected Main parent;
	int count = 8;
	int xCen = 300;
	int yCen = 300;
	float speed = 400;
	float rotationInc = 10*parent.PI/speed;
	float rotationAmt = 0;

	int screenSize = 640;
	
	public Game (Main p)
	{
		parent = p;
		parent.background(0);
		parent.stroke(255);
	}

	public void draw()
	{
		parent.background(0);
		//parent.stroke(255);
		//parent.noFill();
		//parent.rotateZ(20);
		parent.camera(0,300,450,0,0,0,0,1,0);
		parent.beginShape();
			parent.vertex(0,100,0);
			parent.vertex(100,50,0);
			parent.vertex(100,-50,0);
			parent.vertex(0,-100,0);
			parent.vertex(-100,-50,0);
			parent.vertex(-100,50,0);
		parent.endShape(parent.CLOSE);
		//camera(0,300,450,0,0,0,0,1,0);  // see the ferris wheel from one end
	}


}