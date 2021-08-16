package vo;

import java.util.Objects;

public class Alunos {
//Atributos
	private String ra;
	private String nome;
	private String turma;

//Construtores
	public Alunos() {
	}

	public Alunos(String ra, String nome, String turma) {
		this.ra = ra;
		this.nome = nome;
		this.turma = turma;
	}

	public Alunos(String[] csv) {
		this.ra = csv[0];
		this.nome = csv[1];
		this.turma = csv[2];
	}

	// Getters && Setters
	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	// Chave RA
	@Override
	public int hashCode() {
		return Objects.hash(ra);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alunos other = (Alunos) obj;
		return Objects.equals(ra, other.ra);
	}

	@Override
	public String toString() {
		return ra + "\t" + nome + "\t" + turma + "\n";
	}

	public String toCSV() {
		return ra + ";" + nome + ";" + turma + "\r\n";
	}

	public String toHTML() {
		return "<tr><td>" + ra + "</td><td>" + nome + "</td><td>" + turma + "</td></tr>";
	}

	public void add(Alunos alunos) {
		
		
	}
}