package models;
import java.util.ArrayList;
import java.util.List;

public class Relatorio {
	private List<Registro> registros = new ArrayList<Registro>();
	private List<Registro> relatorios = new ArrayList<Registro>();
	
	public Relatorio(List<Registro> registros) {
		this.registros = registros;
	}
	
	public List<Registro> getRegistros() {
		return registros;
	}

	public List<Registro> getRelatorios() {
		return relatorios;
	}

	public void exibirEpocasFavoritas() {}
	public void exibirEpocasFavoritasPorIdade() {}
	public void exibirArtistasPopulares() {}
	public void exibirFluxoDiario() {}
	
}
