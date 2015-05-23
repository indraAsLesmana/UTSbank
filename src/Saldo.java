/*
 * @Author: Indra Agus Lesmana 
 * On	 : Asus X200MA
 */

public class Saldo extends Bank {

	public Saldo() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getSaldo() {
		int saldoakhir=super.getSimpanUang()+super.getTabungan();
		System.out.println("Sisa Saldo:"+ saldoakhir);
	}
	
	
	
}
