Alien theAliens[];
Player thePlayer;
Bullet theBullets[];

final int SCREENX = 400;
final int SCREENY = 400;

PImage happy, cry, player, speedup, big, doubleBullet;


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
  
  thePlayer = new Player(player);
  theAliens = new Alien[10];
  init_aliens(theAliens);
}

void init_aliens ( Alien aliens[]){
  for(int i=0; i<aliens.length; i++)
    aliens[i] = new Alien(int(random(0,SCREENX)), int(random(0, SCREENY/4)), happy);
 /* for each position in the array,  create a new alien at an appropriate
 starting point on the screen */
}

void draw(){ 
  background(255);
  thePlayer.draw();
  thePlayer.move(mouseX);
  
  if(shot){
    for(int i=0; i<theBullets.length; i++){
    theBullets[i].move();
    theBullets[i].draw();
    theBullets[i].collide(theAliens);
    
    if(theBullets[i].ypos < 0) shot = false;
    }
  }
 
  for(int i=0; i<theAliens.length; i++){
    theAliens[i].move();
    theAliens[i].draw();
    
    if(theAliens[i].lives <= 0 && !theAliens[i].exploded){
      if(random(0, 100)<50) theAliens[i].explode();
      else if(random(0, 100)<20)  theAliens[i].speedup();
      else if(random(0, 100)<20)  theAliens[i].bigBullet();
      else if(random(0, 100)<20)  theAliens[i].doubleBullet();
    }
  }
}

void mousePressed(){
  if(!shot){
    theBullets = new Bullet[bulletNumber];
     for(int i = 0; i<theBullets.length; i++){
      theBullets[i] = new Bullet(thePlayer.xpos + bulletRadius*i + BULLETGAP * i,
      thePlayer.ypos);
     }
  }
  shot = true;
}
