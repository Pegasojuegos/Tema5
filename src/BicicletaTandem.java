
public class BicicletaTandem extends Bicicleta{
	int numAsientos;
	
	public BicicletaTandem (int velocidadActual,int piñonActual,int platoActual) {
		super(velocidadActual,piñonActual,platoActual);
		
	}
	
	public void acelerar() {
		velocidadActual*=4;
	}
	public void acelerarB() {
		super.acelerar();
	}
}
