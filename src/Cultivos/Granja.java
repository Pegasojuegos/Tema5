package Cultivos;

import java.util.Scanner;

public class Granja {

	public static void main(String[] args) {
		Huerto h1=new Huerto(5);
		Cultivo fresa=new Regadío("Fresa", 8,true);
		Cultivo remolacha=new Regadío("Remolacha",6,false);
		Cultivo carambola=new Regadío("Carambola",13,false);
		Cultivo judías=new Secano("Judías",10,true);
		Cultivo patata=new Secano("Patata",6,false);
		Scanner s=new Scanner(System.in);
		
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
		System.out.println(""
				+ "Tras un largo viaje acabas de llegar a la granja de tu tío Anakin, ya que por\n"
				+ "problemas económicos has decidido pasarte una temporada en el campo.\n"
				+ "¡Bienvenido al Valle de las Sombras!\n"
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
			System.out.println("   -secano o regadío: ");
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
			System.out.println("Coges todas las semillas y las vas esparciendo por cada parcela que habías\n"
					+ "creado, ahora solo queda esperar e ir regando y abonado de vez en cuando.\n"
					+ "Solo tendrás que introducir el número de la opción que quieres realizar.\n");
		}
		boolean cerrar=false;
		while(cerrar==false) {
			cerrar=operación(h1);
		}
	}
	public static boolean operación(Huerto h1) {
		String opciones="";
		StringBuilder res=new StringBuilder();
		res.append(h1);
	}
	

}
