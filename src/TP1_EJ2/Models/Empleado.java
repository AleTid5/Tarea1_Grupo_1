package TP1_EJ2.Models;

public class Empleado {
	
	//Atributos
	
	private int id;
	private String nombre;
	private int edad;
	
	private static int contador = 1000; // variable de la clase 
	
	//Constructores
	
	public Empleado()
	{
		this.id = contador++;
		this.nombre = "Pepe";
		this.edad = 30;
	}
	
	public Empleado(String nombre,int edad)
	{
		this.id = contador ++;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	//Getters and Setters
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
		String empleado = String.format("Empleado: ID = %d, Nombre = %s, Edad = %s",id,nombre,edad);
		return empleado;
	}
	
	public static int DevuelveProximoId()
	{
		return contador++ ;
	}
	
}
