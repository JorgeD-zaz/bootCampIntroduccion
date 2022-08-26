public class Main {
    public static void main(String[] args) {
    Cliente cliente1 = new Cliente();
    Trabajador trabajador1 = new Trabajador();

    cliente1.nombre= "Luis  Jorge";
    cliente1.edad = 34;
    cliente1.telefono= "3241324356";
    cliente1.credito= 50000;
        System.out.println("Nombre Cliente: "+cliente1.nombre);
        System.out.println("Edad: "+cliente1.edad);
        System.out.println("Telefono: "+cliente1.telefono);
        System.out.println("Credito: "+cliente1.credito +"\n");


        trabajador1.nombre= "Fabian Roberto";
        trabajador1.edad = 40;
        trabajador1.telefono= "4455764356";
        trabajador1.salario= 80000;
        System.out.println("Nombre Trabajador: "+trabajador1.nombre);
        System.out.println("Edad: "+trabajador1.edad);
        System.out.println("Telefono: "+trabajador1.telefono);
        System.out.println("Salario: "+trabajador1.salario);

    }

    public static class  Persona{
        String nombre;
        int edad;
        String telefono;

    }
    public static  class Cliente extends Persona{
        int credito;
    }

    public  static class Trabajador extends Persona{
        int salario;
    }
}