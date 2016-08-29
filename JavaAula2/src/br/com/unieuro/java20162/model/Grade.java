package br.com.unieuro.java20162.model;

public class Grade {

	private Integer idGrade;
	private String idDisciplina;
	private String semestre;
	private Integer ano;
	private String professor;

	public Grade(Integer idGrade, String idDisciplina, String semestre, Integer ano, String professor) {
		super();
		this.idGrade = idGrade;
		this.idDisciplina = idDisciplina;
		this.semestre = semestre;
		this.ano = ano;
		this.professor = professor;
	}

	public Integer getIdGrade() {
		return idGrade;
	}

	public void setIdGrade(Integer idGrade) {
		this.idGrade = idGrade;
	}

	public String getIdDisciplina() {
		return idDisciplina;
	}

	public void setIdDisciplina(String idDisciplina) {
		this.idDisciplina = idDisciplina;
	}

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

}
