//Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas. Fazer um algoritmo que calcule e escreva:
//a. a maior e a menor altura do grupo;
//b. média de altura dos homens;
//c. o número de mulheres.

import java.util.Scanner;

public class CalcularItensSobreIdadeSexo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var altura = new double[10];
		var sexo = new String[10];
		int numeroMulheres = 0, qtde=0; 
		double mediaAlturaHomens=0, maiorAltura=0, menorAltura=10;
		
		var scanner = new Scanner(System.in);
		
		for (int i = 0; i < sexo.length; i++) {
			System.out.print("Digite a " + (i+1) +"º" + " altura: ");
			altura[i] = scanner.nextDouble(); 
			System.out.print("Digite o sexo da " + (i+1) +"º" + " pessoa: ");
			sexo[i] = scanner.next();
		}
		
		for (int i = 0; i < sexo.length; i++) {
			if (sexo[i].equalsIgnoreCase("feminino")) {
				numeroMulheres++;
			} else {
				mediaAlturaHomens += altura[i];
				qtde++;
			}
			
			if(altura[i] < menorAltura) {
				menorAltura = altura[i];
			}	
			
			if(altura[i] > maiorAltura) {
				maiorAltura = altura[i];
			}
			
		}
		
		System.out.println("O mais alto do grupo tem: " + maiorAltura);
		System.out.println("O mais baixo do grupo tem: " + menorAltura);
		System.out.println("O numero de mulheres é: " + numeroMulheres);
		System.out.println("A média de altura dos homens é: " + (mediaAlturaHomens/qtde));
		
		scanner.close();
	}

}
