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
<title>Rabello - Login</title>
</head>
<body class="w-100 d-flex flex-column justify-content-center align-items-center">
	<form
        class="container needs-validation cadastrar-form border rounded p-3" action="login"
        novalidate
      >
        <div class="row">
          <div class="mb-3">
            <label for="validationCustomEmail">E-mail</label>
            <div class="input-group">
              <input
                type="email"
                class="form-control input-email"
                id="validationCustomEmail"
                placeholder="Ex.: jose@email.com"
                name="email_login"
                aria-describedby="inputGroupPrepend"
                required
              />
              <div class="valid-feedback">Parece bom!</div>
              <div class="invalid-feedback">Por favor coloque o e-mail.</div>
            </div>
          </div>
        </div>
        <div class="row">
          <div class="mb-3">
            <label for="validationCustom03">Senha</label>
            <input
              type="password"
              class="form-control input-senha"
              id="validationCustom03"
              name="senha_login"
              placeholder="Senha"
              required
            />
            <div class="invalid-feedback">Por favor coloque a senha.</div>
          </div>
        </div>
        <button class="btn btn-primary mb-3" type="submit">Acessar</button>
      </form>

	<script src="js/bootstrap.bundle.min.js"></script>
	<script type="text/javascript" src="js/admin.js"></script>
</body>
</html>