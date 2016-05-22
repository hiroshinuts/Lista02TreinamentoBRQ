package br.com.hiro.principal;

import java.util.ArrayList;
import java.util.List;

import br.com.hiro.controls.ControleCliente;
import br.com.hiro.entities.Cliente;
import br.com.hiro.entities.Funcionario;

public class MainCliente {

	public static void main(String[] args) {

		List<Cliente> lista = new ArrayList<Cliente>();
		lista.add(new Cliente(1, "Rafael" , "hiro", "123123", "22854300866"));
		lista.add(new Cliente(2, "Babara" , "bbr", "123123", "22854300866"));
		lista.add(new Cliente(3, "Sergio" , "serg", "123123", "22854300866"));
		lista.add(new Cliente(4, "Caio" , "caiii", "123123", "22854300866"));
		lista.add(new Cliente(5, "Abap" , "abcde", "123123", "22854300866"));
		
		try{
			
			ControleCliente c = new ControleCliente();
			c.exportarXml(lista);
			
			System.out.println("XML gerado com sucesso \n");
			for(Cliente cli : c.importaXml()){
				System.out.println(cli);
			}
			
		}catch(Exception e){
			System.out.println("Erro no cliente" + e.getMessage());
		}
		
		
	}

}
