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
		//System.out.println("     [SCV ����]");
		System.out.printf("  ü��: 60");//,this.Health);
		System.out.println("");
		System.out.printf("  ���ݷ�: 5");//,this.AttackDamage);
		System.out.println("");
		System.out.printf("  ����: 0");//,this.Defense);
		System.out.println("");
		System.out.printf("  ��� �α���: 1");//,this.Population);
		System.out.println("");
	}
	@Override
	public void printUnitPopulation() {
		//�ش� ������ ���ڿ� �ش� �������� ���ǰ� �ִ� �α����� ����Ѵ�.
		System.out.println(this.Population);
	}
}
