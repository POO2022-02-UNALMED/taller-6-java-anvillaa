package vehiculos;

public class Camion extends Vehiculo {
	private int ejes;

	public int getEjes() {
		return ejes;
	}

	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
	
	public Camion(String placa,int puertas,float velocidadMaxima,String nombre,float precio,int peso,String traccion,
			Fabricante fabricante,int cantidadVehiculos,int ejes) {
		setPlaca(placa);
		setPuertas(2);
		setVelocidadMaxima(80);
		setNombre(nombre);
		setPrecio(precio);
		setPeso(peso);
		setTraccion("4X2");
		setFabricante(fabricante);
		cantidadVehiculos ++;
		setEjes(ejes);
	}
}
