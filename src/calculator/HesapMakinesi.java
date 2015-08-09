package calculator;

public class HesapMakinesi {
	private static HesapMakinesi hesapMakinesi;

	public static HesapMakinesi getInstance() {
		if (hesapMakinesi == null) {
			synchronized (HesapMakinesi.class) {
				if (hesapMakinesi == null) {
					hesapMakinesi = new HesapMakinesi();
				}
			}
		}
		return hesapMakinesi;
	}

	private HesapMakinesi() {
	}

	public double hesapla(String girdi) {
		String[] parcala = girdi.split("\\ ");

		MatematikselFonksiyon fonksiyon = fonksiyonBul(parcala[1]);
		return fonksiyon.hesapla(Integer.parseInt(parcala[0]), Integer.parseInt(parcala[2]));
	}

	private MatematikselFonksiyon fonksiyonBul(String isaret) {
		switch (isaret) {
		case "+":
			return new Toplama();

		case "-":
			return new Cikarma();

		case "/":
			return new Bolme();

		case "*":
			return new Carpma();

		case "^":
			return new Test();
		}

		return null;

	}

}
