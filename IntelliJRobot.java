package Prog;
import org.apache.bcel.generic.RETURN;
import robocode.JuniorRobot;

public class   IntelliJRobot extends JuniorRobot {
    public void run() {
        setColors(green, black, blue);

        while (true) {
            ahead
        }
    }

    public void onScannedRobot() {
        turnGunTo(scannedAngle);
        fire(1);
    }

    public void onHitByBullet() {
        turnAheadLeft(100, 90 - hitByBulletBearing);
    }


    public void onHitWall(){
        back(90 );
        if(fieldHeight < fieldWidth) {
            turnRight(45);
        } else {
            turnLeft(45);

            if(fieldHeight > fieldWidth) {
                turnLeft(45);
            } else {
                turnRight(45);
            }
        }
    }
}