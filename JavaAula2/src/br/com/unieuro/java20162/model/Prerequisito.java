package br.com.unieuro.java20162.model;

public class Prerequisito {

	private String idDisciplina;
	private String idPrerequisito;

	public Prerequisito(String idDisciplina, String idPrerequisito) {
		super();
		this.idDisciplina = idDisciplina;
		this.idPrerequisito = idPrerequisito;
	}

	public String getIdDisciplina() {
		return idDisciplina;
	}

	public void setIdDisciplina(String idDisciplina) {
		this.idDisciplina = idDisciplina;
	}

	public String getIdPrerequisito() {
		return idPrerequisito;
	}

	public void setIdPrerequisito(String idPrerequisito) {
		this.idPrerequisito = idPrerequisito;
	}

}
