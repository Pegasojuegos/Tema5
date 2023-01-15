
public abstract class Vehículo {
	protected int velocidadActual;
	
	public Vehículo(int velocidadActual) {
		this.velocidadActual=velocidadActual;
	}
	public Vehículo() {
		velocidadActual=0;
	}
	
	public abstract void acelerar();
	public abstract void frenar();
}
