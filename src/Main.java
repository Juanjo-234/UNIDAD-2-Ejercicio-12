//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Propiedad propiedadLibre = new Propiedad("AVENIDA SAN MARTIN 1500", " AL DIA ", 1500, false);
    Propiedad propiedadEmbargada = new Propiedad("BELGRANO 890", " embargo ", 5000, true);

    Propietario propietario1 = new Propietario("Juan Perez", 34786932);
    Propietario propietario2 = new Propietario("Pepe Soldan", 48392046);

    RegistroPropiedad registro = new RegistroPropiedad();
    GestorInmobiliario gestor = new GestorInmobiliario(registro);

System.out.println("--------CASO 1--------");
System.out.println("Estado de la propiedad: " + propiedadLibre);
gestor.ejecutarSolicitudTransferencia(propiedadLibre, propietario1);



System.out.println("--------CASO 2--------");
System.out.println("Estado de la propiedad: " + propiedadEmbargada);
gestor.ejecutarSolicitudTransferencia(propiedadEmbargada, propietario2);



}
