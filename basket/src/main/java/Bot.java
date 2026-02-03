public class Bot implements Runnable {
    private GestoreFile gf;
    private Azione azione;
    public Bot(GestoreFile gf, Azione azione) {
        this.gf=gf;
        this.azione=azione;
    }
    @Override
    public void run() {
        boolean salvataggio = false;
        for (int i=0; i<3; i++) {
            int x = (int) (Math.random() * 2) + 1;
            if (x == 0 && !salvataggio) {
                gf.salvaSuFile(azione);
                salvataggio = true;
                System.out.println("Il bot " + this + " ha registrato una nuova azione.\n");
            } else {
                Azione a1 = gf.leggiDaFile();
                if (a1 != null) {
                    System.out.println("Il bot " + this + "ha letto " + a1.toString());
                }
            }
        }
    }
}