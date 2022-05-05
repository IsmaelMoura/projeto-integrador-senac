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