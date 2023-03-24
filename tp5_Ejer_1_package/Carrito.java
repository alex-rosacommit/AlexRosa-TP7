package tp5_Ejer_1_package;
import java.util.*;

public class Carrito {
	private int numeroCarrito;
	private Persona cliente;
	private List<Producto> productos = new ArrayList<Producto>();
	private double montoCarrito = 0;
	
	public Carrito(int numCarro, Persona cli ) {
		this.numeroCarrito = numCarro;
		this.cliente = cli;
	}
	
	
	public Carrito(int numCarro, Persona cli, Producto prod ) {
		this.numeroCarrito = numCarro;
		this.cliente = cli;
		this.productos.add(prod);
	}
	
	public Carrito(int numCarro, Persona cli, List<Producto> prodList ) {
		this.numeroCarrito = numCarro;
		this.cliente = cli;
		this.productos.addAll(prodList);
	}
	
	public int getNumCarrito() {
		return this.numeroCarrito;
	}
	
	public int getCantProducto() {
		return productos.size();
	}
	
	public double getMontoCarrito() {
		if(productos.size() > 0) {
			montoCarrito = 0;
			for(int i = 0; i < productos.size(); i++) {
				montoCarrito = montoCarrito + (productos.get(i).getPrecio() * productos.get(i).getCantidad());
			}
			return montoCarrito;
		}
		return 0;
	}
	
	public void agregarProducto(Producto nuevoProducto) {
		this.productos.add(nuevoProducto);
	}
	
	public void agregarListaProducto(List<Producto> nuevaListaProducto) {
		this.productos.addAll(nuevaListaProducto);
	}
	
	public void ShowPropietario() {
		System.out.println("El propietario de este carrito es: " + cliente.getNombre());
		System.out.println("N° de Cliente: " + cliente.getNumeroCliente());
	}
	
	public void showProductos(){
		if(productos.size() > 0) {
			System.out.println("===================================================");
			System.out.println("Cant\tPrecioUnitario\t\tProducto");
			
			for(int i = 0; i < productos.size(); i++) {
				System.out.println("  " + productos.get(i).getCantidad() + "\t  " + productos.get(i).getPrecio() + "\t\t   " + productos.get(i).getDescripcion());
			}
			System.out.println("===================================================");
		}
	}
	
	
	
	
}
