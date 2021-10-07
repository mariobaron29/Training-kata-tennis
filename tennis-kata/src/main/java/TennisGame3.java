
public class TennisGame3 implements TennisGame {
    
    private int p2;
    private int p1;
    private String p1N;
    private String p2N;

    public TennisGame3(String p1N, String p2N) {
        this.p1N = p1N;
        this.p2N = p2N;
    }

    public String getPuntaje() {
        String s;
        if (p1 < 4 && p2 < 4 && !(p1 + p2 == 6)) {
            String[] p = new String[]{"Amor", "Quince", "Treinta", "Cuarenta"}; 
            s = p[p1];
            return (p1 == p2) ? s + "-Todos" : s + "-" + p[p2];
        } else {
            if (p1 == p2)
                return "Deuce";
            s = p1 > p2 ? p1N : p2N;
            return ((p1-p2)*(p1-p2) == 1) ? "Ventaja " + s : "Gana " + s;
        }
    }
    
    public void ganoPunto(String nombreJugador) {
        if (nombreJugador == "jugador1")
            this.p1 += 1;
        else
            this.p2 += 1;
        
    }

}
