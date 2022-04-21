
package vista;

import java.util.Random;

import modelo.Electrodomestico;
import modelo.Lavadora;
import modelo.Television;

/**
 * UD9-Ejercicio-1 - vista - mainApp
 *
 * @author Jose Antonio González Alcántara
 * 
 * Fecha de creación 21/04/2022
 */
public class mainApp {

	public static void main(String[] args) {
		
		
		//Generamos 3 objetos para ver lo tres constructores
		Electrodomestico electroDefecto = new Electrodomestico();
		Electrodomestico electroPesoPrecio = new Electrodomestico(200, 10);
		Electrodomestico electroTodos = new Electrodomestico(300, "negro", 'A', 15);
		Electrodomestico electroTodosIncorrecto = new Electrodomestico(100, "negrsdfas", 'Z', 50);	
		
		//Crea un array de Electrodomesticos de 10 posiciones
		Electrodomestico electrodomestico[] = new Electrodomestico[10];
		
		//introducimos los creados anteriormente
		electrodomestico[0] = electroDefecto;
		electrodomestico[1] = electroPesoPrecio;
		electrodomestico[2] = electroTodos;
		electrodomestico[3] = electroTodosIncorrecto;
		
		double sumaTelevision = 0.0;
		double sumaLavadora = 0.0;
		
		//Asigna a cada posición un objeto de las clases Lavadora y Televisión con los valores que desees
		for (int i = 4; i < electrodomestico.length; i++) {
			
			float floatRandom = (float) generarNumeroAleatorio(0, 100);
			double doubleRandom = (double) generarNumeroAleatorio(0, 1000);
			boolean booleanSwitch = false;
			
			if (i % 2 != 0) {
				
				booleanSwitch = true;
				
			}
			
			//Genramos lavadoras y televisores 
			Lavadora lavadora = new Lavadora(doubleRandom, Lavadora.COLORES[1], Lavadora.CONSUMOS[3], floatRandom,
					(float) doubleRandom + floatRandom);
			Television television = new Television(doubleRandom, Television.COLORES[4], Television.CONSUMOS[2],
					floatRandom, (float) doubleRandom + floatRandom, booleanSwitch);
			
			//Mestemos uno de cada tipo
			if (i % 2 != 0) {
				
				electrodomestico[i] = lavadora;
				
			}else {
				
				electrodomestico[i] = television;
				
			}
			
			
			//sumamos los televisores y lavadoras por sparado
			if (electrodomestico[i] instanceof Lavadora){
				
				sumaLavadora += electrodomestico[i].precioFinal();
				
			}else if (electrodomestico[i] instanceof Television) {
				
				sumaTelevision += electrodomestico[i].precioFinal();
				
			}
						
		}
		
		//impreimimos las sumas
		System.out.println("La suma de La clase Electrodomestico es " + (sumaTelevision + sumaLavadora));
		System.out.println("La suma de La clase Lavadora es " + sumaLavadora);
		System.out.println("La suma de La clase Television es " + sumaTelevision);
		
	}

	public static int generarNumeroAleatorio(int numBase, int numTope){
		
		Random random;
		int numeroAleatorio; 

		random = new Random();
	    numeroAleatorio = numBase + random.nextInt((numTope+1) - numBase);
		return numeroAleatorio;
	}
}
