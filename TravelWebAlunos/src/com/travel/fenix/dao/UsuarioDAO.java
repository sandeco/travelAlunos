package com.travel.fenix.dao;

import com.travel.fenix.model.Usuario;

public interface UsuarioDAO {
	
	public Usuario buscarUsuarioAtivo();

	public Usuario buscarUsuario(String email, String senha);

	public void ativarUsuario(Usuario user);

	public Usuario salvar(Usuario user);

	

}
