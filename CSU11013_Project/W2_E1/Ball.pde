class Ball{
  float x; float y;
  float dx; float dy;
  int radius;
  color ballColor = color(200, 100, 50);
  boolean ballOutUp = false; boolean ballOutDown = false;
  
  Ball(){
    x = random(SCREENX / 4, SCREENX / 2);
    y = random(SCREENY / 4, SCREENY / 2);
    dx = random(1, 2); dy = random(1, 2);
    radius = 5;
  }
  
  void move(){
    x = x + dx; y = y + dy;
  }
  
  void draw(){
    fill(ballColor);
    ellipse(int(x), int(y), radius, radius);
  }
  
  void collide(Player tPlayer){
    if(y + radius >= tPlayer.ypos &&
       y - radius < tPlayer.ypos + PADDLEHEIGHT &&
       x >= tPlayer.xpos &&
       x <= tPlayer.xpos + PADDLEWIDTH){
         println("collided!");
         dy = -dy;
       }
  }
  
  void collideWalls(){
    if(x - radius <= 0 || x + radius >= SCREENX)
    dx = -dx;
  }
  
  
  void reset(){
      x = random(SCREENX / 4, 3 * SCREENX / 4);
      y = random(SCREENY / 4, 3 * SCREENY / 4);
    }
    
 }
