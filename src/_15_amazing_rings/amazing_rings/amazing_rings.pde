void setup () {
 size (800, 800); 
}
void draw () {
 int bob = 400;
  for (int i = 20; i > 0; i--) {
  noFill();
    ellipse (200, 400, bob, bob);
bob -= 20;
 }
  for (int i = 20; i > 0; i--) {
  noFill();
    ellipse (600, 400, bob, bob);
}
}
