package br.com.hiro.entities;

public class Funcionario extends Usuario {

	private String funcao;
	private Double salario;

	public Funcionario() {
		// TODO Auto-generated constructor stub
	}

	public Funcionario(Integer idUsuario, String nome, String login, String senha, String funcao, Double salario) {
		super(idUsuario, nome, login, senha);
		this.funcao = funcao;
		this.salario = salario;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return super.toString() +  funcao + ", " + salario;
	}

}
