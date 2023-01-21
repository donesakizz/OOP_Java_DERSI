package YX_OOP_Examples_inheritance2;

	
	public class Calisan {
		String adSoyad ,email;
		int telefon;
		static int girisSayisi=0;
		
		public void giris() {
			System.out.println("Calişan giriş yaptı");
		}

		public static int giris1() {
			return ++Calisan.girisSayisi;
		}

	}


