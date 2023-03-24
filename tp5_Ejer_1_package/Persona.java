package tp5_Ejer_1_package;

public class Persona {
	private String nombre;
	private int numeroCliente;
	private Carrito miCarrito;
	private CuponDescuento miCuponDescuento;

	
	Persona(String nom, int numCli, Carrito nuevoCarrito){
		this.nombre = nom;
		this.numeroCliente = numCli;
		this.miCarrito = nuevoCarrito;
	}
	
	Persona(String nom, int numCli){
		this.nombre = nom;
		this.numeroCliente = numCli;
		this.miCarrito = null;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	
	public int getNumeroCliente() {
		return numeroCliente;
	}
	
	public void getCupon() {
		if(miCuponDescuento != null) {
			System.out.println("\n\nSu cupon de descuento es de: " + miCuponDescuento.getProcentajeDesc() + "%" );
		}
		else {
			System.out.println("\n\nNo posee cupon de descuento.");
		}
	}
	
	public void getDatosMiCarrito() {
		if(miCarrito != null && miCarrito.getCantProducto() > 0) {
			System.out.println("\t\tCarrito de " + this.nombre.toUpperCase());
			System.out.println("===================================================");
			System.out.println("Num Carrito \t Propietario\t CantProductos");
			System.out.println("   " + miCarrito.getNumCarrito() + "\t\t   " + this.getNombre() + "\t\t\t" + miCarrito.getCantProducto() );
			System.out.println("===================================================");
		}else {
			System.out.println("Este cliente no posee un carrito o el mismo esta vacio.");
		}
		
	}
	
	public double getMonto() {
		return miCarrito.getMontoCarrito();
	}
	
	public void agregarCuponDescuento(CuponDescuento nuevoCupon) {
		miCuponDescuento = nuevoCupon;
	}
	
	public void aplicarCupon() {
		if(this.miCuponDescuento != null) {
			double m = miCarrito.getMontoCarrito();
			System.out.println("\n\nAplicando el: " + miCuponDescuento.getProcentajeDesc() + "% de descuento al monto del carrito: " + m );
			double total = miCuponDescuento.aplicarDescuento(m);
			System.out.println("\n\t\tEl total es: " + total);
			miCuponDescuento = null;
			return;
		}
		System.out.println("Ningun cupon disponible");
		
	}
	
	public void agregarCarrito(Carrito nuevoCarrito) {
		this.miCarrito = nuevoCarrito;
	}
	
	public void agregarProducto(Producto nuevoProducto) {
		if(miCarrito != null) {
			miCarrito.agregarProducto(nuevoProducto);
		}else {
			System.out.println("Este cliente no posee un carrito.");
		}
		
	}
	
	
	public void productosEnCarrito() {
		System.out.println("\n\t\tProductos en Carrito ");
		miCarrito.showProductos();
	}
	
	public void montoEnCarrito() {
		double total = miCarrito.getMontoCarrito();
		if(total == 0) {
			System.out.println("El carrito está vacio");
		}else {
			System.out.println("\n\t\tMonto total de carrito ");
			miCarrito.showProductos();
			System.out.println("\t\tMonto subtotal: " + total);
		}
	}
}
