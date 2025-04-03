import java.time.LocalDate;

public class TicketSoporte {
    // Atributos de la clase TicketSoporte
    private int id;
    private String descripcion;
    private String estado;
    private LocalDate fechaCreacion;
    private Usuario usuario;
    private String tecnicoAsignado;

    // Metodos getters.
    public int getId() {
        return id;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public String getEstado() {
        return estado;
    }
    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public String getTecnicoAsignado() {
        return tecnicoAsignado;
    }

    // Constructor sobrecargado, para crear tickets con usuario.
    public TicketSoporte(int id, String descripcion, Usuario usuario) {
        this.id = id;
        this.descripcion = descripcion;
        this.estado = "Abierto";
        this.fechaCreacion = LocalDate.now();
        this.usuario = usuario;
    }

    // Constructor sobrecargado, para crear tickets sin usuario.
    public TicketSoporte(int id, String descripcion) {
        this(id, descripcion, null);
    }

    // Metodo para marcar a un ticket como "Cerrado".
    public void cerrarTicket() {
        this.estado = "Cerrado";
    }

    // Metodo para mostrar el detalle del ticket.
    public String mostrarDetalle() {
        String detalle = "Ticket #" + id +
                "\nDescripción: " + descripcion +
                "\nEstado: " + estado +
                "\nFecha creación: " + fechaCreacion;

        if (usuario != null) {
            detalle += "\nUsuario: " + usuario.getNombre();
        }

        if (tecnicoAsignado != null) {
            detalle += "\nTécnico asignado: " + tecnicoAsignado;
        }

        return detalle;
    }

    // Metodo para asignar un tecnico al ticket.
    public void asignarTecnico(String tecnico) {
        this.tecnicoAsignado = tecnico;
    }
}