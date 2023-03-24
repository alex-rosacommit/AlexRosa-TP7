package tp5_Ejer_1_package;

public class Compras {

	public static void main(String[] args) {
		// Creamos diferentes productos
		String nombre = "Leche";
		String codigo = "lc0001";
		String tipo = "Lacteo";
		String descripcion = "Leche larga vida Sancor";
		int cant = 2;
		
		Producto prod_1 = new Producto(nombre, codigo, tipo, 300, descripcion, cant);
		
		nombre = "Arroz";
		codigo = "gra1000";
		tipo = "Gramineas";
		descripcion = "Arroz blanco Condor";
		cant = 4;
		
		Producto prod_2 = new Producto(nombre, codigo, tipo, 185, descripcion, cant);
		
		nombre = "Agua saborizada";
		codigo = "beb5000";
		tipo = "Bebidas";
		descripcion = "Agua saborizada villa del sur levite";
		
		Producto prod_3 = new Producto(nombre, codigo, tipo, 210.50, descripcion);
		
		// Creamos una persona que hará de cliente.
				// Datos de la persona
		String nombreCliente = "Alex";
		int codigoCliente = 1179;
		
		Persona clienteAlex = new Persona(nombreCliente, codigoCliente);
		
		// Creamos un carrito para Alex 
				//Datos del carro 
		int numeroCarrito = 9632;
		
		Carrito nuevoCarrito = new Carrito(numeroCarrito, clienteAlex);
		//Agregamos un producto al carrito
		nuevoCarrito.agregarProducto(prod_2);
		
		//Agregamos el carrito al cliente 'Alex'
		clienteAlex.agregarCarrito(nuevoCarrito);
		
		//El cliente 'Alex' ya puede agregar productos al carrito
		clienteAlex.agregarProducto(prod_3);
		clienteAlex.agregarProducto(prod_1);
		
		// Creamos un cupon de descuento del 25%.
		CuponDescuento decuento25 = new CuponDescuento(25);
		
		// Le otorgamos el cupon al clienteAlex.
		clienteAlex.agregarCuponDescuento(decuento25);
		
		// El cliente puede consultar el monto total de los productos en su carrito
		clienteAlex.montoEnCarrito();
		
		// El cliente puede consultar si tiene cupon de descuento.
		clienteAlex.getCupon();
		
		//El cliente puede usar su cupon de descuento
		clienteAlex.aplicarCupon();
	
	}

}
