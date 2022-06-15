package Cinema;

public class Main {

	public static void main(String[] args) {

		Cinema cinema = new Cinema(0);
		
		Fileme filmePT = new Filme("1");
		
		filmePT.assistir(cinema);
		Cartaz.filme(Cartaz);
		
		Cinema.assistirFilme();	
    SalaExibicao.capacidade();
	}
}
