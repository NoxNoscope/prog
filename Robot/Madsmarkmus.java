package prog;
import robocode.*;

public class Madsmarkmus extends JuniorRobot
{
	public void run() {
	
		setColors(orange, orange, orange, orange, orange;
		
		//HVIS START I MARGIN
		if (robotX < 50){
			turnTo(90);
			ahead(50-robotX);
			turnTo(0);
		}
		if (robotX > fieldWidth-50){
			turnTo(270);
			ahead(50-(fieldWidth-robotX));
			turnTo(180);
		}
		if (robotY < 50){
			turnTo(0);
			ahead(50-robotY);
			turnTo(270);
		}
		if (robotY > fieldHeight-50){
			turnTo(180);
			ahead(50-(fieldHeight-robotY));
			turnTo(90);
		}
		
		//HVIS PÅ KØRELINJEN
		
		if (robotX == 50){
			turnTo(0);
			ahead(fieldHeight-robotY-50);
		}
		if (robotX == (fieldWidth-50)){
			turnTo(180);
			ahead(robotY-50);
		}
		if (robotY == 50) {
			turnTo(270);
			ahead(fieldWidth-robotY-50);
		}
		if (robotY == (fieldHeight-50)) {
			turnTo(90);
			ahead(fieldWidth-robotX-50);
		}

		//HVIS START I MIDTEN
		
		if (robotX <= (fieldWidth*0.5) && robotY < fieldHeight-50 && robotY > 50) {
		turnTo(270);
		ahead(fieldWidth-(fieldWidth-robotX)-50);
		}
		if (robotX > (fieldWidth*0.5) && robotY < fieldHeight-50 && robotY > 50) {
		turnTo(90);
		ahead(fieldWidth-robotX-50);
		}	
	}

	public void onScannedRobot() {
	/*
		turnTo(scannedAngle);
		fire(0.1);
		*/
		
	}

	/*
	public void onHitByBullet() {
		back(10);
	}
	*/
	
	public void onHitRobot(){
	
	}
}
