public class Inscripcion {

    // clase de registro de participantes a cursos
    private Curso curso;
    private Participante participante;

    public Inscripcion(Curso curso, Participante participante) {
        this.curso = curso;
        this.participante = participante;
    }


    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Participante getParticipante() {
        return participante;
    }

    public void setParticipante(Participante participante) {
        this.participante = participante;
    }


    @Override
    public String toString() {
        return "Curso: " + curso.getNombre() + ", participante: " + participante.getNombre();
    }
}
