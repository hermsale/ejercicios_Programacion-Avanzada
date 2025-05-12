public class Curso {

    private String nombre;
    private int codigo;
    private int cupoMaximo;
    private int cantidadInscriptos =0;
    
    public Curso(String nombre, int codigo, int cupoMaximo, int cantidadInscriptos) {
        setCupoMaximo(cupoMaximo);
        setNombre(nombre);
        setCodigo(codigo);
        this.cantidadInscriptos = cantidadInscriptos;
    }

    
    public int getcantidadInscriptos(){
        return cantidadInscriptos;
    }
    
    public void setcantidadInscriptos(int cantidadInscriptos){
         this.cantidadInscriptos = cantidadInscriptos;
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    private void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCupoMaximo() {
        return cupoMaximo;
    }

    private void setCupoMaximo(int cupoMaximo) {
        if(cupoMaximo<0){
            throw new IllegalArgumentException("El numero de cupo máximo no puede ser inferior a 0.");
        }
        this.cupoMaximo = cupoMaximo;
    }

    @Override
public String toString() {
    return "Curso: " + getNombre() + "\n" +
           "Código: " + getCodigo() + "\n" +
           "Cupo máximo: " + getCupoMaximo() + "\n" +
           "Inscriptos actuales: " + getcantidadInscriptos() ;
    }
}
