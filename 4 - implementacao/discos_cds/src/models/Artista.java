package models;

import java.util.ArrayList;
import java.util.List;

public class Artista {
	private int idArtista = 0;
	private String nome;
	private List<Musica> musicas = new ArrayList<Musica>();
	
	
	public Artista(int idArtista, String nome) {
		super();
		this.idArtista = idArtista;
		this.nome = nome;
	}
	
	public void addMusica(Musica musica) {
		this.musicas.add(musica);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdArtista() {
		return idArtista;
	}
	public List<Musica> getMusicas() {
		return musicas;
	}
	
	
}
