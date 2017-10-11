

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.util.ArrayList;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;


public class Cliente_Cadastro_Usuario {

	private JFrame frame;
	private JTextField tfId;
	private JTextField tfSenha;
	private JTextField tfNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cliente_Cadastro_Usuario window = new Cliente_Cadastro_Usuario();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Cliente_Cadastro_Usuario() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 882, 561);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		
		JPanel panel_1 = new JPanel();
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel_1, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 840, Short.MAX_VALUE)
						.addComponent(panel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 840, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Calibri Light", Font.PLAIN, 20));
		
		JLabel lblId = new JLabel("User ID");
		lblId.setFont(new Font("Calibri Light", Font.PLAIN, 20));
		
		tfId = new JTextField();
		tfId.setFont(new Font("Calibri Light", Font.PLAIN, 20));
		tfId.setColumns(10);
		
		tfSenha = new JTextField();
		tfSenha.setFont(new Font("Calibri Light", Font.PLAIN, 20));
		tfSenha.setColumns(10);
		
		JButton btnCadastrarse = new JButton("Cadastrar-se");
		btnCadastrarse.setFont(new Font("Calibri Light", Font.PLAIN, 20));
		
		tfNome = new JTextField();
		tfNome.setFont(new Font("Calibri Light", Font.PLAIN, 20));
		tfNome.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Calibri Light", Font.PLAIN, 20));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel_1.createSequentialGroup()
					.addGap(274)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblId)
						.addComponent(lblSenha)
						.addComponent(lblNome))
					.addGap(26)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(btnCadastrarse, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
						.addComponent(tfNome, GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
						.addComponent(tfSenha, 247, 254, Short.MAX_VALUE)
						.addComponent(tfId, GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE))
					.addGap(237))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(53)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(tfId, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblId))
					.addGap(13)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(tfSenha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSenha))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(tfNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNome))
					.addGap(33)
					.addComponent(btnCadastrarse)
					.addContainerGap(175, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		
		JLabel lblTituloJanela = new JLabel("Preencha os dados abaixo para efetuar seu cadastro");
		lblTituloJanela.setFont(new Font("Calibri Light", Font.PLAIN, 27));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(145, Short.MAX_VALUE)
					.addComponent(lblTituloJanela)
					.addGap(134))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblTituloJanela)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		frame.getContentPane().setLayout(groupLayout);
		
		
		btnCadastrarse.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				String nome = tfNome.getText();
				String senha = tfSenha.getText();
				String username = tfId.getText();
				
				ClienteB b = new ClienteB();
				Servico s = b.getServico();
				
				try {
					
					s.addUser(username, senha, nome);
					JOptionPane.showMessageDialog(null, "Usu�rio cadastrado com sucesso!");
					Cliente_LogIn cl = new Cliente_LogIn();
					cl.main(null);
					
				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		
	}
}
