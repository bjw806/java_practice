package starcraft;

public class SCV extends Unit{
	
	/*public SCV(int hl, int ad, int df,int po) {
		this.Health=hl;
		this.AttackDamage=ad;
		this.Defense=df;
		this.Population=po;
	}*/
	
	/*public SCV() {
		this.Health=60;
		this.AttackDamage=5;
		this.Defense=0;
		this.Population=1;
	}*/
	public SCV() {
		this.SCV = false;
	}
	/*public void mineral() {
		 x 
	}
	*/
	
	@Override
	public void makeUnit() {
		this.SCV = true;
	}
	@Override
	public void killUnit() {
		this.SCV = false;
	}
	@Override
	public void printUnitInfo() {
		//System.out.println("     [SCV 유닛]");
		System.out.printf("  체력: 60");//,this.Health);
		System.out.println("");
		System.out.printf("  공격력: 5");//,this.AttackDamage);
		System.out.println("");
		System.out.printf("  방어력: 0");//,this.Defense);
		System.out.println("");
		System.out.printf("  사용 인구수: 1");//,this.Population);
		System.out.println("");
	}
	@Override
	public void printUnitPopulation() {
		//해당 유닛의 숫자와 해당 유닛으로 사용되고 있는 인구수를 출력한다.
		System.out.println(this.Population);
	}
}
