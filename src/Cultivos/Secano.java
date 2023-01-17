package Cultivos;

public class Secano extends Cultivo {
	private boolean ahogada;
	
	public Secano(String nombre, int tiempoParaCrecer,boolean recosechable) {
		super(nombre, tiempoParaCrecer, recosechable);
		ahogada=false;
	}

	@Override
	public void crecer() {
		if(agua>=30) tiempoParaCosecha--;
		if(nutrientes>=10) tiempoParaCosecha--;
		if(tiempoParaCosecha<=0) cosechable=true;
		if(agua>120) ahogada=true;
	}

	public boolean isAhogada() {
		return ahogada;
	}

}
