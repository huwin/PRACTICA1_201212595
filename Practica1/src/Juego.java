import java.util.Random;
import java.util.Scanner;


public class Juego {

	public void reglas(){
		System.out.println("soy regla");
	}
		//DECLARACION DE VARIABLES GLOBALES
		public static int acum=0;

		public static void main(String[] args) {

			//DECLARACION DE VARIABLES LOCALES
			
			int num=0, regresar=0,tok=0;
			String j,p;
				
				
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
					
					
					
					// aleatorio para ver quien empieza el juego
					
					Random turno=new Random();
					int n=1+turno.nextInt(2);
					if (n==1){
						System.out.println("Tu empiezas el juego "+j);
						System.out.println("El rival pc es el Segundo ");
					}
						else
						{
							System.out.println(""+j+"eres el segundo en jugar");
							System.out.println("Tu rival pc es quien empieza el juego ");
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
				
				
			
		
		
		}

	}

	

	
