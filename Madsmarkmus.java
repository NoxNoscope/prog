package prog;
import robocode.*;

public class Madsmarkmus extends Robot
{
	public void run() {
	
		setAdjustRadarForGunTurn(true);
		
		//HVIS START I MARGIN
		if (getX < 50){
			turnTo(90);
			ahead(50-getX);
			turnTo(0);
		}
		if (getX > getBattleFieldWidth-50){
			turnTo(270);
			ahead(50-(getBattleFieldWidth-getX));
			turnTo(180);
		} 
		if (getY < 50){
			turnTo(0);
			ahead(50-getY);
			turnTo(270);
		}
		if (getY > getBattleFieldWidth-50){
			turnTo(180);
			ahead(50-(fieldHeight-getY));
			turnTo(90);
		}
		
		//HVIS PÅ KØRELINJEN
		
		if (getX == 50){
			turnTo(0);
			ahead(fieldHeight-getY-50);
		}
		if (getX == (getBattleFieldWidth-50)){
			turnTo(180);
			ahead(getY-50);
		}
		if (getY == 50) {
			turnTo(270);
			ahead(getBattleFieldWidth-getY-50);
		}
		if (getY == (fieldHeight-50)) {
			turnTo(90);
			ahead(getBattleFieldWidth-getX-50);
		}

		//HVIS START I MIDTEN
		
		if (getX <= (getBattleFieldWidth*0.5) && getY < fieldHeight-50 && getY > 50) {
		turnTo(270);
		ahead(getBattleFieldWidth-(getBattleFieldWidthgetX)-50);
		}
		if (getX > (getBattleFieldWidth*0.5) && getY < fieldHeight-50 && getY > 50) {
		turnTo(90);
		ahead(getBattleFieldWidth-getX-50);
		}	
	}
}
