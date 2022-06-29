package aulas;

import java.util.Scanner;

public class Aula_11 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double base, altura, areaRetangulo;
		
		
		System.out.print("Informe o valor da base:");
		base= input.nextDouble();
		
		System.out.print("Informe o valor altura:");
		altura = input.nextDouble();
		
		areaRetangulo = base*altura;
		
		System.out.println("A area de um retangulo de base = " +base);
		System.out.println("de altura  = " +altura);
		System.out.println("é " +areaRetangulo);

	}

}
