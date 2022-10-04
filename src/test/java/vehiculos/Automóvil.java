package vehiculos;

public class Automóvil extends Vehiculo{
	private int puestos;
	private static int cantidadAutomoviles;
	
	
	
	public int getPuestos() {
		return puestos;
	}



	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
	
	public static int getCantidadAutomoviles() {
		return cantidadAutomoviles;
	}



	public Automóvil(String placa,String nombre, float precio, int peso,
			Fabricante fabricante, int puestos) {
		super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
		this.puestos = puestos;
		cantidadAutomoviles ++;
	}

	
	
}
