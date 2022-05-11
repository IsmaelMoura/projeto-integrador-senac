const navBar = document.querySelector('#nav-bar')
const toggleBtn = document.querySelector('#header_toggle')
const bodyPadding = document.querySelector('#body-pd')
const headerPadding = document.querySelector('#header')

toggleBtn.addEventListener('click', () => {
    navBar.classList.toggle('mostrar')
    bodyPadding.classList.toggle('body-pd')
    headerPadding.classList.toggle('body-pd')
    toggleBtn.classList.toggle('fa-xmark')
})

const confirmar = (id_cli) => {
	let resposta = confirm("Deseja deletar?");
	
	if(resposta === true) {
		window.location.href = `delete?id_cli=${id_cli}`;
	}
}

const confirmarUsu = (id_usu) => {
	let resposta = confirm("Deseja deletar?");
	
	if(resposta === true) {
		window.location.href = `deleteusu?id_usu=${id_usu}`;
	}
}

const confirmarCar = (id_car) => {
	let resposta = confirm("Deseja deletar?");
	
	if(resposta === true) {
		window.location.href = `deletecar?id_car=${id_car}`;
	}
}

const confirmarSoli = (id_soli) => {
	let resposta = confirm("Deseja deletar?");
	
	if(resposta === true) {
		window.location.href = `deletesoli?id_soli=${id_soli}`;
	}
}