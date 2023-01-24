package Cultivos;
/**@author pegaso
 * @version 1.0
 * */
public class Regadío extends Cultivo {
	private boolean seco;
	
	public Regadío(String nombre, int tiempoParaCrecer,boolean recosechable) {
		super(nombre, tiempoParaCrecer, recosechable);
		seco=false;
	}

	@Override
	public void crecer() {
		if(agua>=50) tiempoParaCosecha--;agua-=30;
		if(nutrientes>=30) 	tiempoParaCosecha--;nutrientes-=30;
		if(tiempoParaCosecha<=0) cosechable=true;
		if(agua<10) seco=true;
		agua--;
	}
	
	public void regar() {
		this.agua+=10;
	}

	public boolean isMuerta() {
		return seco;
	}

}
