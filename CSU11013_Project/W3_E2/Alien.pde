final int A_FORWARD = 2;
final int A_BACKWARD = -2;
final int A_DOWN = 1;
final int ALIENWIDTH = 29;
final int ALIENHEIGHT = 26;

class Alien {
  int x; int y; int dx; int dy; int moveDistance; PImage currentImage; boolean exploded;
 /* declare variables for alien position, direction of movement and appearance */

 /* Constructor is passed the x and y position where the alien is to
 be created, plus the image to be used to draw the alien */
 Alien(int xpos, int ypos, PImage newImage){
   x = xpos; y = ypos;
   dx = A_FORWARD;
   dy = A_FORWARD;
   currentImage = newImage;
   exploded = false;
  /* set up the new alien object */ 
 }
  
 void move(){
   if(exploded){
     x += 0;
     y += 0;
   }
   else{
       if( (x+ALIENWIDTH > SCREENX) &&
           (moveDistance < ALIENHEIGHT) ){
       x += 0;
       y += A_DOWN;
       moveDistance+= A_DOWN;
       dx = A_BACKWARD;
     }
     else if(moveDistance >= ALIENHEIGHT){
       x += dx;
       if(x < 0 || x + ALIENWIDTH > SCREENX) moveDistance = 0;
     }
     else if(x < 0 &&
            (moveDistance < ALIENHEIGHT)){
       x += 0;
       y += A_DOWN;
       moveDistance+= A_DOWN;
       dx = A_FORWARD;
     }  
     else{
       x += dx;
     }
   }
  /* Move the alien according to the instructions in the exercise */ 
 }
  
  void explode(){
      currentImage = crybanana;
      exploded = true;
  }
  
  void draw(){
    image(currentImage, x, y);
    /* Draw the alien using the image() method demonstrated in class */
  }
}
