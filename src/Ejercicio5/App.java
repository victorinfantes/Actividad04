package Ejercicio5;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<Alumno> alumnos=new ArrayList<>();

        int dni;
        String nombre,apellidos,dir;
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 1; i++) {
            System.out.println("Introduce el dni del alumno: ");
            dni=sc.nextInt();
            System.out.println("Introduce el nombre del alumno: ");
            nombre=sc.next();
            System.out.println("Introduce el apellido del alumno: ");
            apellidos=sc.next();
            System.out.println("Introduce la direccion del alumno: ");
            dir=sc.next();
            alumnos.add(new Alumno(dni, nombre,apellidos,dir));
        }
        int opcion = 0;
        while (opcion != 6) {
            System.out.println("Introduce la opcion que desea seleccionar");
            opcion=sc.nextInt();
            switch (opcion) {
                case 1: {
                    System.out.println("Introduce el nombre del alumno");
                    nombre = sc.next();
                    for (Alumno p:
                         alumnos) {
                        if (nombre.equalsIgnoreCase(p.getNombre())) {
                            System.out.println(p.toString());
                        }
                    }
                break;
                }
                case 2:{
                    System.out.println("Introduce las primeras letras del nombre del alumno: ");
                    nombre = sc.next();
                    for (Alumno p:
                            alumnos) {
                        if (p.getNombre().contains(nombre)) {
                            System.out.println(p.toString());
                        }
                    }
                break;
                }
                case 3: {
                    System.out.println("Introduce el alumno: ");
                    nombre=sc.next();
                    for (Alumno p:
                            alumnos) {
                        if (p.getApellidos().contains(nombre)) {
                            System.out.println(p.getApellidos());

                        }
                    }
                }
            }
        }

    }
}
