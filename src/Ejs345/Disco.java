package Ejs345;

public class Disco extends Multimedia{
	private enum géneros{rock,pop,soul,funky,flamenco,clásica,blues,tecno,opera,punk,jazz,hiphop};
	private géneros género;
	
	
	public Disco(String título, String autor, String formato, int duración,String género) {
		super(título, autor, formato, duración);
		this.género=géneros.valueOf(género);
	}

	public String suena() {
		return "lalalala";
	}

	public géneros getGénero() {
		return género;
	}


	@Override
	public String toString() {
		return "Disco [género=" + género + ", título=" + título + ", autor=" + autor + ", formato=" + formato
				+ ", duración=" + duración + "]";
	}

}
