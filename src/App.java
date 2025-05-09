public class App {
    public static void main(String[] args) throws Exception {
      
        Instituto inst = new Instituto();

        Participante participante1 = new ParticipanteLimitado("Alejandro");
        Participante participante2 = new ParticipanteSinRestriccion("Agustin");

        inst.registrarParticipante(participante1);
        inst.registrarParticipante(participante2);
        
        inst.mostrarParticipantes();
        
    }
}
