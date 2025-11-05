// Array di utenti con password criptate (MD5)
const utenti = [
  { nome: "admin", password: CryptoJS.MD5("admin123").toString(), ruolo: "amministratore" },
  { nome: "mario", password: CryptoJS.MD5("mario2024").toString(), ruolo: "utente" },
  { nome: "lucia", password: CryptoJS.MD5("passlucia").toString(), ruolo: "utente" }
];

function login() {
  const user = document.getElementById("username").value.trim();
  const pass = document.getElementById("password").value;
  const hash = CryptoJS.MD5(pass).toString();

  const trovato = utenti.find(u => u.nome === user && u.password === hash);

  if (trovato) {
    document.getElementById("loginBox").style.display = "none";
    document.getElementById("welcomeMsg").style.display = "block";
    document.getElementById("welcomeMsg").innerHTML =
      `👋 Benvenuto <b>${trovato.nome}</b>!<br>Ruolo: <b>${trovato.ruolo}</b>`;
  } else {
    document.getElementById("errorMsg").innerText = "Nome utente o password errati.";
  }
}
