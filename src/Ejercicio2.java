import java.util.ArrayList;
import java.util.Iterator;

public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numeros.add((int) (Math.round(Math.random() * 10)));
        }
        System.out.println(numeros);
        //numeros.remove(Integer.valueOf(5));
        //System.out.println(numeros);
        //Eliminamos todos los 5 que haya en la lista utilizando Iterator
        Iterator<Integer> it = numeros.iterator();
        while (it.hasNext()) {
            int i = it.next();
            if (i == 5) {
                it.remove();
            }
        }
        System.out.println(numeros);


    }
}
