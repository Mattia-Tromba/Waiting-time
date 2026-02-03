public class Giocatore {
    private String nome;
    private String cognome;
    private String squadra;
    private int numeroMaglia;

    public Giocatore(String nome, String cognome, String squadra, int numeroMaglia) {
        this.nome = nome;
        this.cognome = cognome;
        this.squadra = squadra;
        this.numeroMaglia = numeroMaglia;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSquadra(String squadra) {
        this.squadra = squadra;
    }
    public void setNumeroMaglia(int numeroMaglia) {
        this.numeroMaglia = numeroMaglia;
    }
    public String getNome() {
        return nome;
    }
    public String getCognome() {
        return cognome;
    }
    public String getSquadra() {
        return squadra;
    }
    public int getNumeroMaglia() {
        return numeroMaglia;
    }

    @Override
    public String toString() {
        return "Giocatore{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", squadra='" + squadra + '\'' +
                ", numeroMaglia=" + numeroMaglia +
                '}';
    }
}