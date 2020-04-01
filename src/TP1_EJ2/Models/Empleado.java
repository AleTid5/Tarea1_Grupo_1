package TP1_EJ2.Models;

public class Empleado {
	//Atributos
	private final int id; // Final porque no tiene que poder ser cambiado una vez establecido
	private String nombre;
	private int edad;
	private static int contador = 1000; // variable de la clase 
	
	//Constructores
	public Empleado() {
		this("pepe", 30);
	}
	
	public Empleado(String nombre,int edad) {
		this.id = contador++; // Asigna y despues suma
		this.nombre = nombre;
		this.edad = edad;
	}
	
	//Getters and Setters
	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	//Metodos
	public String DevuelveDatos() {
		return String.format("Empleado: ID = %d, Nombre = %s, Edad = %s", this.id, this.nombre, this.edad);
	}
	
	public static int DevuelveProximoId() {
		return Empleado.contador; // Solo el contador en este momento, ya que el constructor ya lo incrementó
	}
}
