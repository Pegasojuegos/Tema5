package Cultivos;

public class Huerto {
	private Cultivo h1[];
	private int tamaño;
	
	public Huerto(int tamaño) {
		h1=new Cultivo[tamaño];
	}
	
	public void plantar(Cultivo c1) {
		for(Cultivo c:h1) {
			if(c==null) {
				if(c1 instanceof Regadío) {
					c=new Regadío(c1.getNombre(), c1.getTiempoParaCrecer());
					break;
				}
				if(c1 instanceof Secano) {
					c=new Secano(c1.getNombre(), c1.getTiempoParaCrecer());
					break;
				}
			}//if
		}//for
	}//plantar
}
