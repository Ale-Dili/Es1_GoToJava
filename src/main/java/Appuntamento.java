public class Appuntamento {
    private int giorno;
    private int oraInizio;
    private int oraFine;

    public Appuntamento(int giorno, int oraInizio, int oraFine) {
        this.giorno = giorno;
        this.oraInizio = oraInizio;
        this.oraFine = oraFine;
    }

    public void setGiorno(int giorno) {
        this.giorno = giorno;
    }

    public void setOraInizio(int oraInizio) {
        this.oraInizio = oraInizio;
    }

    public void setOraFine(int oraFine) {
        this.oraFine = oraFine;
    }

    public int getGiorno() {
        return giorno;
    }

    public int getOraInizio() {
        return oraInizio;
    }

    public int getOraFine() {
        return oraFine;
    }
}
