import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Instituto {

    private List<Participante> participantes = new ArrayList<>();
    private List<Curso> cursos = new ArrayList<>();
    private Set<Inscripcion> inscripciones = new HashSet<>();
   
    

    public Instituto() {
        
    }

    public List<Participante> getParticipantes(){
        return participantes;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public Set<Inscripcion> getInscripciones() {
        return inscripciones;
    }

    // metodos para crear participante 
    public void registrarParticipante(Participante participante){
        if (participante!=null) {
            participantes.add(participante);
        }
    }

    // metodos para crear cursos
    public void crearCurso(Curso curso){
        if(curso!=null){
            cursos.add(curso);
        }
    }

    public boolean registrarParticipanteEnCurso(Inscripcion inscripcion){
        if(inscripcion==null){
            throw new IllegalArgumentException("La inscripción no puede ser nula");
        }

        // HashSet verifica automaticamente si el participante ya se encuentra inscripto en el mismo curso
        if(inscripciones.add(inscripcion)){
            System.out.println("Inscripcion exitosa ");
            return true;
        }else{
            System.out.println("Error al inscribirse. "+inscripcion.getParticipante().getNombre()+" Ya se encuentra inscripto a "+inscripcion.getCurso().getNombre());
            return false;
        }
    }

    // Método opcional para ver inscripciones
    public void mostrarInscripciones() {
        if (inscripciones.isEmpty()) {
            System.out.println("No hay inscripciones registradas.");
        } else {
            System.out.println("\n=== LISTA DE INSCRIPCIONES ===");
            inscripciones.forEach(System.out::println);
        }
    }
    // creo un metodo polimorfico para mostrar cualquier tipo de lista
    public <T> void mostrar(List<T> lista){
        // System.out.println("Lista: ");
        for(T i: lista){
            System.out.println(i);
        }
    }
}
