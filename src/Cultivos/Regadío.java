package Cultivos;

public class Regadío extends Cultivo {
	private boolean seco;
	
	public Regadío(String nombre, int tiempoParaCrecer) {
		super(nombre, tiempoParaCrecer);
		seco=false;
	}

	@Override
	public void crecer() {
		if(agua>=50&nutrientes>=30) {
			tiempoParaCrecer--;
		}
		if(tiempoParaCrecer<=0) {
			florecida=true;
		}
		if(agua<10) {
			seco=true;
		}
	}
	
	public void regar() {
		this.agua+=10;
	}

	public boolean isSeco() {
		return seco;
	}

}
