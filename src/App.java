import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        // creo un listado y lo inicializo 
        List<Usuario> listado = new ArrayList<>();
        
        // creo una lista  nueva de todos los usuarios
        List<UsuarioAbstract> listado2 = new ArrayList<>();
        List<UsuarioAbstract> listadoPrioridad = new ArrayList<>();
        List<UsuarioAbstract> listadoComun = new ArrayList<>();

        System.out.println("Registro de Usuarios: ");

        // registro esta cantidad de usuarios
        Usuario user1 = new Usuario("Alejandro", 34);
        Usuario user2 = new Usuario("Erica", 35);
        Usuario user3 = new Usuario("Agustin", 33);

        listado.add(user1);
        listado.add(user2);
        listado.add(user3);

        // for (Usuario usuario : listado) {
        //     System.out.println(usuario);
        // }

        // se uso de metodo polimorfico para asignar prioridad
        UsuarioAbstract user4 = new UsuarioComun("Marcelo", 61);
        UsuarioAbstract user5 = new UsuarioComun("Susana", 55);
        UsuarioAbstract user6 = new UsuarioPrioridad("Erika", 39);
        UsuarioAbstract user7 = new UsuarioPrioridad("Barbara", 31);

        
        listado2.add(user6);
        listado2.add(user4);
        listado2.add(user5);
        listado2.add(user7);

        for(UsuarioAbstract usuarioAbs : listado2){
            if(usuarioAbs.tipo()==true){
                listadoPrioridad.add(usuarioAbs);
            }else{
                listadoComun.add(usuarioAbs);
            }
        }


        int i=0;
        System.out.println("Usuarios con prioridad: ");
        while (i<listadoPrioridad.size()) {
            System.out.println(listadoPrioridad.get(i)); // get es un metodo propio de la clase List 
            i++;
        }
        i=0;
        System.out.println("Usuarios comunes: ");
        while(i<listadoComun.size()){
            System.out.println(listadoComun.get(i)); // get es un metodo propio de la clase List 
            i++;
        }
    }
}
