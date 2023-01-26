package Cultivos;
/**Esta subclase crea cultivos de tipo regadío, la cual tiene la capacidad de secarse, y de ser regada
 * y sobreescribe el metodo crecer.
 * *@author pegaso
 * @version 1.0*/
public class Regadío extends Cultivo {
	private boolean seco;
	
	/**<b>Constructor</b> para ser de regadío
	 * @param nombre nombre del Cultivo
	 * @param tiempoParaCrecer es el tiempo necesario para dar la primera cosecha
	 * @param recosechable indica si se puede volver a cosechar tras la primera cosecha
	 * */	
	public Regadío(String nombre, int tiempoParaCrecer,boolean recosechable) {
		super(nombre, tiempoParaCrecer, recosechable);
		seco=false;
	}//FinConstructor

	
	/**Método que comprueba las cantidades de agua y nutrientes para reducir el tiempo que queda para
	 * la cosecha, si llega a 0 florece. Tabién reduce el agua de la planta y si tiene menos de 10 se seca*/
	@Override
	public void crecer() {
		if(agua>=50) tiempoParaCosecha--;agua-=30;
		if(nutrientes>=30) 	tiempoParaCosecha--;nutrientes-=30;
		if(tiempoParaCosecha<=0) cosechable=true;
		if(agua<10) seco=true;
		agua--;
	}
	
	/**Método que aumenta el agua de la planta regándola*/
	public void regar() {
		this.agua+=10;
	}

	/**Comprueba si la planta está muerta (seca).
	 * @return seco boolean que índica si la planta está seca o no*/
	public boolean isMuerta() {
		return seco;
	}

}
