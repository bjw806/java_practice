package starcraft;

public class Barrack extends Building{
	
	public Barrack() {
		this.Barrack = false;
	}
	
	int MarinNum = 0;
	int FirebatNum = 0;
	int MedicNum = 0;
	
	public void MakeMarin() {//Marin 생산
	    
		MarinNum++;
		//자원 소모..?
		//미네랄 -50
	}
	
	public void MakeFirebat() {//Firebat 생산
	    
		FirebatNum++;
		//미네랄 -50
		//가스 -25
	}
	
	public void MakeMedic() {//Medic 생산
    
		MedicNum++;
		//미네랄 -50
		//미네랄 -25
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
