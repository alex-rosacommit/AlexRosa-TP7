package tp5_Ejer_1_package;

public class CuponDescuento extends Descuento {
	private boolean estado = true;
	
	public CuponDescuento (int porcentaje){
		super(porcentaje);
	}
	
	public boolean estadoDeCupon() {
		if(this.estado) {
			System.out.println("El cupon esta habilitado.");
		}
		else {
			System.out.println("El cupon NO esta habilitado.");
		}
		return this.estado;
	}
	
	public double aplicarDescuento(double monto) {
		if(this.estado) {
			double descuento = (super.getProcentajeDesc() * monto) / 100;
			double totalConDescuento = monto - descuento;
			
			this.estado = false;
			return totalConDescuento;
		}
		System.out.println("El cupon de descuento ya fue utilisado.");
		return monto;
	}
}
