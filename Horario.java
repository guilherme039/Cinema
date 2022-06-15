package cinema;

import java.util.ArrayList;
import java.util.List;

import cinema.Horario;
public class Cinema{
	
	List<Cartaz> filme = new ArrayList<Cartaz>();
	
	public int capacidade;
	
	public Cinema(int cap) {
		capacidade = cap;
	}
	
	void listarVeiculos() {
		for(int i = 0; i < Cartaz .size(); i++) {
			System.out.println(horario.get(i) + " " + horario.get(i).filme());
		}
	}
	
	public boolean sala() {
		if(horario.size() < capacidade)
			return true;
		return 0;
	}

}
