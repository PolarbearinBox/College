final int SCREENX = 400;
final int SCREENY = 400;
PImage alienImage;
Alien theAlien;
/* Declare an Alien */


void settings(){
   size(SCREENX, SCREENY);
}

void setup(){
  alienImage = loadImage("invader.gif");
  theAlien = new Alien(0,0,alienImage);
 /* create a new alien object */ 
}

void draw(){
  background(0);
  image(alienImage, theAlien.xpos, theAlien.ypos);
  
  theAlien.move();
  
  //image(alienImage, a1.xpos, a1.ypos);
  /* clear the screen */
  /* move the alien */
  /* draw the alien */
}
