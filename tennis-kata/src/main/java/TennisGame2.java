
public class TennisGame2 implements TennisGame
{
    public int P1puntos = 0;
    public int P2puntos = 0;
    
    public String P1res = "";
    public String P2res = "";
    private String nombreJugador1;
    private String nombreJugador2;

    public TennisGame2(String nombreJugador1, String nombreJugador2) {
        this.nombreJugador1 = nombreJugador1;
        this.nombreJugador2 = nombreJugador2;
    }

    public String getPuntaje(){
        String score = "";
        if (P1puntos == P2puntos && P1puntos < 4)
        {
            if (P1puntos ==0)
                score = "Amor";
            if (P1puntos ==1)
                score = "Quince";
            if (P1puntos ==2)
                score = "Treinta";
            score += "-Todos";
        }
        if (P1puntos == P2puntos && P1puntos >=3)
            score = "Deuce";
        
        if (P1puntos > 0 && P2puntos ==0)
        {
            if (P1puntos ==1)
                P1res = "Quince";
            if (P1puntos ==2)
                P1res = "Treinta";
            if (P1puntos ==3)
                P1res = "Cuarenta";
            
            P2res = "Amor";
            score = P1res + "-" + P2res;
        }
        if (P2puntos > 0 && P1puntos ==0)
        {
            if (P2puntos ==1)
                P2res = "Quince";
            if (P2puntos ==2)
                P2res = "Treinta";
            if (P2puntos ==3)
                P2res = "Cuarenta";
            
            P1res = "Amor";
            score = P1res + "-" + P2res;
        }
        
        if (P1puntos > P2puntos && P1puntos < 4)
        {
            if (P1puntos ==2)
                P1res="Treinta";
            if (P1puntos ==3)
                P1res="Cuarenta";
            if (P2puntos ==1)
                P2res="Quince";
            if (P2puntos ==2)
                P2res="Treinta";
            score = P1res + "-" + P2res;
        }
        if (P2puntos > P1puntos && P2puntos < 4)
        {
            if (P2puntos ==2)
                P2res="Treinta";
            if (P2puntos ==3)
                P2res="Cuarenta";
            if (P1puntos ==1)
                P1res="Quince";
            if (P1puntos ==2)
                P1res="Treinta";
            score = P1res + "-" + P2res;
        }
        
        if (P1puntos > P2puntos && P2puntos >= 3)
        {
            score = "Ventaja jugador1";
        }
        
        if (P2puntos > P1puntos && P1puntos >= 3)
        {
            score = "Ventaja jugador2";
        }
        
        if (P1puntos >=4 && P2puntos >=0 && (P1puntos - P2puntos)>=2)
        {
            score = "Gana jugador1";
        }
        if (P2puntos >=4 && P1puntos >=0 && (P2puntos - P1puntos)>=2)
        {
            score = "Gana jugador2";
        }
        return score;
    }
    
    public void SetP1Punto(int number){
        
        for (int i = 0; i < number; i++)
        {
            P1Puntaje();
        }
            
    }
    
    public void SetP2Punto(int number){
        
        for (int i = 0; i < number; i++)
        {
            P2Puntaje();
        }
            
    }
    
    public void P1Puntaje(){
        P1puntos++;
    }
    
    public void P2Puntaje(){
        P2puntos++;
    }

    public void ganoPunto(String nombreJugador) {
        if (nombreJugador == "jugador1")
            P1Puntaje();
        else
            P2Puntaje();
    }
}