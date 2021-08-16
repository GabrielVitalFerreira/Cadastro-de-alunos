package vo;

import java.util.Objects;


public class Aluno {

	private String ra;
	private String nome;
	private String turma;

	public Aluno() {
	}
	public Aluno(String ra, String nome, String turma) {
		this.ra = ra;
		this.nome = nome;
		this.turma = turma;
	}
		public Aluno(String[] vetor) {
			this.ra = vetor[0];
			this.nome = vetor[1];
			this.turma = vetor[2];
		}

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
		Aluno other = (Aluno) obj;
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

}
