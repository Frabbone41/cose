public class main1 {
    public static void main(String[] args) {
        // Creare un rettangolo
Punto centro = new Punto(10, 10);
Rettangolo rett = new Rettangolo(6, 4, centro);

// Ottenere i vertici
Punto[] vertici = rett.getVertici();

// Stampare i vertici
for (int i = 0; i < vertici.length; i++) {
    System.out.println("Vertice " + i + ": (" + vertici[i].x + "; " + vertici[i].y + ")");
}

Punto punto1 = new Punto(2.0f,12.0f);

if(rett.isRettangolo(punto1)==true){
    System.out.println("il punto1 è all'interno del quadrato");
}else{
    System.out.println("il punto1 non è all'interno del quadrato");
}

rett.isVicino();

}
}
