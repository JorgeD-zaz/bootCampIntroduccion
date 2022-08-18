package com.company;

public class Main {

     public static void main(String[] args) {
        int r =  suma(20, 89, 90);
        System.out.printf("El  resultado de la funcion suma entre 20, 89, 90 es "+ r +"\n\n");
        coche miCoche = new coche();
        System.out.printf("El numero de puertas inicial es: "+String.valueOf(miCoche.puertas) +"\n");
        System.out.println("Llamando a la funcion sumar puertas....." );
        miCoche.sumapuertas();
        System.out.println("El numero de puertas es:" + String.valueOf(miCoche.puertas));
    }
    public static int suma(int a, int b, int c){
        int result  = a + b+ c ;
        return result;
    }

}
class coche{
    int puertas = 0 ;

    public void  sumapuertas(){
        puertas ++;

    }


}
