const utenti = [
  { nome: "admin", password: CryptoJS.MD5("admin123").toString(), ruolo: "amministratore" },
  { nome: "mario", password: CryptoJS.MD5("mario2024").toString(), ruolo: "utente" },
  { nome: "lucia", password: CryptoJS.MD5("passlucia").toString(), ruolo: "utente" }
];

function login() {
  const user = document.getElementById("username").value.trim();
  const pass = document.getElementById("password").value.trim();

  // Controlla se la password sembra già un hash MD5 (32 caratteri esadecimali)
  const isMD5 = /^[a-f0-9]{32}$/i.test(pass);

  // Se è già MD5 la usa direttamente, altrimenti la converte
  const hash = isMD5 ? pass : CryptoJS.MD5(pass).toString();

  const trovato = utenti.find(u => u.nome === user && u.password === hash);

  if (trovato) {
    document.getElementById("loginBox").style.display = "none";
    document.getElementById("welcomeMsg").style.display = "block";
    document.getElementById("welcomeMsg").innerHTML =
      `Benvenuto <b>${trovato.nome}</b>!<br>Ruolo: <b>${trovato.ruolo}</b>`;
    document.getElementById("errorMsg").innerText = "";
  } else {
    document.getElementById("errorMsg").innerText = "Nome utente o password errati.";
  }
}
