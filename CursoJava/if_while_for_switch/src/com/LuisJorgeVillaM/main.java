package com.LuisJorgeVillaM;

public class main {

    public static void main(String[] args) {
      int  numeroIF = 10;
      int numeroWhile = 0;
      int numeroDoWhile = 2;
      int numeroFor = 0;
      String estacion = "retret";

     si(numeroIF);
     mientras(numeroWhile);
     doMientras(numeroDoWhile);
     para(numeroFor);
    casos(estacion);
    }

    static void si(int numeroIf){
        if(numeroIf > 0){
            System.out.println(numeroIf + " Es positivo");
        } else if (numeroIf < 0) {
            System.out.println(numeroIf+" Es negativo");

        } else if (numeroIf == 0) {
            System.out.println(numeroIf +" Es neutro");

        }

    }

    static void mientras(int numeroWhile ){
      while(numeroWhile < 3){
          System.out.println("Iteracion while: "+numeroWhile);
          numeroWhile++;
      }
    }
    static void doMientras(int numeroDoWhile ){
       do {
           System.out.println("Iteracion Do While: "+numeroDoWhile);
           numeroDoWhile++;
       }while (numeroDoWhile < 3);
    }
    static void  para(int numeroFor){
        for (int i = 0; i < 3; i++ ){
            System.out.println("Iteracion For: "+ numeroFor);
            numeroFor++;

        }

    }

    static void casos(String estacion ){
        switch (estacion){
            case "Primavera":
                System.out.println("Estamos en "+ estacion);
                break;
            case "Verano":
                System.out.println("Estamos en "+ estacion);
                break;
            case "Otoño":
                System.out.println("Estamos en "+ estacion);
                break;
            case "invierno":
                System.out.println("Estamos en "+ estacion);
                break;
            default:
                System.out.println(estacion +" No es una estacion");

        }


    }
}
