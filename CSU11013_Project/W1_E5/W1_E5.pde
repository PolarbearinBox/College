int i = 0;
int j = 0;

void setup()
{
    size(400, 400);
    noStroke();
    i = 0;
    j = 0;
}

void draw()
{
    int red = (int) (200 * sin(25 * i));
    int green = (int) (125 * cos(25 * i));
    int blue = (int)  (150 * sin(25 * i) * cos(50 * i));
    color c1 = color(red, green, blue);
    color c2 = color(blue, red, green);
    
  
    background(255);
    fill(c1);
    rect(i, 30 * sin(0.1 * j) + 50, 100, 100);
    fill(c2);
    rect(300-i, 30 * sin(0.1 * j) + 200, 100, 100);
    i++;
    j++;
    
    if(i >= 300)
      { 
       fill(c1);
       rect(i - 400, 30 * sin(0.1 * j) + 50, 100, 100);
       fill(c2);
       rect(700 - i, 30 * sin(0.1 * j) + 200, 100, 100);
      }
     if(i >= 400) i -= 400;
}
