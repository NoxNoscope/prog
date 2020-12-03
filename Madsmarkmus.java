package prog;
import robocode.*;

public class Madsmarkmus extends Robot
{
	public void run() {
		
		//HVIS START I MARGIN
		if (getX() < 50){
			turnRight(90);
			ahead(50-getX());
			turnLeft(0);
		}
		if (getX() > getBattleFieldWidth()-50){
			turnRight(270);
			ahead(50-(getBattleFieldWidth()-getX()));
			turnLeft(180);
		} 
		if (getY() < 50){
			turnRight(0);
			ahead(50-getY());
			turnLeft(270);
		}
		if (getY() > getBattleFieldWidth()-50){
			turnRight(180);
			ahead(50-(getBattleFieldHeight()-getY()));
			turnLeft(90);
		}
		
		//HVIS PÅ KØRELINJEN
		
		if (getX() == 50){
			turnRight(0);
			ahead(getBattleFieldHeight()-getY()-50);
		}
		if (getX() == (getBattleFieldWidth()-50)){
			turnRight(180);
			ahead(getY()-50);
		}
		if (getY() == 50){
			turnRight(270);
			ahead(getBattleFieldWidth()-50-50);
		}
		if (getY() == (getBattleFieldHeight()-50)) {
			turnRight(90);
			ahead(getBattleFieldWidth()-getX()-50);
		}

		//HVIS START I MIDTEN
		
		if (getX() <= (getBattleFieldWidth()*0.5) && getY() < getBattleFieldHeight()-50 && getY() > 50) {
		turnLeft(270);
		ahead(getBattleFieldWidth()-(getBattleFieldWidth()-getX())-50);
		}
		if (getX() > (getBattleFieldWidth()*0.5) && getY() < getBattleFieldHeight()-50 && getY() > 50) {
		turnRight(90);
		ahead(getBattleFieldWidth()-getX()-50);
		}	
	}
}