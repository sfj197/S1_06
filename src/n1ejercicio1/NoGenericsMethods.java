package n1ejercicio1;

public class NoGenericsMethods<T> {
	
	private String nombreCatalan;
	private String nombreIngles;
	private String nombrePolaco;
	
	public NoGenericsMethods(String nombreCatalan,String nombreIngles,String nombrePolaco) {
		this.nombreCatalan = nombreCatalan;
		this.nombreIngles = nombreIngles;
		this.nombrePolaco = nombrePolaco;
	}

	public String getNombreCatalan() {
		return nombreCatalan;
	}

	public void setNombreCatalan(String nombreCatalan) {
		this.nombreCatalan = nombreCatalan;
	}

	public String getNombreIngles() {
		return nombreIngles;
	}

	public void setNombreIngles(String nombreIngles) {
		this.nombreIngles = nombreIngles;
	}

	public String getNombrePolaco() {
		return nombrePolaco;
	}

	public void setNombrePolaco(String nombrePolaco) {
		this.nombrePolaco = nombrePolaco;
	}
	
	@Override
	public String toString() {
		return "[nombreCatalan=" + nombreCatalan + ", nombreIngles=" + nombreIngles
				+ ", nombrePolaco=" + nombrePolaco + "]";
	}	

}
