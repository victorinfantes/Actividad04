import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numeros.add((int) (Math.round(Math.random() * 10)));
        }
        System.out.println(numeros);
        //Eliminamos todos los 5 que haya en la lista utilizando valueOf
        numeros.remove(Integer.valueOf(5));
        System.out.println(numeros);
    }
}
