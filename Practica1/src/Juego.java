import java.util.Random;
import java.util.Scanner;


public class Juego {
	
	public static int h1,h2,h3,h4,h5,h6,h7,pc1,pc2,pc3,pc4,pc5,pc6,pc7,n,c1,c2,c3,c4;
	public static String carta1="(1) Guard", carta2="(2) Priest",carta3="(3) Baron",carta4="(4) Handmaid",carta5="(5) Prince";
	public static String carta6="(6) King", carta7="(7) Countess",carta8="(8) Princess",carta9="(#)SinCartaAun";
	public static String j,p,A,B,C;
	public static String j1,j2,j3,j4,j5,j6,j7,j8;
	public static String p1,p2,p3,p4,p5,p6,p7,p8;
	public static int a,b,c,d,e,f,g,h,token=0,tokenpc=0;


	public void reglas(){
		System.out.println("LAS REGLAS SON : \n");
		System.out.println("Durante tu turno, roba la carta superior del mazo y añádela a tu mano. \n Entonces elige una de las dos cartas y descártala cara arriba delante tuya. \n Deberás aplicar el efecto de la carta descartada, incluso si es perjudicial para ti.");
	System.out.println("Una vez es aplicado el efecto de la carta el turno pasa al jugador oponente \n \n Si un jugador es eliminado de la ronda, ese jugador descarta la carta \n en su mano boca arriba, (sin aplicar su efecto) \n y deja de jugar hasta la siguiente ronda.");
		
		System.out.println("\n presiona una letra o digito para regresar a menu ");
		Scanner entrada2=new Scanner(System.in);
	C=entrada2.next();
		Juego.main(null);
	}
		//DECLARACION DE VARIABLES GLOBALES
		public static int acum=0;

		public static void main(String[] args) {

			//DECLARACION DE VARIABLES LOCALES
			
			int num=0, regresar=0,tok=0;
			
				
				
			Scanner entrada=new Scanner(System.in);

			//CODIGO PARA MOSTRAR MENU
			
			System.out.println("BIENVENIDO A LOVE LETTER \n ");
			System.out.println("QUE DESEA HACER \n ");
			System.out.println("(1) Jugar una partida ");
			System.out.println("(2)  Seleccionar el numero de tokens a Jugar ");
			System.out.println("(3) Mostrar las reglas del juego ");
			System.out.println("(4)  Salir ");
			num = entrada.nextInt();
			
		  
			
			//CODIGO PARA LA EJECUCION DE MENU
			
			switch (num){
			case 1: 
				if( acum==0){ //CODIGO SI NO HA SELECCIONADO TOKEN  CASE1
					System.out.println("Debe seleccionar numero de tokens para Jugar");
					System.out.println("presione 1 para regresar");
					regresar=entrada.nextInt();
					Juego.main(null);
					}	
				else if  (acum<4){
					System.out.println("ingresa tu nombre: ");
					j=entrada.next();
					System.out.println(" ingresa nombre de rival PC: ");
					p=entrada.next();
					
					
			Juego Descartadas =new Juego();  //llamado a las cuatro descartadas
			Descartadas.CartasRemovidas();
		
			Juego llamarHu=new Juego();   //llamado a la primer carta de humano
			llamarHu.PrimeraHumano(); System.out.println("");
			
			
				//ALEATORIO PARA DECIR QUIEN EMPIEZA
			
				Random cartas=new Random();
				int n=cartas.nextInt(2);
				if (n==0){						//codigo si humano es primero
				System.out.println("Tu empiezas el juego "+j);
				System.out.println("El rival pc es el Segundo \n");
				System.out.println("teclea 1 letra o numero y enter para INICIAR");
				String pedir=entrada.next();
				System.out.println("");
				
				Juego llamarSegHum=new Juego();			//llamamiento de 2da ccarta humano
				llamarSegHum.SegundaCartaHumano();
				}
				else if (n==1)			//codigo si pc es primero
				{
					System.out.println("eres el segundo en jugar");
					System.out.println("Tu rival pc es quien empieza el juego \n");
					System.out.println("teclea 1 letra o numero y enter para INICIAR");
					String pedir=entrada.next();
					System.out.println("");
					j2=carta9;
					Juego llamarCompu=new Juego();    //llamada a carta1 pc
					llamarCompu.CartaCompu();
					
					Juego llamarPrimerPc=new Juego();	//llamada a carta2 pc
					llamarPrimerPc.SegundaCartaPc();
					
		
					
				}		
				}// termina aleatorio de quien empieza
				 
				
					
				
			
				
				
			break;
			
			// SELECCIONAR TOKENS
			
			case 2 :
				Scanner teclado=new Scanner(System.in);
				
				System.out.println("(1) jugar a 1 token ");
				System.out.println("(2) jugar a 3 tokens");
				tok=teclado.nextInt();
				
				if (tok==1){
					acum+=1;
					System.out.println("jugando a : "+acum + "tokens");
					System.out.println("presione 1 para regresar");
					regresar=entrada.nextInt();
					Juego.main(null);
				}
					else if (tok==2){
						acum+=3;
					System.out.println("jugando a : "+acum+"  tokens");
					
				System.out.println("presione 1 para regresar");
				regresar=entrada.nextInt();
				Juego.main(null);
					}
			break;
			
			//REGLAS
			
			case 3: 
				Juego llamarReglas=new Juego();
				llamarReglas.reglas();
				System.out.println("Las reglas del juego son las siguientes: ");
				
				System.out.println("presione 1 para regresar");
				regresar=entrada.nextInt();
				Juego.main(null);
				break;
				
				
			case 4:
				System.out.println("Saliendo del juego..... adios ");
				System.exit(num);
				break;
			}
				
		
			
				
				

		
			
			
				
			
		}//TERMINA MAIN
		
		//METODO DE PRIMERAS 4 QUITADAS
		public void CartasRemovidas(){
			//empieza for 1 PARA QUITAR 4 CARTAS
			
			for (int i = 0; i < 4; i++) {	
			
				if (i==0){
					Random cartas=new Random();
					c1 =1+cartas.nextInt(16);
				}	
				
				else if (i==1){
						Random cartas=new Random();
						c2=1+cartas.nextInt(15);
					}
				else if (i==2){
					Random cartas=new Random();
					c3=1+cartas.nextInt(14);
				}
				else if (i==3){
					Random cartas=new Random();
					c4=1+cartas.nextInt(13);
				}//fin if dentro de for
				
				
				//if de comp. entre 4 generadas
				
					if (c1==c2 || c1==c3 || c1==c4) {
						Random cartas=new Random();
						c1=1+cartas.nextInt(16);
					}
					
					
					else if (c2==c3 || c2==c4){
						Random cartas=new Random();
						c2=1+cartas.nextInt(15);
					}
					
					else if (c3==c4){
						Random cartas=new Random();
						c3=1+cartas.nextInt(14);
					}//fin if
							
			}//termina for4 generadas
			
			//PEDIR QUE PRESIONE TECLA PARA REVOLVER CARTAS
			
			System.out.println("ESCRIBE CUALQUIER letra o digito para revolver");
			Scanner entrada=new Scanner(System.in);
			String revolver1=entrada.next();
			
			
				//CODIGO PARA MOSTRAR NUMERO Y NOMBRE DE CARTA QUITADA
			
			System.out.println("LAS CARTAS REMOVIDAS SON:\n ");
		if (c1==1 || c1==2 || c1==3 || c1==4 || c1==5){

		System.out.println(""+carta1);
		}
		else if(c1==6 || c1==7){
		System.out.println(""+carta2);
		}
		else if(c1==8 ||c1==9){
		System.out.println(""+carta3);
		}
		else if(c1==10 || c1==11){
		System.out.println(""+carta4);
		}
		else if(c1==12 || c1==13){
		System.out.println(" "+carta5);
		}
		else if(c1==14){
		System.out.println(" "+carta6);
		}
		else if(c1==15){
		System.out.println(" "+carta7);
		}
		else if(c1==16){
		System.out.println(""+carta8);
		}


		if (c2==1 || c2==2 || c2==3 || c2==4 || c2==5){

		System.out.println(" "+carta1);
		}
		else if(c2==6 || c2==7){
		System.out.println(""+carta2);
		}
		else if(c2==8 ||c2==9){
		System.out.println(""+carta3);
		}
		else if(c2==10 || c2==11){
		System.out.println(""+carta4);
		}
		else if(c2==12 || c2==13){
		System.out.println(""+carta5);
		}
		else if(c2==14){
		System.out.println(""+carta6);
		}
		else if(c2==15){
		System.out.println(""+carta7);
		}
		else if(c2==16){
		System.out.println(""+carta8);
		}



		if (c3==1 || c3==2 || c3==3 || c3==4 || c3==5){

		System.out.println(""+carta1);
		}
		else if(c3==6 || c3==7){
		System.out.println(""+carta2);
		}
		else if(c3==8 ||c3==9){
		System.out.println(""+carta3);
		}
		else if(c3==10 || c3==11){
		System.out.println(""+carta4);
		}
		else if(c3==12 || c3==13){
		System.out.println(""+carta5);
		}
		else if(c3==14){
		System.out.println(""+carta6);
		}
		else if(c3==15){
		System.out.println(""+carta7);
		}
		else if(c3==16){
		System.out.println(""+carta8);
		}
			

		if (c4==1 || c4==2 || c4==3 || c4==4 || c4==5){

		System.out.println(""+carta1);
		}
		else if(c4==6 || c4==7){
		System.out.println(""+carta2);
		}
		else if(c4==8 ||c4==9){
		System.out.println(""+carta3);
		}
		else if(c4==10 || c4==11){
		System.out.println(""+carta4);
		}
		else if(c4==12 || c4==13){
		System.out.println(""+carta5);
		}
		else if(c4==14){
		System.out.println(""+carta6);
		}
		else if(c4==15){
		System.out.println(""+carta7);
		}
		else if(c4==16){
		System.out.println(""+carta8);
		}
			
			
		}// FINALIZA CODIGO E 4 QUITADAS

		public void PrimeraHumano(){    		//METODO PARA DAR CARTA 1 AHUMANO
			//generacion de dos primeras cartas

			for (int i = 0; i < 1; i++) {
				if (i==0) {
					Random cartas=new Random();
					h1=1+cartas.nextInt(16);
				
				}
				
			
				if (h1==c1 || h1==c2 || h1==c3 || h1==c4) {
					
					Random cartas=new Random();
					h1=1+cartas.nextInt(16);
					}
				
			}
			
			//muestra de dos primeras cartas jugador y pc
			
			
			
			//primera carta jugador humano
			
			if (h1<6) {
				j1=carta1;
				System.out.println(j+" Tu primera carta es: " + j1);
			}
			else if (h1==6 || h1==7) {
				j1=carta2;

				System.out.println(j+" Tu primera carta es: " + j1);
			}
			else if (h1==8 || h1==9){
				j1=carta3;

				System.out.println(j+" Tu primera carta es: " + j1);
			}
			else if (h1==10 || h1==11){
				j1=carta4;

				System.out.println(j+" Tu primera carta es: " + j1);
			}
			else if (h1==12 || h1==13){
				j1=carta5;

				System.out.println(j+" Tu primera carta es: " + j1);
			}
			else if (h1==14){
				j1=carta6;

				System.out.println(j+" Tu primera carta es: " + j1);
			}
			else if (h1==15){
				j1=carta7;

				System.out.println(j+" Tu primera carta es: " + j1);
			}
			else if (h1==16){
				j1=carta8;

				System.out.println(j+" Tu primera carta es: " + j1);
			}	
			}
	

public void CartaCompu(){		//METODO PARA CARTA1 PC

	
	for (int i = 0; i < 1; i++) {
		if (i==0) {
		
			Random cartas=new Random();
			pc1=1+cartas.nextInt(16);  //PRIMERA CARTA PARA A COMPU
		}
	
		
		 if (pc1==h1 ||pc1==c1 || pc1==c2 || pc1==c3 | pc1==c4) {
			Random cartas=new Random();
			pc1=1+cartas.nextInt(16);//PRIMERA CARTA PARA COMPU
		}
	}
	
	//mostrar primera carta COMPUTADORA

	if (pc1< 6) {
		p1=carta1;
	}
	else if (pc1==6 || pc1==7) {
		p1=carta2;
		}
	else if (pc1==8 || pc1==9){
		p1=carta3;
		}
	else if (pc1==10 || pc1==11){
		p1=carta4;
		}
	else if (pc1==12 || pc1==13){
		p1=carta5;
		}
	else if (pc1==14){
		p1=carta6;
		}
	else if (pc1==15){
		p1=carta7;
		}
	else if (pc1==16){
		p1=carta8;
		}	
}


public void SegundaCartaHumano(){		//METODO PARA CARTA 2 HUMANO
	//inicia for de segunda humano
	 for (int i = 0; i < 1; i++) {
		
	if(i==0){
	
			Random cartas=new Random();
			h2=1+cartas.nextInt(16);	
			}
			else if (h2==c1 || h2==c2 || h2==c3 || h2==c4 || h2==h1 || h2==pc1) {
			Random cartas1=new Random();
			h2=1+cartas1.nextInt(16);
			}
		} //termina for de segunda humano
	 if (h2<6) {
			j2=carta1;
		}
		else if (h2==6 || h2==7) {
			j2=carta2;

		}
		else if (h2==8 || h2==9){
			j2=carta3;

		}
		else if (h2==10 || h2==11){
			j2=carta4;

		}
		else if (h2==12 || h2==13){
			j2=carta5;

		}
		else if (h2==14){
			j2=carta6;

		}
		else if (h2==15){
			j2=carta7;

		}
		else if (h2==16){
			j2=carta8;

		}	
		
		

Scanner entrada1=new Scanner(System.in);
	System.out.println(" \n \n tu nueva carta es:  "+j2+"\n \n");
	 System.out.println("jugador "+j+ "  "+ acum +"tokens"    +"           pc"+p);
	 System.out.println("tienes en tu mano: "+ j1+"  "+j2);
	 System.out.println("(1) Usar carta #1");
	 System.out.println("(2) Usar carta #2");
	 System.out.println("(3) Salir del juego\n");
	 a=entrada1.nextInt();
	 switch (a) {
	case 1:
		Juego llamar3=new Juego();
		llamar3.CartaCompu();
		if (h1 < 6) {  						//codigo si carta es guard
			System.out.println("adivina al rival y gana \n");
			System.out.println("cual crees que tiene el rival ");
			System.out.println(""+carta2+carta3+carta4+carta5+carta6+carta7+carta8);
			b=entrada1.nextInt();
			if (b==2 && p1==carta2) {
				System.out.println("ganaste tiene "+p1);
			}//fin if 2
			else if (b==3 && p1==carta3) {
				System.out.println("ganaste tiene "+p1);
				token=acum -1;
			}
			else if (b==4 && p1==carta4) {
				System.out.println("ganaste tiene "+p1);
				token=acum -1;			}
			else if (b==5 && p1==carta5) {
				System.out.println("ganaste tiene "+p1);
				token=acum -1;			}
			else if (b==6 && p1==carta6) {
				System.out.println("ganaste tiene "+p1);
				token=acum -1;			}
			else if (b==7 && p1==carta7) {
				System.out.println("ganaste tiene "+p1);
				token=acum -1;			}
			else if (b==8 && p1==carta8) {
				System.out.println("ganaste tiene "+p1);
				token=acum -1;			}
			else{
				System.out.println("no adivinaste.. tiene "+p1);
				
			}
			
		}//fin if1
		
		else if (h1==6 || h1==7) {		//if si selecc1 es priest
			p1=carta1;

			System.out.println("tu rival tiene estas carta "+ p1+"\n");
		}
		else if (h1==8 || h1==9) {   					  //if si selecc1 es baron
			System.out.println("comparando manos con rival ");
			System.out.println("tu "+j2+"  rival  "+p1);
			if (h2>pc1) {
				System.out.println("Tu cartas es mayao    GANASTE");
				acum=2;
			}
			else if (h2<pc1){
				System.out.println("tu HAS PERDIDO");
			}
			else if (h2==pc1){
				System.out.println("empates... sigue el juego");
			}
		} // fin if sellec1 baron
		else if (h1==10 || h1==11) {					//if si selecc1 es handmaid
			System.out.println("estas protegido 1 turno");
			
		}
		else if (h1==12 || h1 ==13 ) {					//if si selecc1 es prince
	System.out.println("que mano deseas botar");
	System.out.println("(1) la tuya        (2)  oponente");
     b=entrada1.nextInt();
     		if (b==1) {    //if de seleccion de mazo nuevo
     		
     			
     			for (int i = 0; i < 1; i++) {    //inicia for de nuevo mazo tuyo con h3
     				
     				if(i==0){
     				
     						Random cartas=new Random();
     						h3=1+cartas.nextInt(16);	
     						}
     						else if (h3==c1 || h3==c2 || h3==c3 || h3==c4 || h3==h1 || h3==pc1 ||h3==h2) {
     						Random cartas1=new Random();
     						h3=1+cartas1.nextInt(16);
     						}
     					} //termina for de segunda humano
     				 if (h3<6) {
     						j3=carta1;
     					}
     					else if (h3==6 || h3==7) {
     						j3=carta2;

     					}
     					else if (h3==8 || h3==9){
     						j3=carta3;

     					}
     					else if (h3==10 || h3==11){
     						j3=carta4;

     					}
     					else if (h3==12 || h3==13){
     						j3=carta5;

     					}
     					else if (h3==14){
     						j3=carta6;

     					}
     					else if (h3==15){
     						j3=carta7;

     					}
     					else if (h3==16){
     						j3=carta8;

     					}	//termina for de mazo tuyo
     			System.out.println("tu nueva carta es: "+j3);
     		}     //fin if seleccion botar mazo
     		
     		
     		else if (b==2) {  //if si selecc1 con carta prince es oponente
				
				//inicia for de nuevo mazo carta1 pc
				for (int i = 0; i < 1; i++) {   //for para generar nueva carta1 pc
					if (i==0) {
					
						Random cartas=new Random();
						pc2=1+cartas.nextInt(16);  //PRIMERA CARTA PARA A COMPU
					}
				
					
					 if (pc2==h1 ||pc2==c1 || pc2==c2 || pc2==c3 | pc2==c4 ||pc2==pc1) {
						Random cartas=new Random();
						pc2=1+cartas.nextInt(16);//PRIMERA CARTA PARA COMPU
					}
				}
				
				//mostrar primera carta COMPUTADORA
				if (pc2< 6) {
					p2=carta1;
				}
				else if (pc2==6 || pc2==7) {
					p2=carta2;
					}
				else if (pc2==8 || pc2==9){
					p2=carta3;
					}
				else if (pc2==10 || pc2==11){
					p2=carta4;
					}
				else if (pc2==12 || pc2==13){
					p2=carta5;
					}
				else if (pc2==14){
					p2=carta6;
					}
				else if (pc2==15){
					p2=carta7;
					}
				else if (pc2==16){
					p2=carta8;
					}	
				
			}  //fin if b igual a 2
		} // fin if si h1 igual a 13-14
		
		else if (h1==14) {				//if usando king carta king
			System.out.println("se intercambiaran mazos");
			h4=pc1;		//nuevo numero de carta ya intercambiado
			j4=j1;			//nombre de nueva carta
			pc3=h2;
			p3=j2;
			System.out.println("ahora tu carta es "+j4);
			}
		
		else if (h1==15) {  //if usando carta countess
			
			System.out.println("usando carta  ");
			System.out.println("fin de turno");
		
		}   //fin if carta coutess
		
		else if (h1==16) {
			System.out.println("perdiste .. no se puede usar a princess");
		tokenpc=acum-1;
		}
		break;

	case 2:
		//si seleccion es igual a 2
		
		
		
		if (h2 < 6) {//codigo si carta es guard
			Juego llamarr=new Juego();
			llamarr.CartaCompu();
			System.out.println("adivina al rival y gana");
			System.out.println("cual crees que tiene el rival ");
			System.out.println(""+carta2+carta3+carta4+carta5+carta6+carta7+carta8);
			b=entrada1.nextInt();
			if (b==2 && p1==carta2) {
				System.out.println("ganaste tiene "+p1);
			}//fin if 2
			else if (b==3 && p1==carta3) {
				System.out.println("ganaste tiene "+p1);
				token=acum -1;
			}
			else if (b==4 && p1==carta4) {
				System.out.println("ganaste tiene "+p1);
				token=acum -1;			}
			else if (b==5 && p1==carta5) {
				System.out.println("ganaste tiene "+p1);
				token=acum -1;			}
			else if (b==6 && p1==carta6) {
				System.out.println("ganaste tiene "+p1);
				token=acum -1;			}
			else if (b==7 && p1==carta7) {
				System.out.println("ganaste tiene "+p1);
				token=acum -1;			}
			else if (b==8 && p1==carta8) {
				System.out.println("ganaste tiene "+p1);
				token=acum -1;			}
			else{
				System.out.println("no adivinaste.. tiene "+p1);
				
			}
			
		}//fin if1
		
		else if (h2==6 || h2==7) {		//if si selecc1 es priest
			
			Juego llamar2=new Juego();
			llamar2.CartaCompu();
			System.out.println("tu rival tiene estas carta "+ p1+"\n");
		}
		else if (h2==8 || h2==9) {   					  //if si selecc1 es baron
			System.out.println("comparando manos con rival ");
			System.out.println("tu "+j1+"  rival  "+p1);
			if (h1>pc1) {
				System.out.println("Tu cartas es mayao    GANASTE");
				token=acum-1;
			}
			else if (h1<pc1){
				System.out.println("tu HAS PERDIDO");
				tokenpc=acum-1;
			}
			else if (h1==pc1){
				System.out.println("empates... sigue el juego");
				System.out.println("fin de turno");
			}
		} // fin if sellec1 baron
		else if (h2==10 || h2==11) {					//if si selecc1 es handmaid
			System.out.println("estas protegido 1 turno");
			
		}
		else if (h2==12 || h2 ==13 ) {					//if si selecc1 es prince
	System.out.println("que mano deseas botar");
	System.out.println("(1) la tuya        (2)  oponente");
     b=entrada1.nextInt();
     		if (b==1) {    //if de seleccion de mazo nuevo
     		
     			
     			for (int i = 0; i < 1; i++) {    //inicia for de nuevo mazo tuyo con h3
     				
     				if(i==0){
     				
     						Random cartas=new Random();
     						h3=1+cartas.nextInt(16);	
     						}
     						else if (h3==c1 || h3==c2 || h3==c3 || h3==c4 || h3==h1 || h3==pc1 ||h3==h2) {
     						Random cartas1=new Random();
     						h3=1+cartas1.nextInt(16);
     						}
     					} //termina for de segunda humano
     				 if (h3<6) {
     						j3=carta1;
     					}
     					else if (h3==6 || h3==7) {
     						j3=carta2;

     					}
     					else if (h3==8 || h3==9){
     						j3=carta3;

     					}
     					else if (h3==10 || h3==11){
     						j3=carta4;

     					}
     					else if (h3==12 || h3==13){
     						j3=carta5;

     					}
     					else if (h3==14){
     						j3=carta6;

     					}
     					else if (h3==15){
     						j3=carta7;

     					}
     					else if (h3==16){
     						j3=carta8;

     					}	//termina for de mazo tuyo
     			System.out.println("tu nueva carta es: "+j3);
     		}     //fin if seleccion botar mazo
     		
     		
     		else if (b==2) {  //if si selecc1 con carta prince es oponente
				
				//inicia for de nuevo mazo carta1 pc
				for (int i = 0; i < 1; i++) {   //for para generar nueva carta1 pc
					if (i==0) {
					
						Random cartas=new Random();
						pc2=1+cartas.nextInt(16);  //PRIMERA CARTA PARA A COMPU
					}
				
					
					 if (pc2==h1 ||pc2==c1 || pc2==c2 || pc2==c3 | pc2==c4 ||pc2==pc1) {
						Random cartas=new Random();
						pc2=1+cartas.nextInt(16);//PRIMERA CARTA PARA COMPU
					}
				}
				
				//mostrar primera carta COMPUTADORA
				if (pc2< 6) {
					p2=carta1;
				}
				else if (pc2==6 || pc2==7) {
					p2=carta2;
					}
				else if (pc2==8 || pc2==9){
					p2=carta3;
					}
				else if (pc2==10 || pc2==11){
					p2=carta4;
					}
				else if (pc2==12 || pc2==13){
					p2=carta5;
					}
				else if (pc2==14){
					p2=carta6;
					}
				else if (pc2==15){
					p2=carta7;
					}
				else if (pc2==16){
					p2=carta8;
					}	
				
			}  //fin if b igual a 2
		} // fin if si h1 igual a 13-14
		
		else if (h2==14) {				//if usando king carta king
			System.out.println("se intercambiaran mazos");
			h4=pc1;		//nuevo numero de carta ya intercambiado
			j4=j1;			//nombre de nueva carta
			pc3=h2;
			p3=j2;
			System.out.println("ahora tu carta es "+j4);
			}
		
		else if (h2==15) {  //if usando carta countess
			
			System.out.println("usando carta ");
			System.out.println("fin de turno");
		
		}   //fin if carta coutess
				else if (h2==16) {
			System.out.println("perdiste .. no se puede usar a princess");
		tokenpc=acum-1;
		}
		
		
		
		break;
	
	case 3:
		
		System.out.println("saliendo del juego.......");
		System.out.println("adios ");
		System.exit(b);
		
		break;
	 }
	 
}  // fin de metodo segunda humano


public void SegundaCartaPc(){		//INICIA METODO CARTA  2 PC

	//inicia for de segunda PC
		 for (int i = 0; i < 1; i++) {
			
		if(i==0){
		
				Random cartas=new Random();
				pc2=1+cartas.nextInt(16);	
				}
				else if (pc2==c1 || pc2==c2 || pc2==c3 || pc2==c4 || pc2==h1 || pc2==h2 || pc2==pc1) {
				Random cartas1=new Random();
				pc2=1+cartas1.nextInt(16);
				}
			} //termina for de segunda humano
		 if (pc2<6) {
				p2=carta1;
			}
			else if (pc2==6 || pc2==7) {
				p2=carta2;

			}
			else if (pc2==8 || pc2==9){
				p2=carta3;

			}
			else if (pc2==10 || pc2==11){
				p2=carta4;

			}
			else if (pc2==12 || pc2==13){
				p2=carta5;

			}
			else if (pc2==14){
				p2=carta6;

			}
			else if (pc2==15){
				p2=carta7;

			}
			else if (pc2==16){
				p2=carta8;

			}	
			

	
		 System.out.println("jugador: "+j+"                                 pc  "+p);
		 System.out.println("tienes en tu mano: "+ j1+"  "+j2+"\n");
		 System.out.println("presiona una letra o digito y enter para indicar que pc inice");
		Scanner entrada2=new Scanner(System.in);
		 A=entrada2.next();
				 
		 
		 
}
	

}//termina clase principal

	

	
