package Lista2;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
	int vetor[] = null;
	int tamanho = 0;
	for (int i=0; i<=100;i++) {
	System.out.println("1 - Criar Vetor");
	System.out.println("2 - Mostrar Vetor");
	System.out.println("3 - Apresentar Inverso");
	int valor = entrada.nextInt();
	
	if (valor == 1) {
		System.out.println("Qual tamanho do vetor deseja?");
		tamanho = entrada.nextInt();
		vetor = new int[tamanho];
		for (int j=0; j<=tamanho-1;j++) {
			System.out.println("Digite o valor para posição " +j+  " do vetor");
			vetor[j]= entrada.nextInt();
		}
	}
	
	if (valor == 2) {
		for (int j=0;j<=tamanho-1;j++) {
			System.out.println("Vetor " +j+ " = " +vetor[j]);
		}
	}
	
	if (valor == 3) {
		for (int j=tamanho-1;j>=0;j--) {
			System.out.println("Vetor " +j+ " = " +vetor[j]);
	}
	
	if ((valor <3) || (valor<1) ) {
		System.out.println("1 - Cadastrar Contatos");
		System.out.println("2 - Listar contatos");
		System.out.println("3 - Sair");
	}
	}

	}
	entrada.close();
	}}


