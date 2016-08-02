package net.codejava.swing.jpanel;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Date;
import java.util.Random;
import java.io.*;
import sun.audio.*;
import javax.sound.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

import net.codejava.swing.jpanel.TimeFrame.StopWatchPane;




@SuppressWarnings("serial")
class JanelaSaida extends JFrame implements ActionListener {

	//TEMPORIZADOR
	private JLabel timeLabel;
	
	/*
	public void TimerTime()
    {
    
    			Scanner scan = new Scanner(System.in);
    		    System.out.println("Jogo de quantos minutos?");
    		    int timet= scan.nextInt() * 60; // Convert to seconds
    		    long delay = timet * 1000;
    		    do
    		    {
    		      int minutes = timet / 60;
    		      int seconds = timet % 60;
    		      System.out.println(minutes +  seconds);
    		      try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
    		      timet = timet - 1;
    		      delay = delay - 1000;

    		    }
     	       while (delay != 0);
    		    	System.out.println("Acabou!");
    
    }*/
	
	//Definiçao de variaveis Globais para classe
	//MIN = 50 MAX =100
	int min = 50;
	int max = 100;
	
	//Dados para geraçao aleatoria da Imagem da Carta
	//Alterar se mudarmos localizaçao pasta dos futebolistas
	    String prefix = new String("C:\\Users\\Alex\\Desktop\\SimFoot Executable\\Futebolistas");
	    File picDir = new File(prefix);
	    String[] fileNames = picDir.list();
	    int numPix = fileNames.length;
		Random rg = new Random();
	
		
	//Criaçao da Frame
	JFrame janela = new JFrame("simFoot © 2015 ");
	
	//Criaçao do panel
    JPanel pnlButton = new JPanel(new GridLayout(5,1));
    
    //Painel da carta jogador
    JPanel Carta1 = new JPanel();
    JPanel Carta2 = new JPanel();
    JPanel Carta3 = new JPanel();
    JPanel Carta = new JPanel();
    
    //Painel do estadio e arranque jogo
    JPanel pnlstart = new JPanel(new GridLayout(3,0));
    JPanel inicio = new JPanel();
    JPanel inicio2 = new JPanel();
    JPanel timeLabel1 = new JPanel();
    
   
    //Painel da Carta Repetir
    JPanel CartaRepeat = new JPanel();
    
    // Criaçao dos botoes
   JButton start = new JButton("INICIAR");
   JButton about = new JButton("SOBRE");
   JButton exit = new JButton("SAIR");
   
   //Criaçao de botao para gerar carta de jogador
   JButton GerarCarta = new JButton("SORTEAR JOGADOR");
   
 //lABEL COM NOME DO JOGO
   JLabel simFoot = new JLabel ("simFoot © 2015 - Produzido por ALEXANDRE ABREU");
   
   //Labels para carta gerada!!
   JLabel infonome = new JLabel ("Nome Jogador:");
   JLabel info1 = new JLabel ("Velocidade:");
   JLabel info2 = new JLabel ("Remate:");
   JLabel info3 = new JLabel ("Passe:");
   JLabel info4 = new JLabel ("Drible:");
   JLabel info5 = new JLabel ("Resistencia:");
   JButton repeat = new JButton("REPETIR");
   JButton voltar = new JButton("VOLTAR AO MENU");

// Constructor: 
	public JanelaSaida() 
   	{
	
		janela.getContentPane().removeAll();
		Carta1.removeAll();
		Carta2.removeAll();
		
   	  JLabel loginBackground = new javax.swing.JLabel();
	  loginBackground.setIcon(new javax.swing.ImageIcon("C:\\Users\\Alex\\Desktop\\SimFoot Executable\\simFoot.jpg")); //
      loginBackground.setMaximumSize(new java.awt.Dimension(800, 500));
      loginBackground.setMinimumSize(new java.awt.Dimension(800, 500));
      loginBackground.setPreferredSize(new java.awt.Dimension(800, 500));
      add(loginBackground);
      loginBackground.setBounds(400, 400, 400, 200);
	  
    //Invoca a foto que tem estadio
      JLabel campo = new javax.swing.JLabel();
      campo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Alex\\Desktop\\SimFoot Executable\\estadio.jpg")); 
      campo.setMaximumSize(new java.awt.Dimension(400, 200));
      campo.setMinimumSize(new java.awt.Dimension(200, 50));
      campo.setPreferredSize(new java.awt.Dimension(800, 600));
      campo.setSize(new Dimension(campo.getWidth(), campo.getHeight()));
      add(campo);

      
	  //Definiçao do fundo da Frame
      janela.setLayout(new BorderLayout());
       janela.setLocation(200, 100);
       janela.setPreferredSize(new Dimension(1024, 800));
	   janela.add(pnlButton, BorderLayout.CENTER);
	   janela.setTitle("Simulador de Futebol - simFoot © 2015");
	   janela.setBackground(Color.BLACK);
	   janela.add(loginBackground);
	   janela.pack();
	   janela.setVisible(true);
	   
	   //Definicao do fundo do panel
	   pnlButton.setBackground(Color.BLACK);
	   //pnlButton.setBounds(getBounds());
	   
	   
	   // Create a menu and menubar
	    JMenuBar menuBar = new JMenuBar();

	    // Create os menus
	    JMenu menu1 = new JMenu("Ficheiro");
	    JMenu menu = new JMenu("Configurações");
	    JMenu menu2 = new JMenu("Ajuda");
	    
	 // Create a menu item
	    JMenuItem arq1 = new JMenuItem("Abrir Jogador Criado");
	    JMenuItem arq2 = new JMenuItem("Sortear Jogador");
	    JMenuItem arq3 = new JMenuItem("Gravar Jogador");
	    JMenuItem arq4 = new JMenuItem("Fechar programa");
	    
	    JMenuItem opcao1 = new JMenuItem("Imagem");
	    JMenuItem opcao2 = new JMenuItem("Som");
	    JMenuItem opcao3 = new JMenuItem("Controlos");
	 
	    JMenuItem ajuda1 = new JMenuItem("Comandos");
	    JMenuItem ajuda2 = new JMenuItem("Quer sair?");
	    
	    //Adicionar menu a menubar
	    menuBar.add(menu1);
	    menuBar.add(menu);
	    menuBar.add(menu2);
	    
	    //Colocar no menu os items
	    menu1.add(arq1);
	    menu1.add(arq2);
	    menu1.add(arq3);
	    menu1.addSeparator();
	    menu1.add(arq4);
	    
	    menu.add(opcao1);
	    menu.add(opcao2);
	    menu.add(opcao3);
	    
	    menu2.add(ajuda1);
	    menu2.add(ajuda2);
	    
		//adicionar menubar a Jframe
		janela.setJMenuBar(menuBar);
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		//adicionar ao painel inicio
		//inicio.setPreferredSize(new Dimension(800, 600));
		inicio.setBackground(Color.GREEN);
		JLabel startgame = new JLabel("JOGO vai começar em breve!");
		inicio.add(startgame,BorderLayout.PAGE_START);
		inicio.add(campo);
		
		//adicionar ao painel inicio2
		 //Questionar quantos minutos para jogo
		inicio2.setPreferredSize(new Dimension(100, 50));
		
	      JLabel askmin = new JLabel("Quantos Minutos de jogo?      : ");
		  JTextField minutes = new JTextField(6);
		  JButton confirm = new JButton("ARRANCAR JOGO");
		  
		  inicio2.add(askmin);
	      inicio2.add(minutes);
	      inicio2.add(confirm); 
		
	      
	//parametros botao start,sobre,exit,gerar carta
      start.setBounds(100, 100, 500, 500);
      start.setBackground(new java.awt.Color(127,255,212));
      start.setFont(new java.awt.Font("serif", 5, 24));
      start.setForeground(new java.awt.Color(0, 0, 0));
      
      about.setBounds(300, 100 , 300, 300);
      about.setBackground(Color.WHITE);
      
      exit.setBounds(100, 100 , 200,200);
      exit.setBackground(Color.RED);
      
      voltar.setBounds(100, 100 , 200,200);
      voltar.setBackground(Color.GREEN);
      
      GerarCarta.setBounds(300, 100, 200, 200);
      GerarCarta.setBackground(Color.YELLOW);
      GerarCarta.setForeground(new java.awt.Color(0, 250, 142));
      
      
      simFoot.setBounds(200, 50, 100, 100);
      simFoot.setBackground(new java.awt.Color(240, 255, 255));
      simFoot.setForeground(new java.awt.Color(255, 255, 255));
      simFoot.setSize(200,200);
     
      repeat.setBounds(500, 500, 200, 200);
      repeat.setBackground(Color.yellow);
      repeat.setForeground(Color.BLUE);
      repeat.setSize(200, 500);
     
      //Bounds dos paineis do start
      inicio.setBounds(1024, 800, 400, 300);
      inicio.setBackground(Color.GREEN);
      inicio.setPreferredSize( new Dimension(800, 600) );
      
      inicio2.setBounds(800, 10, 10, 10);
      inicio2.setBackground(Color.GREEN);
      inicio2.setPreferredSize( new Dimension(100, 50) );
      
      // JPanel bounds
      pnlButton.setBounds(200, 100, 300, 100);
      pnlButton.setVisible(true);
   
      
       //Adding to JPanel
      pnlButton.add(start,BorderLayout.WEST);
      pnlButton.add(GerarCarta, BorderLayout.CENTER);
      pnlButton.add(simFoot, BorderLayout.EAST);
      pnlButton.add(about, BorderLayout.NORTH);
      pnlButton.add(exit,BorderLayout.SOUTH);
     
      // JPanel do start bounds
      	pnlstart.setLayout(new BoxLayout(pnlstart, BoxLayout.Y_AXIS));
		pnlstart.setBackground(Color.GREEN);
	    pnlstart.setPreferredSize( new Dimension(1024, 800) );
	    pnlstart.setVisible(true);
	   
	       //Adding to JPanel
	      pnlstart.add(inicio2,BorderLayout.PAGE_START);
	      pnlstart.add(inicio,BorderLayout.CENTER);
	      
      //Fixar tamanho do panel para a Frame
      janela.validate();
  
  
    //Accao botao START
      start.addActionListener(new ActionListener(){
    	  public void actionPerformed(ActionEvent e){
    		
    		  new music().hide();
    		  JPanel panelTrocar = new JPanel(new BorderLayout(2,1));
    		  if ( e.getSource() == start ) {
    			  panelTrocar = pnlstart;
    	        	pnlstart.setVisible(true);
    	  }
    		  else{
    			  panelTrocar = pnlstart;
    	        	
    		  }
    		  
    		  	start();
      	       janela. getContentPane().removeAll();
    	       janela. getContentPane().add(panelTrocar);
    	       janela.revalidate();
    	       janela.repaint();
    	       janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    		    
    	  	}
    	  }
    	  );
     
      //Accçao botao confirm dos minutos
      confirm.addActionListener(new ActionListener(){
    	  public void actionPerformed(ActionEvent e){
    	  
    		  
    	  }
    	  
      });
      
      
      //Acao botao Gerar CArta Jogador
      GerarCarta.addActionListener(new ActionListener(){
  	  	public void actionPerformed(ActionEvent e){
  	  		
  	  		
  	        JPanel panelTrocar = null;
  	        if ( e.getSource() == GerarCarta ) {
  	        	panelTrocar = Carta;
  	        	Carta.setVisible(true);
  	        	
  	        }
  	        else {
  	          panelTrocar = pnlButton;
  	        }
  	       GerarCarta();
  	        janela. getContentPane().removeAll();
  	       janela. getContentPane().add( panelTrocar );
  	       
  	       //janela.pack();
  	       janela.validate();
  	       //janela.repaint(); 
  	       janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  	    }
  	  		 
  		}
      );
      
      
    
      //Acao botao repeat
      repeat.addActionListener(new ActionListener(){
    	
		public void actionPerformed(ActionEvent e){
    		  
    		  JPanel panelTrocar2 = null;
   	        if ( e.getSource() == repeat ) { 
   	        	panelTrocar2=CartaRepeat;
   	        }
   	        else {
   	           panelTrocar2 = Carta;
   	        
   	        }
   	        
   	        CartaRepetir();
   	       janela. getContentPane().removeAll();
 	       janela. getContentPane().add(panelTrocar2);
 	       janela.revalidate();
 	       janela.repaint();
 	       janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	       
    	  }
      });
      
      //Acao botao Gerar Menu Aqruivo -> Sorteio CArta Jogador
      arq2.addActionListener(new ActionListener(){
  	  	public void actionPerformed(ActionEvent e){
  	  	   janela. getContentPane().removeAll();
   	       janela. getContentPane().add(Carta);
   	       janela.validate();
   	       janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  	  	}
      }
  	  	);	 
  		
    
    //Programaçao do menu Ajuda1 - COMANDOS
      ajuda1.addActionListener(new ActionListener(){
    	  public void actionPerformed(ActionEvent e){
    		  JOptionPane.showMessageDialog(null,
    		 "Movimento do Rato - Selecionar as opçoes,\n"
    		 + "MOUSE1 - Clicar como ENTER \n "
    		 + "ALT+F4 - Sair do Jogo",
    				 "simFoot © 2015", JOptionPane.INFORMATION_MESSAGE);
    	  }
      });
      
      //Programaçao do menu Ajuda2 - QUER SAIR?
      ajuda2.addActionListener(new ActionListener(){
    	  public void actionPerformed(ActionEvent e){
    		  JOptionPane.showMessageDialog(null,
    		 "Clique em SAIR no menu principal \nSe quiser sair a qualquer altura pressione ALT+F4",
    				 "simFoot © 2015", JOptionPane.INFORMATION_MESSAGE);
    	  }
      });
      
      //Accao botao About
      about.addActionListener(new ActionListener(){
    	  public void actionPerformed(ActionEvent e){
    		  JOptionPane.showMessageDialog(null,
    		 "Jogo criado no ano de 2015 pelo Engº Alexandre Abreu,\n"
    		 + "com o intuito de desenvolver a linguagem Java",
    				 "simFoot © 2015", JOptionPane.INFORMATION_MESSAGE);
    	  }
      });
      //Acao Botao Exit
      exit.addActionListener(new ActionListener(){
    	  	public void actionPerformed(ActionEvent e){
    	  			System.exit(0);
    	  			}});
      
    //Acao Botao Voltar ao menu
      voltar.addActionListener(new ActionListener(){
    	  	public void actionPerformed(ActionEvent e){
    	  		janela.setVisible(false);
                janela.dispose();
    	  			new JanelaSaida();
    	  			}});
      
      //Acao MenuItem Fechar Programa
      arq4.addActionListener(new ActionListener(){
    	   public void actionPerformed(ActionEvent e){
    		   	System.exit(0); 
    		   	} 
    	   }
      );
     
      //Acao MenuItem Abrir Registo
      arq1.addActionListener(new ActionListener(){
    	   public void actionPerformed(ActionEvent e){
    		   ProcessBuilder pb = new ProcessBuilder("Notepad.exe", "C:\\Users\\Alex\\Desktop\\simFoot\\GamePlayers\\escolhasJOG.txt");
    		   try {
				pb.start();
			} catch (IOException e1) {
				e1.printStackTrace();
				System.out.println("Ups, Aconteceu um Erro.");
			}
    	   } 
    	 }
      );
      
      //Accao do menu SOM
      
      opcao2.addActionListener(new ActionListener(){
    	  public void actionPerformed(ActionEvent e){
    		  new music();
    		  	 
    	       
    	  }
      }	   
		
  );
  
      
  }	
	  
	
	   //Funçao para limpar Carta Jogador
	   
	   private void clear() {
	       removeAll();
	       revalidate();
	       
	  }
	   
	   
	//Funcao para gerar a Carta Jogador
	private void GerarCarta(){
		 
		//Quando voltar a ser chamada funcao para garantir que apaga os componentes da 
		//carta e coloca novos
		
	    
		//Definicao do aspeto do panel da carta
			Carta.removeAll();
		   Carta.setLayout(new BorderLayout());
		   Carta.setBackground(Color.BLACK);
		   
		   Carta1.setBackground(Color.BLACK);
		   Carta2.setBackground(Color.BLACK);
		   Carta3.setBackground(Color.BLACK);
		   
		   Carta.add(Carta1,BorderLayout.PAGE_START);
		   Carta.add(Carta2,BorderLayout.CENTER);
		   Carta.add(Carta3,BorderLayout.PAGE_END);
		   
		   
		   Carta.setPreferredSize(new java.awt.Dimension(500, 300));
		   Carta.setMaximumSize(new Dimension(600, 400));
		   
		   Carta1.removeAll();
		   Carta2.removeAll();
		   
		//CArta 1 = FOTO jogador + Nome Jogador   
		   //Adicionar imagem da carta
		   ImageIcon[] imageArray = new ImageIcon[numPix];
		   int x;
		   for(x=0; x<imageArray.length; x++)
			  imageArray[x] = new ImageIcon(prefix+"\\"+fileNames[x]);
		   int value = rg.nextInt(numPix);
		   JLabel pic = new JLabel(imageArray[value]);
		   Carta1.add(pic);

	 
		   //Label que fica no topo a frente da imagem com Nome jogador 
		   //Criaçao de fonte
		   Font myFont1 = new Font(Font.DIALOG, Font.BOLD, 18);
		   infonome.setForeground(Color.white);
		   infonome.setFont(myFont1);
		   Carta1.add(infonome);
		   
		   
		   //Configurar nome a aparecer que e o do Ficheiro gerado:
		   String name = fileNames[value];
		   
		   int index = name.lastIndexOf('.');
		   if (index != -1)
		     name = name.substring(0, index);
		   System.out.println("Nome Jogador: " +name);
		   JLabel nomejogador = new JLabel();
		   nomejogador.setText(name);
		   Carta1.add(nomejogador);
		   nomejogador.setForeground(Color.white);
		
		   
		 //Carta 2 = Velocidade, Remate.... e botao Repetir  
		   // Label com info da VELOCIDADE
		   Carta2.add(info1);
		   info1.setForeground(Color.RED);
		   JLabel result1 = new JLabel();
		   //Colocar na JLabel o valor random entre min e max
		   result1.setText(String.valueOf(rg.nextInt(max-min+1)+min));
		   result1.setForeground(Color.WHITE);
		   Carta2.add(result1);
		   
		   //Label com info do REMATE
		   Carta2.add(info2);
		   info2.setForeground(Color.red);
		   JLabel result2 = new JLabel();
		   result2.setText(String.valueOf(rg.nextInt(max-min+1)+min));
		   result2.setForeground(Color.WHITE);
		   Carta2.add(result2);
		   
		   // Label com info do Passe
		   Carta2.add(info3);
		   info3.setForeground(Color.RED);
		   JLabel result3 = new JLabel();
		   result3.setText(String.valueOf(rg.nextInt(max-min+1)+min));
		   result3.setForeground(Color.WHITE);
		   Carta2.add(result3);
		   
		   //Label com info da Drible
		   Carta2.add(info4);
		   info4.setForeground(Color.red);
		   JLabel result4 = new JLabel();
		   result4.setText(String.valueOf(rg.nextInt(max-min+1)+min));
		   result4.setForeground(Color.WHITE);
		   Carta2.add(result4);
		   
		   //Label com info da Resistencia
		   Carta2.add(info5);
		   info5.setForeground(Color.red);
		   JLabel result5 = new JLabel();
		   result5.setText(String.valueOf(rg.nextInt(max-min+1)+min));
		   result5.setForeground(Color.WHITE);
		   Carta2.add(result5);
		
		   //Adicionar os botes repetir e saida a carta3
		   Carta3.add(repeat);
		   Carta3.add(voltar);
		   Carta3.add(exit);
	}
 
	private void CartaRepetir(){
		
		//Definicao do aspeto do panel da carta
		//janela.getContentPane().removeAll();
		//janela.getContentPane().add(CartaRepeat);
		
		
		   CartaRepeat.setLayout(new BorderLayout());
		   CartaRepeat.setBackground(Color.BLACK);
		   Carta1.setBackground(Color.BLACK);
		   Carta2.setBackground(Color.BLACK);
		   CartaRepeat.add(Carta1,BorderLayout.PAGE_START);
		   CartaRepeat.add(Carta2,BorderLayout.CENTER);
		   CartaRepeat.add(Carta3,BorderLayout.PAGE_END);
		   
		   CartaRepeat.setPreferredSize(new java.awt.Dimension(500, 300));
		   CartaRepeat.setMaximumSize(new Dimension(600, 400));
		
		   Carta1.removeAll();
		   Carta2.removeAll();
		   
		   //Adicionar imagem da carta
		   ImageIcon[] imageArray = new ImageIcon[numPix];
		   int x;
		   for(x=0; x<imageArray.length; x++)
			  imageArray[x] = new ImageIcon(prefix+"\\"+fileNames[x]);
		   int value = rg.nextInt(numPix);
		   JLabel pic = new JLabel(imageArray[value]);
		   
		   Carta1.remove(pic);
		   Carta1.add(pic);
	
		
		//Label que fica no topo a frente da imagem com Nome jogador 
		   //Criaçao de fonte
		   Font myFont1 = new Font(Font.DIALOG, Font.BOLD, 18);
		   infonome.setForeground(Color.white);
		   infonome.setFont(myFont1);
		   Carta1.add(infonome);
		   
		   
		   //Configurar nome a aparecer que e o do Ficheiro gerado:
		   String name = fileNames[value];
		   
		   int index = name.lastIndexOf('.');
		   if (index != -1)
		     name = name.substring(0, index);
		   System.out.println("Nome Jogador: " +name);
		   JLabel nomejogador = new JLabel();
		   nomejogador.setText(name);
		   Carta1.add(nomejogador);
		   nomejogador.setForeground(Color.white);
		
		   
		 //Carta 2 = Velocidade, Remate.... e botao Repetir  
		   // Label com info da VELOCIDADE
		   Carta2.add(info1);
		   info1.setForeground(Color.RED);
		   JLabel result1 = new JLabel();
		   //Colocar na JLabel o valor random entre min e max
		   result1.setText(String.valueOf(rg.nextInt(max-min+1)+min));
		   result1.setForeground(Color.WHITE);
		   Carta2.add(result1);
		   
		   //Label com info do REMATE
		   Carta2.add(info2);
		   info2.setForeground(Color.red);
		   JLabel result2 = new JLabel();
		   result2.setText(String.valueOf(rg.nextInt(max-min+1)+min));
		   result2.setForeground(Color.WHITE);
		   Carta2.add(result2);
		   
		   // Label com info do Passe
		   Carta2.add(info3);
		   info3.setForeground(Color.RED);
		   JLabel result3 = new JLabel();
		   result3.setText(String.valueOf(rg.nextInt(max-min+1)+min));
		   result3.setForeground(Color.WHITE);
		   Carta2.add(result3);
		   
		   //Label com info da Drible
		   Carta2.add(info4);
		   info4.setForeground(Color.red);
		   JLabel result4 = new JLabel();
		   result4.setText(String.valueOf(rg.nextInt(max-min+1)+min));
		   result4.setForeground(Color.WHITE);
		   Carta2.add(result4);
		   
		   //Label com info da Resistencia
		   Carta2.add(info5);
		   info5.setForeground(Color.red);
		   JLabel result5 = new JLabel();
		   result5.setText(String.valueOf(rg.nextInt(max-min+1)+min));
		   result5.setForeground(Color.WHITE);
		   Carta2.add(result5);
		
		 //Adicionar os botes repetir e saida a carta3
		   Carta3.add(repeat);
		   Carta3.add(voltar);
		   Carta3.add(exit);
	}
	
	//Funçao para o inicio
	@SuppressWarnings("unused")
	private void start(){

			janela.setLayout(new BorderLayout(3,0));
	       janela.setLocation(200, 100);
	       janela.setPreferredSize(new Dimension(1024, 800));
	       janela.add(pnlstart,BorderLayout.CENTER);
		   janela.setTitle("Jogo a decorrer ....");
		   janela.setBackground(Color.BLACK);
		   janela.pack();
		   janela.setVisible(true); 
		   
		 //  timeLabel1.add(timeLabel, BorderLayout.NORTH);
		 //  janela.add(timeLabel1,BorderLayout.NORTH);
		   
		   new TimeFrame().setVisible(true);
		  
		   
	     
	}


 
	

	//!!! Funcao principal saida da Aplicaçao  !!!
 
public static void main(String[] args) {
	
	new JanelaSaida();
	
	
	
}


private static void JavaAudioPlaySoundExample() {
		// TODO Auto-generated method stub
		
	}


@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	timeLabel.setText( new Date().toString() );
		} 

} 

