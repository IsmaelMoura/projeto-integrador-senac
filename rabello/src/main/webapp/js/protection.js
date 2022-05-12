/**
 * 
 */
 
 if (!localStorage.getItem('token')) {
	$(location).prop('href', 'http://localhost:8080/rabello/index.html')
}