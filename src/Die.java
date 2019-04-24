package games.resources;
import java.lang.Math;

public class Die {
private int sides;

public Die() {
  sides = 6;

}

public Die(int sides){
this.sides = sides;
}

 int roll() {
  return (int)(Math.random()*sides)+1;

 }

}
