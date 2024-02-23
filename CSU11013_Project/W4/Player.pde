final int PADDLEWIDTH = 30;
final int PADDLEHEIGHT = 10;

class Player{
  
  int xpos; int ypos;
  //color paddlecolor = color (255, 170, 0);
  //int lives; 
  PImage playerImage;
  
  Player( PImage newImage)
  {
    xpos = SCREENX / 2;
    ypos = SCREENY - 2 * PADDLEHEIGHT;
    //dx = 1;
    //lives = 3;
    playerImage = newImage;
  }
  
  void move (int x)
  {
    if(x > SCREENX - PADDLEWIDTH) xpos = SCREENX - PADDLEWIDTH;
    else xpos = x;
  }
  /*
  void compMove(int x)
  {
     xpos = 3*x/4 + dx;
  }
  
  void life(){
    lives = lives - 1;
  }
  */
  
  void draw()
  {
    //fill(paddlecolor);
    //rect(xpos, ypos, PADDLEWIDTH, PADDLEHEIGHT);
    image(playerImage, xpos, ypos);
  }
}
