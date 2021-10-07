import java.util.HashMap;
import java.util.Map;

public class TennisGame1Refactored implements TennisGame {
    
    private int m_puntaje1 = 0;
    private int m_puntaje2 = 0;
    private String nombreJugador1;
    private String nombreJugador2;

    public TennisGame1Refactored(String nombreJugador1, String nombreJugador2) {
        this.nombreJugador1 = nombreJugador1;
        this.nombreJugador2 = nombreJugador2;
    }

    public void ganoPunto(String nombreJugador) {
        if (nombreJugador == "jugador1")
            m_puntaje1 += 1;
        else
            m_puntaje2 += 1;
    }

    public String getPuntaje() {
        String puntaje = "";
        int tempPuntaje;
        if (m_puntaje1 == m_puntaje2)
        {
           return calcularEmpate();
        }

        if (m_puntaje1 >=4 || m_puntaje2 >=4)
        {
            return getResult();
        }

        for (int i=1; i<3; i++)
        {
            if (i==1) tempPuntaje = m_puntaje1;
            else { puntaje+="-"; tempPuntaje = m_puntaje2;}
            switch(tempPuntaje)
            {
                case 0:
                    puntaje+="Amor";
                    break;
                case 1:
                    puntaje+="Quince";
                    break;
                case 2:
                    puntaje+="Treinta";
                    break;
                case 3:
                    puntaje+="Cuarenta";
                    break;
            }
        }

        return puntaje;
    }

    private String getResult() {
        String puntaje;
        int minusResult = m_puntaje1 - m_puntaje2;
        if (minusResult==1) puntaje ="Ventaja jugador1";
        else if (minusResult ==-1) puntaje ="Ventaja jugador2";
        else if (minusResult>=2) puntaje = "Gana jugador1";
        else puntaje ="Gana jugador2";

        return puntaje;
    }

    public String calcularEmpate(){
        Map<Integer, String> puntajes = new HashMap<>();
        puntajes.put(0,"Amor-Todos");
        puntajes.put(1,"Quince-Todos");
        puntajes.put(2,"Treinta-Todos");

        return puntajes.getOrDefault(m_puntaje1,"Deuce");


    }

}
