package com.travel.fenix.util;

import com.travel.fenix.dao.UsuarioDAO;
import com.travel.fenix.dao.UsuarioDAOMock;

public class FabricaDAO {
	
	public static UsuarioDAO criarUsuarioDAO(){
		return new UsuarioDAOMock();
	}

}
