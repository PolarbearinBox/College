int i = 0;

void setup()
{
    size(400, 400);
    noStroke();
    i = 0;

}

void draw()
{
    color c1 = color(128, 0, 0);
    color c2 = color(0, 128, 0);
  
    background(255);
    fill(c1);
    rect(i, 50, 100, 100);
    if(i >= 300)
      { 
       fill(c1);
       rect(i - 400, 50, 100, 100);
      }
      
    fill(c2);
    rect(300 - i, 200, 100, 100);
    if (i >= 300)
      {
        fill(c2);
        rect(700 - i, 200, 100, 100);
      }
    i++;
    
     if(i >= 500) i -= 400;
}
