package models;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Registro {
	private int idRegistro = 0;
	private Cliente cliente;
	private List<Musica> musicas = new ArrayList<Musica>();
	private Date data = new Date();
	private double valorTotal = 0.0;
	
	public Registro(int idRegistro, Cliente cliente, Date data) {
		this.idRegistro = idRegistro;
		this.cliente = cliente;
		this.data = data;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getIdRegistro() {
		return idRegistro;
	}

	public List<Musica> getMusica() {
		return musicas;
	}

	public Date getData() {
		return data;
	}

	public double getValorTotal() {
		for(Musica music : this.musicas) {
			this.valorTotal += music.getValor();
		}
		return valorTotal;
	}
	
	public void addMusic(Musica musica) {
		this.musicas.add(musica);
	}
	public void removeMusic(Musica musica) {
		this.musicas.remove(musica.getIdMusica());
	}
	
}
