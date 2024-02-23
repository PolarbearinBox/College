int i;
void setup()
{
  size(400, 400);
  noStroke(); fill(255, 204, 0);
  i = 0;
}
void draw(){
  background(255);
  rect(i, 100, 100, 100);
  if (i++ >= 300) i = 0;
}
