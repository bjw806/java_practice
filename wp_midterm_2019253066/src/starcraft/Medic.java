package starcraft;

public class Medic extends Unit{

	/*public Medic() {
		this.Health=60;
		this.AttackDamage=0;
		this.Defense=1;
		this.Population=1;
	}*/
	
	public Medic() {
		this.Medic = false;
	}
	
	@Override
	public void makeUnit() {
		this.Medic = true;
	}
	@Override
	public void killUnit() {
		this.Medic = false;
	}
	@Override
	public void printUnitInfo() {
		System.out.printf("  ü��: 60");//,this.Health);
		System.out.println("");
		System.out.printf("  ���ݷ�: 0");//,this.AttackDamage);
		System.out.println("");
		System.out.printf("  ����: 1");//,this.Defense);
		System.out.println("");
		System.out.printf("  ��� �α���: 1");//,this.Population);
		System.out.println("");
	}
	@Override
	public void printUnitPopulation() {
		System.out.println(this.Population);
	}
}
