package Ejs345;

import java.util.Arrays;

public class ListaMultimedia {
	private int cantidad;
	private Multimedia lista[];
	private Multimedia defecto=new Multimedia("a", "a", "mp3", 5);
	
	public ListaMultimedia(int cantidad) {
		this.cantidad=cantidad;
		this.lista=new Multimedia[cantidad];
		for(int i=0;i<lista.length;i++) {
			lista[i]=defecto;
		}
		
	}
	
	public int size() {
		int cont=0;
		for (Multimedia m:lista) {
			if(!m.equals(defecto)) {
				cont++;
			}
		}
		return cont;
	}
	
	public boolean add(Multimedia m) {
		for (Multimedia i:lista) {
			if(!i.equals(m)) {
				i=m;
				return true;
			}
		}
		return false;
	}
	
	public Multimedia get(int posición) {
		if(posición<lista.length) {
			return lista[posición];
		}
		else {
			return null;
		}
	}

	@Override
	public String toString() {
		StringBuilder res=new StringBuilder();
		for(Multimedia m:lista) {
			res.append(m.toString());
			res.append("\n");
		}
		return res.toString();
	}
	
	
}
