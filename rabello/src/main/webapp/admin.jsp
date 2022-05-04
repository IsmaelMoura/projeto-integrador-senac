<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="model.JavaBeans"%>
<%@ page import="java.util.ArrayList"%>

<%
	ArrayList<JavaBeans> lista = (ArrayList<JavaBeans>) request.getAttribute("clientes");

	/*for (int i = 0; i < lista.size(); i++) {
		out.print(lista.get(i).getId_cli());
		out.print(lista.get(i).getNome_cli());
		out.print(lista.get(i).getEmail_cli());
		out.print(lista.get(i).getTelefone_cli());
		out.print(lista.get(i).getSenha_cli());
	}*/
%>

<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css" />
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/admin.css" />
<title>Rabello - Admin</title>
</head>
<body id="body-pd">
	<header class="header" id="header">
		<div class="header_toggle">
			<i class="fa-solid fa-bars" id="header_toggle"></i>
		</div>
		<b class="header-page w-100 text-center">Clientes</b>
	</header>
	<div class="l-navbar" id="nav-bar">
		<nav class="nav">
			<div>
				<a href="#" class="nav_logo"> <span class="nav_logo-name">Rabello</span>
				</a>
				<div class="nav_list">
					<a href="#" class="nav_link active"> <i
						class="fa-solid fa-users"></i> <span class="nav_name">Clientes</span>
					</a> <a href="#" class="nav_link"> <i
						class="fa-solid fa-user-group"></i> <span class="nav_name">Usuários</span>
					</a> <a href="#" class="nav_link nav-car"> <i
						class="fa-solid fa-car"></i> <span class="nav_name">Carros</span>
					</a> <a href="#" class="nav_link nav-req"> <i
						class="fa-solid fa-clipboard"></i> <span class="nav_name">Solicitações</span>
					</a> <a href="editarcli.jsp" class="nav_link nav-req"> <i
						class="fa-solid fa-clipboard"></i> <span class="nav_name">Editar Cliente</span>
					</a>
				</div>
			</div>
			<a href="#" class="nav_link"> <i
				class="fa-solid fa-right-from-bracket"></i> <span
				class="user-info d-flex flex-column">
					<p class="nav-name">Nome: XXX</p>
					<p class="nav-name">Perfil: ZZZ</p>
			</span>
			</a>
		</nav>
	</div>

	<main class="main">

		<% for (int i = 0; i < lista.size(); i++) {%>
		<div
			class="row client-card d-flex align-items-center justify-content-between">
			<b class="client-id col-md-1 col-12"><%=lista.get(i).getId_cli()%></b> 
			<b class="client-name col-md-4 col-12"><%=lista.get(i).getNome_cli() %></b>
			<b class="client-name col-md-4 col-12"><%=lista.get(i).getEmail_cli() %></b>
			<div class="client-buttons col-md-3 col-12">
				<a href="select?id_cli=<%=lista.get(i).getId_cli()%>" class="client-edit btn">Editar</a> 
				<a href="#" class="client-delete btn bg-danger">Excluir</a>
			</div>
		</div>
		<% } %>

	</main>

	<script src="js/bootstrap.bundle.min.js"></script>
	<script type="text/javascript" src="js/admin.js"></script>
</body>
</html>