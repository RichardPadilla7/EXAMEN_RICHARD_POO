package Sistema_Compra_Bus;

public class Servicio {
    private String[] serviciosAdicionales;

    public Servicio() {
    }

    public Servicio(String[] serviciosAdicionales) {
        this.serviciosAdicionales = serviciosAdicionales;
    }

    public String[] getServiciosAdicionales() {
        return serviciosAdicionales;
    }

    public void setServiciosAdicionales(String[] serviciosAdicionales) {
        this.serviciosAdicionales = serviciosAdicionales;
    }

}