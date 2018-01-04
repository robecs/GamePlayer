import java.awt.Robot;
import java.util.Random;

public class MouseMover {
    public static final int SECOND = 1000;
    public static final int MAX_Y = 400;
    public static final int MAX_X = 400;

    public static void main(String... args) throws Exception {
        Robot robot = new Robot();
        Random random = new Random();
        while (true) {
						int 
							x = random.nextInt(MAX_X),
							y = random.nextInt(MAX_Y);
						System.out.println(String.format("Moving to: %d %d",x,y));
            robot.mouseMove(x, y);
            Thread.sleep(1 * SECOND);
        }
    }
}
