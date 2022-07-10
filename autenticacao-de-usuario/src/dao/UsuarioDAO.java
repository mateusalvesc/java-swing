package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import dto.UsuarioDTO;

public class UsuarioDAO {

	Connection conn;

	public ResultSet autenticacaoUsuario(UsuarioDTO objusuariodto) {
		conn = new ConexaoDAO().conectaBD();

		try {
			String sql = "Select * from usuario where nome_usuario = ? and senha_usuario = ?";
			
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, objusuariodto.getNome_usuario());
			pstm.setString(2, objusuariodto.getSenha_usuario());
			
			ResultSet rs = pstm.executeQuery();
			return rs;
			
		} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null, "UsuarioDAO: " + erro);
			return null;
		}

	}

}