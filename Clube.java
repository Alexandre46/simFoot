import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.String;
import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class Clube extends dbplayers{
	
	private static final String CHAR_LIST = "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVW";
	private static final int RANDOM_STRING_LENGTH = 5;
	public int value;
	
	public static int rate=0;
	
	//Metodo para gerar Nome de um Jogador
	public String gerarRandString(){
		StringBuffer randstr = new StringBuffer();
	for(int i=0; i<RANDOM_STRING_LENGTH; i++){
            int number = getRandomNumber();
            char ch = CHAR_LIST.charAt(number);
            randstr.append(ch);
        }
        return randstr.toString();
    }
    
	//metodo para dar gerar um valor aleatorio
    public  int getRandomNumber() {
        int randomInt = 0;
        Random randomGenerator = new Random();
        randomInt = randomGenerator.nextInt(CHAR_LIST.length());
        if (randomInt - 1 == -1) {
            return randomInt;
        } else {
            return randomInt - 1;
        }
    }
    
    //meotodo para gerar valor de idade do jogador entre 18 e 40 anos
    public int getRandomIdade(){
    	int randomIdade = 0;
    	Random randomInt = new Random();
    	randomIdade = randomInt.nextInt(40);
    	if (randomIdade <= 18) {
    		randomIdade = randomIdade+20;
    		return randomIdade;
    	} else {
    	return randomIdade;
    	}
    }
    
    //Meotodo para apanhar o valor do jogador entre 0 e 100 inclusive
    public static int getRandomRate(){
    	Random r = new Random();
    	 rate= r.nextInt(101);
    
    	return rate;
    }
	
   
  /*Metodo para retornar clubes que Jogador Passou
	public String geraClube(){ //saida de texto representando o objeto
		String[] Clube = {"SL Benfica", "FC Porto","Sporting CP","CS Maritimo","CD Nacional","Real Madrid","AC Milan","FC Barcelona","Arsenal","Liverpool","Manchester United","Andorinha","Aston Villa","Ajax",
				"Colo Colo","Inter","Roma","Fiorentina","Bayer Munich","Estrela Amadora","Dinamo Moscovo","Boca Juniors","Hamburger SV","Botafogo","cruzeiro","Sao Paulo"};
		
		int minimo=0;
		
		int randomNum= minimo + (int)(Math.random()*Clube.length);
		
		return Clube[randomNum];
}
*/
  //Meotodo para retornar N Nomes de clubes de um jogador
    public static void ClubesJogador(){
    	String currentClub;
    	String[] Clubes1 = {"SL Benfica", "FC Porto","Sporting CP","CS Maritimo","CD Nacional","Real Madrid","AC Milan","FC Barcelona","Arsenal","Liverpool","Manchester United","Andorinha","Aston Villa","Ajax"};
    	String[] Clubes2 = {"Colo Colo","Inter","Roma","Fiorentina","Bayer Munich","Estrela Amadora","Dinamo Moscovo","Boca Juniors","Hamburger SV","Botafogo","cruzeiro","Sao Paulo"};
    	String[] Clubes3 = {"Braga","Gil Vicente","Uniao da Madeira","Chelsea"};
    	String[] Clubes4 = {"AD Camacha","Fiorentina","Juventus","Black Rovers"};
    	
    	Random rand = new Random();
    	Random rand2 = new Random();
    	Random rand3 = new Random();
    	Random rand4 = new Random();
    	
    	int rnd = rand.nextInt( Clubes1.length);
    	int rnd2 = rand2.nextInt(Clubes2.length);
    	int rnd3 = rand3.nextInt(Clubes3.length);
    	int rnd4 = rand4.nextInt(Clubes4.length);
    	
    	int randomNum = rnd*(int)(Math.random()*rnd2);
    	
    	if (randomNum <= 15 && randomNum> 1){
    		currentClub = Clubes1 [rnd];
    	}
    	else if (randomNum <= 30 && randomNum> 16){
    	currentClub = Clubes1 [rnd] +" >> " + Clubes2 [rnd2];
    	}
    	else if (randomNum <= 45 && randomNum> 17){
        	currentClub = Clubes1 [rnd] +" >> " + Clubes2 [rnd2] +" >> " + Clubes3 [rnd3] ;
        	}
    	else {
        	currentClub = Clubes1 [rnd] +" >> " + Clubes2 [rnd2] +" >> " + Clubes3 [rnd3] +" >> " + Clubes4 [rnd4] ;
        	}
    	
    	System.out.println(currentClub);

    }
    
    
    // Algoritmo de Selecao de elementos
    public void selectionSort(int[] arr) {
        int i, j, minIndex, tmp;
        int n = arr.length;
        for (i = 0; i < n - 1; i++) {
              minIndex = i;
              for (j = i + 1; j < n; j++)
                    if (arr[j] < arr[minIndex])
                          minIndex = j;
              if (minIndex != i) {
                    tmp = arr[i];
                    arr[i] = arr[minIndex];
                    arr[minIndex] = tmp;
              }
        }
  } 

  
    public static void infoextra(){
    	//INSTACIA A CLASSE
        Clube clb = new Clube();
       
        //System.out.println(clb.gerarRandString());
       //System.out.println(clb.getRandomRate());
       // clb.ClubesJogador();
      if (rate <= 100 && rate > 75)
       System.out.println("Uma Vedeta do futebol, é o Cr7 ou Messi?");
      
      else if (rate >50 && rate <=75)
    	  System.out.print("Esta a evoluir bem, uma estrela do futebol num futuro, convem ter por perto um excelente treinador");
      
      else if ( rate>25 && rate<=50 )
		{
    	  System.out.print("Um mau jogador, certamente ainda tem muito que evoluir, pois não é muito forte tactiamente nem tecnicamente");
		}
      else if ( rate>15 && rate<=25 )
		{
		System.out.println( "Jogador que carece de muito treino para ser alguem");
		}
      
      else
    	  System.out.println("Decerteza que esta na profissao certa? Com estas aptidoes deveria se dedicar à PESCA!");
    		}
    
    
    
    //Main da Classe Clube
    public static void main(String []args){
   
	}
    
}
