package br.com.unieuro.java20162.model;

public class Disciplina {

	private String nome;
	private String id;
	private Integer creditos;
	private String departamento;

	public Disciplina(String nome, String id, Integer creditos, String departamento) {
		super();
		this.nome = nome;
		this.id = id;
		this.creditos = creditos;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getCreditos() {
		return creditos;
	}

	public void setCreditos(Integer creditos) {
		this.creditos = creditos;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

}
