
public class Camión extends Vehículo{
	protected int peso;
	protected int longitud;
	protected String carga;
	
	public Camión(int velocidadActual,int longitud, int peso,String carga) {
		super(velocidadActual);
		this.carga=carga;
		this.peso=peso;
		this.longitud=longitud;
		
	}
	
	
	@Override
	public void acelerar() {
		velocidadActual+=velocidadActual/10+1;
	}

	@Override
	public void frenar() {
		velocidadActual-=10;
	}

}
