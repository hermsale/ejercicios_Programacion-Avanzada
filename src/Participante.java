public abstract class Participante {
    // creo un contador para llevar el conteo de identificador unico
    private int id;
    private String nombre;
    private static int contador = 0;

    public Participante(String nombre) {
        setNombre(nombre);
        contador=contador+1;
        this.id = contador;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    private void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
            this.nombre = nombre;
    }
}
