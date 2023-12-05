package n2ejercicio2;

import java.util.ArrayList;

public class GenericsMethods<T> {
	
	public static <T> void imprimirGenericos(ArrayList<T> elementos) {
		
		for(int i = 0;i < elementos.size();i++) {
			
			System.out.println(elementos.get(i));
			
		}
		
		
		
		
	}


}
