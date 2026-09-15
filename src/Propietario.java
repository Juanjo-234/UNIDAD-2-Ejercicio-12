public class Propietario {
    String nombreCompleto;
    int DNI;

    public Propietario(String nombreCompleto, int DNI){
        this.nombreCompleto = nombreCompleto;
        this.DNI = DNI;
    }

    String getNombreCompleto(){
        return nombreCompleto;
    }

    int getDNI(){
        return DNI;
    }
}
