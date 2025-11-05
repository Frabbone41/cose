function incrementa(){
let incrementa = document.getElementById("contatore")
let numero = document.getElementById("incrementa").value 
incrementa.value = parseInt(incrementa.value) + parseInt(numero);

}

function decrementa(){
let incrementa = document.getElementById("contatore")
let numero = document.getElementById("incrementa").value 
incrementa.value = parseInt(incrementa.value) - parseInt(numero);
}