

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;

import java.awt.GridLayout;

import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.util.ArrayList;

import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

public class Cliente_Publisher {

	private JFrame frame;
	private JTextField tfDataInicial;
	private JTextField tfDataFinal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cliente_Publisher window = new Cliente_Publisher();
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
	public Cliente_Publisher() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 917, 853);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 578, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE))
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 875, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
						.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE))
					.addContainerGap())
		);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));
		
		JTextArea taNoticia = new JTextArea();
		taNoticia.setRows(5);
		taNoticia.setEditable(false);
		panel_2.add(taNoticia);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("T\u00F3pico 1");
		chckbxNewCheckBox.setFont(new Font("Calibri Light", Font.PLAIN, 18));
		
		JCheckBox chckbxTpico_2 = new JCheckBox("T\u00F3pico 2");
		chckbxTpico_2.setFont(new Font("Calibri Light", Font.PLAIN, 18));
		
		JButton btnCriarTpico = new JButton("Criar T\u00F3pico");
		btnCriarTpico.setFont(new Font("Calibri Light", Font.PLAIN, 18));
		
		JButton btnCriarNotcia = new JButton("Criar Not\u00EDcia");
		btnCriarNotcia.setFont(new Font("Calibri Light", Font.PLAIN, 18));
		
		JLabel lblInscreverse = new JLabel("Inscrever-se");
		lblInscreverse.setFont(new Font("Calibri Light", Font.PLAIN, 18));
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(btnCriarNotcia, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(btnCriarTpico, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
								.addComponent(chckbxNewCheckBox, Alignment.LEADING)
								.addComponent(chckbxTpico_2, Alignment.LEADING)))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGap(33)
							.addComponent(lblInscreverse)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnCriarTpico)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnCriarNotcia)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblInscreverse)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxNewCheckBox)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(chckbxTpico_2)
					.addGap(537))
		);
		panel_3.setLayout(gl_panel_3);
		
		JLabel lblBusca = new JLabel("Busca");
		lblBusca.setFont(new Font("Calibri Light", Font.PLAIN, 20));
		
		tfDataInicial = new JTextField();
		tfDataInicial.setFont(new Font("Calibri Light", Font.PLAIN, 18));
		tfDataInicial.setColumns(10);
		
		tfDataFinal = new JTextField();
		tfDataFinal.setFont(new Font("Calibri Light", Font.PLAIN, 18));
		tfDataFinal.setColumns(10);
		
		JLabel lblDataInicial = new JLabel("Data inicial");
		lblDataInicial.setFont(new Font("Calibri Light", Font.PLAIN, 18));
		
		JLabel lblDataFinal = new JLabel("Data final");
		lblDataFinal.setFont(new Font("Calibri Light", Font.PLAIN, 18));
		
		JLabel lblTpicos = new JLabel("T\u00F3picos");
		lblTpicos.setFont(new Font("Calibri Light", Font.PLAIN, 18));
		
		JCheckBox chckbxTpico = new JCheckBox("T\u00F3pico 1");
		chckbxTpico.setFont(new Font("Calibri Light", Font.PLAIN, 18));
		
		JCheckBox chckbxTpico_1 = new JCheckBox("T\u00F3pico 2");
		chckbxTpico_1.setFont(new Font("Calibri Light", Font.PLAIN, 18));
		
		JButton btnAtualizar = new JButton("Atualizar");
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
								.addComponent(tfDataInicial, GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
								.addComponent(lblDataFinal, Alignment.LEADING)
								.addComponent(tfDataFinal, GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
								.addComponent(lblDataInicial, Alignment.LEADING)
								.addComponent(chckbxTpico_1, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
								.addComponent(chckbxTpico, Alignment.LEADING)))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(34)
							.addComponent(lblBusca))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblTpicos))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnAtualizar)))
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addComponent(lblBusca)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblDataInicial)
					.addGap(1)
					.addComponent(tfDataInicial, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblDataFinal)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(tfDataFinal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnAtualizar)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblTpicos)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(chckbxTpico)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(chckbxTpico_1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(418, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		
		JLabel lblTituloJanela = new JLabel("Ol\u00E1, Leitor | Escritor");
		lblTituloJanela.setFont(new Font("Calibri Light", Font.PLAIN, 27));
		
		JButton btnLogOff = new JButton("Log Off");
		btnLogOff.setFont(new Font("Calibri Light", Font.PLAIN, 18));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(314)
					.addComponent(lblTituloJanela)
					.addPreferredGap(ComponentPlacement.RELATED, 238, Short.MAX_VALUE)
					.addComponent(btnLogOff)
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(5)
					.addComponent(lblTituloJanela))
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(19, Short.MAX_VALUE)
					.addComponent(btnLogOff)
					.addContainerGap())
		);
		panel.setLayout(gl_panel);
		frame.getContentPane().setLayout(groupLayout);
		
		btnLogOff.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Cliente_LogIn cl = new Cliente_LogIn();
				cl.main(null);
				frame.dispose();
			}
		});
		
		btnCriarTpico.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Cliente_Cadastro_Topico cct = new Cliente_Cadastro_Topico();
				cct.main(null);
			}
		});
		
		btnCriarNotcia.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Cliente_Cadastro_Noticia ccn = new Cliente_Cadastro_Noticia();
				ccn.main(null);
			}
		});
		
		btnAtualizar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				String texto = "";
				
				ClienteB b = new ClienteB();
				Servico s = b.getServico();
				
				ArrayList<String> topicoNoticias = new ArrayList<String>();
				ArrayList<String> textoNoticias = new ArrayList<String>();
				
				try {
					topicoNoticias = s.getTopicoNoticias();
					textoNoticias = s.getTextoNoticias();
				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				for(int i= 0;i<topicoNoticias.size();i++){
					texto=texto+"\n\n";
					texto=texto+"T�pico: " + topicoNoticias.get(i);
					texto=texto+"\n";
					texto=texto+"Not�cia: " + textoNoticias.get(i);
					
				}
				taNoticia.setText(texto);
			}
		});
		
	}
}
