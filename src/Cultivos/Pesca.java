package Cultivos;

import java.util.Scanner;

public final class Pesca {
	static final String peces[]= {"un Bacalao","un Salmón","un Pez globo","una Anchoa","un Atún","una Sardina","un Besugo","una Perca","una Lubina","una Trucha arcoíris","un Lucio","un Cachuelo","una Carpa","un Pez gato","un Saturi","un Pez sol","un Salmonete","un Arenque","una Anguila","un Pulpo","un Pargo colorado","un Calamar","un Pepino de mar","un Superpepino","un Pez fantasma","un Pez piedra","un Pez carámbano","una Anguila de lava","un Lenguado","una Carpa escorpión","una Platija","una Carpa medianoche","un Esturión","una Trucha tigre","un Siluro","una Tilapia","un Bardo","un Dorado","un Atún blanco","un Sábalo","un Bacalao largo","un Fletán","un Muyu","un Salmón sombrío","un Babolín","un Mantarraya","un Pez león","un Pez disco","un Rape","una Carpa mutante D:","una gambita :D","un caracolcito :D","una bota","una piedra","una bolsa de plástico","un calcetín"};
	
	public static String pescar() {
		String pescador=""
				+ "         /| \n"
				+ "  ()_() / |\n"
				+ "  (^.^)/  |\n"
				+ " c(\")(\")  |\n"
				+ "-------|  |\n"
				+ "~~~~~~~~~~|~~~";
		System.out.println(pescador);
		Scanner s=new Scanner(System.in);
		s.nextLine();
		return "¡Henorabuna pescaste "+peces[(int)(Math.random()*peces.length)]+"!" ;
	}
}
