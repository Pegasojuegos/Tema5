package Cultivos;

import java.util.Arrays;

public class pruebaArray {
	public static void main(String[] args) throws InterruptedException {
		Huerto h1 = new Huerto(5);
		Cultivo fresa=new Regadío("Fresa", 8,true);
		Cultivo remolacha=new Regadío("Remolacha",6,false);
		Cultivo carambola=new Regadío("Carambola",13,false);
		Cultivo judías=new Secano("Judías",8,false);
		Cultivo patata=new Secano("Patata",6,false);
		
		h1.plantar(fresa);h1.plantar(patata);h1.plantar(judías);h1.plantar(carambola);h1.plantar(remolacha);
		System.out.println(h1);
		h1.ordenar();
		System.out.println(h1);
				
	}

}
