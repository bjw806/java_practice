package starcraft;

public class Unit {
	
	int Health;
	int AttackDamage;
	int Defense;
	int Population;
	
	/*public Unit() {
		this.Health=0;
		this.AttackDamage=0;
		this.Defense=0;
		this.Population=0;
	}//기본생성자*/
	
	/*public Unit(int hl, int ad, int df,int po) {
		this.Health=hl;
		this.AttackDamage=ad;
		this.Defense=df;
		this.Population=po;
	}*/
	
	boolean SCV = false;
	boolean Marine = false;
	boolean Firebat = false;
	boolean Medic = false;
	
	public Unit() {
		this.SCV = false;
		this.Marine = false;
		this.Firebat = false;
		this.Medic = false;
	}
	//V2
	public void makeUnit(/*int unitnum*/) {
		/*switch(unitnum) {
		case 1:
			SCV = true;
			break;
		case 2:
			Marine = true;
			break;
		case 3:
			Firebat = true;
			break;
		case 4:
			Medic = true;
			break;
		}*/
	}
	
	public void killUnit(/*int unitnum*/) {
		/*(switch(unitnum) {
		case 1:
			SCV = false;
			break;
		case 2:
			Marine = false;
			break;
		case 3:
			Firebat = false;
			break;
		case 4:
			Medic = false;
			break;
		}*/
	}
	
	public void printUnitInfo() {
		//System.out.println("[유닛 정보]");
		/*System.out.println(Health);
		System.out.println(AttackDamage);
		System.out.println(Defense);
		System.out.println(Population);*/
	}
	
	public void printUnitPopulation() {
		System.out.println(this.Population);
	}
}
