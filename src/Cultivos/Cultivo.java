package Cultivos;
/**
 * Esta clase abstracta define que elementos y métodos compartirán todas su subclases.
 * @author pegaso
 * @version 2.1*/
public abstract class Cultivo implements Comparable<Cultivo>{
	protected int agua;
	protected int nutrientes;
	protected int tiempoParaCosecha;
	protected final int tiempoEntreCosechas;
	protected String nombre;
	protected boolean cosechable;
	protected boolean recosechable;
	
	/**
	 * <b>Constructor</b> que define como se creara la parte de <i>cultivo</i> de todas sus subclases,
	 * las cuales heredarán esta parte (super) y añadirán la suya propia
	 * @param nombre Nombre de la planta, tiempoParaCrecer Días necesarios para que florezca,
	 * recosechable capacidad de volver a florezer tras la primera cosecha,agua y nutrientes cantidad que
	 * tiene la planta, se establece a 0,cosechable indica si la planta a florecido, tiempoEntreCosechas tiempo
	 * para la recosecha el cual es la mitad al que necesita para crecer*/
	public Cultivo(String nombre,int tiempoParaCrecer,boolean recosechable) {
		this.nombre=nombre;
		this.tiempoParaCosecha=tiempoParaCrecer;
		agua=0;
		nutrientes=0;
		cosechable=false;
		this.recosechable=recosechable;
		tiempoEntreCosechas=tiempoParaCrecer/2;
	}
	
	/**
	 * Método que comprueba si un cultivo se puede cosechar y si se puede lo cosecha.
	 * @return true si  se ha podido cosechar o false si no*/
	public boolean cosechar() {
		if(cosechable==true) {
			cosechable=false;
			tiempoParaCosecha=tiempoEntreCosechas;
			return true;
		}else return false;
	}
	
	/**Método abstracto que obliga a sus sublcases a estableces una método propio para indicar
	 * si una planta está muerta*/
	public abstract boolean isMuerta();
	
	/**Método que hace llover, aumentando el agua de la planta*/
	public void llover() {
		agua+=50;
	}
	
	/**Método para abonar la planta, incrementadno en 10 sus nutrientes*/
	public void abonar() {
		nutrientes+=10;
	}
	
	/**Método que escribe un Cultivo, indicando de manera visual sus estados
	 * @return String formado por el nombre de la planta, seguído de un "-" por cada día que le queda
	 * para florecer y un "⚜" si la planta ya puede ser cosechada*/
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

	/**Método heredado de Comparable, sobrescrito para que compare dos cultivos. La primera condición 
	 * por la que compata es el tiempo entre Cosecha, yendo antes los que menos tiempo tengan. En caso
	 * de igualdad comprueba si son recosechables, yendo antes las que sí lo son. Por último si las
	 * anteriores son iguales, los ordenará alfabéticamente.
	 * @param Un objeto de tipo Cultivo con el que comparar este cultivo.
	 * @return 1 si el cultivo pasado por parámetro es mayor, -1 si es menot y 0 si son iguales*/
	@Override
	public int compareTo(Cultivo c) {
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
	}
	
	/**Método abstracto que obliga a todas las subclases a implementar un método que indique como 
	 * crecerá la planta*/
	public abstract void crecer() ;

	/**Método que devuelve el tiempo que le queda para florecer
	 * @return Número de días que le quedán para florecer a la planta*/
	public int getTiempoParaCrecer() {
		return tiempoParaCosecha;
	}
	
	/**Método que devuelve el nombre de la planta.
	 * @return String con el nombre de la planta*/
	public String getNombre() {
		return nombre;
	}

	/**Método que indica si una planta es recosechable.
	 * @return true si es recosechable, false si no*/
	public boolean isRecosechable() {
		return recosechable;
	}

	/**Método que indica si una planta puede ser cosechada.
	 * @return true si ya puede ser cosechada, false si no*/
	public boolean isCosechable() {
		return cosechable;
	}
	
	
}
