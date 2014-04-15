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

	  if (keyPressed && (key == 'f' || key == 'F'))
	  {
	    speed -= 5;
	    if (speed == 0)
	    {
	      speed = 1;
	    }
	  }
	  if (keyPressed && (key =='s' || key == 'S'))
	  {
	    speed += 5;
	  }
	  
	  rotationInc = 10*PI/speed;
	  
	  if (keyPressed && (key == 'P' || key == 'p') )
	  {
	    return;
	  }
	  
	    background(0);
	    
	    rotationAmt += rotationInc;
	// NOTE: I have indented the pushMatrix and popMatrix commands to 
//	       clearly show which transformations are in effect for each
//	       drawing command.  For instance, the first one effects ALL the 
//	       drawing commands.

	    pushMatrix(); // For rotating the entire Ferris wheel
	       translate(300,300,0);
	       rotateZ(rotationAmt);
	       translate(-300,-300,0);
	     
	       fill(255,0,0);
	       noStroke();
	       ellipse (300,300,200,200);
	     
	       fill(0,0,255);
	       rect(200,295,200,10);
	       rect(295,200,10,200);
	     
	       pushMatrix(); // For placing the other wheel into the Z-axis
	     
	         translate(0,0,55);    
	         fill(255,0,0);
	         noStroke();
	         ellipse (300,300,200,200);
	         fill(0,0,255);
	         rect(200,295,200,10);
	         rect(295,200,10,200);
	        
	       popMatrix();  // Moves other wheel into the z-axis
	     
	       pushMatrix(); // place first car in ferris wheel (green)
	         fill(0,255,0);
	         noStroke();
	     
	         translate(200,300,28);
	         rotateZ(-rotationAmt);
	         box(50,50,50);
	     
	       popMatrix(); // place and rotate first car in ferris wheel (green)
	     
	       pushMatrix(); // place and rotate purple car in ferris wheel 
	         fill(150,0,255);
	         noStroke();
	     
	         translate(300,200,28);
	         rotateZ(-rotationAmt);
	         box(50,50,50);
	     
	       popMatrix(); // place and rotate purple car in ferris wheel
	     
	       pushMatrix(); // place and rotate yellow car in ferris wheel 
	         fill(255,255,0);
	         noStroke();
	     
	         translate(400,300,28);
	         rotateZ(-rotationAmt);
	         box(50,50,50);
	     
	       popMatrix(); // place and rotate yellow car in ferris wheel
	     
	       pushMatrix(); // place and rotate orange car in ferris wheel 
	         fill(255,100,0);
	         noStroke();
	     
	         translate(300,400,28);
	         rotateZ(-rotationAmt);
	         box(50,50,50);
	     
	       popMatrix(); // place and rotate orange car in ferris wheel
	     
	     popMatrix(); // Rotates the ferris wheel

	    camera(0,300,128,300,300,28,0,1,0);  // see the ferris wheel from one end
	  }


}