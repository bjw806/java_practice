package starcraft;

public class Barrack extends Building{
	
	public Barrack() {
		this.Barrack = false;
	}
	
	int MarinNum = 0;
	int FirebatNum = 0;
	int MedicNum = 0;
	
	public void MakeMarin() {//Marin ����
	    
		MarinNum++;
		//�ڿ� �Ҹ�..?
		//�̳׶� -50
	}
	
	public void MakeFirebat() {//Firebat ����
	    
		FirebatNum++;
		//�̳׶� -50
		//���� -25
	}
	
	public void MakeMedic() {//Medic ����
    
		MedicNum++;
		//�̳׶� -50
		//�̳׶� -25
	}
	
	@Override
	public boolean isBuild() {
		return this.Barrack;
	}
	@Override
	public void Build() {
		this.Barrack = true;
	}
	@Override
	public void Destroy() {
		this.Barrack = false;
	}
}
