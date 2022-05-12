/**
 * 
 */

const token = "627c499b6fcb7";
const tokenField = document.querySelector(".input-token");

const checkToken = () => {
	if (tokenField.value == token) {
		$(location).prop('href', 'http://localhost:8080/rabello/main')
		localStorage.setItem('token', token);
	} else {
		alert("Token incorreto");
	}
}

const sessionLogin = () => {
	if (localStorage.getItem('token') == token) {
		$(location).prop('href', 'http://localhost:8080/rabello/main')
	} else {
		$(location).prop('href', 'http://localhost:8080/rabello/acessar.html')
	}
}

const logOut = () => {
	localStorage.removeItem('token');
	$(location).prop('href', 'http://localhost:8080/rabello/index.html')
}