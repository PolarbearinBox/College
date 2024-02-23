color fullShield = color (66, 87, 245);
color halfShield = color (135, 205, 245);
color noShield = color(255, 255, 255);
final int SHIELDWIDTH = 40;
final int SHIELDHEIGHT = 5;
class Shield{
  int x, y, lives;
  color shieldColor;
  boolean collided;
  
  Shield(){
    x = SCREENX / 2;
    y = SCREENY - 10 * SHIELDHEIGHT;
    lives = 3;
    shieldColor = fullShield;
    collided = false;
  }
  
  void hurt(){
    lives -= 1;
    if(lives <= 2) shieldColor = halfShield;
  }
  
  void draw()
  {
    fill(shieldColor);
    rect(x, y, SHIELDWIDTH, SHIELDHEIGHT);
  }
}
