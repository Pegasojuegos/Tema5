package Ejs345;

public class Película extends Multimedia {
	private String actriz;
	private String actor;
	
	
	public Película(String título, String autor, String formato, int duración,String actor,String actriz) {
		super(título, autor, formato, duración);
		this.actor=actor;
		this.actriz=actriz;
	}
	
	@Override
	public String toString() {
		return "Película [actriz=" + actriz + ", actor=" + actor + ", título=" + título + ", autor=" + autor
				+ ", formato=" + formato + ", duración=" + duración + "]";
	}




	public String getActriz() {
		return actriz;
	}
	public String getActor() {
		return actor;
	}
	
}
