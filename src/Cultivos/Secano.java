package Cultivos;
/**@author pegaso
 * @version 1.0
 * Esta subclase crea cultivos de tipo secano, la cual tiene la capacidad de ahogarse,
 * y sobreescribe el metodo crecer*/
public class Secano extends Cultivo {
	private boolean ahogada;
	
	/**<b>Constructor</b> para ser de secano
	 * @param (super) parte heredada de Cultivo, ahogada boolean que indica si la planta se ha ahogado*/
	public Secano(String nombre, int tiempoParaCrecer,boolean recosechable) {
		super(nombre, tiempoParaCrecer, recosechable);
		ahogada=false;
	}

	/**Método que comprueba las cantidades de agua y nutrientes para reducir el tiempo que queda para
	 * la cosecha, si llega a 0 florece. Tabién comprueba la cantidad de agua y si tiene más de 1020 se ahoga*/
	@Override
	public void crecer() {
		if(agua>=30) tiempoParaCosecha--;agua-=30;
		if(nutrientes>=10) tiempoParaCosecha--;nutrientes-=10;
		if(tiempoParaCosecha<=0) cosechable=true;
		if(agua>120) ahogada=true;
	}

	/**Comprueba si la planta está muerta (ahogada).
	 * @return ahogada boolean que índica si la planta está ahogada o no*/
	public boolean isMuerta() {
		return ahogada;
	}

}
