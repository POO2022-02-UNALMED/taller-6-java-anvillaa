package vehiculos;

public class Automóvil extends Vehiculo{
	private int puestos;
	
	
	
	public int getPuestos() {
		return puestos;
	}



	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}



	public Automóvil(String placa,int puertas,float velocidadMaxima,String nombre,float precio,int peso,String traccion,
			Fabricante fabricante,int cantidadVehiculos,int puestos) {
		setPlaca(placa);
		setPuertas(4);
		setVelocidadMaxima(100);
		setNombre(nombre);
		setPrecio(precio);
		setPeso(peso);
		setTraccion("FWD");
		setFabricante(fabricante);
		cantidadVehiculos ++;
		setPuestos(puestos);
	}
}
