
package vista;

import modelo.Electrodomestico;
import modelo.Lavadora;

/**
 * UD9-Ejercicio-1 - vista - mainApp
 *
 * @author Jose Antonio González Alcántara
 * 
 * Fecha de creación 21/04/2022
 */
public class mainApp {

	public static void main(String[] args) {

		// Generamos 3 objetos para ver lo tres constructores
		Electrodomestico electroDefecto = new Electrodomestico();
		Electrodomestico electroPesoPrecio = new Electrodomestico(200, 10);
		Electrodomestico electroTodos = new Electrodomestico(300, "negro", 'A', 15);
		Electrodomestico electroTodosIncorrecto = new Electrodomestico(100, "negrsdfas", 'Z', 50);
		Lavadora lavadora = new Lavadora(5, "negrsdfas", 'Z', 50, 31);

		// Objeto constructor por defecto
		System.out.println("Electrodomestico con constructor por defecto" + " Color " + electroDefecto.getColor()
				+ " Peso " + electroDefecto.getPeso() + " Kg " + " Consumo " + electroDefecto.getConsumo() + " Precio "
				+ electroDefecto.getPrecioBase() + " €");

		// Objeto constructor con precio y peso por parametros
		System.out.println("Electrodomestico con constructor con el precio y peso. El resto por defecto" + " Color "
				+ electroPesoPrecio.getColor() + " Peso " + electroPesoPrecio.getPeso() + " Kg " + " Consumo "
				+ electroPesoPrecio.getConsumo() + " Precio " + electroPesoPrecio.getPrecioBase() + " €");

		// Objeto constructor con todos los atributos por parametro
		System.out.println("Electrodomestico con constructor con todos los atributos" + " Color "
				+ electroTodos.getColor() + " Peso " + electroTodos.getPeso() + " Kg " + " Consumo "
				+ electroTodos.getConsumo() + " Precio " + electroTodos.getPrecioBase() + " €");
		
		// Objeto constructor con todos los atributos por parametro
				System.out.println("Electrodomestico con constructor con todos los atributos" + " Color "
						+ electroTodosIncorrecto.getColor() + " Peso " + electroTodosIncorrecto.getPeso() + " Kg " + " Consumo "
						+ electroTodosIncorrecto.getConsumo() + " Precio " + electroTodosIncorrecto.getPrecioBase() + " €");
				
		System.out.println(lavadora.getPrecioBase() + " "  + lavadora.getColor()  + " "  + lavadora.getCarga()  + " "  + lavadora.getPeso()  + " "  + lavadora.getConsumo());		

	}

}
