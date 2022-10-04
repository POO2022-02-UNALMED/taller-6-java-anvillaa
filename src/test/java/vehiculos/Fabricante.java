package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	private String nombre;
	private Pais pais;
	public static ArrayList <Fabricante> listFabrica;
	public  int cantidadCreadosFabrica;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public Fabricante(String nombre, Pais pais) {
		super();
		this.nombre = nombre;
		this.pais = pais;
		listFabrica.add(this);
		pais.agregarFabrica(this);
	}
	
	public static Fabricante fabricaMayorVentas() {
		Fabricante cantidadMaximo=listFabrica.get(0);
		for(int i = 1;i<listFabrica.size();i++) {
			if (cantidadMaximo.cantidadCreadosFabrica<listFabrica.get(i).cantidadCreadosFabrica) {
				cantidadMaximo.cantidadCreadosFabrica = listFabrica.get(i).cantidadCreadosFabrica;
			}
		}
		return cantidadMaximo;
		
		
	}
}
