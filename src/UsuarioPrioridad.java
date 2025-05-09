public class UsuarioPrioridad extends UsuarioAbstract{
    // private int id;
 
    public UsuarioPrioridad(String nombre, int edad) {
        super(nombre, edad);
        // id = contador;
    }

    @Override
    public boolean tipo(){
        return true;
    }

}
