import processing.core.*;

public class Main extends PApplet {

	  int count = 8;
	  float speed = 800;
	  float rotationInc = 10*PI/speed;
	  float rotationAmt = 0;
	  
	  int screenSize = 600;
	  
	  
	  public void setup()
	  {
	    size(screenSize, screenSize, P3D);
	   
	    background(0);
	    stroke(255);
	  }
	  
	  public void draw()
	  {
	    
	    if (keyPressed && (key == 'P' || key == 'p') )
	    {
	      return;
	    }
	    
	      background(0);
	      
	      rotationAmt += rotationInc;
	      
	      pushMatrix();
	      translate(300,300);
	      rotateZ(rotationAmt);
	      translate(-300,-300);
	      
	      fill(255,0,0);
	      noStroke();
	      pushMatrix();
	      translate(300,300);
	      rotateZ(rotationAmt);
	      box (50,250,50);
	      popMatrix();
	         
	      fill(0,255,255);
	      
	      pushMatrix();
	      translate(300,300);
	      rotateX(rotationAmt);
	      translate(-300,-300);
	             
	      pushMatrix();
	      translate(300,450);
	      rotateY(rotationAmt);
	      translate(-300,-450);
	             
	      translate(300,450,25);
	      box(150,50,50);
	      translate(0,0,-50);
	      fill(0,0,255);
	      box(150,50,50);
	      
	      popMatrix();
	         
	      pushMatrix();
	      translate(300,150);
	      rotateY(-rotationAmt);
	      translate(-300,-150);
	      
	      fill(255,0,255);
	      translate(300, 150, 25);
	      box(150,50,50);
	         
	      fill(240,240,0);
	      translate(0,0,-50);
	      box(150,50,50);
	      popMatrix();     
	      popMatrix();
	      popMatrix();
	      
	      camera(900,300,260,300,300,28,0,1,0);  // see the delerium ride from one end
	    }
}