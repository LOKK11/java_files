public class Main_Koira2 {

	public static void main(String [] args) {

		Koira2 viivi = new Koira2("paimenkoira");

		System.out.println("Main =>");
		System.out.println(viivi);
		muutaKoira(viivi);
		System.out.println("Main =>");
		System.out.println(viivi);
		muutaKoira2(viivi);
		System.out.println("Main =>");
		System.out.println(viivi);
	}	
	
	private static void muutaKoira(Koira2 sessu) {
		
		sessu = new Koira2("Chihuahua");
		sessu.vaihdaNimi("Taavi");
		sessu.muutaSyntymavuosi(2002);
		System.out.println("muutaKoira =>");
		System.out.println(sessu);	
	}
	
	private static void muutaKoira2(Koira2 sessu) {
		
		Koira2 aaa = new Koira2("Chihuahua");
		aaa.vaihdaNimi("Heluna");
		aaa.muutaSyntymavuosi(2015);
		sessu = aaa;	
		System.out.println("muutaKoira2 =>");
		System.out.println(aaa);
		System.out.println("muutaKoira2 =>");
		System.out.println(sessu);
	}
}