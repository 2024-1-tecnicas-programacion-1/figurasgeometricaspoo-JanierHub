package com.mycompany.figurasgeometricaspoo;

public class Triangulo extends FiguraGeometrica {
    private double lado1; 
    private double lado2; 
    
    public Triangulo(String nombre, String color, double lado1, double lado2) {
        super(nombre, color);
        this.lado1 = lado1; 
        this.lado2 = lado2; 
        
    }
    
     
     
    /**
     *
     */
     public double obtenerArea(){
         
         return this.lado2*this.lado1/2;
        
     
     } 
     
    /**
     *
     */
     public double obtenerPerimetro(){
        
         return this.lado1+this.lado2;
         
         
     }
}
