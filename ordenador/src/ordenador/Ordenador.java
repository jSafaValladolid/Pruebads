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

	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * @return the memoria
	 */
	public int getMemoria() {
		return memoria;
	}

	/**
	 * @param memoria the memoria to set
	 */
	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	
}
