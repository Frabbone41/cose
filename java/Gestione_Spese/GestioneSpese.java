import java.util.ArrayList;

public class GestioneSpese {

    private ArrayList<Spesa> lista = new ArrayList<>();

    public GestioneSpese() {
        this.lista = new ArrayList<Spesa>();
    }

    public ArrayList<Spesa> getLista() {
        return lista;
    }
    public void mostraSpese(){
        for (Spesa spesa : lista) {
            System.out.println(spesa.toString());
        }
    }

    public void aggiungi(Spesa s) {
        lista.add(s);
    }

    public double totale() {
        double totale = 0; // inizializzi fuori dal ciclo

        for (Spesa s : lista) { // scorri ogni oggetto Spesa
            totale += s.getImporto(); // aggiungi il suo importo
        }
        return totale; // restituisci il totale
    }

    public double mediaspesa() {
        double media = 0;
        for (Spesa s : lista) {
            media += s.getImporto();
        }
        return media / lista.size();
    }

    public String maxmin() {
        double min = lista.get(0).getImporto();
        double max = lista.get(0).getImporto();
        for (Spesa s : lista) {
            if (min > s.getImporto())
                min = s.getImporto();
            if (max < s.getImporto())
                max = s.getImporto();
        }
        return String.format("max=%.2f min=%.2f", max, min);
    }

    public String catg() {
        ArrayList<String> categorie = new ArrayList<>();
        ArrayList<Double> totali = new ArrayList<>();

        // Somma gli importi per categoria
        for (Spesa s : lista) {
            String cat = s.getCategoria();
            double imp = s.getImporto();

            int index = categorie.indexOf(cat);
            if (index == -1) {
                categorie.add(cat);
                totali.add(imp);
            } else {
                totali.set(index, totali.get(index) + imp);
            }
        }

        // Trova max e min
        double max = totali.get(0);
        double min = totali.get(0);
        String catMax = categorie.get(0);
        String catMin = categorie.get(0);

        for (int i = 1; i < totali.size(); i++) {
            if (totali.get(i) > max) {
                max = totali.get(i);
                catMax = categorie.get(i);
            }
            if (totali.get(i) < min) {
                min = totali.get(i);
                catMin = categorie.get(i);
            }
        }

        return String.format("la categoria con le spese più alte è %s = %.2f€\nla categoria con le spese più basse è %s = %.2f€",catMax,max,catMin,min);
    } /*"Categoria con spese più alte: " + catMax + " (" + max + "€)\n" +
                "Categoria con spese più basse: " + catMin + " (" + min + "€)";
    } */

    public String pagaments() {

        ArrayList<String> pagamento = new ArrayList<>();
        ArrayList<Double> totali = new ArrayList<>();

        // Somma gli importi per categoria
        for (Spesa s : lista) {
            String pag = s.getPagamento();
            double imp = s.getImporto();

            int index = pagamento.indexOf(pag);
            if (index == -1) {
                pagamento.add(pag);
                totali.add(imp);
            } else {
                totali.set(index, totali.get(index) + imp);
            }
        }

        // Trova max e min
        double max = totali.get(0);
        double min = totali.get(0);
        String pagmax = pagamento.get(0);
        String pagmin = pagamento.get(0);

        for (int i = 1; i < totali.size(); i++) {
            if (totali.get(i) > max) {
                max = totali.get(i);
                pagmax = pagamento.get(i);
            }
            if (totali.get(i) < min) {
                min = totali.get(i);
                pagmin = pagamento.get(i);
            }
        }
return String.format("il metodo di pagamento con le spese più alte è %s = %.2f€\nil metodo di pagamento con le spese più basse è %s = %.2f€",pagmax,max,pagmin,min);


    }

}
