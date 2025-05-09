public class ParticipanteSinRestriccion extends Participante{

    // no tiene restricciones para inscribirse a los cursos 
    public ParticipanteSinRestriccion(String nombre) {
        super(nombre);
    }

    // este usuario NO posee limitaciones para inscribirse a varios cursos
    @Override
    public boolean tieneRestriccion() {
        return false;
    }
}
