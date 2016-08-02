import java.lang.*;
import java.util.*;
import java.io.*;
import static java.lang.System.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;




public class Jogador extends Clube{

 String[] posicoes2 = {"Guarda-Redes", "Defesa Direito","Defesa esquerdo","Defesa central","Medio defensivo","Medio Centro","Medio Ofensivo","Medio Esquerdo","Medio Direito","Lateral esquerdo","Lateral direito","Extremo Esquerdo","Extremo direito","Avancado"};

	//atributos
		private String nome;
		private int idade;
		private String clube;
		//private String nacionalidade;
		
		//CONSTRUTOR		
		public Jogador(){
			nome=new String("Unknown Player");
			idade=0;
			clube=new String("Desconhecido o Clube");
		}
		
		public Jogador(String n, String c){
			nome=new String(n);
			idade=00;
			clube=new String(c);
		}
		
		//retornar nome jogador
		public String getNome(){
			return nome;
		}
		
		//definir qual nome do jogador
		public void setNome(String n){
			nome = n;
		}
		
		//Retornar idade do jogador
		public int getIdade(){
			return idade;
		}
		
		//Definir qual a idade do jogador
		//Void porque e para definir apenas,NAO retorna NADA
		public void setIdade(int i){
			idade=i;
		}
		
		//Retornar clube do jogador
		public String getClube(){
			return clube;
		}
		
		//Definir qual o clube
		public void setClube(String c){
			clube=c;
		}
		
	/*	public String getNacionalidade(){
			return nacionalidade;
		}
		
		public void setNacionalidade(String nac){
			nacionalidade=nac;
		}
	*/	
		//Representar Nacionalidade dos Jogadores
		public static String geraNacao(){ //saida de texto representando o objeto
			String[] nacionalidades = {"Portugues", "Brasileiro","Frances","espanhol",
					"bulgaro","Grego","Italiano","Alemao","Ingles","Sueco","Polaco","Dinamarques",
					"Venezuelano","Croata","Checo","Japones","Chines","Angolano",
					"Belga","Equatoriano","Israelita"};
			int minimo=0;
			int maximo=13;
			int randomNum= minimo + (int)(Math.random()*maximo);
				//System.out.println(nacionalidades[randomNum]);
				return nacionalidades[randomNum];
			}
			
			//Gerar aleatoriamente posiçao jogador
				public static String geraposicao(){ //saida de texto representando o objeto
			String[] posicoes = {"Guarda-Redes", "Defesa Direito","Defesa esquerdo","Defesa central","Medio defensivo",
					"Medio Centro","Medio Ofensivo","Medio Esquerdo","Medio Direito","Lateral esquerdo","Lateral direito","Extremo Esquerdo","Extremo direito","Avancado"};
			int minimo=0;
			int maximo=14;
			int randomNum= minimo + (int)(Math.random()*maximo);
				//System.out.println(nacionalidades[randomNum]);
				return posicoes[randomNum];
			}
			
				
		//metodo que retorna qual o pe usado
				public static String getPeUsado(){ //saida de texto representando o objeto
					String[] pata = {"Esquerdo", "Direito", "Ambos"};
					int minimo=0;
					int maximo=3;
					int randomNum= minimo + (int)(Math.random()*maximo);
						//System.out.println(nacionalidades[randomNum]);
						return pata[randomNum];
					}	
		
				//Representacao da info do jogaodr
				public static String geraInfo(){ //saida de texto representando o objeto
					
					String[] info = {"Um bom jogador, mas ocasionalmente falha muitos golos, convem ponderar sobre este jogador como avancado",
			 "Um mau jogador, certamente ainda tem muito que evoluir, pois não é muito forte tactiamente nem tecnicamente",
			 "Uma Vedeta do futebol, é o Cr7 ou Messi?",
			 "Esta a evoluir bem, uma estrela do futebol num futuro, convem ter por perto um excelente treinador",
			 "Jogador que carece de muito treino para ser alguem",
			 "Decerteza que esta na profissao certa? Com estas aptidoes deveria se dedicar à PESCA!"};
			
			Clube Score = new Clube();
			int n = Score.getRandomNumber();
			
			if (n>75 && n<=100  )
			{
			return info[2];
			}
			else if (n>50 && n<=75 )
			{
			return info[3];
			}
			
			else if ( n>25 && n<=50 )
			{
			return info[1];
			}
			
			else if ( n>15 && n<=25 )
			{
			return info[4];
			}
			
			else
			{
			return info[5];
			}	
		}


				//funcao para dar informacao detalhada de um 1 Player
				 
				public static void infoPlayers(){
					Clube x= new Clube();
					Jogador j = new Jogador();
					dbplayers na= new dbplayers();
					System.out.println("____________________________________________ \n");
					System.out.println("          Informaçao sobre o Jogador");
					System.out.println("____________________________________________ \n");
					
					//System.out.println("Nome : " +x.gerarRandString() );
					//System.out.println("Sobrenome : " +x.gerarRandString());
					
					System.out.print("Nome: ");
					Dbnames(); 
					System.out.print(" ");
					Dbnames();
					System.out.print(" ");
					Dbnames();
					System.out.print(" ");
					Dbnames();
					
					System.out.println("");
					System.out.println("Idade: " +x.getRandomIdade());
					System.out.println("Nacionalidade: " +j.geraNacao());
					System.out.println("Posicao :" +j.geraposicao());
					System.out.println("Classificação[0,100] : " +j.getRandomRate());
					System.out.println("Informacao extra : \t");  
					infoextra();
					System.out.println("\n");
					System.out.println("Pé? (Esquerdo/Direito/Ambos)?\n" +j.getPeUsado());
					System.out.println("\n");
					System.out.println("Clubes por onde passou?\t");  
					
					ClubesJogador(); 
				}
				
				//Funcao dar info jogadores da simulaçao Plantel 11 elementos
				public static void infoPlayers2(){
					Clube x= new Clube();
					Jogador j = new Jogador();
					int numero=1;
					int i = 0;
					
					while (numero<12){
					System.out.println("____________________________________________ \n");
					System.out.println("          Informação sobre o Jogador nº " +numero);
					System.out.println("____________________________________________ \n");
					System.out.println(" POSICAO: " +j.posicoes2[i]);
					System.out.println("____________________________________________ \n");
					System.out.println("Nome : " +x.gerarRandString() );
					System.out.println("Sobrenome : " +x.gerarRandString());
					System.out.println("Idade: " +x.getRandomIdade());
					System.out.println("Nacionalidade: " +j.geraNacao());
					
					System.out.println("Classificação [0,100]: " +j.getRandomRate());
					System.out.println("Informacao extra : \t");  
					infoextra();
					System.out.println("\n");
					System.out.println("Pe preferencial?\n" +j.getPeUsado());
					System.out.println("\n");
					System.out.println("Clubes por onde passou?\t");  
					ClubesJogador();
					System.out.println("\n");
					numero=numero+1;
					i++;
					}
				}
				
				//Saida Principal da Classe Jogador
				
		public static void main(String []args){
			//infoPlayers();
			//System.out.println(geraInfo());	
			System.out.println("Isto nao e o MAIN, e apenas a Classe Jogador!!");
			infoPlayers();
	}			

}
				

		

