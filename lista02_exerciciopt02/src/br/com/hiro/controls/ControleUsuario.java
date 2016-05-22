package br.com.hiro.controls;

import java.util.List;

import br.com.hiro.entities.Usuario;

public abstract class ControleUsuario<T extends Usuario> {
	
	protected static final String PATH = "c:\\temp\\";
	
	public abstract void exportarXml(List<T> lista) throws Exception;
	
	public abstract List<T> importaXml() throws Exception;

}
