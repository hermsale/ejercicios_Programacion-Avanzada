public class ParticipanteLimitado extends Participante{

    public ParticipanteLimitado(String nombre) {
        super(nombre);
    }


    // este usuario posee limitaciones para inscribirse a varios cursos
    
    @Override
    public boolean tieneRestriccion() {
        return true;
    }


    @Override
    public String toString() {
        return "ParticipanteLimitado []";
    }

        
}
