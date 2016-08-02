import java.io.*;
import java.util.Random;
import java.util.Scanner;
import java.awt.*;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

// ------------ main ------------------

public class main extends Jogador{

	static Object[] opcoes = { "sim", "não" };
    static Object resposta;
	private static Object[] nacionalidades;
	static Object[] options = {"Sim, por favor","Nem pensar!"};
	
	


	//meotodo para limpar o ecra, basta depois invocar este metodo cls()
		public static void clr(){ 
			{
				for(int i = 0; i < 25; i++)
				System.out.println("");
			}
				 
		}		

		//metodo para ler o que esta sendo introduzido
		public static void lerKey(){
			Scanner inicio = new Scanner(System.in);
			inicio.next().charAt(0);
			inicio.close();
		}

		//metodo a simulaçao de um Jogador
		public static void simulaPlayer(){
			clr();
			infoPlayers();
			System.out.println("\n");
			//System.out.println("++++++++++++++++ \n");
			System.out.println("Simular novo Jogador?");
			System.out.println("Se teclar Y seguido de Enter entao ira gerar um novo jogador");
			System.out.println("Se teclar N seguido de enter ira sair desta opcao e retornar menu inicial");
			Scanner inicio = new Scanner(System.in);
			char c = inicio.next().charAt(0);
			if(c =='Y'|| c=='y'){
				clr();
				infoPlayers();
				System.out.println("++++++++++++++++ \n");
				System.out.println("Simular novo Jogador?");
				System.out.println("Se teclar Y seguido de Enter entao ira gerar um novo jogador");
				System.out.println("Se teclar N seguido de enter ira sair desta opcao e retornar menu inicial");
				
			}
			else if(c=='N' || c=='n'){
				main(null);
				
			}
			else{
				JOptionPane.showMessageDialog(null,
					    "Não é opção isso e como tal programa encerra! SimFoot© 2015");
				System.exit(1);
			}
			
		}
		
		//metodo para criar os 11 elementos apenas
		public static void simulaPlantel(){
			/*System.out.println("____________________________________________ \n");
			System.out.println("Jogador 1 - Guarda Redes");
			infoPlayers2();
			System.out.println("\n");
			
			System.out.println("____________________________________________ \n");
			System.out.println("Jogador 2 - Defesa esquerdo");
			infoPlayers2();
			System.out.println("\n");
			
			System.out.println("____________________________________________ \n");
			System.out.println("Jogador 3 - Defesa Central");
			infoPlayers2();
			System.out.println("\n");
			
			System.out.println("____________________________________________ \n");
			System.out.println("Jogador 4 - Defesa Central");
			infoPlayers2();
			System.out.println("\n");
			
			System.out.println("____________________________________________ \n");
			System.out.println("Jogador 5 - Defesa Direito");
			infoPlayers2();
			System.out.println("\n");
			
			System.out.println("____________________________________________ \n");
			System.out.println("Jogador 6 - Medio Esquerdo");
			infoPlayers2();
			System.out.println("\n");
			
			System.out.println("____________________________________________ \n");
			System.out.println("Jogador 7 - Medio Centro");
			infoPlayers2();
			System.out.println("\n");
			
			System.out.println("____________________________________________ \n");
			System.out.println("Jogador 8 - Medio Centro");
			infoPlayers2();
			System.out.println("\n");
			
			System.out.println("____________________________________________ \n");
			System.out.println("Jogador 9 - Medio Direito");
			infoPlayers2();
			System.out.println("\n");
			
			System.out.println("____________________________________________ \n");
			System.out.println("Jogador 10 - Avançado");
			infoPlayers2();
			System.out.println("\n");
			
			System.out.println("____________________________________________ \n");
			System.out.println("Jogador 11 - Ponta-de-Lança");
			infoPlayers2();
			System.out.println("\n");
			*/
			infoPlayers2();
			
			
		}
		//PPPPPPPPPPPPPPPPPPPmainLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL
		
		public static void main(String[] args) {
			
			new Clube();
			new Jogador();
			String[] Clubescreate = {"xxy","DreamTeam","madeye","CSK","Los Matadores","Las chiquititas",
					"COLOCOLO","CHUCHAS","FuraC*","WTF*#","TaSeTudoAPassar","YORN+","MEOMERDA","PTFUD**",
					"WortenSempre","FNC","PHONE+","iNSTAclub","SLBGlorioso","osERVILHAS","osLunaticos",
					"osFDDs","GalaticosFC","PTeam","sensyFC","Ladeira FC"};
			
			//APRESENTA NO ECRA ENTRADA DO JOGO
			System.out.println("\n");
			System.out.println("\n");
			System.out.println(" |             / _____        ____   _____   |      /| _____     ");
			System.out.println("  |           /  |      |     |      |    |  | |   / | |         ");
			System.out.println("   |    /|   /   |____  |     |      |    |  |  | /  | |____     ");
			System.out.println("    |  / |  /    |      |     |      |    |  |   /   | |         ");
			System.out.println("     |/   |/     |____  |____ |____  |____|  |       | |____     ");
			System.out.println("                                                                 ");
			System.out.println("                                                                 ");
			System.out.println("                         _____                                   ");
			System.out.println("                              |                                  ");
			System.out.println("                          ____|                                  ");
			System.out.println("                         |                                       ");
			System.out.println("                         |_____                                  ");
			System.out.println("                                                                 ");
			System.out.println("                                                                 ");
			System.out.println(" _____   _ _               ___   ______    ______    ________    ");
			System.out.println(" |        |    |l     l|  |     |      |  |      |       |       ");
			System.out.println(" |        |    | l   l |  |     |      |  |      |       |       ");
			System.out.println("  ----    |    |  l l  |  |---  |      |  |      |       |       ");
			System.out.println("      |   |    |   l   |  |     |      |  |      |       |       ");
			System.out.println("  ____|  _|_   |       |  |     |______|  |______|       |       ");
			System.out.println("                                                                 ");
			System.out.println("\n");
			System.out.println("\n");

			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<");
			System.out.println(" >>              PRESS ANY KEY TO ENTER               <<");
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<\n");
			System.out.println(" Pressione tecla Q/q para sair \n");
			
			//Mensagem para o User
			JOptionPane.showMessageDialog(null,
				    "DIGA NAO À PIRATARIA !   SimFoot© 2015");
			
			//Novamente criar um Scanner para ler INput do keyboard
			Scanner entra = new Scanner(System.in);
			char co = entra.next().charAt(0);
			
			//Verificar qual acao que USER quer se e jogar ou sAir
			if(co=='Q' || co=='q'){
				//JOptionPane.showMessageDialog(null,"Aplicaçao SimFoot fechada com sucesso");
				int n = JOptionPane.showOptionDialog(null,
					    "Tem mesmo certeza que quer sair do jogo?",
					    "Escolha qual opção",
					    JOptionPane.YES_NO_OPTION,
					    JOptionPane.QUESTION_MESSAGE,
					    null,     //do not use a custom Icon
					    options,  //the titles of buttons
					    options[1]); //default button title
				
				if (n==JOptionPane.YES_OPTION){
				JOptionPane.showMessageDialog(null, "Adeus, até à próxima");
				System.exit(0);
				}
				else{
					main(null);
				}
			}
			else{
				
			
			//pedir nome do user
			String username = null;
		    while (username == null || username.equals("") || username.equals(" "))
		    {	
		    	username = JOptionPane.showInputDialog(null, "Digite o seu nome", "SimFoot@2015", JOptionPane.PLAIN_MESSAGE);
		    	if (username == null || username.equals("")|| username.equals(" ")) 
		    	{
		    		JOptionPane.showMessageDialog(null,"Digite seu nome para avançarmos!","NOME NAO ENCONTRADO",
		    			    JOptionPane.WARNING_MESSAGE);
		      }
		    }
		    JOptionPane.showMessageDialog(null, "Seu nome:  " +username);
		    
			//apresentar ecra com opcoes	
			System.out.println(" :::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
			System.out.println(" :::::::::::::::::::::  SimFoot ©  :::::::::::::::::::::");
			System.out.println(" :::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
			System.out.println(" ::::::::::::: SIMULADOR DE FUTEBOL VIRTUAL  ::::::::::::::::::");
			System.out.println(" :::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
			System.out.println(" »»»»»»»»»»»»»»»»»»»» USER:"  +username +" «««««««««««««««««««««" );
			System.out.println(" :::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
			System.out.println(" :::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
			System.out.println(" :::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
			System.out.println(" ::::::::::::::::::::::  MENU  :::::::::::::::::::::::::::");
			System.out.println(" :::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
			System.out.println(" :::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
			System.out.println("           PRESSIONE UMA DAS SEGUINTES TECLAS(1-9)        ");
			System.out.println("           PRESSIONE ENTER PARA FINALIZAR OPCAO           ");
			System.out.println(" :::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
			System.out.println(" ::::::::::::::::::::::JOGADORES::::::::::::::::::::::::::");
			System.out.println("           1 -> GERAR JOGADOR ALEATORIO                   ");
			System.out.println("         1.1 -> GERAR JOGADOR LENDARIO                    ");
			System.out.println("           2 -> CRIAR MEU JOGADOR                         ");
			System.out.println(" ::::::::::::::::::::::EQUIPAS::::::::::::::::::::::::::::");
			System.out.println("           3 -> GERAR PLANTEL DE 11 JOGADORES             ");
			System.out.println("         3.1 -> GERAR PLANTEL DE 11 LENDARIOS             ");
			System.out.println("           N -> CONSTRUIR MEU PLANTEL                     ");
			System.out.println(" ::::::::::::::::::::::OPÇOES::::::::::::::::::::::::::::");
			System.out.println("           7 -> COMANDOS DO JOGO                         ");
			System.out.println("           8 -> SOBRE O CRIADOR                          ");
			System.out.println("           9 -> SAIR DO JOGO                              ");
			System.out.println(" :::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
			System.out.println(" :::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
			
			}	
			
			//funcao de detectar o que se escreve
			Scanner scan = new Scanner(System.in);
			int num=scan.nextInt();
			System.out.println("\n");
			
			
			//Opçao 1 -> para gerar um jogador do sistema	
			if (num==1){
		
			while(true){
				String question = scan.nextLine();
			//clr();	
			simulaPlayer();
			
						}
			}
			
			//opçao tomada numero 2 = o user CRIAR o seu proprio Jogador
			if(num==2){
	   //Dares o nome ao Jogador 
				String nome = null;
			    while (nome == null || nome.equals("") || nome.equals(" "))
			    {	
			    	nome = JOptionPane.showInputDialog(null, "Qual o nome do Jogador que quer criar?", "SimFoot@2015", JOptionPane.PLAIN_MESSAGE);
			    	if (nome == null || nome.equals("")|| nome.equals(" ")) {
			    		JOptionPane.showMessageDialog(null,
			                    "Você não quer criar o Jogador? Vamos lá! digite o nome pretendido","Inane error",
			                    JOptionPane.ERROR_MESSAGE);
			      }
			    }
			    JOptionPane.showMessageDialog(null, "Nome do Jogador é " + nome);
			    
		//Dares a idade ao Jogador 
			    int IDD =0;
			    String errorMessage = "";
			    do {
			        // Temos que fazer o parseInt
			        String stringInput = JOptionPane.showInputDialog(errorMessage + "Introduz a idade do jogador", "Numero inteiro entre [18,40]");
			        try {
			            int numberIDD = Integer.parseInt(stringInput);
			            JOptionPane.showMessageDialog(null, "Idade do Jogador é: " + numberIDD + ".");
			            errorMessage = ""; // Nao há erros
			            IDD=numberIDD;
			                
			        } 
			        catch (NumberFormatException e) {
			            // Se nao for um inteiro da msg erro
			        	{
			      JOptionPane.showMessageDialog(null, "O que escreves-te não é um inteiro!Tens que por um INTEIRO entre 18 e 40 (Idades normais dos jogadores futebol)");}
			        	}
			    } 
			    
			    while (!errorMessage.isEmpty() );
			    
			    //Colocar Nacionalidade
			    String[] nacion = {"Portugues", "Brasileiro","Argentino","Frances","espanhol","Suiço","Tailandes","Nigeriano"
						,"bulgaro","Grego","Italiano","Alemao","Ingles","Sueco","Polaco","Dinamarques",
						"Venezuelano","Croata","Checo","Japones","Chines","Angolano",
						"Belga","Equatoriano","Israelita","Turco"};
			   
			    //Usando comboBox inves de chatear USER a digitar Nacionalidade
			    
			    JFrame frame = new JFrame("Selecione qual a Nacionalidade do Jogador");
			    String nacao = (String) JOptionPane.showInputDialog(frame, 
			        "Qual a nacionalidade do Jogador?",
			        "Nacionalidade",
			        JOptionPane.QUESTION_MESSAGE, 
			        null, 
			        nacion, 
			        nacion[0]);
			    
			    
			  //Colocar Clube Jogador
			    String[] ClubesCHOOSE = {
			    		"SL Benfica", "FC Porto","Sporting CP","CS Maritimo","CD Nacional","Real Madrid","AC Milan","FC Barcelona","Arsenal","Liverpool","Manchester United","Andorinha","Aston Villa","Ajax"
		    	,"Colo Colo","Inter","Roma","Fiorentina","Bayer Munich","Estrela Amadora","Dinamo Moscovo","Boca Juniors","Hamburger SV","Botafogo","cruzeiro","Sao Paulo"
		    	,"Braga","Gil Vicente","Uniao da Madeira","Chelsea"
		    	,"AD Camacha","Fiorentina","Juventus","Black Rovers"		
			    };
			    
			    JFrame frame2 = new JFrame("Selecione qual o clube do Jogador");
			    String escolhaclube = (String) JOptionPane.showInputDialog(frame2, 
			        "Qual o clube do Jogador?",
			        "Clube",
			        JOptionPane.QUESTION_MESSAGE, 
			        null, 
			        ClubesCHOOSE, 
			        ClubesCHOOSE[0]);
			//Colocar classificaçao do jogador
			    int urrating = 0;
			    String errorMessage2 = "";
			    do {
			        // Temos que fazer o parseInt
			        String stringInput2 = JOptionPane.showInputDialog(errorMessage + "Introduz a classificacao do Jogador [0 a 100]", "Numero inteiro entre [0,100]");
			        try {
			            int numerRating = Integer.parseInt(stringInput2);
			            JOptionPane.showMessageDialog(null, "Classificacao [0,100] : " + numerRating + ".");
			            errorMessage2 = ""; // Nao há erros
			            urrating=numerRating;
			                
			        } 
			        catch (NumberFormatException e) {
			            // Se nao for um inteiro da msg erro
			        	{
			      JOptionPane.showMessageDialog(null, "O que escreves-te não é um inteiro!Tens que por um INTEIRO entre 0 e 100");}
			        	}
			    } 
			    
			    while (!errorMessage2.isEmpty() );
			    
			    
			    //Aprensentar no ecra os resultados da criaçao do user
			    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
			    System.out.println("               Resultado do jogador criado por si!                 ");
			    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n");
			    
			    System.out.println("Nome                  : " +nome);
			    System.out.println("Idade                 : " +IDD);
			    System.out.println("Nacionalidade         : " +nacao);
			    System.out.println("Clube                 : " +escolhaclube);
			    System.out.println("Classificaçao[0,100]  : " +urrating);
			    System.out.println("");
			    System.out.println("\n");
			    
			    //Gravar escolhas num TXT para user ter acesso
			    
			    File file =new File("escolhasJOG.txt");
			    try{
			    	FileWriter file_writer = new FileWriter (file);
			    	BufferedWriter buf_writer = new BufferedWriter (file_writer);
			    	PrintWriter print_writer = new PrintWriter (buf_writer);
			    	
			    	print_writer.println("SimFoot Alexandre Abreu © 2015 \n");
			    	print_writer.println(" ");
			    	print_writer.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
			    	print_writer.println("               Resultado do jogador criado por si!                 ");
			    	print_writer.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<\n");
			    	print_writer.println("Nome                 : " +nome);
			    	print_writer.println("Idade                : " +IDD);
			    	print_writer.println("Nacionalidade        : " +nacao);
			    	print_writer.println("Clube Jogador        : " +escolhaclube);
			    	print_writer.println("Classificação[0,100] : " +urrating);
			    	print_writer.println(" ");
			    	
			    	print_writer.println("Divirta-se criando mais jogadores!");
			    	print_writer.println("Copyright@SimFoot - Alexandre Abreu");
			    	//libertar escrita no ficheiro
			    	print_writer.flush();
			    	//Fechar Ficheiro
			    	print_writer.close();
			    }
			    catch (IOException ioe){
			    	System.out.println("IO Exception");
			    	}
			    
			
			    
			    resposta = JOptionPane.showInputDialog(null,
                        "Deseja finalizar o programa?",
                        "Finalização",
                        JOptionPane.PLAIN_MESSAGE,
                        null,
                        opcoes,
                        "não");
			    if (resposta=="sim"){
			    	System.out.println("ADEUS, ATE A PROXIMA!");
					System.exit(0);
				}
			    else {
			    	System.out.println("Vamos lá para mais uma rodada! O jogo irá iniciar novamente");
			    	main(null);
			    }
			   
			
		}
			//Opçao 3 -> tomada para Gerar Plantel 11 JOGADORES
			else if(num==3){
				
				//Dar um nome random da lista de Array que tem nomes ja predefinidos
				String currentClub;
				Random rand = new Random();
				int rnd = rand.nextInt( Clubescreate.length);
				int randomNum = rnd*(int)Math.random();
				currentClub = Clubescreate [rnd];
				System.out.println("Vamos lá criar o teu clube !! \n");
				
				for (int i=0; i<10; i++){
				System.out.println("...................................");
				}
				System.out.println(" ");
				System.out.println("Nome do teu CLUBE : " +currentClub);
				System.out.println("\n");
				
				//vai buscar esta funçao que simula um Plantel com 11 ELEMENTOS
				simulaPlantel();
				
			}
			//opcao 7 = Controlos do jogo
			else if (num==7){
				System.out.println("::::: COMANDOS DO JOGO :::::");
				System.out.println("SELECIONAR OPCOES: ");
				System.out.println("Teclas numericas : 1 a 9");
				System.out.println("SAIR DO JOGO: ");
				System.out.println("Pressionar teclas: Alt+F4");
				try {
					new Thread().sleep(6000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				main(null);
			}
			//Opçao tomada numero 8 para saber dados de mim e do JOGO
			else if (num==8){
				System.out.println("SimFoot v1.1.14.03.2015");
				System.out.println("SimFoot versao actual v1.1.26.11.2015");
				System.out.println("Jogo inicialmente pensado em 2014/15");
				System.out.println("Desenvolvido por Alexandre Abreu - natural do Funchal -  nascido em 1990");
				System.out.println("Licenciado em Eng Informatica - Universidade da Madeira");
				System.out.println("Sendo programado em JAVA - linguagem que tem preferencia por diversos motivos.");
				System.out.println("Adora informatica, musica ,cinema,futebol,entre outros.");
				System.out.println("para qualquer informaçao adicional email: Alexandreabreu46@hotmail.com");
				System.out.println("Outra opçao de contacto é atraves do Skype: Alexandreabreu46");
				System.out.println("Copyright Alexandre Abreu");
				// Funcao temporal de 4ms e aparece seguinte info
				try {
					new Thread().sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				//Teclar ENTER para limpar 1 e depois sair do programa
				System.out.println("");
				System.out.println("Pressione ENTER para sair");
				String input = scan.nextLine();
				input = scan.nextLine();
				if (input.equals(""))
						{
					//clr();
					System.out.println("Adeus, vemo-nos em breve");
					System.exit(0);
						}
			}
			//Opçao tomada numero 9 para sair do jogo
			else{
				System.out.println("----------------------------");
				System.out.println(" SimFoot - Simulaçao Futebol");
				System.out.println(" Alexandre Abreu © 2015     ");
				System.out.println("----------------------------");
				System.out.println(" Sugestões são bem vindas   ");
				System.out.println(" Esperamos por si brevemente");
				System.out.println("-----------Adeus-------------");
				for (int i=0 ; i<50 ; i++){
					System.out.println(" ENCERRANDO ..... ");
				}
				//funcao temporal de 4ms e depois passa ao pressione ...
				try {
					new Thread().sleep(4000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 
				System.out.println("");
				System.out.println("      F E C H A D O      ");
				System.out.println("      SimFoot © 2015     ");
				System.out.println("----------------------------");
			
				
				System.exit(0);
				/*Teclar ENTER para limpar 1 e depois sair do programa
				System.out.println("");
				System.out.println("Pressione ENTER para sair");
				String input = scan.nextLine();
				input = scan.nextLine();
				if (input.equals(""))
						{
					//clr();
					System.out.println("Adeus, vemo-nos em breve");
					System.exit(0);
						}
			*/	
			}
		}

	}	


