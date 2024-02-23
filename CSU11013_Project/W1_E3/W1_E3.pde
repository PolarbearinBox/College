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
    
  
    background(255);
    fill(c1);
    rect(i, 150, 100, 100);
    i++;
    
    if(i >= 300)
      { 
       fill(c1);
       rect(i - 400, 150, 100, 100);
      }
     if(i >= 400) i -= 400;
}
