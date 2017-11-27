package arrays;

import java.util.Arrays;
import java.util.Collections;

public class WorkSpace{
    public static void main(String[] args){
    	int[] arr0 = {13, 7, 6, 45, 21, 9, 101, 102};
    	System.out.println("array a ordenar: \n" + Arrays.toString(arr0));
        System.out.println();
    	
        //ordenamiento comun
    	int[] arr = {13, 7, 6, 45, 21, 9, 101, 102};
        Arrays.sort(arr);
        System.out.println("ordenamiento comun: \n" + Arrays.toString(arr));
        System.out.println();
        
        //desde hasta
        int[] arr2 = {13, 7, 6, 45, 21, 9, 101, 102};
        Arrays.sort(arr2, 3, 5);
        System.out.println("ordenamiento del 3 al 5: \n" + Arrays.toString(arr2));
        System.out.println();
        
        //reverso, con funcion
        Integer[] arr3 = {13, 7, 6, 45, 21, 9, 101, 102};
        Arrays.sort(arr3, Collections.reverseOrder());
        System.out.println("ordenamiento reverso, con funcion: \n" + Arrays.toString(arr3));
        System.out.println();
        
        //con funcion de comparacion
        Estudiante[] arr4 ={new Estudiante(111, "bbbb", "london"),
                			new Estudiante(131, "aaaa", "nyc"),
                			new Estudiante(121, "cccc", "jaipur")};
        
        System.out.println("Sin orden");
        for (int i=0; i<arr4.length; i++)
            System.out.println(arr4[i]);

        Arrays.sort(arr4, new OrdenamientoPorRol());

        System.out.println("\nOrdenar por numero de rol");
        for (int i=0; i<arr4.length; i++)
            System.out.println(arr4[i]);
    } 
}