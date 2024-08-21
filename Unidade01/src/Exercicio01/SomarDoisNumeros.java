package Exercicio01;

import java.util.Scanner;

public class SomarDoisNumeros {
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		//Declaração de variáveis 
		
		int num1, num2, somaNumeros;
		
		//Leitura dos números e processamento de dados
		
		System.out.print("Insira o primeiro número: ");
		num1 = sc.nextInt();
		System.out.print("Insira o segundo número: ");
		num2 = sc.nextInt();
		
		somaNumeros = num1 + num2;
		
		//Imprime resultado na tela
		
		System.out.println("O resultado da soma é: " + somaNumeros);
		
		//Fecha o scanner
		
		sc.close();

	}

}
