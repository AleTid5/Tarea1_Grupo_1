package TP1_EJ2;

import Common.Utils.Message;
import TP1_EJ2.Models.Empleado;

public class Principal {

	public static void main(String[] args) {
		
		Empleado[] vEmpleado = new Empleado[4];
		vEmpleado[0] = new Empleado();
		vEmpleado[1] = new Empleado("Alberto",54);
		vEmpleado[2] = new Empleado("Susana",34);
		vEmpleado[3] = new Empleado("Enrique",22);
		
		for (Empleado empleado : vEmpleado) {
			Message.show(empleado.DevuelveDatos());
		}
		System.out.println("El proximo ID sera el " + Empleado.DevuelveProximoId());
	}
}
