<%@page import="ctr.AlunosProcess"%>
<%@page import="vo.Alunos"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de Alunos</title>
</head>
<body>
	<div>
		<a href="cadastro.jsp">Cadastrar Novo</a> <a href="editar.jsp">Alterar
			ou Remover</a>
	</div>
	<table>
		<tr>
			<th>Ra</th>
			<th>Nome</th>
			<th>Turma</th>
		</tr>
		<%
		AlunosProcess.abrir();
		out.print("<table style='border:solid 1px'>");
		for (Alunos c : AlunosProcess.alunos) {
			out.print(c.toHTML());
		}
		out.print("</table>");
		out.print(AlunosProcess.salvar());
		%>
	</table>
</body>
</html>