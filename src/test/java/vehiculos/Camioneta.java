package vehiculos;

public class Camioneta extends Vehiculo {
	private boolean volco;
	
	
	public boolean isVolco() {
		return volco;
	}


	public void setVolco(boolean volco) {
		this.volco = volco;
	}


	public Camioneta (String placa,int puertas,float velocidadMaxima,String nombre,float precio,int peso,String traccion,
			Fabricante fabricante,int cantidadVehiculos,boolean volco) {
		setPlaca(placa);
		setPuertas(puertas);
		setVelocidadMaxima(90);
		setNombre(nombre);
		setPrecio(precio);
		setPeso(peso);
		setTraccion("4X4");
		setFabricante(fabricante);
		cantidadVehiculos ++;
		setVolco(volco);
	}
}
