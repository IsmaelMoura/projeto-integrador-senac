<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

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
		<b class="header-page w-100 text-center">Editar</b>
	</header>
	<div class="l-navbar" id="nav-bar">
		<nav class="nav">
			<div>
				<a href="#" class="nav_logo"> <span class="nav_logo-name">Rabello</span>
				</a>
				<div class="nav_list">
					<a href="admin.jsp" class="nav_link active"> <i
						class="fa-solid fa-users"></i> <span class="nav_name">Clientes</span>
					</a> <a href="#" class="nav_link"> <i
						class="fa-solid fa-user-group"></i> <span class="nav_name">Usuários</span>
					</a> <a href="#" class="nav_link nav-car"> <i
						class="fa-solid fa-car"></i> <span class="nav_name">Carros</span>
					</a> <a href="#" class="nav_link nav-req"> <i
						class="fa-solid fa-clipboard"></i> <span class="nav_name">Solicitações</span>
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

		<form
			class="container needs-validation cadastrar-form border rounded p-3"
			action="updateusu" novalidate>
			<div class="row">
				<div class="mb-3">
					<label for="validationCustomName">ID</label> <input type="text"
						class="form-control input-nome" id="validationCustom01"
						name="id_usu"
						value="<% out.print(request.getAttribute("id_usu")); %>" readonly />
				</div>
			</div>
			<div class="row">
				<div class="mb-3">
					<label for="validationCustomName">Nome</label> <input type="text"
						class="form-control input-nome" id="validationCustom01"
						name="nome_usu" placeholder="Ex.: José"
						value="<% out.print(request.getAttribute("nome_usu")); %>" required />
					<div class="valid-feedback">Parece bom!</div>
					<div class="invalid-feedback">Por favor coloque seu nome.</div>
				</div>
			</div>
			<div class="row">
				<div class="mb-3">
					<label for="validationCustomEmail">E-mail</label>
					<div class="input-group">
						<input type="email" class="form-control input-email"
							id="validationCustomEmail" placeholder="Ex.: jose@email.com"
							name="email_usu" aria-describedby="inputGroupPrepend" 
							value="<% out.print(request.getAttribute("email_usu")); %>" required />
						<div class="valid-feedback">Parece bom!</div>
						<div class="invalid-feedback">Por favor coloque o e-mail.</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="mb-3">
					<label for="validationCustomEmail">Telefone</label>
					<div class="input-group">
						<input type="tel" class="form-control input-telefone"
							id="validationCustomEmail" placeholder="Ex.: jose@email.com"
							name="telefone_usu" aria-describedby="inputGroupPrepend"
							value="<% out.print(request.getAttribute("telefone_usu")); %>" required />
						<div class="valid-feedback">Parece bom!</div>
						<div class="invalid-feedback">Por favor coloque o telefone.</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="mb-3">
					<label for="validationCustomPhone">Senha</label>
					<div class="input-group">
						<input type="password" class="form-control input-password"
							id="validationCustomPhone" placeholder="Ex.: (11) 91234-5678"
							name="senha_usu" aria-describedby="inputGroupPrepend"
							value="<% out.print(request.getAttribute("senha_usu")); %>" required />
						<div class="valid-feedback">Parece bom!</div>
						<div class="invalid-feedback">Por favor coloque sua senha.</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="mb-3">
					<label for="profile" class="form-label">Perfil</label> <select
						class="form-select" id="profile" name="perfil_usu"
						value="<% out.print(request.getAttribute("perfil_usu")); %>" required>
						<option selected disabled>Escolha...</option>
						<option value="usuario">Usuário</option>
						<option value="admin">Administrador</option>
					</select>
					<div class="valid-feedback">Parece bom!</div>
					<div class="invalid-feedback">Por favor coloque o perfil.</div>
				</div>
			</div>
			<button class="btn bg-primary mb-3" type="submit">Cadastrar</button>
		</form>

	</main>

	<script src="js/bootstrap.bundle.min.js"></script>
	<script type="text/javascript" src="js/admin.js"></script>
	<script type="text/javascript" src="script.js"></script>
</body>
</html>