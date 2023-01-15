package Ejs345;

public class Multimedia {
	protected String título;
	protected String autor;
	protected enum formatos{wav,mp3,midi,avi,mov,mpg,cdAudio,dvd};
	protected formatos formato;
	protected int duración;
	
	public Multimedia(String título,String autor,String formato,int duración) {
		this.título=título;
		this.autor=autor;
		this.formato=formatos.valueOf(formato);
		this.duración=duración;
	}

	public String getTítulo() {
		return título;
	}

	public String getAutor() {
		return autor;
	}

	public formatos getFormato() {
		return formato;
	}

	public int getDuración() {
		return duración;
	}
	
	
}
