package Game;
import processing.core.*;

public class Main extends PApplet {

	int count = 8;
	int xCen = 300;
	int yCen = 300;
	float speed = 400;
	float rotationInc = 10*PI/speed;
	float rotationAmt = 0;

	int screenSize = 600;

	public static void main(String[] args) 
	{
		PApplet.main(new String[] {"Game.Main"});
	}
	public void setup()
	{
		size(screenSize, screenSize, P3D);

		background(0);
		stroke(255);
	}

	public void draw()
	{
		background(0);
		//stroke(255);
		//noFill();
		//rotateZ(20);
		camera(0,300,450,0,0,0,0,1,0);
		beginShape();
			vertex(0,100,0);
			vertex(100,50,0);
			vertex(100,-50,0);
			vertex(0,-100,0);
			vertex(-100,-50,0);
			vertex(-100,50,0);
		endShape(CLOSE);
		//camera(0,300,450,0,0,0,0,1,0);  // see the ferris wheel from one end
	}


}