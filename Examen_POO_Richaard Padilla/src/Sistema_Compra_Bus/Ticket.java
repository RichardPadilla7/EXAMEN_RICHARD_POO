package Sistema_Compra_Bus;

public class Ticket {
    private Ruta ruta;
    private String tipoServicio;
    private Pasajero pasajero;

    public Ticket() {
    }

    public Ticket(Ruta ruta, String tipoServicio, Pasajero pasajero) {
        this.ruta = ruta;
        this.tipoServicio = tipoServicio;
        this.pasajero = pasajero;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public double calcularPasaje() {
        double costoBase = ruta.getPrecio();
        if (tipoServicio.equals("VIP")) {
            costoBase *= 1.3;
        }
        return costoBase;
    }

    public void imprimirInformacion() {
        System.out.println("Detalles:");
        System.out.println("Pasajero: " + pasajero.getNombre() + " " + pasajero.getApellido());
        System.out.println("Cedula: " + pasajero.getCedula());
        System.out.println("Telefono: " + pasajero.getTelefono());
        System.out.println("La Ruta: " + ruta.getOrigen() + " - " + ruta.getDestino());
        System.out.println("Tipo de Servicio: " + tipoServicio);
        System.out.println("Precio: " + calcularPasaje());
    }
}
