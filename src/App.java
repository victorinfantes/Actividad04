import Ejercicio5.Alumno;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<Alumno> alumnos = new ArrayList<>();
        String dni;
        String nombre, apellidos, dir;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 1; i++) {
            System.out.println("Introduce el dni del alumno");
            dni = sc.next();
            System.out.println(dni);
            System.out.println("Introduce el nombre del alumno");
            nombre = sc.next();
            System.out.println("Introduce los apellidos del alumno");
            apellidos = sc.next();
            System.out.println("Introduce la dirección del alumno");
            dir = sc.next();
            alumnos.add(new Alumno(dni,nombre,apellidos,dir));
            System.out.println(alumnos);
            for (Alumno a : alumnos) {
                System.out.println(a.toString());
            }
        }

        for (Alumno a : alumnos) {
            System.out.println(a.toString());
        }






    }
}
