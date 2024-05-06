package com.mycompany.figurasgeometricaspoo;

public class FiguraGeometrica {
    
    private String nombre; 
    private String color; 
    
    
     public double obtenerArea(){
      return 0;      
     } 
     
     public double obtenerPerimetro(){
     return 0; 
         
     }

    public FiguraGeometrica(String nombre,String color) {
        this.color = color; 
        this.nombre = nombre; 
        
    }

    public String getNombre() {
        return nombre;
    }

    public String getColor() {
        return color;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
     
     
}
