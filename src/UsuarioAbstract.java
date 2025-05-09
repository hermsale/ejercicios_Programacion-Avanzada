public abstract class UsuarioAbstract implements AsignarTipo{

        private String nombre;
        private int edad;


        // el conteo del id lo lleva la clase padre
        private int id;
        private static int contador = 0;
    
        public UsuarioAbstract(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
            contador = contador+1;
            id = contador;
            
        }
    
    
        
    
        public String getNombre() {
            return nombre;
        }
    
    
    
    
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    
    
    
    
        public int getEdad() {
            return edad;
        }
    
    
    
    
        public void setEdad(int edad) {
            this.edad = edad;
        }
    
    
        // creo un metodo polimorfico
        // al integrarlo desde una interface. no hace falta declarar aca el metodo 
        // protected abstract String tipo();
    
    
        @Override
        public String toString() {
            return "Usuario [nombre=" + nombre + ", edad=" + edad + ", id=" + id;
        }       
    }
