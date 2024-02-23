int i = 0;
color c1 = color (128, 0, 0);
color c2 = color (0, 128, 0);
color c3 = color (0, 0, 128);

void setup()
{
  size(400, 400);
  noStroke();
  i = 0;
}

void draw()
{
  background(255);
  fill(c1);
  rect(100 + i, 100, 100, 100);
  fill(c2);
  rect (50 - i, 100, 100, 100);
  fill(c3);
  rect (75, 75 + i, 100, 100);
  
  i++;
}
