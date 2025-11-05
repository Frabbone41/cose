// Set di caratteri
const UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
const LOWER = "abcdefghijklmnopqrstuvwxyz";
const DIGITS = "0123456789";
const SYMBOLS = "-_*+%&$=";

// Restituisce un intero casuale in [0, max)
function randomInt(max) {
  if (max <= 0) return 0;
  const u32 = crypto.getRandomValues(new Uint32Array(1))[0];
  return Math.floor((u32 / 0x100000000) * max);
}

// Shuffle array
function shuffleArray(arr) {
  for (let i = arr.length - 1; i > 0; i--) {
    const j = randomInt(i + 1);
    [arr[i], arr[j]] = [arr[j], arr[i]];
  }
  return arr;
}

// Genera una singola password complessa
function generatePassword(minLength = 12) {
  const length = Math.max(12, Math.floor(minLength));
  const all = UPPER + LOWER + DIGITS + SYMBOLS;
  const pwdChars = [];

  // Almeno un carattere per ogni tipo
  pwdChars.push(UPPER[randomInt(UPPER.length)]);
  pwdChars.push(LOWER[randomInt(LOWER.length)]);
  pwdChars.push(DIGITS[randomInt(DIGITS.length)]);
  pwdChars.push(SYMBOLS[randomInt(SYMBOLS.length)]);

  // Riempi fino alla lunghezza richiesta
  for (let i = pwdChars.length; i < length; i++) {
    pwdChars.push(all[randomInt(all.length)]);
  }

  // Mischia e restituisci
  return shuffleArray(pwdChars).join('');
}

// Genera N password
function generateN(n = 5, minLength = 12, randomLengths = false) {
  const result = [];
  for (let i = 0; i < n; i++) {
    const len = randomLengths ? minLength + randomInt(9) : minLength;
    result.push(generatePassword(len));
  }
  return result;
}

// --- UI ---
const listEl = document.getElementById('list');
const genBtn = document.getElementById('gen');
const genRandBtn = document.getElementById('gen-random');
const lengthInput = document.getElementById('length');

function renderPasswords(passwords) {
  listEl.innerHTML = '';
  passwords.forEach(pw => {
    const li = document.createElement('li');
    const span = document.createElement('span');
    span.className = 'pw';
    span.textContent = pw;

    const copyBtn = document.createElement('button');
    copyBtn.className = 'btn';
    copyBtn.textContent = 'Copia';
    copyBtn.onclick = async () => {
      try {
        await navigator.clipboard.writeText(pw);
        copyBtn.textContent = 'Copiato!';
        setTimeout(() => copyBtn.textContent = 'Copia', 1200);
      } catch (e) {
        copyBtn.textContent = 'Errore';
        setTimeout(() => copyBtn.textContent = 'Copia', 1200);
      }
    };

    li.appendChild(span);
    li.appendChild(copyBtn);
    listEl.appendChild(li);
  });
}

// Eventi bottoni
genBtn.addEventListener('click', () => {
  const minLen = Math.max(12, Number(lengthInput.value) || 12);
  renderPasswords(generateN(5, minLen, false));
});

genRandBtn.addEventListener('click', () => {
  const minLen = Math.max(12, Number(lengthInput.value) || 12);
  renderPasswords(generateN(5, minLen, true));
});

// Genera automaticamente all'avvio
renderPasswords(generateN(5, 12, false));
