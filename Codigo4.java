//Este código es un juego de "piedra, papel o tijera" entre dos personas. 
//Usando el Scanner, el programa lee lo que cada jugador escribe en la pantalla. 
//Luego, con el else y el if, el programa decide quién gana o si hay empate, comparando las elecciones que guardó en los String para cada jugador. 
//El break ayuda a detener el juego en el momento adecuado, y el default se usa si algo inesperado ocurre durante el juego. 
//El programa hace de árbitro para determinar quién gana el juego según las reglas.

package com.generation;

import java.util.Scanner;

public class Codigo4 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Turno del jugador 1 (piedra, papel o tijeras): ");
			String jugador1 = scanner.nextLine();
			
			System.out.print("Turno del jugador 2 (piedra, papel o tijeras): ");
			String jugador2 = scanner.nextLine();
			
			if (jugador1.equals(jugador2)) {
			    System.out.println("Es un empate");
			} else {
			    int ganador = 2; // Inicialmente no hay ganador. Cambié el nombre de la variable 'g' a 'ganador' para hacerlo más claro y legible
			   
			    // Posteriormente se verifica quién ganó
			    switch(jugador1) {
			        case "piedra":
			            if (jugador2.equals("tijeras")) {
			                ganador = 1; // Jugador 1 gana con piedra
			            }
			            break;
			        case "papel":
			            if (jugador2.equals("piedra")) {
			                ganador = 1; // Jugador 1 gana con papel
			            }
			            break;
			        case "tijeras":
			            if (jugador2.equals("papel")) {
			                ganador = 1; // Jugador 1 gana con tijeras
			            }
			            break;
			        default:
			    }
			    
			    // Se muestra quién ganó
			    if (ganador == 1) {
			        System.out.println("¡Jugador 1 gana!");
			    } else {
			        System.out.println("¡Jugador 2 gana!");
			    }//else
			}//else
		}//scanner
    }// main 
}// public class Código 4 (Se ordena Sintaxis de los "}" )
