public class Orario {
    private int ora;
    private int minuti;
    private int secondi;

    Orario(int ora, int minuti, int secondi) {
        if (ora <= 23 && minuti <= 59 && minuti <= 59) {
            this.ora = ora;
            this.minuti = minuti;
            this.secondi = secondi;
        } else {
            this.ora = 00;
            this.minuti = 00;
            this.secondi = 00;
        }
    }

    Orario() {
        this.ora = 00;
        this.minuti = 00;
        this.secondi = 00;
    }

    public int getSecondi() {
        return secondi;
    }

    public int getMinuti() {
        return minuti;
    }

    public int getOra() {
        return ora;
    }

    public void setSecondi(int secondi) {
        this.secondi = secondi;
    }

    public void setMinuti(int minuti) {
        this.minuti = minuti;
    }

    public void setOra(int ora) {
        this.ora = ora;
    }

    public void tic() {
        setSecondi(this.secondi + 1);
        if (this.secondi == 60) {
            setSecondi(0);
            setMinuti(getMinuti() + 1);
            if (this.minuti == 60) {
                setMinuti(0);
                setOra(getOra() + 1);
            }
            if (this.ora == 24) {
                setOra(0);
            }
            if (this.ora > 23){
                setOra(getOra() - 24);
            }

        }
        if (this.secondi > 60) {
            setSecondi(getSecondi() - 60);
            setMinuti(getMinuti() + 1);
        }
    }

    public void aggiungiMinuti(int m) {
        setMinuti(getMinuti() + m);

        while (this.minuti > 59) {
                
            
       
        if (this.minuti == 60) {
            setMinuti(0);
            setOra(getOra() + 1);
        }
        if (this.ora == 24){
            setOra(0);
        }

        if (this.minuti > 60) {
            setMinuti(getMinuti() - 60);
            setOra(getOra() + 1);
        }
        if (this.ora > 24){
            setOra(getOra()- 24 );
        } 
            }
    }

    public boolean ugualeA(Orario ora) { 
        return this.ora == ora.ora &&
                this.minuti == ora.minuti &&
                this.secondi == ora.secondi;
    }

    public String mostra() {
        return String.format("%02d:%02d:%02d", ora, minuti, secondi);// %02d = stampa con due cifre, aggiungendo lo 0 davanti se serve
    }

}
