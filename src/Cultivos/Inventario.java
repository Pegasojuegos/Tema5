package Cultivos;

/**Clase  genérica, guarda un inventario del tipo de datos pedido, cuando uno de ellos se repite lo  cuenta.
 *@author pegaso
 *@version 2.3 */
public class Inventario<T> {
	private T lista[];
	private int cantidad[];
	private int tamaño;
	
	/**<b>Constructor</b> para crear un nuevo inventario.*/
	public Inventario() {
		tamaño=0;
		lista=(T[]) new String[0];
		cantidad=new int[0];
	}
	
	/**Método privado que ordena la lista por cantidad de un mismo item y por orden alfabético.*/
	private void ordenar() {
		for(int i=0;i<cantidad.length-1;i++) {
			for(int j=i;j<cantidad.length;j++) {
				if(cantidad[i]<cantidad[j]) {
					intercambio(i,j);
				}else {
					if(cantidad[i]==cantidad[j]) {
						if(((String) lista[i]).compareTo((String) lista[j])>0) {
							intercambio(i,j);
						}
					}
				}
			}
		}
	}
	
	/**Método que aumenta en uno el tamaño de la lista y añade el item dado.
	 * @param item objeto a añadir*/
	public void añadir(T item) {
		for(int i=0;i<lista.length;i++){
			if(lista[i]!=null) {
				if(lista[i].equals(item)) {
					cantidad[i]++;
					return;
				}
			}
		}
		//Si sale del bucle es que todavía no esta ese item guradado
		T nuevo[]=(T[]) new Object[lista.length+1];
		int nuevoNum[]=new int[cantidad.length+1];
		for(int i=0;i<lista.length;i++) {
			nuevo[i]= lista[i];
			nuevoNum[i]=cantidad[i];
		}
		nuevo[nuevo.length-1]=item;
		nuevoNum[nuevoNum.length-1]++;
		lista=(T[]) nuevo;
		cantidad=nuevoNum;
	}

	public String toString() {
		ordenar();
		String res="Inventario\n";
		for(int i=0;i<lista.length;i++) {
			res+=lista[i].toString()+" "+cantidad[i]+"\n";
		}
		return res;
	}
	private void intercambio(int i,int j) {
		int aux1=cantidad[i];
		cantidad[i]=cantidad[j];
		cantidad[j]=aux1;
		T aux2= lista[i];
		lista[i]=lista[j];
		lista[j]= aux2;
	}
}
