package modelo;

/**
 * UD9-Ejercicio-1 - modelo - Lavadora
 *
 * @author Jose Antonio González Alcántara
 * 
 * Fecha de creación 21/04/2022
 */
public class Lavadora extends Electrodomestico {

	// Declaraciones de constantes
	public static final float CARGA_DEFECTO = 5;
	
	// Propiedades de clase
	private float carga;
	
	
	// Constructor por defecto
	public Lavadora() {
		super();
		this.carga = CARGA_DEFECTO;
	}

	// Constructor 2 parametros
	public Lavadora(double precioBase, float peso) {
		super(precioBase, peso);
		this.carga = CARGA_DEFECTO;
	}

	// Constructor todos los prarametros
	public Lavadora(double precioBase, String color, char consumo, float peso, float carga) {
		super(precioBase, color, consumo, peso);
		this.carga = carga;
	}

	//sobreescrivimos el método y llamamos al metodo de la superclase
	@Override
	public double precioFinal() {
		super.precioFinal();
		
		double precioFinal = this.precioBase;
		
		if (this.carga > 30) {

			this.precioBase += 50;

		}
		
		return precioFinal;

	}

	/**
	 * @return the carga
	 */
	public float getCarga() {
		return carga;
	}


}
