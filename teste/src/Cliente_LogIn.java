

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


public class Cliente_LogIn {

	private JFrame frame;
	private JTextField tfId;
	private JTextField tfSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cliente_LogIn window = new Cliente_LogIn();
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
	public Cliente_LogIn() {
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
		
		JLabel lblId = new JLabel("ID");
		lblId.setFont(new Font("Calibri Light", Font.PLAIN, 20));
		
		tfId = new JTextField();
		tfId.setFont(new Font("Calibri Light", Font.PLAIN, 20));
		tfId.setColumns(10);
		
		tfSenha = new JTextField();
		tfSenha.setFont(new Font("Calibri Light", Font.PLAIN, 20));
		tfSenha.setColumns(10);
		
		JButton btnAcessar = new JButton("Acessar");
		btnAcessar.setFont(new Font("Calibri Light", Font.PLAIN, 20));
		
		JButton btnCadastrarse = new JButton("Cadastrar-se");
		btnCadastrarse.setFont(new Font("Calibri Light", Font.PLAIN, 20));
		
		JButton btnNewButton = new JButton("Acesso sem cadastro");
		btnNewButton.setFont(new Font("Calibri Light", Font.PLAIN, 20));
		
		JCheckBox chckbxAcessarComoEscritor = new JCheckBox("Acessar como escritor");
		chckbxAcessarComoEscritor.setFont(new Font("Calibri Light", Font.PLAIN, 20));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
					.addGap(282)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblId)
						.addComponent(lblSenha))
					.addGap(26)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnCadastrarse, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
						.addComponent(btnNewButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
						.addComponent(tfSenha, Alignment.LEADING)
						.addComponent(tfId, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
						.addComponent(chckbxAcessarComoEscritor, Alignment.LEADING)
						.addComponent(btnAcessar, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
					.addGap(9)
					.addComponent(chckbxAcessarComoEscritor)
					.addGap(18)
					.addComponent(btnAcessar)
					.addGap(18)
					.addComponent(btnCadastrarse)
					.addGap(18)
					.addComponent(btnNewButton)
					.addContainerGap(85, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		
		JLabel lblTituloJanela = new JLabel("Fa\u00E7a Log in ou Cadastre-se");
		lblTituloJanela.setFont(new Font("Calibri Light", Font.PLAIN, 27));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(314)
					.addComponent(lblTituloJanela))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(5)
					.addComponent(lblTituloJanela))
		);
		panel.setLayout(gl_panel);
		frame.getContentPane().setLayout(groupLayout);
	
		btnAcessar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				String nome = tfId.getText();
				String senha = tfSenha.getText();
								
				ClienteB b = new ClienteB();
				Servico s = b.getServico();
				
				ArrayList<String> username = null;
				ArrayList<String> senhas = null;;
				try {
					username = s.getUsername();
					senhas = s.getSenha();
				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				for(int i=0;i<username.size();i++){
					if(username.get(i).equals(nome)){
						if(senhas.get(i).equals(senha)){
							if(chckbxAcessarComoEscritor.isSelected()){
								//abrir cliente publisher
								Cliente_Publisher cp = new Cliente_Publisher();
								cp.main(null);
							}else{
								Cliente_Subscriber cs = new Cliente_Subscriber();
								cs.main(null);
							}
							
						}else{
							JOptionPane.showMessageDialog(null, "Senha incorreta!");
						}
					}
				}
				
				
			}
		});
		
		
		btnCadastrarse.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				Cliente_Cadastro_Usuario cnu = new Cliente_Cadastro_Usuario();
				cnu.main(null);
				
				
			}
		});
		
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Cliente_SemCadastro csc = new Cliente_SemCadastro();
				csc.main(null);
			}
		});
		
	
	}
}
