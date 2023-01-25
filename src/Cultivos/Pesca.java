package Cultivos;

/**@author pegaso
 * @version 2.1
 * Clase final que no permite crear instancias de ella, sino que guarda una lista de peces los cuales
 * pueden ser pescados llamando a su método.*/
public final class Pesca {
	static final String peces[]= {"un Bacalao","un Salmón","un Pez globo","una Anchoa","un Atún","una Sardina","un Besugo","una Perca","una Lubina","una Trucha arcoíris","un Lucio","un Cachuelo","una Carpa","un Pez gato","un Saturi","un Pez sol","un Salmonete","un Arenque","una Anguila","un Pulpo","un Pargo colorado","un Calamar","un Pepino de mar","un Superpepino","un Pez fantasma","un Pez piedra","un Pez carámbano","una Anguila de lava","un Lenguado","una Carpa escorpión","una Platija","una Carpa medianoche","un Esturión","una Trucha tigre","un Siluro","una Tilapia","un Bardo","un Dorado","un Atún blanco","un Sábalo","un Bacalao largo","un Fletán","un Muyu","un Salmón sombrío","un Babolín","un Mantarraya","un Pez león","un Pez disco","un Rape","una Carpa mutante D:","una gambita :D","un caracolcito :D","una bota","una piedra","una bolsa de plástico","un calcetín"};
	
	/**Método que escribe por pantalla a un conegito pescando, simulando una animación. Al final  pesca
	 * un pez aleatório
	 * @return  string dando la enhorabuena y diciendo que pez has pescado*/
	public static String pescar() throws InterruptedException {
		String limpiar="\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n";
		String pescador=""
				+ "         /| \n"
				+ "  ()_() / |\n"
				+ "  (^.^)/  |\n"
				+ " c(\")(\")  |\n"
				+ "-------|  |\n"
				+ "~~~~~~~~~~|~~~";
		String pescador1=""
				+ "       ! /| \n"
				+ "  ()_() / |\n"
				+ "  (^.^)/  |\n"
				+ " c(\")(\")  |\n"
				+ "-------|  |\n"
				+ "~~~~~~~~~~|~~~";
		String pescador2=""
				+ "         /| \n"
				+ "  ()_() / |\n"
				+ "  (^.^)/  |\n"
				+ " c(\")(\")  |\n"
				+ "-------|  |\n"
				+ "~~~~~~~~~~J~~~";
		String pescador3=""
				+ "         /| \n"
				+ "  ()_() / |\n"
				+ "  (^.^)/  |\n"
				+ " c(\")(\")  |\n"
				+ "-------|  J\n"
				+ "~~~~~~~~~~~~~~";
		String pescador4=""
				+ "         /| \n"
				+ "  ()_() / |\n"
				+ "  (^.^)/  |\n"
				+ " c(\")(\")  J\n"
				+ "-------|   \n"
				+ "~~~~~~~~~~~~~~";
		String pescador5=""
				+ "         /| \n"
				+ "  ()_() / |\n"
				+ "  (^.^)/  J\n"
				+ " c(\")(\")   \n"
				+ "-------|   \n"
				+ "~~~~~~~~~~~~~~";
		System.out.println(limpiar+pescador);
		Thread.sleep((long)((Math.random()*1000)+200));
		System.out.println(limpiar+pescador1);
		Thread.sleep(250);
		System.out.println(limpiar+pescador);
		Thread.sleep(100);
		System.out.println(limpiar+pescador2);
		Thread.sleep(100);
		System.out.println(limpiar+pescador3);
		Thread.sleep(100);
		System.out.println(limpiar+pescador4);
		Thread.sleep(100);
		System.out.println(limpiar+pescador5);
		Thread.sleep(100);
		return "¡Enhorabuena pescaste "+peces[(int)(Math.random()*peces.length)]+"!" ;
	}
}
