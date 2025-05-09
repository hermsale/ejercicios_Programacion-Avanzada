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

    public void registrarParticipante(Participante participante){
        participantes.add(participante);
    }

    // croe un metodo polimorfico para mostrar cualquier tipo de lista
    public <T> void mostrar(List<T> lista){
        for(T i: lista){
            System.out.println(i);
        }
    }

    public void mostrarParticipantes(){
        for(Participante p : participantes){
            System.out.println(p);
        }
    }
}
