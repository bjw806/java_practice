package starcraft;

public class Marine extends Unit{

	public Marine() {
		this.Marine = false;
	}
	
	@Override
	public void makeUnit() {
		this.Marine = true;
	}
	@Override
	public void killUnit() {
		this.Marine = false;
	}
	@Override
	public void printUnitInfo() {
		System.out.printf("  체력: 40");//,this.Health);
		System.out.println("");
		System.out.printf("  공격력: 6");//,this.AttackDamage);
		System.out.println("");
		System.out.printf("  방어력: 0");//,this.Defense);
		System.out.println("");
		System.out.printf("  사용 인구수: 1");//,this.Population);
		System.out.println("");
	}
	@Override
	public void printUnitPopulation() {
		System.out.println(this.Population);
	}
}
