public class Usuario {
    private String nombre;
    private int edad;
    private int id;
    private static int contador = 0;

    public Usuario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        contador = contador+1;
        id = contador;
    }


    

    public String getNombre() {
        return nombre;
    }




    public void setNombre(String nombre) {
        this.nombre = nombre;
    }




    public int getEdad() {
        return edad;
    }




    public void setEdad(int edad) {
        this.edad = edad;
    }




    @Override
    public String toString() {
        return "Usuario [nombre=" + nombre + ", edad=" + edad + ", id=" + id + "]";
    }


    
}
