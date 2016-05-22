package br.com.hiro.controls;

import java.util.Scanner;

import br.com.hiro.controls.types.Menu;
import br.com.hiro.entitites.Aluno;
import br.com.hiro.input.InputAluno;
import br.com.hiro.persistence.DAOAluno;

public class ControleAluno {

	private InputAluno input;

	public ControleAluno() {

		input = new InputAluno();

	}

	private void cadastrarAluno() {

		try {

			Aluno a = new Aluno();
			a.setNome(input.lerNomeAluno());
			a.setCpf(input.lerCpfAluno());

			DAOAluno d = new DAOAluno();
			d.insert(a);

			System.out.println("Aluno cadastrado com sucesso");

		} catch (Exception e) {

			System.out.println("Erro ao cadastrar o Aluno " + e.getMessage());
		}

	}

	public void atualizarAluno() {

		try {

			DAOAluno d = new DAOAluno();

			Aluno a = d.findById(input.lerIdAluno());

			if (a != null) {

				a.setNome(input.lerNomeAluno());
				a.setCpf(input.lerCpfAluno());

				d.update(a);

				System.out.println("Aluno atualizado com sucesso");
			} else {

				throw new Exception("Aluno não encontrado!");

			}

		} catch (Exception e) {
			System.out.println("Erro ao atualizar Aluno " + e.getMessage());
		}

	}

	private void excluirAluno() {

		try {

			DAOAluno d = new DAOAluno();
			Aluno a = d.findById(input.lerIdAluno());

			if (a != null) {
				d.delete(a.getIdAluno());

				System.out.println("Aluno excluido com sucesso!" + a);
			} else {

				throw new Exception("Aluno não encontrado");

			}

		} catch (Exception e) {
			System.out.println("Erro ao deletar Aluno " + e);
		}

	}

	private void consultarAluno() {

		try {

			DAOAluno d = new DAOAluno();

			for (Aluno a : d.findAll()) {

				System.out.println("Aluno: " + a);

			}
		} catch (Exception e) {
			System.out.println("Erro ao consultar aluno " + e.getMessage());
		}

	}

	// MENU

	public void menuAluno() {

		System.out.println("\nMenu Aluno");
		System.out.println("\tCADASTRAR");
		System.out.println("\tATUALIZAR");
		System.out.println("\tEXCLUIR");
		System.out.println("\tCONSULTAR");
		System.out.println("\tSAIR");

		Menu menu = Menu.valueOf(new Scanner(System.in).nextLine().toUpperCase());

		switch (menu) {

		case CADASTRAR:
			cadastrarAluno();
			menuAluno();
			break;

		case ATUALIZAR:
			atualizarAluno();
			menuAluno();
			break;

		case EXCLUIR:
			excluirAluno();
			menuAluno();
			break;

		case CONSULTAR:
			consultarAluno();
			menuAluno();
			break;

		case SAIR:
			System.out.println("\nFIM DO PROGRAMA");
			break;

		}

	}

}
