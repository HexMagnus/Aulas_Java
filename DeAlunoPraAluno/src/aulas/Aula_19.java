package aulas;

import java.util.Scanner;

public class Aula_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Qual é o seu nome?");
		String nome = input.nextLine();
		
		System.out.println("Qual é a sua idade");
		int idade = input.nextInt();
		
		
		if (idade <1) {
			System.out.println("Idade informada não é válida");
		}else if(idade >=18){
			System.out.println(nome + " é maior de idade");
			
		}else {
			System.out.println(nome + " é maior de idade");
		}
		
		
	}

}
