package n3ejercicio1;

public class SmartPhone implements Telefono {
	
	private String marca;
	private String modelo;
	
	public SmartPhone(String marca, String modelo) {
		
		this.marca = marca;
		this.modelo = modelo;
	}
	
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String llamar() {
		
		return "Estan llamando.";
	}
	
	public String hacerFotos() {
		
		return "Se han hecho fotos.";
	}

	@Override
	public String toString() {
		return "SmartPhone [marca=" + marca + ", modelo=" + modelo + "]";
	}
}
