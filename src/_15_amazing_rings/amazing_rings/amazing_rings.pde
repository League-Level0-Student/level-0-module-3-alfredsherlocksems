int dave = 600;
  int bil = 200;
boolean stop = false;
int direction = 1;
void setup () {
 size (800, 800); 
}
void draw () {
background (200, 200, 200);
  int bob = 400;
  for (int i = 20; i > 0; i--) {
    noFill();
    ellipse (bil, 400, bob, bob);
ellipse (dave, 400, bob, bob);
 bob -= 20;
 }
dave -= 1 * direction;
 bil += 1 * direction;
if (bil >= dave && !stop) {
direction = -1;
stop = true;

}
}
