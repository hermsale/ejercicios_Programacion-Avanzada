import java.util.Objects;

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


    // metodos para el uso del List con hashSet
    @Override
    // equals define que dos inscripciones son iguales si tienen el mismo curso y participante
    public boolean equals(Object obj) {
       if(this == obj) return true;
       if(obj == null || getClass() != obj.getClass()) return false;
       Inscripcion that = (Inscripcion) obj;

    //    comparo el id del curso y participante que viene y con los que ya tengo 
       return participante.getId() == that.participante.getId() && curso.getCodigo() == that.curso.getCodigo();
    }
    @Override
    public int hashCode() {
         // Genera un código numerico unico basado en curso y participante
       return Objects.hash(curso.getCodigo(),participante.getId());
    }



    
}
