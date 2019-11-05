// Neera Puri Novianti (Kelas A)
package Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //input
		int menu;
		//arraylist 
		ArrayList <Data>dp = new ArrayList<>() ;
		
			dp.add(new Data("PEG01","Yohana","Jakarta", 12345));
			dp.add(new Data("PEG02","Yohane","Palembang", 23456));
			dp.add(new Data("PEG03","Yohani","Medan", 34567));
			dp.add(new Data("PEG04","Yohano","Surabaya", 45678));
			dp.add(new Data("PEG05","Yohano","Malang", 56789));
			
			//for (int i=0; i<dp.size();i++){
				//System.out.println(dp.get(i).getDataInfo());
			//}
		
		ArrayList <Jadwal>jp = new ArrayList<>();
		
		jp.add(new Jadwal("Algoritma","31-Oct-19",711, 3)); //0
		jp.add(new Jadwal("Spring Boot","12-Nov-19",724, 2));//1
		jp.add(new Jadwal("Android","23-Nov-19",728, 2));//2
		jp.add(new Jadwal("Python","11-Nov-19",706, 4));//3
		jp.add(new Jadwal("Ajax","13-Nov-19",711, 1));//4
		
		//for (int i=0; i<jp.size();i++){
			//System.out.println(jp.get(i).getJadwalInfo());
		//}	
		ArrayList <Nilai>np = new ArrayList<>();
		//pegawai 1
		np.add(new Nilai(dp.get(0).getKode(), dp.get(0).getNama(), jp.get(0).getMateri(),86 ));
		np.add(new Nilai(dp.get(0).getKode(), dp.get(0).getNama(), jp.get(1).getMateri(),88 ));
		np.add(new Nilai(dp.get(0).getKode(), dp.get(0).getNama(), jp.get(2).getMateri(),89 ));
		np.add(new Nilai(dp.get(0).getKode(), dp.get(0).getNama(), jp.get(3).getMateri(),90 ));
		//pegawai 2
		np.add(new Nilai(dp.get(1).getKode(), dp.get(1).getNama(), jp.get(1).getMateri(),78));
		np.add(new Nilai(dp.get(1).getKode(), dp.get(1).getNama(), jp.get(2).getMateri(),89));
		np.add(new Nilai(dp.get(1).getKode(), dp.get(1).getNama(), jp.get(3).getMateri(),77));
		//pegawai 3
		np.add(new Nilai(dp.get(2).getKode(), dp.get(2).getNama(), jp.get(2).getMateri(),88));
		np.add(new Nilai(dp.get(2).getKode(), dp.get(2).getNama(), jp.get(3).getMateri(),89));
		np.add(new Nilai(dp.get(2).getKode(), dp.get(2).getNama(), jp.get(4).getMateri(),90));
		//pegawai 4
		np.add(new Nilai(dp.get(3).getKode(), dp.get(3).getNama(), jp.get(1).getMateri(),89));
		np.add(new Nilai(dp.get(3).getKode(), dp.get(3).getNama(), jp.get(2).getMateri(),77));
		np.add(new Nilai(dp.get(3).getKode(), dp.get(3).getNama(), jp.get(3).getMateri(),88));
		np.add(new Nilai(dp.get(3).getKode(), dp.get(3).getNama(), jp.get(4).getMateri(),88));
		//pegawai 5
		np.add(new Nilai(dp.get(4).getKode(), dp.get(4).getNama(), jp.get(0).getMateri(),89));
		np.add(new Nilai(dp.get(4).getKode(), dp.get(4).getNama(), jp.get(1).getMateri(),90));
		np.add(new Nilai(dp.get(4).getKode(), dp.get(4).getNama(), jp.get(2).getMateri(),100));
		
		
		//	//for (int i=0; i<np.size();i++){
		//System.out.println(np.get(i).getNilaiInfo());
		//}
		do{
			System.out.println("=========================");
			System.out.println("Informasi yang tersedia adalah sebagai berikut:");
			System.out.println("1. List Pegawai");
			System.out.println("2. List Jadwal");
			System.out.println("3. List Nilai");
			System.out.println("4. Selesai");
			System.out.println("=========================");
			
			menu = input.nextInt();
			
			if (menu==1){
				for( Data s : dp){
					System.out.println(s.getDataInfo());
				}
			}
			else if (menu==2){
				for( Jadwal s : jp){
				System.out.println(s.getJadwalInfo());
				}
			}
			else if (menu==3){
				for( Nilai s : np){
					System.out.println(s.getNilaiInfo());
				}
			}
			else
				break;
		}while (menu>=1 && menu <=3);
	
	
	}
}
//version 5
