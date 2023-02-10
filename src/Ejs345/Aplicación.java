package Ejs345;

public class Aplicación {
	public static int nom;
	
	public Aplicación(int a) {
		this.nom=a;
	}
	
	
	public static void main(String[] args) {
		ListaMultimedia lista=new ListaMultimedia(20);
		Multimedia p1=new Película("In Time", "Andrew Niccol", "dvd", 109, "Justin Timberlake", "Amanda Seyfried");
		Multimedia p2=new Película("Chaos Walking", "Doug Liman", "dvd", 109, "Tom Holland", "Daisy Ridley");
		Multimedia p3=new Película("Rubber", "Mr. Oizo", "avi", 85, "Stephen Spinella", "Roxane Mesquida");
		Multimedia d1=new Disco("Cry baby", "Melanie Martinez", "dvd", 65,"pop" );
		Multimedia d2=new Disco("Full Circle", "FFDP", "wav", 73,"rock" );
		Multimedia d3=new Disco("Mezmerize", "SOAD", "mp3", 95,"rock" );
		
		
		lista.add(p1);lista.add(p2);lista.add(p3);lista.add(d1);lista.add(d2);lista.add(d3);
		System.out.println(lista);
		/*Multimedia d4=new Disco(d3.título, d3.autor, "avi", 10, "rock");*/
		System.out.println(lista);
		
		Aplicación uno=new Aplicación(5);
		Aplicación dos=new Aplicación(7);
		System.out.println(uno.nom);
		
	}

}
