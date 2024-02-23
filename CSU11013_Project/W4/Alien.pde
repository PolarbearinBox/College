final int A_FORWARD = 2;
final int A_BACKWARD = -2;
final int A_DOWN = 1;
final int ALIENWIDTH = 30;
final int ALIENHEIGHT = 30;
final int ALIENLIVES = 3;
class Alien {
  int x, y, dx, dy, moveDistance, lives; 
  PImage currentImage; 
  boolean collided, exploded; 
  
 Alien(int xpos, int ypos, PImage newImage){
   x = xpos; y = ypos;
   lives = ALIENLIVES;
   dx = dy = A_FORWARD;
   
   currentImage = newImage;
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
 }
 
 /*
 void move(){
   if (exploded) dx = 0;
   else{ 
     if(moveDistance >= ALIENHEIGHT){
     moveDistance = 0;
     dx *= -1;
     }
     
     if (((x + ALIENWIDTH >= SCREENX) || x <= 0)
     && moveDistance <= ALIENHEIGHT){
     x += 0;
     y += dy;
     moveDistance += dy;
   }
   x += dx;
  }
}
*/
  
  void explode(){
    exploded = true;
    currentImage = cry;
  }
  
  void speedup(){
    exploded = true;
    currentImage = speedup;
    bulletSpeed += 1;
  }
  
  void bigBullet(){
    exploded = true;
    currentImage = big;
    bulletRadius += 2;
  }
  
  void doubleBullet(){
    exploded = true;
    currentImage = doubleBullet;
    bulletNumber = 2;
  }
  
  void draw(){
    image(currentImage, x, y);
    /* Draw the alien using the image() method demonstrated in class */
  }
}
