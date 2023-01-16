package Cultivos;

public class Granja {

	public static void main(String[] args) {
		Huerto h1=new Huerto(5);
		Cultivo Fresa=new Regadío("Fresa", 8);
		
		
		h1.plantar(Fresa);
	}

}
