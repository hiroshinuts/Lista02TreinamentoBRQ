package br.com.hiro.entities;

public class Cliente extends Usuario{
	
	private String cpf;
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public Cliente(Integer idUsuario, String nome, String login, String senha, String cpf) {
		super(idUsuario, nome, login, senha);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return super.toString() + ", " + cpf;
	}

	
	
	

}
