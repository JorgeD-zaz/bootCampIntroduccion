// El programa  muestra como  se encapsulan las propiedades de una clase  y como setearles valores  y obtenerlos  por medio de funciones
public class Main {
    public static void main(String[] args) {
    Persona persona = new Persona();

    persona.setNombre("Luis jorge");
    persona.setEdad(34);
    persona.setTelefono("3310114151");


        System.out.println("Nombre: "+ persona.getNombre());
        System.out.println("Edad: "+ persona.getEdad());
        System.out.println("Telefono: "+ persona.getTelefono());

    }


}
class Persona{
    private int edad;
    private String telefono;
    private String nombre;


    public  void  setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public  void  setTelefono(String telefono){
        this.telefono = telefono;
    }
    public String getTelefono(){
        return this.telefono;
    }

    public void setEdad(int edad){
        this.edad = edad;

    }
    public int getEdad(){
        return this.edad;
    }
}