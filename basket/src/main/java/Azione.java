import java.time.Duration;

public class Azione {
    private String tipoAzione;
    private int punti;
    private String inizio;
    private String fine;
    private Giocatore giocatore;
    private Partita partita;

    public Azione(String tipoAzione, int punti, String inizio, String fine, Giocatore giocatore,  Partita partita) {
        this.tipoAzione = tipoAzione;
        this.punti = punti;
        this.inizio = inizio;
        this.fine = fine;
        this.giocatore = giocatore;
        this.partita = partita;
    }
    public String getTipoAzione() {
        return tipoAzione;
    }
    public void setTipoAzione(String tipoAzione) {
        this.tipoAzione = tipoAzione;
    }
    public int getPunti() {
        return punti;
    }
    public void setPunti(int punti) {
        this.punti = punti;
    }
    public String getInizio() {
        return inizio;
    }
    public void setInizio(String inizio) {
        this.inizio = inizio;
    }
    public String getFine() {
        return fine;
    }
    public void setFine(String fine) {
        this.fine = fine;
    }
    public Giocatore getGiocatore() {
        return giocatore;
    }
    public void setGiocatore(Giocatore giocatore) {
        this.giocatore = giocatore;
    }

    @Override
    public String toString() {
        return "Azione{" +
                "tipoAzione='" + tipoAzione + '\'' +
                ", punti=" + punti +
                ", inizio='" + inizio + '\'' +
                ", fine='" + fine + '\'' +
                ", giocatore=" + giocatore +
                ", partita=" + partita +
                '}';
    }
}