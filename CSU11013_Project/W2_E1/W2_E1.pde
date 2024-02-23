final int SCREENX = 320;
final int SCREENY = 240;
final int PADDLEHEIGHT = 15;
final int PADDLEWIDTH = 50;
final int MARGIN = 10;

Player comPlayer;
Player thePlayer;
Ball   theBall;

void   settings(){
  size(SCREENX, SCREENY);
}

void   setup(){
  comPlayer = new Player(MARGIN);
  thePlayer = new Player(SCREENY-MARGIN-PADDLEHEIGHT);
  theBall   = new Ball();
  ellipseMode(RADIUS);
}

void   draw(){
  background(250);
  thePlayer.move(mouseX);
  theBall.move();
  comPlayer.compMove((int)theBall.x);
  
  theBall.collide(thePlayer); theBall.collide(comPlayer); theBall.collideWalls();
  
  comPlayer.draw(); thePlayer.draw(); theBall.draw();
  
   if(theBall.y <= 0 || theBall.y >= SCREENY)
   {
    if(theBall.y <= 0) {
      comPlayer.life();
      println("computer has " + comPlayer.lives + " lives left.");
    }
    if(theBall.y >= SCREENY) 
    {
      thePlayer.life();
      println("player has " + thePlayer.lives + " lives left.");
    }
    theBall.reset();
  }
  
  if(comPlayer.lives < 1) text("You Win!", 140, 120);
  if(thePlayer.lives < 1) text("Game Over!", 140, 120);
}

void mousePressed(){
    theBall.reset();
  }
