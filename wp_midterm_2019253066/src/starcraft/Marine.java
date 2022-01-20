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
		System.out.printf("  ü��: 40");//,this.Health);
		System.out.println("");
		System.out.printf("  ���ݷ�: 6");//,this.AttackDamage);
		System.out.println("");
		System.out.printf("  ����: 0");//,this.Defense);
		System.out.println("");
		System.out.printf("  ��� �α���: 1");//,this.Population);
		System.out.println("");
	}
	@Override
	public void printUnitPopulation() {
		System.out.println(this.Population);
	}
}
