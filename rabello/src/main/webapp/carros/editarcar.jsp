<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="icon" href="img/icone.png">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css" />
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/admin.css" />
<title>Rabello - Editar</title>
</head>
<body id="body-pd">
	<header class="header" id="header">
		<div class="header_toggle">
			<i class="fa-solid fa-bars" id="header_toggle"></i>
		</div>
		<b class="header-page w-100 text-center">Editar carro</b>
	</header>
	<div class="l-navbar" id="nav-bar">
		<nav class="nav">
			<div>
          <a href="#" class="nav_logo">
            <span class="nav_logo-name">Rabello</span>
          </a>
          <div class="nav_list">
            <a href="../main" class="nav_link">
              <i class="fa-solid fa-users"></i>
              <span class="nav_name">Clientes</span>
            </a>
            <a href="../mainusu" class="nav_link">
              <i class="fa-solid fa-user-group"></i>
              <span class="nav_name">Usuários</span>
            </a>
            <a href="maincar" class="nav_link active">
              <i class="fa-solid fa-car"></i>
              <span class="nav_name">Carros</span>
            </a>
            <a href="../clientes/cadastrar.html" class="nav_link nav-req">
              <i class="fa-solid fa-clipboard-user"></i>
              <span class="nav_name">Cadastrar cliente</span>
            </a>
            <a href="../usuarios/cadastrarusu.html" class="nav_link nav-req">
              <i class="fa-solid fa-clipboard"></i>
              <span class="nav_name">Cadastrar usuário</span>
            </a>
            <a href="cadastrarcar.html" class="nav_link nav-req">
              <i class="fa-solid fa-clipboard"></i>
              <span class="nav_name">Cadastrar carro</span>
            </a>
            <a href="../mainsoli" class="nav_link nav-req">
              <i class="fa-solid fa-clipboard-user"></i>
              <span class="nav_name">Solicitações</span>
            </a>
          </div>
        </div>
        <a class="nav_link" onclick="logOut()"> <i class="fa-solid fa-arrow-right-from-bracket"></i> <span class="nav_name">Desconectar</span> </a>
		</nav>
	</div>

	<main class="main">

		<form
			class="container needs-validation cadastrar-form border rounded p-3"
			action="updatecar" novalidate>
			<div class="row">
				<div class="mb-3">
					<label for="validationCustomName">ID</label> <input type="text"
						class="form-control input-nome" id="validationCustom01"
						name="id_car"
						value="<%out.print(request.getAttribute("id_car"));%>" readonly />
				</div>
			</div>
			<div class="row">
				<div class="mb-3">
					<label for="validationCustomName">Fabricante</label> <input
						type="text" class="form-control input-nome"
						id="validationCustom01" name="fabricante_car"
						placeholder="Ex.: José"
						value="<%out.print(request.getAttribute("fabricante_car"));%>"
						required />
					<div class="valid-feedback">Parece bom!</div>
					<div class="invalid-feedback">Por favor coloque seu nome.</div>
				</div>
			</div>
			<div class="row">
				<div class="mb-3">
					<label for="validationCustomEmail">Modelo</label>
					<div class="input-group">
						<input type="text" class="form-control input-email"
							id="validationCustomEmail" placeholder="Ex.: jose@email.com"
							name="modelo_car" aria-describedby="inputGroupPrepend"
							value="<%out.print(request.getAttribute("modelo_car"));%>"
							required />
						<div class="valid-feedback">Parece bom!</div>
						<div class="invalid-feedback">Por favor coloque o e-mail.</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="mb-3">
					<label for="validationCustomEmail">Ano</label>
					<div class="input-group">
						<input type="text" class="form-control input-telefone"
							id="validationCustomEmail" placeholder="Ex.: (11) 91234-5678"
							name="ano_car" aria-describedby="inputGroupPrepend"
							value="<%out.print(request.getAttribute("ano_car"));%>" required />
						<div class="valid-feedback">Parece bom!</div>
						<div class="invalid-feedback">Por favor coloque o telefone.</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="mb-3">
					<label for="validationCustomPhone">Cor</label>
					<div class="input-group">
						<input type="text" class="form-control input-password"
							id="validationCustomPhone" name="cor_car"
							aria-describedby="inputGroupPrepend"
							value="<%out.print(request.getAttribute("cor_car"));%>" required />
						<div class="valid-feedback">Parece bom!</div>
						<div class="invalid-feedback">Por favor coloque sua senha.</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="mb-3">
					<label for="profile" class="form-label">Combustível</label> 
					<select
						class="form-select" id="profile" name="combustivel_car"
						value="<%out.print(request.getAttribute("combustivel_car"));%>"
						required>
						<option value="Gasolina">Gasolina</option>
						<option value="Diesel">Diesel</option>
						<option value="Elétrico">Elétrico</option>
					</select>
					<div class="valid-feedback">Parece bom!</div>
					<div class="invalid-feedback">Por favor coloque o tipo do combustível.</div>
				</div>
			</div>
			<div class="row">
				<div class="mb-3">
					<label for="validationCustomPhone">Valor</label>
					<div class="input-group">
						<input type="text" class="form-control input-password"
							id="validationCustomPhone" name="valor_car"
							aria-describedby="inputGroupPrepend"
							value="<%out.print(request.getAttribute("valor_car"));%>"
							required />
						<div class="valid-feedback">Parece bom!</div>
						<div class="invalid-feedback">Por favor coloque sua senha.</div>
					</div>
				</div>
			</div>
			<button class="btn bg-primary mb-3" type="submit">Editar</button>
		</form>

	</main>

	<script src="js/jquery-3.6.0.min.js"></script>
	<script src="js/login.js"></script>
	<script src="js/protection.js"></script>
	<script src="js/bootstrap.bundle.min.js"></script>
	<script type="text/javascript" src="js/admin.js"></script>
	<script type="text/javascript" src="script.js"></script>
</body>
</html>