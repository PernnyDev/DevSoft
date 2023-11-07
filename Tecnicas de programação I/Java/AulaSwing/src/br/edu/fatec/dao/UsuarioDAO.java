package br.edu.fatec.dao;

import java.util.ArrayList;
import java.util.List;

import br.edu.fatec.modelo.Usuario;

public class UsuarioDAO {
	List<Usuario> lista = new ArrayList<Usuario>();
	public void adicionaNaLista(Usuario novoUsuario) {
		lista.add(novoUsuario);
		listasUsuarios();
	}
	
	public void listasUsuarios() {
		System.out.println("Os dados cadastrados são: ");
		for (Usuario usuario : lista) {
			System.out.println("Nome: " + usuario.getNome());
			System.out.println("Login: " + usuario.getLogin());
		}
	}
	
	public boolean buscaUsuario(String login, String senha) {
		for (Usuario usuario : lista) {
			if (usuario.getLogin().equals(login)&& usuario.getSenha().equals(senha)) {
				return true;
			}
		}
		return false;
	}

}
