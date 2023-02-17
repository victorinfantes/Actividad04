import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<Integer> numerosPares = new ArrayList<>();
        ArrayList<Integer> numerosImpares = new ArrayList<>();
        ArrayList<Integer> numeros = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero entre el 1 y el 10");
        int numero = sc.nextInt();
        while (numero != 0) {
            if (numero % 2 == 0) {
                System.out.println("El numero es par lo añado a la lista de pares");
                numerosPares.add(numero);
            }
            else {
                System.out.println("El numero es impar lo añado a la lista de impares");
                numerosImpares.add(numero);
            }
            System.out.println("Introduce un numero entre el 1 y el 10");
            System.out.println("Introduzca 0 para salir");
            numero= sc.nextInt();

        }
        System.out.println(numerosPares);
        System.out.println(numerosImpares);
        numeros.addAll(numerosImpares);
        numeros.addAll(numerosPares);
        System.out.println(numeros);


    }
}
