package arrays;

public class Estudiante {
	public int numeroRol;
	private String nombre, direccion;
	
	public Estudiante(int numeroRol, String nombre, String direccion){
		this.numeroRol = numeroRol;
		this.nombre = nombre;
		this.direccion = direccion;
	}
	public String toString(){
		return this.numeroRol + " " + this.nombre + " " + this.direccion;
	}
}