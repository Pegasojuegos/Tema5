package Cultivos;

public class Huerto {
	private Cultivo huerto[];
	
	public Huerto(int tamaño) {
		huerto=new Cultivo[tamaño];
	}
	
	public void pasarDía() {
		int llover=(int)(Math.random()*10+1);
		for(int i=0;i<huerto.length;i++) {
			if(llover<=4) huerto[i].llover();
			huerto[i].crecer();
		}
	}
	
	public void plantar(Cultivo c1) {
		for(int c=0;c<huerto.length;c++) {
			if(huerto[c]==null) {
				if(c1 instanceof Regadío) {
					huerto[c]=new Regadío(c1.getNombre(), c1.getTiempoParaCrecer());
					break;
				}
				if(c1 instanceof Secano) {
					huerto[c]=new Secano(c1.getNombre(), c1.getTiempoParaCrecer());
					break;
				}
			}//if
		}//for
	}//plantar
}
