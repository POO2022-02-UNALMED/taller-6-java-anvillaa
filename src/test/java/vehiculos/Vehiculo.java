package vehiculos;

public class Vehiculo {
	private String placa;
	private int puertas;
	private float velocidadMaxima;
	private String nombre;
	private float precio;
	private int peso;
	private String traccion;
	private Fabricante fabricante;
	private static int cantidadVehiculos;
	
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getPuertas() {
		return puertas;
	}
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	public float getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public void setVelocidadMaxima(float velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public String getTraccion() {
		return traccion;
	}
	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}
	public Fabricante getFabricante() {
		return fabricante;
	}
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	
	
	public Vehiculo(String placa, int puertas, float velocidadMaxima, String nombre, float precio, int peso,
			String traccion, Fabricante fabricante) {
		super();
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
		cantidadVehiculos++;
	}
	public String vehiculosPorTipo(){
		String texto = ("Automoviles "+Automóvil.getCantidadAutomoviles() +"\n" +"Camionetas " +Camioneta.getCantidadCamionetas()
		+"\n"+"Camiones "+Camion.getCantidadCamiones());
		return texto;
		
	}
}
