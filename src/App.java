public class App {
    public static void main(String[] args) throws Exception {

        Instituto inst = new Instituto();

        Participante participante1=null;
        Participante participante2=null;
        Participante participante3=null;
        Curso curso1=null;
        Curso curso2=null;
        Curso curso3=null;
        Inscripcion insc1 = null;
        Inscripcion insc2 = null;
        Inscripcion insc3 = null;

        try {
            participante1 = new ParticipanteLimitado("Alejandro");
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            participante2 = new ParticipanteSinRestriccion("");
        } catch (Exception e) {
            System.out.println(e);        
        }

        try {
            participante3 = new ParticipanteLimitado("Marcelo");
        } catch (Exception e) {
            System.out.println(e);
        }

        inst.registrarParticipante(participante1);
        inst.registrarParticipante(participante2);
        inst.registrarParticipante(participante3);

        try {
            curso1 = new Curso("Programacion Web 1", 101, 10);
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            curso2 = new Curso("Programacion Web 2", 102, 8);
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            curso3 = new Curso("PA", 103, -5);
        } catch (Exception e) {
            System.out.println(e);
        }

        
        
        inst.crearCurso(curso1);
        inst.crearCurso(curso2);
        inst.crearCurso(curso3);
        
    
        System.out.println("Participantes: ");        
        inst.mostrar(inst.getParticipantes());
        System.out.println("Cursos: ");
        inst.mostrar(inst.getCursos());

        insc1 = new Inscripcion(curso1, participante1);
        insc2 = new Inscripcion(curso2, participante3);
        insc3 = new Inscripcion(curso1, participante1);
        inst.registrarParticipanteEnCurso(insc1);
        inst.registrarParticipanteEnCurso(insc2);
        inst.registrarParticipanteEnCurso(insc3); // esta linea no se va a inscribir porque el participante ya se encuentra en ese curso

        inst.mostrarInscripciones();
        // insc1 = new Inscripcion(curso1, participante1);
        // insc2 = new Inscripcion(curso2, participante2);
        // insc3 = new Inscripcion(curso1, participante1);

    }
}
