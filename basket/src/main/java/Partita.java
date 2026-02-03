public class Partita {
    private String squadraCasa;
    private String squadraTrasferta;
    private int punteggioCasa;
    private int punteggioTrasferta;
    private String data;

    public Partita(String squadraCasa, String squadraTrasferta, int punteggioCasa, int punteggioTrasferta, String data ){
        this.squadraCasa = squadraCasa;
        this.squadraTrasferta = squadraTrasferta;
        this.punteggioCasa = punteggioCasa;
        this.punteggioTrasferta = punteggioTrasferta;
        this.data = data;
    }
    public String getSquadraCasa() {
        return squadraCasa;
    }
    public void setSquadraCasa(String squadraCasa) {
        this.squadraCasa = squadraCasa;
    }
    public String getSquadraTrasferta() {
        return squadraTrasferta;
    }
    public void setSquadraTrasferta(String squadraTrasferta) {
        this.squadraTrasferta = squadraTrasferta;
    }
    public int getPunteggioCasa() {
        return punteggioCasa;
    }
    public void setPunteggioCasa(int punteggioCasa) {
        this.punteggioCasa = punteggioCasa;
    }
    public int getPunteggioTrasferta() {
        return punteggioTrasferta;
    }
    public void setPunteggioTrasferta(int punteggioTrasferta) {
        this.punteggioTrasferta = punteggioTrasferta;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Partita{" +
                "squadraCasa='" + squadraCasa + '\'' +
                ", squadraTrasferta='" + squadraTrasferta + '\'' +
                ", punteggioCasa=" + punteggioCasa +
                ", punteggioTrasferta=" + punteggioTrasferta +
                ", data='" + data + '\'' +
                '}';
    }
}