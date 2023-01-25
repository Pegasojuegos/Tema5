package Cultivos;

public abstract class Cultivo implements Comparable<Cultivo>{
	protected int agua;
	protected int nutrientes;
	protected int tiempoParaCosecha;
	protected final int tiempoEntreCosechas;
	protected String nombre;
	protected boolean cosechable;
	protected boolean recosechable;
	
	@Override
	public int compareTo(Cultivo c) {
<<<<<<< HEAD
		
=======
		//condición principal
		if(this.tiempoEntreCosechas>c.tiempoEntreCosechas)return 1;
		else if(this.tiempoEntreCosechas<c.tiempoEntreCosechas)return -1;
		//condición secundaria
		else if(this.isRecosechable()==false&c.isRecosechable())return 1;
		else if(this.isRecosechable()&c.isRecosechable()==false)return -1;
		//condición terciaria
		else if(this.nombre.compareTo(c.nombre)>0)return 1;
		else if(this.nombre.compareTo(c.nombre)<0)return -1;
		else return 0;
>>>>>>> abd1fc29b5b0ec6c2adf99eaa32575e0bd6e41fe
	}
	
	public Cultivo(String nombre,int tiempoParaCrecer,boolean recosechable) {
		this.nombre=nombre;
		this.tiempoParaCosecha=tiempoParaCrecer;
		agua=0;
		nutrientes=0;
		cosechable=false;
		this.recosechable=recosechable;
		tiempoEntreCosechas=tiempoParaCrecer/2;
	}
	
	public abstract boolean isMuerta();
	
	public void llover() {
		agua+=50;
	}
	
	public void abonar() {
		nutrientes+=10;
	}
	
	public abstract void crecer() ;

	public int getTiempoParaCrecer() {
		return tiempoParaCosecha;
	}
	
	public boolean cosechar() {
		if(cosechable==true) {
			cosechable=false;
			tiempoParaCosecha=tiempoEntreCosechas;
			return true;
		}else return false;
	}

	public String toString() {
		StringBuilder res=new StringBuilder();
		res.append(nombre+":");
		if(tiempoParaCosecha<=0) {
			res.append('⚜');
		}else
		for(int i=0;i<tiempoParaCosecha;i++) {
			res.append('-');
		}
		return res.toString();
	}
	
	public String getNombre() {
		return nombre;
	}

	public boolean isFlorecida() {
		return cosechable;
	}

	public boolean isRecosechable() {
		return recosechable;
	}

	public boolean isCosechable() {
		return cosechable;
	}
	
	
}
