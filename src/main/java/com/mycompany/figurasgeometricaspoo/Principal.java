package com.mycompany.figurasgeometricaspoo;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        Circulo circulo = new Circulo("Círculo", "rojo", 5.0);
        Rectangulo rectangulo = new Rectangulo("Rectángulo", "azul", 4.0, 6.0);
        Triangulo triangulo = new Triangulo("Triángulo", "verde", 3.0, 4.0);

     
        System.out.println("Área del círculo: " + circulo.obtenerArea());
        System.out.println("Perímetro del círculo: " + circulo.obtenerPerimetro());
        System.out.println("Área del rectángulo: " + rectangulo.obtenerArea());
        System.out.println("Perímetro del rectángulo: " + rectangulo.obtenerPerimetro());
        System.out.println("Área del triángulo: " + triangulo.obtenerArea());
        System.out.println("Perímetro del triángulo: " + triangulo.obtenerPerimetro());

        circulo.setNombre("Nuevo Círculo");
        System.out.println("Nombre del círculo modificado: " + circulo.getNombre());

        sc.close();
    }
}


