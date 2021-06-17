//Escreva um programa que, com base em uma temperatura em graus celsius, a converta e exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F), seguindo as fórmulas: F = C * 1.8 + 32; K = C + 273.15; Re = C * 0.8; Ra = C * 1.8 + 32 + 459.67

import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		
		var leitor = new Scanner(System.in);
		System.out.println("Digite a temperatura em Celsius");
		var temperaturaCelsius = leitor.nextDouble();
		
		System.out.println("A temperatura:" + temperaturaCelsius + "ºC");
		System.out.println("É equivalente a: " + (temperaturaCelsius + 273.15) + "K");
		System.out.println("É equivalente a: " + (temperaturaCelsius * 0.8) + "Re");
		System.out.println("É equivalente a: " + (temperaturaCelsius * 1.8 + 32 + 459.67) + "Ra");
		System.out.println("É equivalente a: " + (temperaturaCelsius * 1.8 + 32) + "F");
		
		leitor.close();
	}

}