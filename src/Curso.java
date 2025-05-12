public class Curso {

    private String nombre;
    private int codigo;
    private int cupoMaximo;
    
    public Curso(String nombre, int codigo, int cupoMaximo) {
        setCupoMaximo(cupoMaximo);
        setNombre(nombre);
        setCodigo(codigo);
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
        return "nombre: " + getNombre() + ", codigo:" + getCodigo() + ", cupoMaximo: " + getCupoMaximo();
    }
}
