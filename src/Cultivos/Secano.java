package Cultivos;

public class Secano extends Cultivo {
	private boolean ahogada;
	
	public Secano(String nombre, int tiempoParaCrecer) {
		super(nombre, tiempoParaCrecer);
		ahogada=false;
	}

	@Override
	public void crecer() {
		if(agua>=20&nutrientes>=10) {
			tiempoParaCrecer--;
		}
		if(tiempoParaCrecer<=0) {
			florecida=true;
		}
		if(agua>120) {
			ahogada=true;
		}		
	}

	public boolean isAhogada() {
		return ahogada;
	}

}
