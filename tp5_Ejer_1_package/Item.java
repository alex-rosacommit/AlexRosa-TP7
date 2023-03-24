package tp5_Ejer_1_package;

public class Item {
	private String nombre;
	private String  tipo;
	
	public Item(String nom, String tipo){
		this.nombre = nom;
		this.tipo = tipo;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	
}

