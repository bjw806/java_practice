package starcraft;

public class Building {
	
	boolean CommandCenter;
	boolean SupplyDepot;
	boolean Barrack;
	boolean building;
	int SupplyDepotNum;
	
	public Building() {//생성자
		this.CommandCenter = false;
		this.SupplyDepot = false;
		this.Barrack = false;
		this.building = false;
		this.SupplyDepotNum = 1;
	}
	
	//V2
	public boolean isBuild(/*int buildingnum*/) {//해당 건물이 건설되었는지 반환
		/*if(buildingnum == 1) {
			//CommandCenter
			return this.CommandCenter;
		}
		else if(buildingnum == 2) {
			//SupplyDepot
			return this.SupplyDepot;
		}
		else if(buildingnum == 3){
			//Barrack
			return this.Barrack;
		}
		else {
			return false;
		}*/
		return false;
	}
	
	
	public void Build(/*int buildingnum*/) {//해당 건물을 건설
		/*if(buildingnum == 1) {
			//CommandCenter
			this.CommandCenter = true;
		}
		else if(buildingnum == 2) {
			//SupplyDepot
			this.SupplyDepot = true;
		}
		else if(buildingnum == 3){
			//Barrack
			this.Barrack = true;
		}
		else {
			
		}*/
	}
	
	public void Destroy(/*int buildingnum*/) {//해당 건물을 철거
		/*if(buildingnum == 1) {
			//CommandCenter
			this.CommandCenter = false;
		}
		else if(buildingnum == 2) {
			//SupplyDepot
			this.SupplyDepot = false;
		}
		else if(buildingnum == 3){
			//Barrack
			this.Barrack = false;
		}
		else {
			
		}*/
	}
	
}
