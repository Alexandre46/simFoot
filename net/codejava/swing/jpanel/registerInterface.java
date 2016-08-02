package net.codejava.swing.jpanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class registerInterface extends JFrame {

private JTextField jtfFname, jtfLname,jtfUsername, jtfPassword, jtfPassConfirm, jtfEmail;
private JButton exitButton, backButton, clearButton, submitButton;
private JMenuItem jmiBack, jmiClear, jmiSubmit, jmiExit, jmiHelp, jmiAbout;

	registerInterface(){
 //Criar barra de menu
		JMenuBar regMenuBar = new JMenuBar();
		
//set menu bar to the applet
		setJMenuBar(regMenuBar);
		
//add menu "operation" to menu bar
		JMenu optionsMenu = new JMenu("Opcoes");
		optionsMenu.setMnemonic('O');
		regMenuBar.add(optionsMenu);
		
//add menu "help" to menu bar
		JMenu helpMenu = new JMenu("Ajuda");
		 helpMenu.setMnemonic('A');
		helpMenu.add(jmiAbout = new JMenuItem("Sobre", 'S'));
		regMenuBar.add(helpMenu);
//add menu items with mnemonics to menu "options"
		optionsMenu.add(jmiSubmit = new JMenuItem("Submeter", 'S'));
		optionsMenu.add(jmiClear = new JMenuItem("Apagar", 'A'));           
		optionsMenu.add(jmiBack = new JMenuItem("Voltar", 'V')); 
		optionsMenu.addSeparator();
		optionsMenu.add(jmiExit = new JMenuItem("Saida", 'S'));
		
		//Painel P1 tem os textfields
		JPanel p1 = new JPanel(new GridLayout(6,6));
		p1.setBackground(Color.ORANGE);
		p1.add(new JLabel("Primeiro Nome: "));
		p1.add(jtfFname = new JTextField(15));
		p1.add(new JLabel("Ultimo Nome: "));
		p1.add(jtfLname = new JTextField(15));
		p1.add(new JLabel("Email: "));
		p1.add(jtfEmail = new JTextField(15));
		p1.add(new JLabel("Username: "));
		p1.add(jtfUsername = new JTextField(15));
		p1.add(new JLabel("Password: "));
		p1.add(jtfPassword = new JPasswordField(15));
		p1.add(new JLabel("Confirmar Password: "));
		p1.add(jtfPassConfirm = new JPasswordField(15));
		
		//panel p2 tem os botoes
		JPanel p2 = new JPanel(new FlowLayout());
		p2.setBackground(Color.BLACK);
		p2.add(exitButton = new JButton("Sair"));
		p2.add(backButton = new JButton("Voltar"));
		p2.add(clearButton = new JButton("Limpar"));
		p2.add(submitButton = new JButton("Submeter"));
		 
		//Adicionar Paineis ao Frame
		JPanel panel = new JPanel(new GridLayout(2,1));
		panel.add(p1, BorderLayout.CENTER);
		panel.add(p2, BorderLayout.SOUTH);
		add(panel,BorderLayout.CENTER);
		panel.setBackground(Color.RED);
		
		//listners for exit menuitem and button
		jmiExit.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
		System.exit(0);}
		});
		
		exitButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			System.exit(0);
					}
		});
	
		//action listeners for back buttons and redister menuitem
		backButton.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			registerInterface.this.dispose();
			registerInterface.this.setVisible(false);

		}
		});
		
		//Acao para botao Sobre
		jmiAbout.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
		JOptionPane.showMessageDialog(null,
		"É NECESSÁRIO SE REGISTAR PARA TER ACESSO A TODAS AS FUNCIONALIDADES QUE ESTE JOGO DISPOE PARA OS UTILIZADORES",
		"Sobre simFoot", JOptionPane.INFORMATION_MESSAGE);
		  }
		});
		
		//Acao botao Limpar
		clearButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			jtfFname.setText("");
			jtfLname.setText("");
			jtfEmail.setText("");
			jtfUsername.setText("");
			jtfPassword.setText("");
			jtfPassConfirm.setText("");
			}
			});

		 setLocationRelativeTo(null);
		 setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		 setTitle("Register simFoot©");
		 setSize(600, 400);
	}


}
