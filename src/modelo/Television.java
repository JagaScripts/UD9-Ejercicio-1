package modelo;

/**
 * UD9-Ejercicio-1 - modelo - Television
 *
 * @author Jose Antonio González Alcántara
 * 
 *         Fecha de creación 21/04/2022
 */
public class Television extends Electrodomestico {

	public static final float RESOLUCION_DEFECTO = 20;

	private float resolucion;
	private boolean sintonizador;

	public Television() {
		super();
		this.sintonizador = false;
		this.resolucion = RESOLUCION_DEFECTO;
	}

	public Television(double precioBase, float peso) {
		super(precioBase, peso);
		this.sintonizador = false;
		this.resolucion = RESOLUCION_DEFECTO;
	}

	public Television(double precioBase, String color, char consumo, float peso, float resolucion,
			boolean sintonizador) {
		super(precioBase, color, consumo, peso);
		this.sintonizador = false;
		this.resolucion = RESOLUCION_DEFECTO;
	}
	
	@Override
	public void precioFinal() {
		super.precioFinal();
		
		if (this.resolucion > 40) {

			this.precioBase *= 1.30 ;

		}
		
		if (this.sintonizador) {

			this.precioBase += 50;

		}
	}

	/**
	 * @return the resolucion
	 */
	public float getResolucion() {
		return resolucion;
	}

	/**
	 * @return the sintonizador
	 */
	public boolean isSintonizador() {
		return sintonizador;
	}

}
