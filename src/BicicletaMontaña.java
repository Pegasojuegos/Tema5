
public class BicicletaMontaña extends Bicicleta{
	private int suspensión;
	
	public BicicletaMontaña(int velocidadActual,int piñonActual,int platoActual) {
		super(velocidadActual,piñonActual,platoActual);
		
	}
	
	public void cambiarSuspensión(int suspensión) {
		this.suspensión=suspensión;
	}
	
	public void acelerar() {
		velocidadActual*=3;
	}
	public void acelerarB() {
		super.acelerar();
	}
}
