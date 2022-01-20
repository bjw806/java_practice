package starcraft;

public class Firebat extends Unit {

	public Firebat() {
		this.Firebat = false;
	}
	
	@Override
	public void makeUnit() {
		this.Firebat = true;
	}
	@Override
	public void killUnit() {
		this.Firebat = false;
	}
	@Override
	public void printUnitInfo() {
		System.out.printf("  체력: 50");//,this.Health);
		System.out.println("");
		System.out.printf("  공격력: 16");//,this.AttackDamage);
		System.out.println("");
		System.out.printf("  방어력: 1");//,this.Defense);
		System.out.println("");
		System.out.printf("  사용 인구수: 1");//,this.Population);
		System.out.println("");
	}
	@Override
	public void printUnitPopulation() {
		System.out.println(this.Population);
	}
}
