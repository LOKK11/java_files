public class Main {

	public static void main(String [] args) {
			
		Koira ressu = new Koira();
		Koira pluto = new Koira();
		
		System.out.println(ressu);
		System.out.println(pluto);
		
		ressu.vaihdaNimi("Ressu");
		ressu.muutaSyntymavuosi(2018);
		ressu.vaihdaRotu("Beagle");
		System.out.println(ressu);
		
		pluto.vaihdaNimi("Pluto");
		pluto.muutaSyntymavuosi(2015);
		pluto.vaihdaRotu("Sekarotuinen");
		System.out.println(pluto);
	}		
}