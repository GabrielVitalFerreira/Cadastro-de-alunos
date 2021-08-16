<%@ page import="vo.Aluno"%>
<%@ page import="ctr.AlunoProcess"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<%
			AlunoProcess.testes();
			for(Aluno a: AlunoProcess.alunos) {
				out.print(a.toHTML());
			}
			out.print(AlunoProcess.salvar());
		%>
	</table>
</body>
</html>