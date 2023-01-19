package Cultivos;

public class Inventario {
	private String lista[];
	private int cantidad[];
	private int tamaño;
	
	public Inventario() {
		tamaño=0;
		lista=new String[0];
		cantidad=new int[0];
	}
	
	public void añadir(String item) {
		boolean  guardado=false;
		tamaño++;
		for(int i=0;i<lista.length;i++) {
			if(lista[i]==item) {
				cantidad[i]++;
				guardado=true;
			}
		}
		if(guardado==false) {
			String tem[]=new String[tamaño];
			int temNum[]=new int[tamaño];
			for(int i=0;i<lista.length;i++) {
				tem[i]=lista[i];
				temNum[i]=cantidad[i];
				if(i==lista.length-1) {
					temNum[i+1]=0;
				}
			}
			cantidad=temNum;
			lista=tem;
			for(int i=0;i<lista.length;i++) {
				if(lista[i]==null) {
					lista[i]=item;
					cantidad[i]++;
				}
			}
		}
	}

	public String toString() {
		String res="Inventario\n";
		for(int i=0;i<lista.length;i++) {
			res+=lista[i]+" "+cantidad[i]+"\n";
		}
		return res;
	}
}
