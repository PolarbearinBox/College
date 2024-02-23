final int BOMBSPEED = 1;

class Bomb{
int x, y, dx, dy;
PImage currentImage;
	Bomb(int inputx, int inputy){
	x = inputx;
	y = inputy;
  dy = BOMBSPEED;
	currentImage = bomb;
	}

	void move(){
	y += dy;
	}

	void draw(){
	image(currentImage, x, y);
	}

	boolean offScreen(){
	if(x>=0&&x<=SCREENX &&
	   y>=0&&y<=SCREENY)
	return false;
	else return true;
	}	
  
  boolean collide(Player thePlayer){
    if(x <= thePlayer.xpos + PLAYERWIDTH 
       && x + ALIENWIDTH >= thePlayer.xpos
       && y + ALIENHEIGHT >= thePlayer.ypos
       && y <= thePlayer.ypos + ALIENHEIGHT)
    return true;
    else 
    return false;
  }
  boolean collide(Shield theShield){
    if( theShield.lives>0 &&  x + ALIENWIDTH >= theShield.x 
       && x <= theShield.x + SHIELDWIDTH
       && y + ALIENHEIGHT >= theShield.y
       && y <= theShield.y + SHIELDHEIGHT)
       {
       return true;
       }
       else return false;
  }

}
