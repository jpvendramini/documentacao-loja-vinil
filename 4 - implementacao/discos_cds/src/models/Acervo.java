package models;
import java.util.ArrayList;
import java.util.List;

public class Acervo {
	private List<Artista> artistasAcervo = new ArrayList<Artista>();
	private List<Musica> musicasAcervo = new ArrayList<Musica>();
	
	
	public List<Artista> getArtistasAcervo() {
		return artistasAcervo;
	}
	public List<Musica> getMusicasAcervo() {
		return musicasAcervo;
	}
	
	public void addArtista(Artista artista) {
		this.artistasAcervo.add(artista);
	}
	public void addMusica(Musica musica) {
		this.musicasAcervo.add(musica);
	}
}
