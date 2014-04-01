package com.travel.fenix.dao;

import com.travel.fenix.model.Usuario;

public class UsuarioDAOMock implements UsuarioDAO{

	@Override
	public Usuario buscarUsuarioAtivo() {
				
		return null;
	}

	@Override
	public Usuario buscarUsuario(String email, String senha) {
		Usuario user = new Usuario();
		user.setId(1);
		user.setNome("joao");
		user.setEmail("j@gmail.com");
		user.setSenha("123");

		return user;
	}

	@Override
	public void ativarUsuario(Usuario user) {
		
	}

	@Override
	public Usuario salvar(Usuario user) {
		
		Usuario usuario = new Usuario();
		
		usuario.setId(4);
		usuario.setNome(user.getNome());
		usuario.setEmail(user.getEmail());
		usuario.setSenha(user.getSenha());
		
		
		return usuario;
	}

	

}
