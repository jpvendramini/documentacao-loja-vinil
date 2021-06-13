package models;
import java.util.Date;

public class Musica {
	private int idMusica = 0;
	private String titulo;
	private Artista artista;
	private Date lancamento;
	private Formato formato;
	private int quantidade = 0;
	private double valor;
	
	
	public Musica(int idMusica, String titulo, Artista artista, Date lancamento, Formato formato, double valor) {
		this.idMusica = idMusica;
		this.titulo = titulo;
		this.artista = artista;
		this.lancamento = lancamento;
		this.formato = formato;
		this.valor = valor;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Artista getArtista() {
		return artista;
	}
	public void setArtista(Artista artista) {
		this.artista = artista;
	}
	public Date getLancamento() {
		return lancamento;
	}
	public void setLancamento(Date lancamento) {
		this.lancamento = lancamento;
	}
	public Formato getFormato() {
		return formato;
	}
	public void setFormato(Formato formato) {
		this.formato = formato;
	}
	public int getIdMusica() {
		return idMusica;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getValor() {
		return this.valor;
	}
	
	public void addQuantidade(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void removeQuantidade(int quantidade) {
		this.quantidade -= quantidade;
	}
}
