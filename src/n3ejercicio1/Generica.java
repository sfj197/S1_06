package n3ejercicio1;

public class Generica<T> {
	
	
	public static <T extends Telefono> void gTelefono(T t){
		
		t.llamar();
		
	}
	
	public static <T extends SmartPhone> void gSmartphone (T t) {
		
		t.hacerFotos();
		t.llamar();
		
	}

}
