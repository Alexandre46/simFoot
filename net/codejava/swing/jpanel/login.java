package net.codejava.swing.jpanel;
 
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.*;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
 
/**
 ESTA CLASSE E A QUE TEM A CAIXA DE LOGIN DA APLICAÇAO
 */
@SuppressWarnings("serial")
public class login extends JanelaSaida implements ActionListener{
  
	
	//Criaçao das label, textfield, passfield e botoes 
    JLabel labelUsername = new JLabel("Nome      : ");
    JLabel labelPassword = new JLabel("Password  : ");
    JTextField textUsername = new JTextField(20);
    JTextField fieldPassword = new JPasswordField(20);
    JButton buttonLogin = new JButton("Clique para Entrar");
    JButton regButton = new JButton("Registar");
     
 // Classe Login
  public login() {
         
	  //Config
	  labelUsername.setFont(new Font("Verdana", Font.BOLD, 20));
	  labelPassword.setFont(new Font("Verdana", Font.BOLD, 20));
      labelUsername.setForeground(Color.RED);
      labelPassword.setForeground(Color.RED);
      
	  // create a new panel with GridBagLayout manager
        JPanel newPanel = new JPanel(new GridBagLayout());
         newPanel.setBackground(Color.BLACK);
         
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(10, 10, 10, 10);
         
        // add components to the panel
        constraints.gridx = 0;
        constraints.gridy = 0;  
        newPanel.add(labelUsername, constraints);
 
        constraints.gridx = 1;
        newPanel.add(textUsername, constraints);
         
        constraints.gridx = 0;
        constraints.gridy = 1;     
        newPanel.add(labelPassword, constraints);
         
        constraints.gridx = 1;
        newPanel.add(fieldPassword, constraints);
         
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        newPanel.add(buttonLogin, constraints);
       
        constraints.gridx = 2;
        constraints.gridy = 2;
        constraints.gridwidth = 3;
        constraints.anchor = GridBagConstraints.EAST;
        newPanel.add(regButton,constraints);
   
        //action
        buttonLogin.addActionListener(this);
        
        // set border for the panel
        newPanel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "simFoot © 2015 - Inicio de sessão"));
         
         newPanel.setForeground(Color.RED);
        // add the panel to this frame
        add(newPanel);
        
        pack();
        
        setLocationRelativeTo(null);
        
    

  //Acao para botao de Login !
  
  buttonLogin.addActionListener(new ActionListener(){
  public void actionPerformed(ActionEvent e){
	  				if(( textUsername.getText().equals("")) || (fieldPassword.getText().equals("")))
	  {
	  JOptionPane.showMessageDialog(null, "Preencha todos os campos antes de Ligar-se","Atenção Jogador!",JOptionPane.WARNING_MESSAGE);
       }
                	else
                	{
                	
               	 	setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
               	 	dispose();
                   }
                	
                }
            });
    
   //Acao botao Registar
    	regButton.addActionListener(new ActionListener(){
    		public void actionPerformed(ActionEvent e){
    			registerInterface regFace = new registerInterface();
    			                regFace.setVisible(true);
    			               }
    			});
    	

  
}
  //-------------SAIDA---------------
public static void main(String[] args) {
        
            	new login().setVisible(true);
	
		}
//Fecho da Classe
}   

