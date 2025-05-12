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

    

    public void registrarParticipanteEnCurso(Inscripcion inscripcion){
        if(inscripcion==null){
            throw new IllegalArgumentException("La inscripción no puede ser nula");
        }

        if(inscripcion.getCurso().getcantidadInscriptos()>=inscripcion.getCurso().getCupoMaximo()){
            System.out.println("No hay cupo diponible en el curso de: "+inscripcion.getCurso().getNombre());
            return;
        }

        // Validacion de registro
        if(inscripcion.getParticipante().tieneRestriccion()==true){

            // esta opcion es lo mismo que hacer
            // for(Inscripcion i : inscripciones){
            //     if(i.getParticipante().equals(inscripcion.getParticipante())){
            //         return false;
            //     }
            // }

            // es lo mismo que hacer la anterior. pero usando stream y anymatch que son metodos de la clase Collection de Java
            boolean yaInscripto = inscripciones.stream().anyMatch(i -> i.getParticipante().equals(inscripcion.getParticipante()));
            
            if (yaInscripto) {
                System.out.println("El usuario: "+inscripcion.getParticipante().getNombre() +". Tiene una restriccion: No puede estar en mas de un curso");
                return;
            }
        }

        // HashSet verifica automaticamente si el participante ya se encuentra inscripto en el mismo curso
        if(inscripciones.add(inscripcion)){
            System.out.println("Inscripcion exitosa ");
            incrementarInscriptos(inscripcion.getCurso());
            return;
        }else{
            System.out.println("Error al inscribirse. "+inscripcion.getParticipante().getNombre()+" Ya se encuentra inscripto a "+inscripcion.getCurso().getNombre());
            return;
        }
    }

    // Método para mirar todas las inscripciones
    public void mostrarInscripciones() {
        if (inscripciones.isEmpty()) {
            System.out.println("No hay inscripciones registradas.");
        } else {
            System.out.println("\n=== LISTA DE INSCRIPCIONES ===");
            // inscripciones.forEach(i-> System.out.println(i)); // cualquiera de las dos opciones hace lo mismo
            inscripciones.forEach(System.out::println);
            // inscripciones..getcantidadInscriptos();       
        }
    }

    // creo un metodo polimorfico para mostrar cualquier tipo de lista
    public <T> void mostrar(List<T> lista){
        // System.out.println("Lista: ");
        for(T i: lista){
            System.out.println(i);
        }
    }

    // metodos para manejo de capacidad de inscripciones
    public void incrementarInscriptos(Curso curso){
        curso.setcantidadInscriptos(curso.getcantidadInscriptos()+1);
    }
}
