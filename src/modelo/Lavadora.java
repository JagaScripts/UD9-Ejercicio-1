package modelo;

/**
 * UD9-Ejercicio-1 - modelo - Lavadora
 *
 * @author Jose Antonio González Alcántara
 * 
 * Fecha de creación 21/04/2022
 */
public class Lavadora extends Electrodomestico {

	public static final float CARGA_DEFECTO = 5;
	
	private float carga;
	
	
	
	public Lavadora() {
		super();
		this.carga = CARGA_DEFECTO;
		super.precioFinal();
		this.precioFinal();
	}

	public Lavadora(double precioBase, float peso) {
		super(precioBase, peso);
		this.carga = CARGA_DEFECTO;
		super.precioFinal();
		this.precioFinal();
	}

	public Lavadora(double precioBase, String color, char consumo, float peso, float carga) {
		super(precioBase, color, consumo, peso);
		this.carga = carga;
		super.precioFinal();
		this.precioFinal();
	}

	@Override
	public void precioFinal() {
		
		if (this.carga > 30) {

			this.precioBase += 50;

		}

	}

	/**
	 * @return the carga
	 */
	public float getCarga() {
		return carga;
	}

	@Override
	public String toString() {
		return "Lavadora [carga=" + carga + "]";
	}
	
	

}
