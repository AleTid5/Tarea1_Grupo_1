package TP1_EJ2;

import Common.Utils.Message;
import TP1_EJ2.Models.Empleado;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Empleado> empleados = new ArrayList<>();
		empleados.add(new Empleado());
		empleados.add(new Empleado("Alberto",54));
		empleados.add(new Empleado("Susana",34));
		empleados.add(new Empleado("Enrique",22));

		empleados.forEach((Empleado empleado) -> Message.show(empleado.DevuelveDatos()));
		
		Message.show(String.format("El proximo ID sera el %s", Empleado.DevuelveProximoId()));
	}
}
