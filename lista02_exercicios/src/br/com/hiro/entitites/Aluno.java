package br.com.hiro.entitites;

public class Aluno implements Comparable<Aluno> {

	private Integer idAluno;
	private String nome;
	private String cpf;

	public Aluno() {
		// TODO Auto-generated constructor stub
	}

	public Aluno(Integer idAluno, String nome, String cpf) {
		this.idAluno = idAluno;
		this.nome = nome;
		this.cpf = cpf;
	}

	public Integer getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(Integer idAluno) {
		this.idAluno = idAluno;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return idAluno + ", " + nome + ", "  + cpf;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Aluno) {

			Aluno a = (Aluno) obj;

			return a.getIdAluno().equals(idAluno);

		}

		return false;
	}

	@Override
	public int hashCode() {
		return idAluno.hashCode();
	}

	@Override
	public int compareTo(Aluno a) {

		return idAluno.compareTo(a.idAluno);
	}
}
