package br.com.hiro.persistence;

import java.util.ArrayList;
import java.util.List;

import br.com.hiro.entitites.Aluno;

public class DAOAluno extends DAO {

	public void insert(Aluno a) throws Exception {

		String query = "insert into aluno(nome, cpf) values(?,?)";

		openConnection();

		stmt = con.prepareStatement(query);
		stmt.setString(1, a.getNome());
		stmt.setString(2, a.getCpf());
		stmt.execute();
		stmt.close();

		closeConnectio();

	}

	public void update(Aluno a) throws Exception {

		String query = "update aluno set nome= ?, cpf=? where idaluno = ?";

		openConnection();

		stmt = con.prepareStatement(query);
		stmt.setString(1, a.getNome());
		stmt.setString(2, a.getCpf());
		stmt.setInt(3, a.getIdAluno());
		stmt.execute();
		stmt.close();

		closeConnectio();
	}

	public void delete(Integer idAluno) throws Exception {

		String query = "delete from aluno where idaluno = ?";

		openConnection();

		stmt = con.prepareStatement(query);
		stmt.setInt(1, idAluno);
		stmt.execute();
		stmt.close();

		closeConnectio();

	}

	public List<Aluno> findAll() throws Exception {

		String query = "select * from aluno order by idaluno asc";

		openConnection();

		stmt = con.prepareStatement(query);
		rs = stmt.executeQuery();

		List<Aluno> lista = new ArrayList<Aluno>();

		while (rs.next()) {

			Aluno a = new Aluno();
			a.setIdAluno(rs.getInt("idaluno"));
			a.setNome(rs.getString("nome"));
			a.setCpf(rs.getString("cpf"));

			lista.add(a);

		}

		return lista;
	}
	
	public Aluno findById(Integer idAluno) throws Exception{
		
		String query = "select * from aluno where idaluno = ?";
		
		openConnection();
		
		stmt = con.prepareStatement(query);
		stmt.setInt(1, idAluno);
		rs = stmt.executeQuery();
		
		Aluno a = null;
		
		if(rs.next()){
			a = new Aluno();
			a.setIdAluno(rs.getInt("idaluno"));
			a.setNome(rs.getString("nome"));
			a.setCpf(rs.getString("cpf"));
		}
		stmt.close();
		closeConnectio();
		
		return a;
	}

}
