import java.util.ArrayList;

public class Eccezioni {
    public static void main(String[] args) {
        String s  = "15";
        int i = 0;
        try {
             i = Integer.valueOf(s);
             System.out.println(i);
        } catch (NumberFormatException e) {
            System.out.println();
        }

        try {
            int n  = 19/1;
            System.out.println(n);
        } catch (ArithmeticException e) {
            System.out.println("non puoi dividere per 0");
        }
        ArrayList<String> lista=null;
        try{
            lista.add("pippo");
        }catch(NullPointerException e){
            System.out.println("asino " + e.getMessage());
        }
        lista = new ArrayList<>();
        try{
            String s2 = lista.get(3);
        }catch(IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
