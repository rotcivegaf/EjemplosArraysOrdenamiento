package arrays;

import java.util.Comparator;

public class OrdenamientoPorRol implements Comparator<Estudiante>{
	 public int compare (Estudiante a, Estudiante b){
	        return a.numeroRol - b.numeroRol;
	 }
}
