package br.com.hiro.input;

import java.util.Scanner;

public class InputAluno {

	private Scanner scanner;

	public InputAluno() {

		scanner = new Scanner(System.in);

	}

	public Integer lerIdAluno() {

		System.out.println("Informe o Id do Aluno");
		return Integer.parseInt(scanner.nextLine());

	}

	public String lerNomeAluno() {

		System.out.println("Informe o Nome do Aluno: ");
		return scanner.nextLine();

	}
	
	public String lerCpfAluno(){
		
		System.out.println("Informe o CPF do ALuno:  ");
		return scanner.nextLine();
	}

}
