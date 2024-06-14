//Richard Padilla
package Sistema_Compra_Bus;

public class Main {
    public static void main(String[] args) {
        System.out.println("**** EL BUHO ****");
        System.out.println("-SISTEMA DE COMPRA DE PASAJE DE BUSES-");

        Ruta rutaQuitoGuayaquil = new Ruta("Quito", "Guayaquil", 20.0, 180, 1000);
        Ruta rutaQuitoTulcan = new Ruta("Quito", "Tulcan", 17.50, 200, 2700);
        Ruta rutaQuitoPuyo = new Ruta("Quito", "Puyo", 15.0, 180, 15008);
        Ruta rutaQuitoRiobamba = new Ruta("Quito", "Riobamba", 17.50, 160, 10054);

        Pasajero pasajero1 = new Pasajero("Richard", "Padilla", "0278962191", "0979169393","richardpadilla@epn.edu.ec");
        Ticket ticketHumilde1 = new TicketHumilde(rutaQuitoGuayaquil, pasajero1);
        Ticket ticketVIP1 = new VIP(rutaQuitoTulcan, pasajero1);

        Pasajero pasajero2 = new Pasajero("Kevin", "Sanches", "1258632571","097521478", "kevinSanches@gmail.com");
        Ticket ticketHumilde2 = new TicketHumilde(rutaQuitoPuyo, pasajero2);
        Ticket ticketVIP2 = new VIP(rutaQuitoRiobamba, pasajero2);

        System.out.println("----- Información del pasajero Humilde 1 -----");
        ticketHumilde1.imprimirInformacion();
        System.out.println("\n----- Información del pasajero VIP 1 -----");
        ticketVIP1.imprimirInformacion();

        System.out.println("\n----- Información del pasajero Humilde 2 -----");
        ticketHumilde2.imprimirInformacion();
        System.out.println("\n----- Información del pasajero VIP 2 -----");
        ticketVIP2.imprimirInformacion();
    }
}