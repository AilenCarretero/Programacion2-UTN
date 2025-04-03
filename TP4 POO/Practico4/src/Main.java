import java.util.List;

public class Main {
    public static void main(String[] args) {
        SistemaSoporte sistema = new SistemaSoporte();

        Usuario usuario1 = new Usuario(1, "Jeff Albertson", "jeffalbertson@springfield.com");
        Tecnico tecnico1 = new Tecnico(1, "John I.Q. Nerdelbaum Frink", "Redes");
        TicketSoporte ticket1 = sistema.crearTicket("No hay conexión a internet", usuario1);
        sistema.asignarTecnico(ticket1.getId(), tecnico1);
        ticket1.cerrarTicket();

        Usuario usuario2 = new Usuario(2, "Marge Simpsons", "margesimpsons@springfield.com");
        Tecnico tecnico2 = new Tecnico(2, "Apu Nahasapeemapetilon", "Software");
        TicketSoporte ticket2 = sistema.crearTicket("El programa no inicia", usuario2);
        sistema.asignarTecnico(ticket2.getId(), tecnico2);

        Usuario usuario3 = new Usuario(3, "Bart Simpsons", "bartjsimpsons@springfield.com");
        Tecnico tecnico3 = new Tecnico(3, "Clancy Wiggum", "Ciberseguridad");
        TicketSoporte ticket3 = sistema.crearTicket("Ataque DDoS", usuario3);
        sistema.asignarTecnico(ticket3.getId(), tecnico3);

        // Mostrar reporte
        System.out.println(sistema.generarReporte());

        System.out.println();

        System.out.println("Tickets abiertos:");

        System.out.println();
        
        List<TicketSoporte> abiertos = sistema.getTicketsAbiertos();
        for (TicketSoporte ticket : abiertos) {
            System.out.println(ticket.mostrarDetalle());
            System.out.println();
        }
    }
}