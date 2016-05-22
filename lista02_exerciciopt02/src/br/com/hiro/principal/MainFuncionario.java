package br.com.hiro.principal;

import java.util.ArrayList;
import java.util.List;

import br.com.hiro.controls.ControleFuncionario;
import br.com.hiro.entities.Funcionario;

public class MainFuncionario {

	public static void main(String[] args) {
		
		List<Funcionario> lista = new ArrayList<Funcionario>();
		
		lista.add(new Funcionario(1, "Rafael" , "hiro", "123123" , "Estagio", 1000.0));
		lista.add(new Funcionario(1, "Babara" , "barbs", "1123" , "Diretora", 10000.0));
		lista.add(new Funcionario(1, "Sergio" , "serg", "123123" , "Professor", 100000.0));
		lista.add(new Funcionario(1, "Rafael" , "auei", "aui" , "Diretor", 1500.0));

		try{
			
			ControleFuncionario c = new ControleFuncionario();
			c.exportarXml(lista);
			
			System.out.println("XML gerado com sucesso. \n");
			
			for(Funcionario f : c.importaXml()){
				System.out.println(f);
			}
			
		}catch(Exception e){
			System.out.println("Erro no Funcionario " + e.getMessage());
		}
		
	}

}
