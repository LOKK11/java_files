class TauluDemo {

	public static void main(String [] args) {

		int [] luvut;
		int summa = 0;
		luvut = new int[7];
		luvut[3] = 44;
		luvut[1] = 777;
		luvut[6] = 8;

		System.out.println("Taulukon pituus on: " + luvut.length);

		for (int luku : luvut) {
			System.out.println("\tLuku on: " + luku);
			summa = summa + luku;
		}

		System.out.println("Taulukon lukujen summa on: " + summa);
	}
}