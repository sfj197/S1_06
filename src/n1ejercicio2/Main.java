package n1ejercicio2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cadena = "Hola";
		int entero = 45;
		Persona pers1 = new Persona("Luis","Gomez",78);
			
		GenericsMethods.imprimirGenericos(pers1,entero,cadena);
		GenericsMethods.imprimirGenericos(cadena,entero,pers1);
	}

}
