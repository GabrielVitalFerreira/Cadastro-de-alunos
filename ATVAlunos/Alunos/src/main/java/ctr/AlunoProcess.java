package ctr;

import java.util.ArrayList;
import vo.Aluno;
import vo.dao.AlunoDAO;

public class AlunoProcess {
	
	public static ArrayList<Aluno> alunos;
	public static AlunoDAO bd = new AlunoDAO();
	
	public static void testes() {
		alunos = new ArrayList<>();
		alunos.add(new Aluno("11111111111", "Lionel Messi", "9C"));
		alunos.add(new Aluno("22222222222", "Felipe Ret", "5A"));
		alunos.add(new Aluno("33333333333", "Elon Musk", "7D"));
		alunos.add(new Aluno("44444444444", "Mano Brown", "8B"));
	}
	
	public static void abrir() {
		alunos = bd.abrir();
	}
	
	public static String salvar() {
		if(bd.salvar(alunos)) {
			return "<p> Dados salvos com sucesso</p>";
		}else {
			return "<p>Erro ao salvar dados</p>";
		}
	}
}
