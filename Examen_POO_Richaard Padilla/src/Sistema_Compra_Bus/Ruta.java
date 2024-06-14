package Sistema_Compra_Bus;

public class Ruta {
    private String origen;
    private String destino;
    private double precio;
    private int tiempo;
    private int distancia;


    public Ruta() {
    }

    public Ruta(String origen, String destino, double precio, int tiempo, int distancia) {
        this.origen = origen;
        this.precio = precio;
        this.destino = destino;
        this.tiempo = tiempo;
        this.distancia = distancia;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }
}
