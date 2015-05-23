import java.util.Scanner;

/*
 * @Author: Indra Agus Lesmana 
 * On	 : Asus X200MA
 */

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		
		//intace of class
		Bank []bank=new Bank[2];
		Layout tampilan=new Layout();
		 
		
		int x=0;
		
		
		System.out.println("hallo there i try make changes to make versioning on Sourcetree");
		
		do{
		
		tampilan.getMenu();
		
		String jwbMenu=in.next();
		
		if(jwbMenu.toLowerCase().equals("1")){
			
			//input
			System.out.println("Masukan No Rekening: ");
			int jwbNorek1=in.nextInt();
			bank[x].setNoRekening(jwbNorek1);
			
			System.out.println("Masukan Uang yg Disimpan: ");
			int jwbSimpan=in.nextInt();
			bank[x].setSimpanUang(jwbSimpan);
			
			//output
			tampilan.getABC();
			
			System.out.println("No Rekening"+bank[x].getNoRekening());
			System.out.println("Uang yg di simpan"+bank[x].getSimpanUang());
			bank[x]=new Saldo();
			bank[x].getSaldo();
			 
		}
		
		}while(x<1);
		

	}

}
