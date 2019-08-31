
import unit4.turtleLib.Turtle;

public class TurtuleExercise {
	
	
	public static void printrectangle(int width, int height) {
		Turtle t1 = new Turtle();
		t1.tailDown();
		t1.moveForward(width);
		t1.turnRight(90);
		t1.moveForward(height);
		t1.turnRight(90);
		t1.moveForward(width);
		t1.turnRight(90);
		t1.moveForward(height);
		t1.tailUp();
		t1.moveForward(50);
	}
	
	
	
	public static void printHexagon() {
		//TODO
	}

}
