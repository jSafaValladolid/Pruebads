package ordenador;
/**
 * Esta es una clase para almacenar informacion de los ordenadores del centro
 * @author ALUMNO
 * @version 1.0
 */
public class Ordenador {
	/* Se informa el modelo del ordenador */
	public String modelo;
	/* Variable que almacena el precio total del ordenador */
	public double precio;
	/* Varaible que almacena la capacidad de la memoria */
	public int memoria;
	
	/**
	 * Costructor vacio
	 */
	public Ordenador(){
		
	}
	
	/**
	 * Constructor con todos los atributos de la clase
	 * @param modelo modelo del ordenador
	 * @param precio precio del ordenador
	 * @param memoria memoria del ordenador
	 */
	public Ordenador(String modelo, double precio, int memoria) {
			this.modelo=modelo;
			this.precio=precio;
			this.memoria=memoria;
	}	
}
