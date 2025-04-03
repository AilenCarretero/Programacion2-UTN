import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SistemaSoporte {

    // Atributos de la clase SistemaSoporte
    private List<TicketSoporte> tickets;
    private static int totalTickets = 0;

    public SistemaSoporte() {
        this.tickets = new ArrayList<>();
    }

    // Creacion Ticket
    public TicketSoporte crearTicket(String descripcion, Usuario usuario) {
        totalTickets++;
        TicketSoporte ticket = new TicketSoporte(totalTickets, descripcion, usuario);
        tickets.add(ticket);
        return ticket;
    }

    // Asignación de tecnicos.
    public void asignarTecnico(int idTicket, Tecnico tecnico) {
        for (TicketSoporte ticket : tickets) {
            if (ticket.getId() == idTicket) {
                ticket.asignarTecnico(tecnico.getNombre());
                break;
            }
        }
    }

    // Metodo para listar los tickets abiertos.
    public List<TicketSoporte> getTicketsAbiertos() {
        List<TicketSoporte> abiertos = new ArrayList<>();
        for (TicketSoporte ticket : tickets) {
            if (ticket.getEstado().equals("Abierto") || ticket.getEstado().equals("En proceso")) {
                abiertos.add(ticket);
            }
        }
        return abiertos;
    }

    // Metodo para listar los tickets cerrados.
    public List<TicketSoporte> getTicketsCerrados() {
        List<TicketSoporte> cerrados = new ArrayList<>();
        for (TicketSoporte ticket : tickets) {
            if (ticket.getEstado().equals("Cerrado")) {
                cerrados.add(ticket);
            }
        }
        return cerrados;
    }

    public static int getTotalTickets() {
        return totalTickets;
    }

    // Metodo para generar un reporte sobre los tickets
    public String generarReporte() {
        int abiertos = getTicketsAbiertos().size();
        int cerrados = getTicketsCerrados().size();

        return "REPORTE DEL SISTEMA:\n" +
                "Tickets totales: " + totalTickets + "\n" +
                "Tickets abiertos: " + abiertos + "\n" +
                "Tickets cerrados: " + cerrados;
    }
}