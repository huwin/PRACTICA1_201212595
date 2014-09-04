import java.util.Random;
import java.util.Scanner;


public class Juego {
	
	public static int x,n,c1,c2,c3,c4,k1,k2,k3,k4,k5,k6,k7,k8,k9,k10,k11,k12,k13,k14,k15,k16;
	public static String carta1="(1) Guard", carta2="(1) Guard",carta3="(1) Guard",carta4="(1) Guard",carta5="(1) Guard";
	public static String carta6="(2) Priest", carta7="(2) Priest",carta8="(3) Baron",carta9="(3) Baron",carta10="(4) Handmaid";
	public static String carta11="(4) Handmaid", carta12="(5) PrinCe",carta13="(5) Prince",carta14="(6) King",carta15="(7) Countess",carta16="(8) Princess";
	public static String j,p;



	public void reglas(){
		System.out.println("soy regla");
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
				if  (acum==1 || acum==3){
					System.out.println("ingresa tu nombre: ");
					j=entrada.next();
					System.out.println(" ingresa nombre de rival PC: ");
					p=entrada.next();
					
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
						}
						
						
						
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
							}
									
					}//termina for1
					
					//PEDIR QUE PRESIONE TECLA PARA REVOLVER CARTAS
					System.out.println("ESCRIBE CUALQUIER letra o digito para revolver");
					String revolver1=entrada.next();
					
					
						//CODIGO PARA MOSTRAR NUMERO Y NOMBRE DE CARTA QUITADA
					
					System.out.println("LAS CARTAS REMOVIDAS SON:\n ");
			if (c1==1 || c1==2 || c1==3 || c1==4 || c1==5){

				System.out.println(""+carta1);
			}
			else if(c1==6 || c1==7){
				System.out.println(""+carta6);
			}
			else if(c1==8 ||c1==9){
				System.out.println(""+carta8);
			}
			else if(c1==10 || c1==11){
				System.out.println(""+carta10);
			}
			else if(c1==12 || c1==13){
				System.out.println(" "+carta12);
			}
			else if(c1==14){
				System.out.println(" "+carta14);
			}
			else if(c1==15){
				System.out.println(" "+carta15);
			}
			else if(c1==16){
				System.out.println(""+carta16);
			}
			
			
			if (c2==1 || c2==2 || c2==3 || c2==4 || c2==5){

				System.out.println(" "+carta1);
			}
			else if(c2==6 || c2==7){
				System.out.println(""+carta6);
			}
			else if(c2==8 ||c2==9){
				System.out.println(""+carta8);
			}
			else if(c2==10 || c2==11){
				System.out.println(""+carta10);
			}
			else if(c2==12 || c2==13){
				System.out.println(""+carta12);
			}
			else if(c2==14){
				System.out.println(""+carta14);
			}
			else if(c2==15){
				System.out.println(""+carta15);
			}
			else if(c2==16){
				System.out.println(""+carta16);
			}
			
			
			
			if (c3==1 || c3==2 || c3==3 || c3==4 || c3==5){

				System.out.println(""+carta1);
			}
			else if(c3==6 || c3==7){
				System.out.println(""+carta6);
			}
			else if(c3==8 ||c3==9){
				System.out.println(""+carta8);
			}
			else if(c3==10 || c3==11){
				System.out.println(""+carta10);
			}
			else if(c3==12 || c3==13){
				System.out.println(""+carta12);
			}
			else if(c3==14){
				System.out.println(""+carta14);
			}
			else if(c3==15){
				System.out.println(""+carta15);
			}
			else if(c3==16){
				System.out.println(""+carta16);
			}
					
			
			if (c4==1 || c4==2 || c4==3 || c4==4 || c4==5){

				System.out.println(""+carta1);
			}
			else if(c4==6 || c4==7){
				System.out.println(""+carta6);
			}
			else if(c4==8 ||c4==9){
				System.out.println(""+carta8);
			}
			else if(c4==10 || c4==11){
				System.out.println(""+carta10);
			}
			else if(c4==12 || c4==13){
				System.out.println(""+carta12);
			}
			else if(c4==14){
				System.out.println(""+carta14);
			}
			else if(c4==15){
				System.out.println(""+carta15);
			}
			else if(c4==16){
				System.out.println(""+carta16);
			}
					
					
				
				}
				else if( acum==0){
					System.out.println("debe seleccionar tokens");
					System.out.println("presione 1 para regresar");
					regresar=entrada.nextInt();
					Juego.main(null);
					}	
				break;
			
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
					System.out.println("jugando a : "+acum);
					
				System.out.println("presione 1 para regresar");
				regresar=entrada.nextInt();
				Juego.main(null);
					}
			break;
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
				break;
			}
				
		
			
				
				
			
		
			// aleatorio para ver quien empieza el juego
			
			Random turno=new Random();
			int n=turno.nextInt(2);
			if (n==0){
				System.out.println("Tu empiezas el juego "+j);
				System.out.println("El rival pc es el Segundo ");
			}
				else
				{
					System.out.println(""+j+"eres el segundo en jugar");
					System.out.println("Tu rival pc es quien empieza el juego ");
				}
				
			
		}//TERMINA MAIN

	}

	

	
