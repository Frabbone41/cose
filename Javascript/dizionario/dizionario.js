// Dizionario con più traduzioni (array)
    const dizionario = {
      "ciao": ["hello", "hi"],
      "cane": ["dog"],
      "gatto": ["cat"],
      "sole": ["sun"],
      "luna": ["moon"],
      "casa": ["house", "home"],
      "scuola": ["school"],
      "libro": ["book", "volume"],
      "mela": ["apple"],
      "computer": ["computer", "pc"]
    };

    // Elementi del DOM
    const input = document.getElementById("parolaInput");
    const traduzioneDiv = document.getElementById("traduzione");
    const erroreDiv = document.getElementById("errore");
    const tabellaBody = document.querySelector("#tabella tbody");
    const btnTraduci = document.getElementById("btnTraduci");
    const btnAggiungi = document.getElementById("btnAggiungi");

    // Aggiorna la tabella
    function aggiornaTabella() {
      tabellaBody.innerHTML = "";
      for (const [ita, engArray] of Object.entries(dizionario)) {
        const riga = document.createElement("tr");
        riga.innerHTML = `<td>${ita}</td><td>${engArray.join(", ")}</td>`;
        tabellaBody.appendChild(riga);
      }
    }

    // Traduzione bidirezionale
    function traduci() {
      const parola = input.value.trim().toLowerCase();
      traduzioneDiv.textContent = "";
      erroreDiv.textContent = "";

      if (!parola) {
        erroreDiv.textContent = "Inserisci una parola!";
        return;
      }

      let risultato = null;

      // Italiano → Inglese
      if (dizionario[parola]) {
        risultato = dizionario[parola].join(", ");
      } else {
        // Inglese → Italiano (ricerca inversa)
        for (const [ita, engArray] of Object.entries(dizionario)) {
          if (engArray.includes(parola)) {
            risultato = ita;
            break;
          }
        }
      }

      if (risultato) {
        traduzioneDiv.textContent = `Traduzione: ${risultato}`;
      } else {
        erroreDiv.textContent = "Parola non trovata nel dizionario.";
      }
    }

    // Aggiungi parola o nuova traduzione
    function aggiungiParola() {
      const ita = prompt("Inserisci la parola in ITALIANO:")?.trim().toLowerCase();
      const eng = prompt("Inserisci la traduzione in INGLESE:")?.trim().toLowerCase();
      erroreDiv.textContent = "";

      if (!ita || !eng) {
        erroreDiv.textContent = "Devi inserire entrambe le parole!";
        return;
      }

      // Se la parola esiste già → aggiungiamo la traduzione se non presente
      if (dizionario[ita]) {
        if (!dizionario[ita].includes(eng)) {
          dizionario[ita].push(eng);
          alert(`Aggiunta nuova traduzione: ${ita} → ${eng}`);
        } else {
          erroreDiv.textContent = "Questa traduzione esiste già per questa parola!";
          return;
        }
      } else {
        dizionario[ita] = [eng];
        alert(`Parola aggiunta: ${ita} → ${eng}`);
      }

      aggiornaTabella();
    }

    // Event listeners
    btnTraduci.addEventListener("click", traduci);
    btnAggiungi.addEventListener("click", aggiungiParola);
    input.addEventListener("keypress", (e) => {
      if (e.key === "Enter") traduci();
    });

    // Inizializza la tabella all’avvio
    aggiornaTabella();