// Funzione che genera una lettera maiuscola casuale
function letteraMaiuscola() {
  const codice = Math.floor(Math.random() * 26) + 65; // da 'A' (65) a 'Z' (90)
  return String.fromCharCode(codice);
}

// Funzione che genera una lettera minuscola casuale
function letteraMinuscola() {
  const codice = Math.floor(Math.random() * 26) + 97; // da 'a' (97) a 'z' (122)
  return String.fromCharCode(codice);
}

// Funzione che genera un numero casuale (carattere da '0' a '9')
function numeroCasuale() {
  const codice = Math.floor(Math.random() * 10) + 48; // da '0' (48) a '9' (57)
  return String.fromCharCode(codice);
}

// Funzione che genera un simbolo casuale tra quelli ammessi
function simboloCasuale() {
  const simboli = "-_*+%&$=";
  const i = Math.floor(Math.random() * simboli.length);
  return simboli[i];
}

// Funzione che genera una singola password complessa
function generaUnaPassword(lunghezza = 12) {
  // Garantiamo almeno 12 caratteri
  if (lunghezza < 12) lunghezza = 12;

  // Iniziamo con una password vuota
  let password = "";

  // Assicuriamoci di avere almeno un carattere di ogni tipo
  password += letteraMaiuscola();
  password += letteraMinuscola();
  password += numeroCasuale();
  password += simboloCasuale();

  // Aggiungiamo caratteri casuali fino a raggiungere la lunghezza desiderata
  while (password.length < lunghezza) {
    const tipo = Math.floor(Math.random() * 4); // 0, 1, 2 o 3

    if (tipo === 0) password += letteraMaiuscola();
    else if (tipo === 1) password += letteraMinuscola();
    else if (tipo === 2) password += numeroCasuale();
    else password += simboloCasuale();
  }

  // Mischiamo i caratteri per evitare che i primi 4 siano sempre nello stesso ordine
  const array = password.split("");
  for (let i = array.length - 1; i > 0; i--) {
    const j = Math.floor(Math.random() * (i + 1));
    [array[i], array[j]] = [array[j], array[i]];
  }

  return array.join("");
}

// Funzione principale che genera 5 password e le mostra
function generaPassword() {
  const lista = document.getElementById("listaPassword");
  lista.innerHTML = ""; // pulisce la lista

  for (let i = 0; i < 5; i++) {
    const pw = generaUnaPassword(12);
    const li = document.createElement("li");
    li.textContent = pw;
    lista.appendChild(li);
  }
}
