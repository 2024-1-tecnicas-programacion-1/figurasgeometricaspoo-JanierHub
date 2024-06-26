package com.mycompany.figurasgeometricaspoo;

public class Circulo extends FiguraGeometrica {
    
    private double radio; 
   
    public Circulo(String nombre, String color,double radio) {
        super(nombre, color);
        this.radio = radio;
    }
   
     public double obtenerArea(){
     return Math.PI*radio*2;
     
     } 
  
     public double obtenerPerimetro(){
        return   2*Math.PI*radio;
         
     }
   
  }
     
 
