package n2ejercicio2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cadena = "Hola";
		int entero = 45;
		Persona pers1 = new Persona("Luis","Gomez",78);
		
		ArrayList<Object> elementos = new ArrayList<Object>();
		
		elementos.add(pers1);
		elementos.add(entero);
		elementos.add(cadena);
			
		GenericsMethods.imprimirGenericos(elementos);
	
	}

}
