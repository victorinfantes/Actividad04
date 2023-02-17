import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        ArrayList<Integer> numEnteros = new ArrayList<>();
        ArrayList<Integer> otrosEnteros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i < 11; i++) {
            numEnteros.add(i);
        }
        for (int i = 11; i < 14; i++) {
            otrosEnteros.add(i);
        }
        System.out.println("Array de 10 numeros enteros");
        System.out.println(numEnteros);
        System.out.println("Array de 3 numeros mas");
        System.out.println(otrosEnteros);
        System.out.println("Los dos Arrays juntos");
        numEnteros.addAll(otrosEnteros);
        System.out.println(numEnteros);

        System.out.println("Array de nuevo con 10 numeros enteros");
        numEnteros.removeAll(otrosEnteros);
        System.out.println(numEnteros);
    }
}
