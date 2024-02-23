final int PLAYERWIDTH = 30;
final int PADDLEHEIGHT = 10;

class Player{
  
  int xpos, ypos;
  //color paddlecolor = color (255, 170, 0);
  boolean alive; 
  PImage playerImage;
  
  Player( PImage newImage)
  {
    xpos = SCREENX / 2;
    ypos = SCREENY - 2 * PADDLEHEIGHT;
    //dx = 1;
    alive = true;
    playerImage = newImage;
  }
  
  void move (int x)
  {
    if(x > SCREENX - PLAYERWIDTH) xpos = SCREENX - PLAYERWIDTH;
    else xpos = x;
  }
  int x(){
	return xpos;
	}
  int y(){
	return ypos;
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
