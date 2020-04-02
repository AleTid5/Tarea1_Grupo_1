package TP1_EJ5;

import java.util.ArrayList;
import java.util.Iterator;

import Common.Utils.Message;
import TP1_EJ5.Interfaces.Edificio;
import TP1_EJ5.Models.Oficina;
import TP1_EJ5.Models.Polideportivo;

public class Main {
	public static void main(String[] args) {
		ArrayList<Edificio> edificios = new ArrayList<>();
		edificios.add(new Polideportivo("Torcuato", 1250.5, 1));
		edificios.add(new Polideportivo("Ricardo Rojas", 8512.1, 2));
		edificios.add(new Polideportivo("Tigre", 98741.1, 3));
		edificios.add(new Oficina(25, 987.1));
		edificios.add(new Oficina(150, 5410.9));
		
		Iterator<Edificio> iteradorDeEdificios = edificios.iterator();
		while (iteradorDeEdificios.hasNext()) {
			Message.show(iteradorDeEdificios.next().mostrarAtributos());
		}
	}
}
