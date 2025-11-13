
    public class main1 {
    
        public static void main(String[] args)   { //* */
    
            CD cd1 = new CD("The Dark Side of the Moon", "Pink Floyd", 10, 42.59);
            CD cd2 = new CD("Thriller", "Michael Jackson", 9, 42.19);
            CD cd3 = new CD("Back in Black", "AC/DC", 10, 41.59);
    
            System.out.println(cd1.toString());
            System.out.println(cd2.toString());
            System.out.println(cd3.toString());

            double durataDaConfrontare = cd1.getDurata();

            int confronto = cd3.compareDurata(durataDaConfrontare, cd2.getDurata());

            if (confronto == -1) {
                System.out.println(cd3.toString() + " ha una durata minore di entrambi i CD confrontati.");
            } else if (confronto == 1) {
                System.out.println(cd3.toString() + " ha una durata maggiore di entrambi i CD confrontati.");
            } else {
                System.out.println(cd3.toString() + " ha una durata compresa tra i due CD confrontati o uguale a uno di essi.");
            }
        }
    
    }
