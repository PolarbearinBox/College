Alien theAliens[];
Bullet theBullets[];
Bomb   theBombs[];
Player thePlayer;
Shield theShield;

final int SCREENX = 400;
final int SCREENY = 400;
boolean    alienAllExploded = true;

PImage happy, cry, player, speedup, bomb, big, doubleBullet;


// add code to declare a variable of type Player.
// add code to declare a variable of type Bullet.

void settings(){
    size(SCREENX, SCREENY);
}

void setup(){
  player = loadImage("cry.gif");
  happy = loadImage("happy.png");
  cry = loadImage("cry.gif");
  speedup = loadImage("speedup.png");
  big = loadImage("big.png");
  doubleBullet = loadImage("doubleBullet.png");
  bomb = loadImage("Bomb.gif");
  
  thePlayer = new Player(player);
  theBombs = new Bomb[10];
  theAliens = new Alien[10];
  init_aliens(theAliens);
  theShield = new Shield();
  //init_bombs(theBombs, theAliens);
}

void init_aliens ( Alien aliens[]){
  for(int i=0; i<aliens.length; i++)
    aliens[i] = new Alien(int(random(0,SCREENX)), int(random(0, SCREENY/4)), happy);
}

void draw(){ 
  background(255);
  if(theShield.lives > 0) theShield.draw();
  
  // the player initialisation
  if(thePlayer.alive == true)
  {
    thePlayer.draw();
    thePlayer.move(mouseX);
  }
  else
  {
    fill(0,0,0);
    text("Game Over!", 180, 200);
  }
  // bullet actions
  if(shot){
    for(int i=0; i<theBullets.length; i++){
    theBullets[i].move();
    theBullets[i].draw();
    theBullets[i].collide(theAliens);
    if (theBullets[i].collide(theShield)) theShield.hurt();
    if(theBullets[i].ypos < 0) shot = false;
    }
  }
  
   // the Aliens Initialisation, including the bombs; 
    for(int i=0; i<theAliens.length; i++){
        theAliens[i].move();
        theAliens[i].draw();
    // bomb actions
    if (!theAliens[i].collided && !theAliens[i].exploded){
      theAliens[i].getBomb();
      if(theAliens[i].aBomb != null) 
        theAliens[i].aBomb.draw();
      
    if (theAliens[i].aBomb.collide(thePlayer))
      thePlayer.alive = false;
      
    if (theAliens[i].aBomb.collide(theShield))
      theShield.hurt();
    }
   
   // Alien death actions
    if(theAliens[i].collided && !theAliens[i].exploded){
      if(random(0, 100)<50) theAliens[i].explode();
      else if(random(0, 100)<20)  theAliens[i].speedup();
      else if(random(0, 100)<20)  theAliens[i].bigBullet();
      else if(random(0, 100)<20)  theAliens[i].doubleBullet();
    }
    
    if(!theAliens[i].exploded){
      alienAllExploded = false;
    }
    
    if(alienAllExploded){
      fill(0,0,0);
      text("YOU WIN", 180, 200);
    }
  }
  
}

void mousePressed(){
  if(!shot && thePlayer.alive){
  theBullets = new Bullet[bulletNumber];
     for(int i = 0; i<theBullets.length; i++){
      theBullets[i] = new Bullet(thePlayer.xpos + bulletRadius*i + BULLETGAP * i,
      thePlayer.ypos);
     }
  }
  shot = true;
}
