package tp5_Ejer_1_package;

public class Producto extends Item {
	private String code;
	private double precio;
	private String descripcion;
	private int stock;
	
	public Producto(String nombre, String cod, String tipo, double prec, String desc, int cant){
		super(nombre, tipo);
		this.code = cod;
		this.precio = prec;
		this.descripcion = desc;
		this.stock = cant;
	}
	
	public Producto(String nombre, String codigo, String tipo, double precio, String descri) {
		super(nombre, tipo);
		this.code = nombre;
		this.precio = precio;
		this.descripcion = descri;
		this.stock = 1;
	}
	
	public int getCantidad() {
		return this.stock;
	}
	
	public double getPrecio() {
		return this.precio;
	}
	
	public String getDescripcion() {
		return this.descripcion;
	}
	
	public String getCodigo() {
		return this.code;
	}
	
	
	
	
	
}
