package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;

import dao.UsuarioDAO;
import dto.UsuarioDTO;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class FrameLoginView {

	private JFrame frameLogin;
	
	private JTextField txtNomeUsuario;
	private JPasswordField txtSenhaUsuario;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameLoginView window = new FrameLoginView();
					window.frameLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FrameLoginView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameLogin = new JFrame();
		frameLogin.setTitle("Login");
		frameLogin.setForeground(Color.BLUE);
		frameLogin.setResizable(false);
		frameLogin.setBounds(100, 100, 300, 400);
		frameLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameLogin.getContentPane().setLayout(null);
		
		JLabel lblUsuario = new JLabel("Nome de Usu\u00E1rio");
		lblUsuario.setBounds(14, 39, 262, 13);
		frameLogin.getContentPane().add(lblUsuario);
		
		JLabel lblSenha = new JLabel("Senha de Usu\u00E1rio");
		lblSenha.setBounds(14, 91, 262, 13);
		frameLogin.getContentPane().add(lblSenha);
		
		txtNomeUsuario = new JTextField();
		txtNomeUsuario.setBounds(14, 62, 262, 19);
		frameLogin.getContentPane().add(txtNomeUsuario);
		txtNomeUsuario.setColumns(10);
		
		JButton btnEntrar = new JButton("Entrar no Sistema");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					String nome_usuario, senha_usuario;
					
					nome_usuario = txtNomeUsuario.getText();
					senha_usuario = txtSenhaUsuario.getName();
					
					UsuarioDTO objusuariodto = new UsuarioDTO();
					
					objusuariodto.setNome_usuario(nome_usuario);
					objusuariodto.setSenha_usuario(senha_usuario);
					
					UsuarioDAO objusuariodao = new UsuarioDAO();
					ResultSet rsusuariodao = objusuariodao.autenticacaoUsuario(objusuariodto);
					
					if (rsusuariodao.next()) {
						JOptionPane.showMessageDialog(null, "Logado com sucesso");
					} else {
						JOptionPane.showMessageDialog(null, "Usuário ou Senha inválida");
					}
					
				} catch (SQLException erro) {
					JOptionPane.showMessageDialog(null, "FrameLoginView: " + erro);
				}
				
			}

		});
		btnEntrar.setBounds(63, 173, 164, 21);
		frameLogin.getContentPane().add(btnEntrar);
		
		txtSenhaUsuario = new JPasswordField();
		txtSenhaUsuario.setBounds(14, 114, 262, 19);
		frameLogin.getContentPane().add(txtSenhaUsuario);
	}
}
