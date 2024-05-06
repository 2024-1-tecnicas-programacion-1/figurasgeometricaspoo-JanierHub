package com.mycompany.figurasgeometricaspoo;
import  java.util.Scanner; 
public class Circulo extends FiguraGeometrica {
    
    private double radio; 
   
    public Circulo(String nombre, String color) {
        super(nombre, color);
    }
    
    public void main (String[]args){
    
   Scanner sc = new Scanner (System.in); 
   
    }
    
  
    @Override
     public double obtenerArea(){
     int pi = (int) 3.14;    
     System.out.println("Ingrese el radio");
     int radio = sc.nextInt();
         System.out.println("El area es:"+pi*radio*2);
     
     } 
     
    /**
     *
     * @return
     */
    @Override
     public double obtenerPerimetro(){
         
         int pi = (int) 3.14;
         System.out.println("Ingrese el radio");
         int radio = sc.nextInt();
            System.out.println("El perimetro es: " + 2*pi*radio);
                
     }
   
  }
     
 
