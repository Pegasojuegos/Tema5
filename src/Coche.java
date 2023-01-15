
public class Coche extends Vehículo{
	protected int puertas;
	protected int caballos;
	protected String combustible;
	
	public Coche(int velocidadActual,int puertas,int caballos,String combustible) {
		super(velocidadActual);
		this.caballos=caballos;
		this.combustible=combustible;
		this.puertas=puertas;
	}

	@Override
	public void acelerar() {
		velocidadActual*=(caballos/10);
	}

	@Override
	public void frenar() {
		velocidadActual-=velocidadActual*0.25;
	}
}
