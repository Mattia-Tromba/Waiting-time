import java.io.*;
public class Main {

    public static void main(String[] args) {
        GestoreFile gf = new GestoreFile();
        Partita p = new Partita("Hornets", "Warriors", 125, 112, "2026, 30, 1");
        Giocatore g = new Giocatore("LaMelo", "Ball", "Hornets", 1);
        Azione a1 = new Azione("Canestro", 2, "10:26", "10:27", g, p);
        Bot b1 = new Bot(gf, a1);
        Bot b2 = new Bot(gf, a1);
        Bot b3 = new Bot(gf, a1);
        Bot b4 = new Bot(gf, a1);
    }
}