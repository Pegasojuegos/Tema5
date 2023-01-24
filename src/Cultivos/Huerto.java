package Cultivos;

public class Huerto {
	private Cultivo huerto[];
	private Inventario inventario=new Inventario();
	

	public Huerto(int tamaño) {
		huerto=new Cultivo[tamaño];
	}
	
	//Regar una cultivo concreto
	public void regar(String nombre) {
		for(int i=0;i<huerto.length;i++) {
			if(huerto[i]!=null) {
				if(huerto[i].getNombre().equals(nombre)&huerto[i] instanceof Regadío) {
					((Regadío)huerto[i]).regar();
				}
			}
		}
	}
	//Regar todas los cultivos que sean de regadío
	public void regar() {
		for(int i=0;i<huerto.length;i++) {
			if(huerto[i]!=null) {
				if(huerto[i] instanceof Regadío) {
					((Regadío)huerto[i]).regar();
				}
			}
		}
	}
	//Abonar a un cultivo concreto
	public void abonar(String nombre) {
		for(int i=0;i<huerto.length;i++) {
			if(huerto[i]!=null) {
				if(huerto[i].getNombre().equals(nombre)&huerto[i]instanceof Regadío) {
					((Regadío)huerto[i]).abonar();
				}
			}
		}
	}
	//Abonar todos los cultivos
	public void abonar() {
		for(int i=0;i<huerto.length;i++) {
			if(huerto[i]!=null) {
				huerto[i].abonar();
			}
		}
	}
	
	//Avanza un día con una probabilidad de que llueva y llamando a crecer
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
	//Cosecha un cultivo concreto
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
	//Intenta cosechar todos los cultivos
	public void cosechar() {
		for(int i=0;i<huerto.length;i++) {
			if(huerto[i]!=null) {
				if(huerto[i].cosechar()==true) inventario.añadir(huerto[i].nombre);
				if(huerto[i].isRecosechable()==false&huerto[i].isCosechable()==true)huerto[i]=null;
			}
		}
	}
	
	//Planta un cultivo en el huerto
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

	public Inventario getInventario() {
		return inventario;
	}
}
