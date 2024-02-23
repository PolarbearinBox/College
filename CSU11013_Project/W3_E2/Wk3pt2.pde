final int SCREENX = 400;
final int SCREENY = 400;

PImage invader;
PImage exploding;
PImage happy;
PImage crybanana;
PImage bear;

Alien aliens[];
Bear bears[];

void settings(){
   size(SCREENX, SCREENY);
}

void setup(){
  invader = loadImage("invader.gif");
  exploding = loadImage("exploding.GIF");
  happy = loadImage("smallhappy.png");
  crybanana = loadImage("crybanana.gif");
  bear = loadImage("bear.gif");
  
  aliens = new Alien[10];
  bears = new Bear[3];
  init_aliens(aliens);
  init_bears(bears);
}

void draw(){
  /* clear the screen */
  background(255);
  /* move the alien */
  move_aliens(aliens);
  move_bears(bears);
  /* draw the alien */
  draw_aliens(aliens);
  draw_bears(bears);
  
  //image(alienImage, a1.xpos, a1.ypos);
  explode_aliens(aliens);
  

}

void init_aliens ( Alien aliens[]){
  for(int i=0; i<aliens.length; i++)
    aliens[i] = new Alien(int(random(0,SCREENX)), int(random(0, SCREENY/2)), happy);
 /* for each position in the array,  create a new alien at an appropriate
 starting point on the screen */
}

void init_bears ( Bear bears[]){
  for(int i=0; i<bears.length; i++)
    bears[i] = new Bear(int(random(0,SCREENX)), int(random(0, SCREENY/2)), bear);
 /* for each position in the array,  create a new alien at an appropriate
 starting point on the screen */
}

void draw_aliens (Alien aliens[]){
  for(int i=0; i<aliens.length; i++)
    aliens[i].draw();
}

void draw_bears (Bear bears[]){
  for(int i=0; i<bears.length; i++)
    bears[i].draw();
}

void move_aliens(Alien aliens[]){
  for(int i=0; i < aliens.length; i++)
      aliens[i].move();
}

void move_bears(Bear bears[]){
  for(int i=0; i < bears.length; i++)
      bears[i].bearMove();
}

void explode_aliens(Alien aliens[]){
  int randomIndex = (int) random(0, aliens.length);
  if(randomIndex == (int) random(0, 10 * aliens.length))
    aliens[randomIndex].explode();
}
