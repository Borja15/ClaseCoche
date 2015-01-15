package coche;

public class ClaseCoche {
    
    String modelo;
    String color;
    boolean metalizada;
    int matricula;
    int año;
    
    void asignarValores(String model,String color1,boolean metal,int matri,int año1){
        modelo = model;
        color = color1;
        metalizada = metal;
        matricula = matri;
        año = año1;
    }
    
    String mostrarValores(){
        return modelo +" "+color;
    }
}
