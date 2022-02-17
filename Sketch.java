import processing.core.PApplet;
/*
-------------------------------------------------------------------------------
Name:		Sketch.java
Purpose:	Calling Functions 5.2 Processing Task

Author:	Lui.G

Created:	2022-02-16
------------------------------------------------------------------------------
*/
public class Sketch extends PApplet {
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here

    size(1800, 1000);

  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {

    background(104, 143, 212);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

    //ground
	  for(int i = 0; i <= 1800; i += 100){
      ground(i, 900);
    }

    //stairs
    //set to 1 in order to decrese j & i
    int row = 1;
    int column = 1;
    for(int j = 5; j >= column; j--){
      for(int i = 5; i >= row; i--){
        blocks((i + 5)* 100, (j+3)*100);
      }
      row += 1;
    }

    //flag
    flag(1500, 800);
  }

  private void blocks(float cubeX, float cubeY){

    //brick outline
    stroke(0, 0, 0, 0);
    strokeWeight(1);
    fill(0, 0, 0);
    rect(cubeX, cubeY, 50, 25, 5);
    rect(cubeX+50, cubeY, 50, 25, 5);

    rect(cubeX, cubeY+25, 30, 25, 5);
    rect(cubeX+30, cubeY+25, 40, 25, 5);
    rect(cubeX+70, cubeY+25, 30, 25, 5);

    rect(cubeX, cubeY+50, 50, 25, 5);
    rect(cubeX+50, cubeY+50, 50, 25, 5);

    rect(cubeX, cubeY+75, 30, 25, 5);
    rect(cubeX+30, cubeY+75, 40, 25, 5);
    rect(cubeX+70, cubeY+75, 30, 25, 5);
  
    //brick forecolour
    fill(176, 61, 16);
    rect(cubeX+2, cubeY+2, 46, 21);
    rect(cubeX+52, cubeY+2, 46, 21);

    rect(cubeX+2, cubeY+27, 26, 21);
    rect(cubeX+32, cubeY+27, 36, 21);
    rect(cubeX+72, cubeY+27, 26, 21);

    rect(cubeX+2, cubeY+52, 46, 21);
    rect(cubeX+52, cubeY+52, 46, 21);

    rect(cubeX+2, cubeY+77, 26, 21);
    rect(cubeX+32, cubeY+77, 36, 21);
    rect(cubeX+72, cubeY+77, 26, 21);
    
  }

  private void ground(float groundX, float groundY){

    //dirt
    stroke(0, 0);
    fill(201, 134, 87);
    rect(groundX, groundY, 100, 1000-groundY);

    //grass
    fill(18, 156, 11);
    arc(groundX+50, groundY, 100, 100, 0, PI);

    //particles in the ground
    fill(230, 226, 177);
    ellipse(groundX+30, groundY+80, 25, 25);
    ellipse(groundX+55, groundY+105, 5, 5);
    ellipse(groundX+70, groundY+60, 10, 10);
    ellipse(groundX+30, groundY+140, 15, 15);
    ellipse(groundX+80, groundY+160, 20, 20);
    ellipse(groundX+50, groundY+175, 5, 5);

    //top outline
    stroke(100, 100, 100, 100);
    strokeWeight(2);
    line(groundX, groundY, groundX+100, groundY);

  }

  private void flag(float flagX, float flagY){

    //base
    blocks(flagX, flagY);

    stroke(0, 0, 0, 100);
    strokeWeight(2);

    //pole
    fill(186, 255, 179);
    rect(flagX+40, flagY-700, 20, 700);

    //flag
    fill(255, 255, 255);
    triangle(flagX-64, flagY-700, flagX+38, flagY-700, flagX+38, flagY-600);

    //ball on top of flag
    fill(0, 153, 5);
    ellipse(flagX+50, flagY-725, 50, 50);

    strokeWeight(0);
    ellipse(flagX+10, flagY-670, 45, 45);
  }
}