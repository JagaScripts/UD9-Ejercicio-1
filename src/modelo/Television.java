package modelo;

/**
 * UD9-Ejercicio-1 - modelo - Television
 *
 * @author Jose Antonio González Alcántara
 * 
 *         Fecha de creación 21/04/2022
 */
public class Television extends Electrodomestico {

	// Declaraciones de constantes
	public static final float RESOLUCION_DEFECTO = 20;

	// Propiedades de clase
	private float resolucion;
	private boolean sintonizador;

	// Constructor por defecto
	public Television() {
		super();
		this.sintonizador = false;
		this.resolucion = RESOLUCION_DEFECTO;
	}

	// Constructor 2 parametros
	public Television(double precioBase, float peso) {
		super(precioBase, peso);
		this.sintonizador = false;
		this.resolucion = RESOLUCION_DEFECTO;
	}

	// Constructor todos los prarametros
	public Television(double precioBase, String color, char consumo, float peso, float resolucion,
			boolean sintonizador) {
		super(precioBase, color, consumo, peso);
		this.sintonizador = false;
		this.resolucion = RESOLUCION_DEFECTO;
	}
	
	//sobreescrivimos el método y llamamos al metodo de la superclase
	@Override
	public double precioFinal() {
		super.precioFinal();

		double precioFinal = this.precioBase;
		
		if (this.resolucion > 40) {

			this.precioBase *= 1.30 ;

		}
		
		if (this.sintonizador) {

			this.precioBase += 50;

		}
		
		return precioFinal;
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
