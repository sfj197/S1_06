package n1ejercicio1;

public class UsoNoGenericsMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombreCatalan = "Pere";
		String nombreIngles = "Peter";
		String nombrePolaco = "Potter";
		
		
		System.out.println(new NoGenericsMethods<Object>(nombreCatalan,nombreIngles,nombrePolaco));
		System.out.println(new NoGenericsMethods<Object>(nombrePolaco,nombreCatalan,nombreIngles));
		System.out.println(new NoGenericsMethods<Object>(nombreIngles,nombrePolaco,nombreCatalan));
	}

}
