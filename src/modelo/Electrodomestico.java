package modelo;

/**
 * UD9-Ejercicio-1 - electrodomesticos - Electrodomestico
 *
 * @author Jose Antonio González Alcántara
 * 
 * Fecha de creación 21/04/2022
 */
public class Electrodomestico implements Producto {

	// Declaraciones de constantes
	public static final char CONSUMOS[] = { 'A', 'B', 'C', 'D', 'E', 'F' };
	public static final char CONSUMO_DEFECTO = 'F';
	public static final double PRECIO_DEFECTO = 100;
	public static final float PESO_DEFECTO = 5;
	public static final String COLORES[] = { "blanco", "negro", "rojo", "azul", "gris" };
	public static final String COLOR_DEFECTO = "blanco";

	// Propiedades de clase
	protected double precioBase;
	protected String color;
	protected char consumo;
	protected float peso;

	// Constructor por defecto
	public Electrodomestico() {
		this.color = COLOR_DEFECTO;
		this.consumo = CONSUMO_DEFECTO;
		this.peso = PESO_DEFECTO;
		this.precioBase = PRECIO_DEFECTO;
		this.precioFinal();
		
	}

	// Constructor 2 parametros
	public Electrodomestico(double precioBase, float peso) {
		this.color = COLOR_DEFECTO;
		this.consumo = CONSUMO_DEFECTO;
		this.peso = peso;
		this.precioBase = precioBase;
		this.precioFinal();
		
		
	}

	// Constructor todos los prarametros
	public Electrodomestico(double precioBase, String color, char consumo, float peso) {
		this.comprobarConsumoEnergetico(consumo);
		this.comprobarColor(color);
		this.peso = peso;
		this.precioBase = precioBase;
		this.precioFinal();
		
	}

	// Getters y Setters
	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumo() {
		return consumo;
	}

	public void setConsumo(char consumo) {
		this.consumo = consumo;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}
	

	protected void comprobarConsumoEnergetico(char letra) {
		
		int i = CONSUMOS.length - 1;
	
		do {
			
			if (letra == CONSUMOS[i]) {
				
				this.consumo = letra;
				
			}
			
			i--;
			
		} while (this.consumo == '\u0000' && i >= 0);
		
		if (this.consumo == '\u0000') {
			
			this.consumo = CONSUMO_DEFECTO;
			
		}
		

	}
	
	protected void comprobarColor(String color) {
		
		int i = COLORES.length - 1;
		
		do {
			
			if (color.toLowerCase().equals(COLORES[i])) {
				
				this.color = color;
				
			}
						
			i--;
			
		} while (this.color == null && i >= 0);
		
		if (this.color == null){
			
			this.color = COLOR_DEFECTO;
			
		}
	
	}
	
	public void precioFinal() {
		
		switch (this.consumo) {
		case 'A':
			this.precioBase += 100;
			break;
		case 'B':
			this.precioBase += 80;
			break;
		case 'C':
			this.precioBase += 60;
			break;
		case 'D':
			this.precioBase += 50;
			break;
		case 'E':
			this.precioBase += 30;
			break;
		case 'F':
			this.precioBase += 10;
			break;
			
		default:
			break;
		}
		
		if (this.peso >= 0 && this.peso <= 19) {
			
			this.precioBase += 10;
			
		} else if (this.peso >= 20 && this.peso <= 49 ) {
			
			this.precioBase += 50;
			
		} else if (this.peso >= 50 && this.peso <= 79) {
			
			this.precioBase += 80;
			
		} else if (this.peso > 80) {
			
			this.precioBase += 100;
			
		} 
		
	}


}
