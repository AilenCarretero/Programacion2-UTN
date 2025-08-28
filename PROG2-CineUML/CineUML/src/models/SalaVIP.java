package models;

public class SalaVIP extends Sala {
    protected String beneficio;

    public SalaVIP(int numero, int capacidad, String beneficio) {
        super(numero, capacidad);
        this.beneficio = beneficio;
    }

    public String getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(String beneficio) {
        this.beneficio = beneficio;
    }
}
