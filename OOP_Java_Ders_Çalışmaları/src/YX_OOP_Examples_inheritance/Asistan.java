package YX_OOP_Examples_inheritance;


	public class Asistan extends Akademisyen{
		protected String yüksekLisans;

		public Asistan(String adSoyad, String email, int telefon, String bolum, String gorevler, String ders,
				String yüksekLisans) {
			super(adSoyad, email, telefon, bolum, gorevler, ders);
			this.yüksekLisans = yüksekLisans;
		}
		// Kodu yazarken ata class hariç diger classların getter ve setterları oluşturuldu.
		//Alt sınıfların  get ve setterı olmasa da calışıyor kod ama encapsulation ilkesine uysun diye eklenildi
		//yükseklisansın getterı ve setterı

		public String getYüksekLisans() {
			return yüksekLisans;
		}

		public void setYüksekLisans(String yüksekLisans) {
			this.yüksekLisans = yüksekLisans;
		}

	}



