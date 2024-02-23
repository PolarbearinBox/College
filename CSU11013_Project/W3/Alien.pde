final int A_FORWARD = 2;
final int A_BACKWARD = -2;
final int A_DOWN = 1;
final int ALIENWIDTH = 30;
final int ALIENHEIGHT = 30;

class Alien {
  int xpos; int ypos; int dx; int dy; int moveDistance;
 /* declare variables for alien position, direction of movement and appearance */

 /* Constructor is passed the x and y position where the alien is to
 be created, plus the image to be used to draw the alien */
 Alien(int xpos, int ypos, PImage alienImage){
   xpos = (int)random(0.25 * SCREENX, 0.75 * SCREENX);
   ypos = (int)random(0.25 * SCREENY, 0.75 * SCREENY);
   dx = A_FORWARD;
   dy = A_FORWARD;
  /* set up the new alien object */ 
 }
  
 void move(){
   if(   (xpos+ALIENWIDTH > SCREENX) &&
         (moveDistance < ALIENHEIGHT) ){
     xpos += 0;
     ypos += A_DOWN;
     moveDistance+= A_DOWN;
     dx = A_BACKWARD;
   }
   else if(moveDistance >= ALIENHEIGHT){
     xpos += dx;
     if(xpos < 0 || xpos + ALIENWIDTH > SCREENX) moveDistance = 0;
   }
   else if(xpos < 0 &&
          (moveDistance < ALIENHEIGHT)){
     xpos += 0;
     ypos += A_DOWN;
     moveDistance+= A_DOWN;
     dx = A_FORWARD;
   }
   else{
     xpos += dx;
   }
   
  /* Move the alien according to the instructions in the exercise */ 
 }
  
  void draw(){
    image(alienImage, SCREENX/4, SCREENY/4);
    /* Draw the alien using the image() method demonstrated in class */
  }
}
