public class GestorInmobiliario {
RegistroPropiedad registroPropiedad;

public  GestorInmobiliario(RegistroPropiedad registroPropiedad){
    this.registroPropiedad = registroPropiedad;
}
    void ejecutarSolicitudTransferencia(Propiedad p, Propietario nuevoTitular){
        System.out.println(" Procesando solicitud de transferencia inmobiliaria. ");
        registroPropiedad.transferirInmueble(p, nuevoTitular);
    }
}
