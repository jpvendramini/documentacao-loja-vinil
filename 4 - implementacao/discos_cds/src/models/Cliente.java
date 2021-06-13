package models;

public class Cliente {
	private int idCliente = 0;
	private String nome;
	private String cpf;
	private String numero;
	private int idade;
	
	public Cliente(int id, String nome, String cpf, String numero, int idade) {
		this.idCliente = id;
		this.nome = nome;
		this.cpf = cpf;
		this.numero = numero;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getId() {
		return idCliente;
	}
	
	
}
