package starcraft;

public class SupplyDepot extends Building{
	
	public SupplyDepot() {
		this.SupplyDepot = false;
	}
	
	int population = 10;
	public void BuildSD() {//개수에 따른 인구수 증감
	    
		if(population < 200) {
			population =+ 10;
			SupplyDepotNum++;
			if(population > 200) {
				population =200;
			}
		}
		else {
			System.out.println("최대 인구수 200에 도달하였습니다. 더이상 건설할 수 없습니다.");
		}
		
		
		
	}
	
	@Override
	public boolean isBuild() {
		return this.SupplyDepot;
	}
	@Override
	public void Build() {
		this.SupplyDepot = true;
	}
	@Override
	public void Destroy() {
		this.SupplyDepot = false;
	}
	
	public int population() {
		return this.population;
	}
}
