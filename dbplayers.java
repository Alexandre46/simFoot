import java.util.Random;

//servira para usar como base dados dos nomes jogadores!
public class dbplayers {
	
	
public static void Dbnames(){
	
	String[] dbnomes ={
	//A
		"Arsenio","Angel","Alex","Alexis","Artur","Antonio","Andre","Adriano","Asafe","Afonso","Alberto","Anthony","Alves","akinfeev","Abraao","Andrew","Abel","Alfredo","Adam","Ademir","Armando","Arnaldo","Almir","Araujo","Anselmo","Andrade","Arlindo","Amon","Aécio","Adolfo","Aimar","Ayrton","Acacio","Axel","Agostinho","Aldo","Americo","Alcides","Abelardo","Arbeloa","Aloísio","Adair","Al-hummed","Airon","Alex Sandro","Alessandro","Alejandro","Augustus","Amadeu","Azevedo","Alonso","Aires","Avilla","Anibal","Apolo","Apolinario","Alair","Armindo","Aleixo","Ary","Antero","Anacleto","Ariovaldo","Anastacio","Aristeu","Ali","Ataide",
	
	//B	
		"Bernardo","Bruno","Bilal","Bryan","brian","Bobby","Benjamin","Beckenbauer","Bento","Bueno","Bonifacio","Bill","Barthez","Benitez","Bonaventura","Botardi","Batista","Bartolomeu","Baltasar","Barnabé","Bartolomeu","Basílio","Batista","Belchior","Belmiro","Benedito","Benjamim","Bento","Benício","Bernardo","Bertoldo","Bianco","Bonifácio",
	//C
		"Cruijff","Caetano","Caio","Calvino","Camilo","Carino","Carlitos","Carlos","Carmino","Casemiro","Cassiano","Cassio","Costa","Castor","Cauan","Cauby","Castrinho","Cauê","Caíque","Cecílio","Celestino","Celso","Cervantes","Cesário","Chico","Cid","Cipião","Cipriano","Cirano","Cirilo","Cirineu","Ciro","Clayton","Clemêncio","Cleto","Clodoaldo","Clodomiro","Cláudio","Cléber","Cléver","Clóvis","Colombo","Conrado","Constâncio","Copérnico","Cornélio","Cosme","Crispim","Cristiano","Cristo","Cristóvão","Custódio","Cândido","Célio","César","Cícero","Cíntio"

	//D
		,"Di Stéfano","Didi","Dinis","Duarte","Diamantino","Dennis","Diakite","Diop","djorou","Di Maria"
	//E
	    ,"Eduardo","Elia","Ermenike","Eliseu","Eder","Eusebio","Erico"
	//F
	    ,"Filipe","Frank","Francesco","Francisco","Ferdinand","Franco","Fabio","Fernando"
	//G
	    ,"Garrincha" ,"George Best","Gustavo","Gianni","Gento","Giuseppe","Gerard","Giovani","Gutard","Gil","Gama","Guerra","Giraldo","Genk"
    //H
	    ,"Hector","Herrera","Hiltop","Hilton","Huntelar","Heitor"
    //I
	    ,"Ibrahimovic","Ivan","Igor","Inacio","Ilisio","Ilidio","Iturbe","Iborra","Ibarbo","Iker","Iliev","Immobile",
	    "Iniesta","Ings","Insua","Isco","Izmailov","Iturra","Itturaspe","Ivanovic"
    //J
	   ,"Joao","Jose","Joaquim","Jaime","Jacob","James","Jagielka","Jancko","Jalma","Jankovic","Januzaj",
	   "Jara","Jardel","Jerome","Juan","Just","Josef"
    //K
	   ,"kaka","Kaiser","Khazan","Klup","Kalif","Kallesøe","Källström","Kalou","Kalus","Kukula","Kane","Karachanakov",
	   "Karathanasopoulos","Karsberg-Petersen","Karl-Heinz","Kubala"
    //L
	   ,"Luis","Lopes","Lauro","Leandro","Lalana","Lahm","Lionel"
    //M
	   ,"Mario","Manuel","Muller","Maradona"
	//N
	   
	//O
	   ,"Omar","Orlando","Osvaldo"
	//P
	   ,"Pablo","Paul","Pogba","Pinto","Pedro"
	   
	//Q
	   
	//R
	   ,"Ricardo","Roberto","Richard","Raul","Renato"
	//S
	  ,"Sandro","Sandor","Sissi" ,"Sanchez"
	//T
	  ,"Terry","Tierry","Tomas","Thomas"
	//U
	  ,"Ulisses","Uturraspe"
	 
	//V
	   ,"Vitolo","Vitor","Vitinho","Veiga","Van Basten"
	//X
	  ,"Xandao","Xavier","Xiao"
	//Y
	  ,"Yaya","Yves"
	//W
	  ,"Wellbeck","Wallace","Willsheare","William"
	//Z
	  ,"Zizinho","Zico","Zeus" 
	};

	
	
	
	String currentNome;
	Random rand = new Random();
	int rnd = rand.nextInt( dbnomes.length);
	int randomNum = rnd*(int)Math.random();
	currentNome = dbnomes [rnd];
		
	System.out.print(""+currentNome);
	
	}

public static void Legends(){
	
	String[] lendarios ={
	//A
	"Arsenio Erico","Adolfo Pedernera","Arthur Friedenreich"
	//B
	,"Bobby CHarlton","Bobby Moore"
	//C
	,""
	//D
	,"Dennis Bergkamp","Di Stéfano ","Didi ","Denis Law"
	//E
	,"Eusebio","Elias Figueroa","Eric Cantona","Emilio Butragueño"
	//F
    ,"Franz Beckenbauer","Fritz Walter","Francisco Gento ","Franco Baresi",
    "Frank Rijkaard","Falcao"
	//G
	,"Gattuso","Garrincha","Gerd Müller","George Best ","Gianni Rivera"
	,"Giuseppe Meazza","George Weah ","Giacinto Facchetti","Gunnar Nordahl"
	//H
	,"Higita","Hugo Sánchez","Héctor Scarone"
	//I
	//J
	," Johan Cruijff","Juan Alberto Schiaffino ","José Manuel Moreno","José Leandro Andrade"
	,"Just Fontaine","Josef Bican ","Josef Masopust "
	//K
	,"Karl-Heinz Rummenigge","Koheman","Kevin Keegan"
	//L
	,"Lothar Matthäus","Ladislao Kubala","Luis Suárez"
	//M
	,"Maradona","Marco van Basten","Matthias Sindelar","Majed Abdullah"
	//N
	//O
	,"Omar Sivori "
	//P
	,"Pelé","Puskás","Platini",
	//Q
	//R
	"Ruud Gullit ","Roger Milla","Raymond Kopa","Rivelino","Rivaldo","Romario",
	"Ronaldo"
	//S
	,"Stanley Matthews ","Sándor Kocsis ","Sandro Mazzola","Sócrates"
	//T
	,"Teófilo Cubillas"
	//U
	,"Uwe Seeler "
	//V
	,"Valderrama"
	//X
	//Y
	//W
	,"William Dixie Dean"
	//Z
	,"Zico ","Zizinho "
	};
	
	
	String currentNome;
	Random rand = new Random();
	int rnd = rand.nextInt( lendarios.length);
	int randomNum = rnd*(int)Math.random();
	currentNome = lendarios [rnd];
		
	System.out.print(""+currentNome);
}

public static void LegendsBaliza(){
	
	String[] lendariosGuardaredes ={
	"Lev Yashin ","Gordon Banks","Dino Zoff","Sepp Maier","Ricardo Zamora","Oliver Kahn",
	"Chilavert","Peter Schmeichel","Lorenzo Buffon","Peter Shilton","František Plánicka",
	"Amadeo Carrizo","Gilmar","Ladislao Mazurkiewicz","Pat Jennings","Julio Cesar","Iker Casillas",
	"Fabien Barthez","Ubaldo Fillol","Antonio Carbajal ","Jean-Marie Pfaff","Rinat Dasaev ",
	"Gyula Grosics","Thomas Ravelli","Walter Zenga","Andoni Zubizarreta ","Michel Preud'homme"
	};
	
	
	String currentNome;
	Random rand = new Random();
	int rnd = rand.nextInt( lendariosGuardaredes.length);
	int randomNum = rnd*(int)Math.random();
	currentNome = lendariosGuardaredes [rnd];
		
	System.out.print(""+currentNome);
}


//Funçao principal CLasse DBPlayers - Base dados nomes Jogadors Gerados
public static void main(String []args){
System.out.println(" Nome Jogador Gerado:");
Dbnames();
System.out.println("");
System.out.println("Jogador Lendário:");
Legends();
System.out.println("");
System.out.println("GR Lendário:");
LegendsBaliza();
}


}		

