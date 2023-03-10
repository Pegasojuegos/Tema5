package Cultivos;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
/**Clase que contiene el método main.
 * @author pegaso
 * @version 2.3*/
public class Granja {
	/**Escanes para pedir datos  por pantalla.*/
	public static Scanner s=new Scanner(System.in);
	/**String con saltos de línea para <i>"limpiar"</i> la consola.*/
	public static final String limpiar="\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n";
	/**String que guardará mometáneamente lo que se ha pescado.*/
	public static String pesca;

	/**Método main que inicia un juego en el que pordás organizar un huerto y pescar.
	 * @param args argumentos del main*/
	public static void main(String[] args) {
		Huerto h1=new Huerto(5);
		/*Prueba de que finciona el programa sin interacción
		Cultivo fresa=new Regadío("Fresa", 8,true);
		Cultivo remolacha=new Regadío("Remolacha",6,false);
		Cultivo carambola=new Regadío("Carambola",13,false);
		Cultivo judías=new Secano("Judías",10,true);
		Cultivo patata=new Secano("Patata",6,false);
		
		h1.plantar(fresa);h1.plantar(patata);h1.plantar(judías);h1.plantar(carambola);h1.plantar(remolacha);
		System.out.println(h1);
		for(int i=0;i<12;i++) {
			h1.pasarDía();
			h1.regar();
			h1.abonar();
		}
		System.out.println(h1);
		h1.cosechar();
		System.out.println(h1);
		*/
		//Para iniciar va contando la historia mientras pide datos para crear el huerto y los cultivos
		System.out.println(""
				+ "Tras un largo viaje acabas de llegar a la granja de tu tío Anakin, ya que por\n"
				+ "problemas económicos has decidido pasarte una temporada en el campo.\n"
				+ "¡Bienvenido al Valle de las Som"
				+ "ras!\n"
				+ "Nada más llegar tu tío te pide que te encargues del huerto que tiene detrás\n"
				+ "del jardín, quiere que plantes unos cuantos cultivos y te encargues de ellos\n"
				+ "mientras dure tu estancia para así poder quitarle un poco de la carga de\n"
				+ "trabajo que conlleva vivir del campo.\n"
				+ "Como buen sobrino te diriges al huerto, coges una hoz y aras el pequeño\n"
				+ "terreno, observándos trozos para en\n"
				+ "cada uno poder plantar un cultivo distinto\n"
				+ "\n¿En cuantos trozos lo divides?\n"
				+ "");
		h1=new Huerto(s.nextInt());
		System.out.println(""
				+ "Una vez arado y organizadas las diferentes zonas decides ir a una caseta\n"
				+ "que hay al lado a buscar unas cuantas semillas.\n"
				+ "\n¿Cuántas plantas quieres cultivar?\n"
				+ "");
		int cantidad=s.nextInt();
		s.nextLine();
		System.out.println("Te acercas a una estantería para coger "+cantidad +" bolsitas de semillas, y ves\n"
				+ "que cada una tiene su nombre, días que tardará  en crecer, si son\n"
				+ "de secano o regadío y si son recosechables una vez dan su primera cosecha.\n"
				+ "\n¿Qué semillas decides coger?\n");
		for(int i=0;i<cantidad;i++) {
			System.out.print("Semillas "+(i+1)+"\n   -Nombre: ");
			String nombre=s.nextLine();
			System.out.print("   -Días que tarda en crecer: ");
			int días=s.nextInt();
			System.out.print("   -Recosechables(true/false): ");
			boolean recosechables=s.nextBoolean();
			s.nextLine();
			System.out.print("   -secano o regadío: ");
			String tipo = s.nextLine();
			boolean valido=false;
			while(valido==false) {
				switch(tipo) {
				case "secano":
					h1.plantar(new Secano(nombre, días, recosechables));
					valido=true;
					break;
				case "regadío":
					h1.plantar(new Regadío(nombre,días,recosechables));
					valido=true;
					break;
				default:
					valido=false;
				}
			}
		}
		System.out.println("Coges todas las semillas y las vas esparciendo por cada parcela que habías\n"
				+ "creado, ahora solo queda esperar e ir regando y abonado de vez en cuando.\n"
				+ "Solo tendrás que introducir el número de la opción que quieres realizar.\n");
		
		boolean cerrar=false;
		
		//Una vez creado entra en un bucle en el que pedirá operaciones y las realizara mostrando el resultado
		while(cerrar==false) {
			cerrar=operación(h1);
		}
	}
	/**Función que muestra las opciones y pide la operación a realizar. 
	 * @param h1 Huerto que se está utilizando.
	 * @return true si se decide cerrar el programa o false si continua.*/
	public static boolean operación(Huerto h1) {
		String opciones=""
				+ "\nOpciones:\n"
				+ "  -1.Plantar semillas\n"
				+ "  -2.Regar\n"
				+ "  |-2.1.Todo\n"
				+ "  |-2.2.Una en concreto\n"
				+ "  -3.Abonar\n"
				+ "  |-3.1.Todo\n"
				+ "  |-3.2.Una en concreto\n"
				+ "  -4.Cosechar\n"
				+ "  |-4.1.Todo\n"
				+ "  |-4.2.Una en concreto\n"
				+ "  -5.Dormir\n"
				+ "  -6.Pescar\n"
				+ "  -7.Inventario\n"
				+ "  -8.Ordenar huerto";
		StringBuilder res=new StringBuilder();
		res.append(h1.toString()+opciones);
		System.out.println(res);
		String opción=s.nextLine();
		String nom;
		//Compara la opción elegida con las disponibles y la realiza
		switch(opción) {
		case "1":
			plantar(h1);
			return false;
		case "2.1":
			h1.regar();
			break;
		case "2.2":
			System.out.println("¿Que planta quieres regar?");
			nom=s.nextLine();
			h1.regar(nom);
			return false;
		case "3.1":
			h1.abonar();
			return false;
		case "3.2":
			System.out.println("¿Que planta quieres abonar?");
			nom=s.nextLine();
			h1.abonar(nom);
			return false;
		case "4.1":
			h1.cosechar();
			return false;
		case "4.2":
			System.out.println("¿Que planta quieres cosechar?");
			nom=s.nextLine();
			h1.cosechar(nom);
			return false;
		case "5":
			h1.pasarDía();
			try {
				dormir();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return false;
		case "6":
			try {
				pesca=Pesca.pescar();
				System.out.println(pesca);
				h1.añadeAInventario(pescado(pesca));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			s.nextLine();
			return false;
		case "7":
			System.out.println(h1.getInventario());
			s.nextLine();
			return false;
		case "8":
			h1.ordenar();
			return false;
		case "cerrar":
			return true;
		default:
			return false;
		}
		return false;
	}
	
	/**Función que te pide los datos necesatios para llamar al metodo de huerto.plantar
	 * @param h1 Huerto en el que plantar el Cultivo.*/
	public static void plantar(Huerto h1) {
		System.out.println("\n¿Cuántos cultivos quieres plantar?");
		int cantidad=s.nextInt();
		s.nextLine();
		System.out.println("\n¿Que semillas vas a plantar?");
		for(int i=0;i<cantidad;i++) {
			System.out.print("Semillas "+(i+1)+"\n   -Nombre: ");
			String nombre=s.nextLine();
			System.out.print("   -Días que tarda en crecer: ");
			int días=s.nextInt();
			System.out.print("   -Recosechables(true/false): ");
			boolean recosechables=s.nextBoolean();
			s.nextLine();
			System.out.println("   -secano o regadío: ");
			String tipo;
			boolean valido=false;
			while(valido==false) {
				tipo = s.nextLine();
				switch(tipo) {
				case "secano":
					h1.plantar(new Secano(nombre, días, recosechables));
					valido=true;
					break;
				case "regadío":
					h1.plantar(new Regadío(nombre,días,recosechables));
					valido=true;
					break;
				default:
					System.out.println("Tipo erroneo");
					valido=false;
				}
			}
		}
	}
	
	/**Función que hace una animación de dormir mientras avanza el día.
	 * @throws InterruptedException excepción lanzada si otra tarea le manda una interrupción y esta está parada*/
	public static void dormir() throws InterruptedException {
		String uno=""
				+ "\n"
				+ "  ()_()\n"
				+ "  (-.-)\n"
				+ " c(\")(\")";
		String dos=""
				+ "\n"
				+ "  ()_()\n"
				+ "  (-.-)z\n"
				+ " c(\")(\")";
		String tres=""
				+ "\n"
				+ "  ()_()  z\n"
				+ "  (-.-)\n"
				+ " c(\")(\")";
		String cuatro=""
				+ "        z\n"
				+ "  ()_()\n"
				+ "  (-.-)\n"
				+ " c(\")(\")";
		for(int i=0;i<2;i++) {
			System.out.println(limpiar+uno);
			Thread.sleep(250);
			System.out.println(limpiar+dos);
			Thread.sleep(250);
			System.out.println(limpiar+tres);
			Thread.sleep(250);
			System.out.println(limpiar+cuatro);
			Thread.sleep(250);
		}
	}
	/**Función que extrae en nombre del pescado del String dado por el metodo pescar().
	 * @param pez String devuelto por el método pescar()
	 * @return String nombre del pescado obtenido*/
	public static String pescado(String pez) {
		String res="";
		if(pez.contains("un ")) {
			for(int i=pez.lastIndexOf("un ")+3;i<pez.length()-1;i++) {
				res+=pez.charAt(i);
			}
		}
		if(pez.contains("una ")) {
			for(int i=pez.lastIndexOf("una ")+4;i<pez.length()-1;i++) {
				res+=pez.charAt(i);
			}
		}
		return res;
	}
	
	

}
