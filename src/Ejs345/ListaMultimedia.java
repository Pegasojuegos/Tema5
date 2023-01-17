package Ejs345;

import java.util.Arrays;

public class ListaMultimedia {
	private int cantidad;
	private Multimedia lista[];
	
	
	public ListaMultimedia(int cantidad) {
		this.cantidad=cantidad;
		this.lista=new Multimedia[cantidad];
		
		
	}
	
	public int size() {
		int cont=0;
		for (Multimedia m:lista) {
			if(m!=null) {
				cont++;
			}
		}
		return cont;
	}
	
	public boolean add(Multimedia m) {
		for (int i=0;i<lista.length;i++) {
			if(lista[i]==null) {
				lista[i]=m;
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
			if(m!=null) {
			res.append(m.toString());
			res.append("\n");
			}
		}
		return res.toString();
	}
	
	
}
