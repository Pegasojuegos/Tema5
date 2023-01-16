package Cultivos;

public abstract class Cultivo {
	protected int agua;
	protected int nutrientes;
	protected int tiempoParaCrecer;
	protected String nombre;
	protected boolean florecida;
	
	public Cultivo(String nombre,int tiempoParaCrecer) {
		this.nombre=nombre;
		this.tiempoParaCrecer=tiempoParaCrecer;
		agua=0;
		nutrientes=0;
		florecida=false;
		
	}
	
	public void llover() {
		agua+=50;
	}
	
	public void abonar() {
		nutrientes+=10;
	}
	
	public abstract void crecer() ;

	public int getTiempoParaCrecer() {
		return tiempoParaCrecer;
	}

	public String getNombre() {
		return nombre;
	}

	public boolean isFlorecida() {
		return florecida;
	}
	
	
}
