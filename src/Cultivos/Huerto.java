package Cultivos;

import java.util.Arrays;
/**Clase que almacena un array de Cultivos y un inventario de tipo String.
 * @author pegaso
 * @version 2.3*/
public class Huerto {
	private Cultivo huerto[];
	private Inventario inventario=new Inventario<String>();
	
	/**<b>Consructor</b> para crear un nuevo huerto con el tamaño indicado
	 * @param tamaño huecos del huerto.*/
	public Huerto(int tamaño) {
		huerto=new Cultivo[tamaño];
	}
	
	/**Método para añadir un ítem al inventario del huerto.
	 * @param item nombre del ítem.*/
	public void añadeAInventario(String item){
		inventario.añadir(item);
	}
	
	/**Método para ordenar el huerto, utilizando el compareTo de Cultivo.*/
	public void ordenar() {
		Arrays.sort(huerto);
	}
	
	/**Método que llama al método regar de un cultivo.
	 * @param nombre nombre del cultivo a regar.*/
	public void regar(String nombre) {
		for(int i=0;i<huerto.length;i++) {
			if(huerto[i]!=null) {
				if(huerto[i].getNombre().equals(nombre)&huerto[i] instanceof Regadío) {
					((Regadío)huerto[i]).regar();
				}
			}
		}
	}
	
	/**Método para regar todos los cultivos que sean de regadío.*/
	public void regar() {
		for(int i=0;i<huerto.length;i++) {
			if(huerto[i]!=null) {
				if(huerto[i] instanceof Regadío) {
					((Regadío)huerto[i]).regar();
				}
			}
		}
	}
	
	/**Método que llama al método de abonar de un cultivo.
	 * @param nombre nombre del cultivo a abonar.*/
	public void abonar(String nombre) {
		for(int i=0;i<huerto.length;i++) {
			if(huerto[i]!=null) {
				if(huerto[i].getNombre().equals(nombre)) {
					huerto[i].abonar();
				}
			}
		}
	}

	/**Método para abonar todos los cultivos del huerto.*/
	public void abonar() {
		for(int i=0;i<huerto.length;i++) {
			if(huerto[i]!=null) {
				huerto[i].abonar();
			}
		}
	}
	
	/**Método que avanza un día con una probabilidad de que llueva y llamando a crecer*/
	public void pasarDía() {
		int llover=(int)(Math.random()*10+1);
		for(int i=0;i<huerto.length;i++) {
			if(huerto[i]!=null) {
				if(llover<=4) huerto[i].llover();
				huerto[i].crecer();
				if(huerto[i].isMuerta()==true)huerto[i]=null;
			}
		}
	}
	
	/**Método que cosecha un cultivo concreto.
	 * @param nombre nombre del cultivo a cosechar.*/
	public void cosechar(String nombre) {
		for(int i=0;i<huerto.length;i++) {
			if(huerto[i]!=null) {
				if(huerto[i].getNombre().equals(nombre)) {
					if(huerto[i].cosechar()==true) inventario.añadir(huerto[i].nombre);
					if(huerto[i].isRecosechable()==false)huerto[i]=null;
				}
			}
		}
	}
	
	/**Método que cosecha todos los cultivos cosechables*/
	public void cosechar() {
		for(int i=0;i<huerto.length;i++) {
			if(huerto[i]!=null) {
				if(huerto[i].cosechar()==true) inventario.añadir(huerto[i].nombre);
				if(huerto[i].isRecosechable()==false&huerto[i].isCosechable()==true)huerto[i]=null;
			}
		}
	}
	
	/**Método que planta un cultivo en el huerto.
	 * @param c1 Cultivo a plantar.*/
	public void plantar(Cultivo c1) {
		for(int c=0;c<huerto.length;c++) {
			if(huerto[c]==null) {
				if(c1 instanceof Regadío) {
					huerto[c]=new Regadío(c1.getNombre(), c1.getTiempoParaCrecer(),c1.isRecosechable());
					break;
				}
				if(c1 instanceof Secano) {
					huerto[c]=new Secano(c1.getNombre(), c1.getTiempoParaCrecer(),c1.isRecosechable());
					break;
				}
			}//if
		}//for
	}//plantar
	
	/**Método que esribe en verde cada Cultivo, llamando a su propio método toString.
	 * @return String con todos los cultivos.*/
	public String toString() {
		StringBuilder res=new StringBuilder();
		res.append("\u001B[32m");
		for(Cultivo c:huerto) {
			if(c!=null) {
				res.append(c);
				res.append("\n");
			}
		}
		res.append("\u001B[0m");
		return res.toString();
	}

	/**Método para obtener el inventario interno del huerto.
	 * @return inventario del huerto.*/
	public Inventario getInventario() {
		return inventario;
	}
}
