final int BULLETGAP = 20;
int bulletSpeed = 1;
int bulletRadius = 8;
int bulletNumber = 1;
boolean shot = false;

class Bullet {
  int xpos; int ypos;
  color bulletColor = color (2, 218, 242);
  
  Bullet(int initialXPos, int initialYPos)
  {
    xpos = initialXPos;
    ypos = initialYPos;
  }
  
  void move(){
    ypos -= bulletSpeed;
  }
  
  void collide(Alien aliens[]){
    for(int i = 0; i < aliens.length; i++){
      if(xpos + bulletRadius/2 >= aliens[i].x 
      && xpos - bulletRadius/2 <= aliens[i].x + ALIENWIDTH
      && ypos - bulletRadius/2 >= aliens[i].y
      && ypos + bulletRadius/2 <= aliens[i].y + ALIENHEIGHT
      || (xpos >= aliens[i].x && xpos <= aliens[i].x + ALIENWIDTH && ypos <= aliens[i].y + ALIENHEIGHT && ypos >= aliens[i].y)){
        aliens[i].collided = true;
        //aliens[i].y -= 1;
      }
    }
  }
  
  boolean collide(Shield theShield){
    if(  theShield.lives>0 &&  xpos + bulletRadius/2 >= theShield.x 
       && xpos <= theShield.x + SHIELDWIDTH
       && ypos + bulletRadius/2 >= theShield.y
       && ypos <= theShield.y + SHIELDHEIGHT)
       {
         return true;
       }
       else 
       {
         return false;
       }
  }
  
  void draw(){
    fill(bulletColor);
    circle(xpos + PLAYERWIDTH/2, ypos, bulletRadius);
  }

}
