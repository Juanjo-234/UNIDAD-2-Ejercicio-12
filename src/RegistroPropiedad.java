public class RegistroPropiedad {

    public void transferirInmueble(Propiedad p, Propietario nuevoTitular) {
        if (p.isTieneEmbargo()) {
            System.out.println("[RECHAZADO] La propiedad en '" + p.getDireccion() +
                    "' posee un embargo activo. Transferencia denegada.");
        } else {
            // Proceder con la transferencia
            System.out.println("[APROBADO] Transferencia exitosa. Nuevo titular: " + nuevoTitular.getNombreCompleto());
        }
    }
}