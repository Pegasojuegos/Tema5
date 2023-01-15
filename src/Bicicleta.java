
public class Bicicleta extends Vehículo implements Imprimible{
	protected int platoActual;
	protected int piñonActual;
	protected final int platoDefecto=1;
	protected final int piñonDefecto=1;
	
	
	public Bicicleta(int velocidadActual, int platoActual, int piñonActual) {
		super(piñonActual);
		this.velocidadActual = velocidadActual;
		this.platoActual = platoActual;
		this.piñonActual = piñonActual;
	}
	public Bicicleta() {
		velocidadActual=0;
		platoActual=platoDefecto;
		piñonActual=piñonDefecto;
	}
	
	public void acelerar() {
		if(velocidadActual<=0)velocidadActual=1;
		velocidadActual*=2;
	}
	public void frenar() {
		velocidadActual/=2;
	}
	public void cambiarPlato(int plato) {
		platoActual=plato;
	}
	public void cambiarPiñon(int piñon) {
		piñonActual=piñon;
	}
	public void cambiarPlato() {
		platoActual=platoDefecto;
	}
	public void cambiarPiñon() {
		piñonActual=piñonDefecto;
	}
	@Override
	public void imprime() {
		System.out.println("Velocidad: "+velocidadActual+"\nPiñón: "+piñonActual+"\nPlato: "+platoActual);
	}
	@Override
	public int[] getAtributos() {
		int res[]= {piñonActual,platoActual};
		return res;
	}
	
	public int getVelocidadActual() {
		return velocidadActual;
	}
	public void setVelocidadActual(int velocidadActual) {
		this.velocidadActual = velocidadActual;
	}
	public int getPlatoActual() {
		return platoActual;
	}
	public void setPlatoActual(int platoActual) {
		this.platoActual = platoActual;
	}
	public int getPiñonActual() {
		return piñonActual;
	}
	public void setPiñonActual(int piñonActual) {
		this.piñonActual = piñonActual;
	}
	public int getPlatoDefecto() {
		return platoDefecto;
	}
	public int getPiñonDefecto() {
		return piñonDefecto;
	}

	
	
	

}
