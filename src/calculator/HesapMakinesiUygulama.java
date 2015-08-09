package calculator;

import java.util.Scanner;

public class HesapMakinesiUygulama {
	private static final String Singleton = null;
	    
	public static void main(String[] args) {

		try {
			boolean durum=true;

			while (durum) {
			
				Scanner sc = new Scanner(System.in);
				
				String girdi = sc.nextLine(); // Burada girdiyi oku

				if ("exit".equals(girdi)) {
					break;
				}
				
				double deger = HesapMakinesi.getInstance().hesapla(girdi);

				System.out.println("Sonuc : " + deger); // Ciktiyi Goster

			}

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	private static void getInstance() {

	}

}
