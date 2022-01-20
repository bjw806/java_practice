package starcraft;

import java.util.Scanner;

public class Game {
	
	public static void main(String[] args) {
		Scanner Scan =new Scanner(System.in); //scanner�� scan����
		
		////////////���� ����//////////////
		Building CC = new CommandCenter();
		Building SD[] = new SupplyDepot[19];//������ ���� �� ����. �α����� 200���� �ִ��̱� ������ , �ִ� 19������ �Ǽ�����.
		int SDi = 0;
		Building B = new Barrack();
		//���� ��ȣ �ο�.
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
	while(num!=6) {//6�̸� ���� ����
		 System.out.println("==================");
		 System.out.printf("  ���� �α���: %d",(SDi*10)+10);
		 System.out.printf("��\n");
		 System.out.printf("  ���� ��� �α���: %d",SCVi+Marinei+Firebati+Medici);
		 System.out.printf("��\n");
		 System.out.println("==================");
		 System.out.print("  ���ϴ� ����� �����ϼ���: \n");
		 System.out.print("  �ǹ� �Ǽ�: 1\n");
		 System.out.print("  �ǹ� ö��: 2\n");
		 System.out.print("  ���� ��ȸ: 3\n");
		 System.out.print("  ���� ����: 4\n");
		 System.out.print("  ���� ����: 5\n");
		 System.out.print("  ���� ������: 6\n");
		 System.out.println("==================");
		 num = Scan.nextInt();
		 
		
		switch(num) {
////////////////////////////////////////////////////////////////////////////////////////////
		case 1: 
			System.out.println("");
			System.out.println("=======[�ǹ� �Ǽ�]=======");
			System.out.println("  � �ǹ��� �Ǽ��Ͻðڽ��ϱ�?: ");
			System.out.println("  Command Center: 1");
			System.out.println("  Supply Depot: 2");
			System.out.println("  Barrack: 3");
			System.out.println("======================");
			int buildingnum = Scan.nextInt();

			switch(buildingnum) {
			case 1: //Ŀ�ǵ弾��
				if(CC.isBuild()==true) {//command Center�� �Ǽ��Ǿ�����.
					System.out.println("   Command Center�� �̹� �Ǽ��Ǿ� �ֽ��ϴ�.");
					break;
				}
				else {
					System.out.println("   Command Center�� �Ǽ��մϴ�.");
					CC.Build();
					break;
				}
					
			case 2://����
				if(SDi >= 19) {//supply depot 19�� �̻��̶��
					System.out.println("     �α����� �ִ뿡 �����Ͽ����ϴ�.");
					System.out.println("     ���̻� Supply Depot�� �Ǽ��� �� �����ϴ�.");
					break;
				}
				else if(CC.isBuild()==true) {//command Center�� �Ǽ��Ǿ�����.
					System.out.println("     Supply Depot�� �Ǽ��մϴ�.");
					SD[SDi] = new SupplyDepot();
					SD[SDi].Build();
					SDi++;
					break;
				}
				else {//or
					System.out.println("   Command Center�� �Ǽ��Ǿ����� �ʽ��ϴ�.");
					break;
				}
	
			case 3://�跰
				if(CC.isBuild()==true) {//command Center�� �Ǽ��Ǿ�����.
					if(B.isBuild()==true) {//Barrack�� �Ǽ��Ǿ�����
						System.out.println("   Barrack�� �̹� �Ǽ��Ǿ� �ֽ��ϴ�.");
						break;
					}
					else{//or
						System.out.println("   Barrack�� �Ǽ��մϴ�.");
						B.Build();
						break;
					}
				}
				else {//or
					System.out.println("   Command Center�� �Ǽ��Ǿ����� �ʽ��ϴ�.");
					break;
				}
			}
			break;
////////////////////////////////////////////////////////////////////////////////////////////	
		case 2:  
			System.out.println("");
			System.out.println("=======[�ǹ� ö��]=======");
			System.out.println("  � �ǹ��� ö���Ͻðڽ��ϱ�?: ");
			System.out.println("  Command Center: 1");
			System.out.println("  Supply Depot: 2");
			System.out.println("  Barrack: 3");
			System.out.println("======================");
			int destroynum = Scan.nextInt();

			switch(destroynum) {
			case 1: //Ŀ�ǵ弾��
				if(CC.isBuild()==true) {
					System.out.println("   Command Center�� ö���մϴ�.");
					CC.Destroy();
					break;
				}
				else {
					System.out.println("   Command Center�� �Ǽ��Ǿ����� �ʽ��ϴ�.");
					break;
				}
					
			case 2://����
				if(SDi != 0) {
					System.out.println("   Supply Depot�� ö���մϴ�.");
					SD[SDi-1].Destroy();
					SD[SDi-1] = null;
					SDi--;
					break;
				}
				else {
					System.out.println("   Supply Depot�� �Ǽ��Ǿ����� �ʽ��ϴ�.");
					break;
				}
				
				
			case 3://�跰
				if(B.isBuild()==true) {
					System.out.println("   Barrack�� ö���մϴ�.");
					B.Destroy();						
				}
				else {
					System.out.println("   Barrack�� �Ǽ��Ǿ����� �ʽ��ϴ�.");
					break;
				}
			}
			break;
///////////////////////////////////////////////////////////////////////////////			
		case 3: 
			System.out.println("");
			System.out.println("=======[���� ��ȸ]=======");
			//���� ���� ���.
			//����� �α��� ���.
			
			int SCVii=0;
			int Marineii=0;
			int Firebatii=0;
			int Medicii=0;
			while(SCVii<SCVi) {
				System.out.println("");
				System.out.printf("     [SCV ���� %d",SCVii+1);//���� ��ȣ
				System.out.println("]");
				SCV[SCVii].printUnitInfo();
				SCVii++;
			}
			
			while(Marineii<Marinei) {
				System.out.println("");
				System.out.printf("     [Marine ���� %d",Marineii+1);
				System.out.println("]");
				Marine[Marineii].printUnitInfo();
				Marineii++;
			}
			
			while(Firebatii<Firebati) {
				System.out.println("");
				System.out.printf("     [Firebat ���� %d",Firebatii+1);
				System.out.println("]");
				Firebat[Firebatii].printUnitInfo();
				Firebatii++;
			}
			
			while(Medicii<Medici) {
				System.out.println("");
				System.out.printf("     [Medic ���� %d",Medicii+1);
				System.out.println("]");
				Medic[Medicii].printUnitInfo();
				Medicii++;
			}
			
		break; 
//////////////////////////////////////////////////////////////////////////////////////////////		
		case 4: 
			System.out.println("");
			System.out.println("=======[���� ����]=======");
			System.out.println("  � ������ �����Ͻðڽ��ϱ�?: ");
			System.out.println("  SCV: 1");
			System.out.println("  Marine: 2");
			System.out.println("  Firebat: 3");
			System.out.println("  Medic: 4");
			System.out.println("======================");
			int makeunitnum = Scan.nextInt();
			
			switch(makeunitnum) {
			case 1:
				if(CC.isBuild()==true) {
					System.out.println("     [SCV] ����");
					SCV[SCVi] = new SCV();
					SCV[SCVi].makeUnit();
					SCVi++;
					break;
				}
				else {
					System.out.println("   Command Center�� �Ǽ��Ǿ����� �ʽ��ϴ�.");
					break;
				}
				
				//SCV.
				
			case 2:
				if(B.isBuild()==true) {
					System.out.println("     [Marine] ����");
					Marine[Marinei] = new Marine();
					Marine[Marinei].makeUnit();
					Marinei++;
					break;
				}
				else {
					System.out.println("   Barrack�� �Ǽ��Ǿ����� �ʽ��ϴ�.");
					break;
				}
				//Marine.
				
			case 3:
				if(B.isBuild()==true) {
					System.out.println("     [Firebat] ����");
					Firebat[Firebati] = new Firebat();
					Firebat[Firebati].makeUnit();
					Firebati++;
					break;
				}
				else {
					System.out.println("   Barrack�� �Ǽ��Ǿ����� �ʽ��ϴ�.");
					break;
				}

			case 4:
				if(B.isBuild()==true) {
					System.out.println("     [Medic] ����");
					Medic[Medici] = new Medic();
					Medic[Medici].makeUnit();
					Medici++;
					break;
				}
				else {
					System.out.println("Barrack�� �Ǽ��Ǿ����� �ʽ��ϴ�.");
					break;
				}
			}
		
		break;
/////////////////////////////////////////////////////////////
		case 5: 
			System.out.println("");
			System.out.println("=======[���� ����]=======");
			System.out.println("  � ������ �����Ͻðڽ��ϱ�?: ");
			System.out.println("  SCV: 1");
			System.out.println("  Marine: 2");
			System.out.println("  Firebat: 3");
			System.out.println("  Medic: 4");
			System.out.println("======================");
			int delunitnum = Scan.nextInt();
			
			switch(delunitnum) {
			case 1:
				if(SCVi != 0) {
					System.out.println("     [SCV] ����");
					SCV[SCVi-1].killUnit();
					SCV[SCVi-1] = null;
					SCVi--;
					//SCV.
					break;
				}
				else {
					System.out.println("   SCV�� �������� �ʽ��ϴ�.");
					break;
				}
					
			case 2:
				if(Marinei != 0) {
					System.out.println("     [Marine] ����");
					Marine[Marinei-1].killUnit();
					Marine[Marinei-1] = null;
					Marinei--;
					break;
				}
				else {
					System.out.println("   Marine�� �������� �ʽ��ϴ�.");
					break;
				}
				//Marine.
			case 3:
				if(Firebati != 0) {
					System.out.println("     [Firebat] ����");
					Firebat[Firebati-1].killUnit();
					Firebat[Firebati-1] = null;
					Firebati--;
					break;
				}
				else {
					System.out.println("   Firebat�� �������� �ʽ��ϴ�.");
					break;
				}
				//Firebat.
			case 4:
				if(Medici != 0) {
					System.out.println("     [Medic] ����");
					Medic[Medici-1].killUnit();
					Medic[Medici-1] = null;
					Medici--;
					break;
				}
				else {
					System.out.println("   Medic�� �������� �ʽ��ϴ�.");
					break;
				}
				//Medic.
			}
		break;
/////////////////////////////////////////////////////////////	
		case 6:
			System.out.println("");
			System.out.println("   ������ �����մϴ�.");
			System.exit(0);
		default: 
			System.out.println("   �ٽ� �Է����ּ���");
		break; 
		}
		
	}
}	
}
