class Bear extends Alien{
  double A;
  Bear (int xpos, int ypos, PImage newImage){
    super (xpos, ypos, newImage);
    A = 2.0;
  }
  
  void sinMove(){
    
    x += dx;
    y += A * sin(0.1 * dy);
    dy++;
    A += 0.003;
  }
  
  void bearMove(){
    if( (x+ALIENWIDTH > SCREENX) &&
           (moveDistance < ALIENHEIGHT) ){
       x += 0;
       y += A_DOWN;
       moveDistance+= A_DOWN;
       dx = A_BACKWARD;
     }
     else if(moveDistance >= ALIENHEIGHT){
       sinMove();
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
       sinMove();
     }
  }
  
}
