package starcraft;

import java.util.Scanner;

public class Game {
	
	public static void main(String[] args) {
		Scanner Scan =new Scanner(System.in); //scanner를 scan으로
		
		////////////변수 설정//////////////
		Building CC = new CommandCenter();
		Building SD[] = new SupplyDepot[19];//여러개 지을 수 있음. 인구수는 200명이 최대이기 때문에 , 최대 19개까지 건설가능.
		int SDi = 0;
		Building B = new Barrack();
		//유닛 번호 부여.
		Unit SCV[] = new SCV[100];
		int SCVi = 0;
		Unit Marine[] = new Marine[100];
		int Marinei = 0;
		Unit Firebat[] = new Firebat[100];
		int Firebati = 0;
		Unit Medic[] = new Medic[100];
		int Medici = 0;
		////////////////////////////////
		
		int num=0;
	while(num!=6) {//6이면 게임 종료
		 System.out.println("==================");
		 System.out.printf("  현재 인구수: %d",(SDi*10)+10);
		 System.out.printf("명\n");
		 System.out.printf("  현재 사용 인구수: %d",SCVi+Marinei+Firebati+Medici);
		 System.out.printf("명\n");
		 System.out.println("==================");
		 System.out.print("  원하는 기능을 선택하세요: \n");
		 System.out.print("  건물 건설: 1\n");
		 System.out.print("  건물 철거: 2\n");
		 System.out.print("  유닛 조회: 3\n");
		 System.out.print("  유닛 생성: 4\n");
		 System.out.print("  유닛 삭제: 5\n");
		 System.out.print("  게임 나가기: 6\n");
		 System.out.println("==================");
		 num = Scan.nextInt();
		 
		
		switch(num) {
////////////////////////////////////////////////////////////////////////////////////////////
		case 1: 
			System.out.println("");
			System.out.println("=======[건물 건설]=======");
			System.out.println("  어떤 건물을 건설하시겠습니까?: ");
			System.out.println("  Command Center: 1");
			System.out.println("  Supply Depot: 2");
			System.out.println("  Barrack: 3");
			System.out.println("======================");
			int buildingnum = Scan.nextInt();

			switch(buildingnum) {
			case 1: //커맨드센터
				if(CC.isBuild()==true) {//command Center가 건설되어있음.
					System.out.println("   Command Center는 이미 건설되어 있습니다.");
					break;
				}
				else {
					System.out.println("   Command Center를 건설합니다.");
					CC.Build();
					break;
				}
					
			case 2://디폿
				if(SDi >= 19) {//supply depot 19개 이상이라면
					System.out.println("     인구수가 최대에 도달하였습니다.");
					System.out.println("     더이상 Supply Depot을 건설할 수 없습니다.");
					break;
				}
				else if(CC.isBuild()==true) {//command Center가 건설되어있음.
					System.out.println("     Supply Depot을 건설합니다.");
					SD[SDi] = new SupplyDepot();
					SD[SDi].Build();
					SDi++;
					break;
				}
				else {//or
					System.out.println("   Command Center가 건설되어있지 않습니다.");
					break;
				}
	
			case 3://배럭
				if(CC.isBuild()==true) {//command Center가 건설되어있음.
					if(B.isBuild()==true) {//Barrack이 건설되어있음
						System.out.println("   Barrack은 이미 건설되어 있습니다.");
						break;
					}
					else{//or
						System.out.println("   Barrack을 건설합니다.");
						B.Build();
						break;
					}
				}
				else {//or
					System.out.println("   Command Center가 건설되어있지 않습니다.");
					break;
				}
			}
			break;
////////////////////////////////////////////////////////////////////////////////////////////	
		case 2:  
			System.out.println("");
			System.out.println("=======[건물 철거]=======");
			System.out.println("  어떤 건물을 철거하시겠습니까?: ");
			System.out.println("  Command Center: 1");
			System.out.println("  Supply Depot: 2");
			System.out.println("  Barrack: 3");
			System.out.println("======================");
			int destroynum = Scan.nextInt();

			switch(destroynum) {
			case 1: //커맨드센터
				if(CC.isBuild()==true) {
					System.out.println("   Command Center를 철거합니다.");
					CC.Destroy();
					break;
				}
				else {
					System.out.println("   Command Center는 건설되어있지 않습니다.");
					break;
				}
					
			case 2://디폿
				if(SDi != 0) {
					System.out.println("   Supply Depot을 철거합니다.");
					SD[SDi-1].Destroy();
					SD[SDi-1] = null;
					SDi--;
					break;
				}
				else {
					System.out.println("   Supply Depot가 건설되어있지 않습니다.");
					break;
				}
				
				
			case 3://배럭
				if(B.isBuild()==true) {
					System.out.println("   Barrack을 철거합니다.");
					B.Destroy();						
				}
				else {
					System.out.println("   Barrack이 건설되어있지 않습니다.");
					break;
				}
			}
			break;
///////////////////////////////////////////////////////////////////////////////			
		case 3: 
			System.out.println("");
			System.out.println("=======[유닛 조회]=======");
			//유닛 정보 출력.
			//사용한 인구수 출력.
			
			int SCVii=0;
			int Marineii=0;
			int Firebatii=0;
			int Medicii=0;
			while(SCVii<SCVi) {
				System.out.println("");
				System.out.printf("     [SCV 유닛 %d",SCVii+1);//유닛 번호
				System.out.println("]");
				SCV[SCVii].printUnitInfo();
				SCVii++;
			}
			
			while(Marineii<Marinei) {
				System.out.println("");
				System.out.printf("     [Marine 유닛 %d",Marineii+1);
				System.out.println("]");
				Marine[Marineii].printUnitInfo();
				Marineii++;
			}
			
			while(Firebatii<Firebati) {
				System.out.println("");
				System.out.printf("     [Firebat 유닛 %d",Firebatii+1);
				System.out.println("]");
				Firebat[Firebatii].printUnitInfo();
				Firebatii++;
			}
			
			while(Medicii<Medici) {
				System.out.println("");
				System.out.printf("     [Medic 유닛 %d",Medicii+1);
				System.out.println("]");
				Medic[Medicii].printUnitInfo();
				Medicii++;
			}
			
		break; 
//////////////////////////////////////////////////////////////////////////////////////////////		
		case 4: 
			System.out.println("");
			System.out.println("=======[유닛 생성]=======");
			System.out.println("  어떤 유닛을 생성하시겠습니까?: ");
			System.out.println("  SCV: 1");
			System.out.println("  Marine: 2");
			System.out.println("  Firebat: 3");
			System.out.println("  Medic: 4");
			System.out.println("======================");
			int makeunitnum = Scan.nextInt();
			
			switch(makeunitnum) {
			case 1:
				if(CC.isBuild()==true) {
					System.out.println("     [SCV] 생성");
					SCV[SCVi] = new SCV();
					SCV[SCVi].makeUnit();
					SCVi++;
					break;
				}
				else {
					System.out.println("   Command Center가 건설되어있지 않습니다.");
					break;
				}
				
				//SCV.
				
			case 2:
				if(B.isBuild()==true) {
					System.out.println("     [Marine] 생성");
					Marine[Marinei] = new Marine();
					Marine[Marinei].makeUnit();
					Marinei++;
					break;
				}
				else {
					System.out.println("   Barrack이 건설되어있지 않습니다.");
					break;
				}
				//Marine.
				
			case 3:
				if(B.isBuild()==true) {
					System.out.println("     [Firebat] 생성");
					Firebat[Firebati] = new Firebat();
					Firebat[Firebati].makeUnit();
					Firebati++;
					break;
				}
				else {
					System.out.println("   Barrack이 건설되어있지 않습니다.");
					break;
				}

			case 4:
				if(B.isBuild()==true) {
					System.out.println("     [Medic] 생성");
					Medic[Medici] = new Medic();
					Medic[Medici].makeUnit();
					Medici++;
					break;
				}
				else {
					System.out.println("Barrack가 건설되어있지 않습니다.");
					break;
				}
			}
		
		break;
/////////////////////////////////////////////////////////////
		case 5: 
			System.out.println("");
			System.out.println("=======[유닛 삭제]=======");
			System.out.println("  어떤 유닛을 삭제하시겠습니까?: ");
			System.out.println("  SCV: 1");
			System.out.println("  Marine: 2");
			System.out.println("  Firebat: 3");
			System.out.println("  Medic: 4");
			System.out.println("======================");
			int delunitnum = Scan.nextInt();
			
			switch(delunitnum) {
			case 1:
				if(SCVi != 0) {
					System.out.println("     [SCV] 삭제");
					SCV[SCVi-1].killUnit();
					SCV[SCVi-1] = null;
					SCVi--;
					//SCV.
					break;
				}
				else {
					System.out.println("   SCV가 존재하지 않습니다.");
					break;
				}
					
			case 2:
				if(Marinei != 0) {
					System.out.println("     [Marine] 삭제");
					Marine[Marinei-1].killUnit();
					Marine[Marinei-1] = null;
					Marinei--;
					break;
				}
				else {
					System.out.println("   Marine이 존재하지 않습니다.");
					break;
				}
				//Marine.
			case 3:
				if(Firebati != 0) {
					System.out.println("     [Firebat] 삭제");
					Firebat[Firebati-1].killUnit();
					Firebat[Firebati-1] = null;
					Firebati--;
					break;
				}
				else {
					System.out.println("   Firebat이 존재하지 않습니다.");
					break;
				}
				//Firebat.
			case 4:
				if(Medici != 0) {
					System.out.println("     [Medic] 삭제");
					Medic[Medici-1].killUnit();
					Medic[Medici-1] = null;
					Medici--;
					break;
				}
				else {
					System.out.println("   Medic이 존재하지 않습니다.");
					break;
				}
				//Medic.
			}
		break;
/////////////////////////////////////////////////////////////	
		case 6:
			System.out.println("");
			System.out.println("   게임을 종료합니다.");
			System.exit(0);
		default: 
			System.out.println("   다시 입력해주세요");
		break; 
		}
		
	}
}	
}
