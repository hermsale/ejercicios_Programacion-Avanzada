public class UsuarioComun extends UsuarioAbstract{

    // private int id;
    public UsuarioComun(String nombre, int edad) {
        super(nombre, edad);
    }

    public boolean tipo(){
        return false;
    }
}
