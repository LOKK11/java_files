import java.time.LocalDate;

public class Koira {

	private String nimi;
	private String rotu;
	private int svuosi;
	
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