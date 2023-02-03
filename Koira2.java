import java.time.LocalDate;

public class Koira2 {

	private String nimi;
	private String rotu;
	private int svuosi;
	
	public Koira2(String rotu) {
		this.rotu = rotu;
	}

	public Koira2(String nimi, String rotu, int svuosi) {
		this(rotu);
		this.nimi = nimi;		
		this.svuosi = svuosi;
	}
	
	public void vaihdaNimi(String nimi) {
		
		this.nimi = nimi;
	}

	public String lueNimi() {
		
		return nimi;
	}

	public void vaihdaRotu(String irotu) {
		
		rotu = irotu;
	}

	public String lueRotu() {
		
		return rotu;
	}

	public void muutaSyntymavuosi(int ivuosi) {
		
		svuosi= ivuosi;
	}	
	
	public int lueSyntymavuosi() {
		
		return svuosi;
	}	
	
	public int haeIka() {
		
		LocalDate nyt = LocalDate.now();
		if (svuosi > 0)
			return (nyt.getYear() - svuosi);
		else
			return 0;
	}	
	
	public String toString() {
		
		return "*******************"
		+ "\nKoira: " + nimi
		+ "\nRotu: " + rotu
		+ "\nIka: " + haeIka() 
		+ "\n*******************";		
	}
}