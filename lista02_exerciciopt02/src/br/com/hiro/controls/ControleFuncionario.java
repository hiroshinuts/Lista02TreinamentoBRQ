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

import br.com.hiro.entities.Funcionario;

public class ControleFuncionario extends ControleUsuario<Funcionario> {

	@Override
	public void exportarXml(List<Funcionario> lista) throws Exception {
		
		XStream xstream = new XStream(new StaxDriver());
		xstream.alias("dados", List.class);
		xstream.alias("funcionario", Funcionario.class);
		
		FileWriter arquivo = new FileWriter(new File(PATH + "funcionario.xml"));
		arquivo.write(xstream.toXML(lista));
		arquivo.close();
		
	}

	@Override
	public List<Funcionario> importaXml() throws Exception {

		List<Funcionario> lista = new ArrayList<Funcionario>();
		XStream xstream = new XStream(new Dom4JDriver());
		xstream.alias("dados", List.class);
		xstream.alias("funcionario", Funcionario.class);
		
		BufferedReader arquivo = new BufferedReader(new FileReader(PATH + "funcionario.xml"));
		lista = (List<Funcionario>) xstream.fromXML(arquivo);
		arquivo.close();
		
		return lista;
	}

}
