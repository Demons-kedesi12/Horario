package Simulado.SimuladoLele.Clinica;

public enum StatusConsulta {
    AGENDADA("Consulta Agendada!"),
    REALIZADA("Consulta Realizada!"),
    CANCELADA("Consulta Cancelada!");

    private final String status; //fazer primeiro

    StatusConsulta(String status) {
        this.status = status;
    } //construtor

    public String getDescrição() {
        return status;
    } //getter
}
