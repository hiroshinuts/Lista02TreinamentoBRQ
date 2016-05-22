package br.com.hiro.controls;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.Dom4JDriver;
import com.thoughtworks.xstream.io.xml.StaxDriver;

import br.com.hiro.entities.Cliente;

public class ControleCliente extends ControleUsuario<Cliente>{

	@Override
	public void exportarXml(List<Cliente> lista) throws Exception {
		
		XStream xstream = new XStream(new StaxDriver());
		
		xstream.alias("dados", List.class);
		xstream.alias("cliente", Cliente.class);
		
		FileWriter arquivo = new FileWriter(new File(PATH + "clientes.xml"));
		arquivo.write(xstream.toXML(lista));
		arquivo.close();
		
	}

	@Override
	public List<Cliente> importaXml() throws Exception {
		
		List<Cliente> lista = new ArrayList<Cliente>();
		
		XStream xstream = new XStream(new Dom4JDriver());
		xstream.alias("dados", List.class);
		xstream.alias("cliente", Cliente.class);

		BufferedReader arquivo = new BufferedReader(new FileReader(PATH + "clientes.xml"));
		lista = (List<Cliente>) xstream.fromXML(arquivo);
		arquivo.close();
		
		
		return lista;
	}

}
