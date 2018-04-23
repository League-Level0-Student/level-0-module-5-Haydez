/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;

public class CircleRing {
    public static void main(String[] args) throws Exception {

        // 1. Make a new Robot
Robot t3000 = new Robot();

       //  2. Set your robot’s position to x=150 and y=200
t3000.setX(150);
t3000.setY(200);
        // 3. Put the robot's pen down
t3000.penDown();
        // 4. Set the robot’s speed to 10
t3000.setSpeed(10);
        // 5. Do everything below here 360 times (use i as the counter)
for (int i=0;i<361;i++) {

	        // 6. Move the robot 3 pixels
	t3000.move(3);
       //  7. Turn the robot 1 degree
	t3000.turn(1);
        // 8. If the counter i is divisible by 20 (hint: use mod operator  %)..
if(i%2==0) {
		// 9. do steps 10 and 11 exactly 360 times (use j as the counter)
	for (int j=0;j<361;j++) {
				// 10. Move the robot 1 pixel
t3000.move(1);
t3000.turn(1);
				// 11. Turn the robot 1 degree
}
}
}
}
}
