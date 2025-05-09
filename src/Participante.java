public abstract class Participante implements AsignarRestriccion{
    
    // Cada participante debe tener al menos un identificador único y un nombre válido. - LISTO
    private int id;
    private String nombre;
    private static int contador = 0;

    public Participante(String nombre) {
        // Uso el setter para asignar el nombre, ya que incluye validaciones
        setNombre(nombre);
        // Si no hubiera validaciones, podría asignarlo directamente:
        // this.nombre = nombre;
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

    @Override
    public String toString() {
        return "id: " + getId() + ", nombre: " + getNombre() + "";
    }
}
