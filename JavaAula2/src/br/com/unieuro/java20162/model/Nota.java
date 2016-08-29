package br.com.unieuro.java20162.model;

public class Nota {

	private Integer idEstudante;
	private Integer idGrade;
	private Integer nota;

	public Nota(Integer idEstudante, Integer idGrade, Integer nota) {
		super();
		this.idEstudante = idEstudante;
		this.idGrade = idGrade;
		this.nota = nota;
	}

	public Integer getIdEstudante() {
		return idEstudante;
	}

	public void setIdEstudante(Integer idEstudante) {
		this.idEstudante = idEstudante;
	}

	public Integer getIdGrade() {
		return idGrade;
	}

	public void setIdGrade(Integer idGrade) {
		this.idGrade = idGrade;
	}

	public Integer getNota() {
		return nota;
	}

	public void setNota(Integer nota) {
		this.nota = nota;
	}

}
