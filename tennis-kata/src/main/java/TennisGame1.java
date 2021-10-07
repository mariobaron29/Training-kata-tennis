
public class TennisGame1 implements TennisGame {
    
    private int m_puntaje1 = 0;
    private int m_puntaje2 = 0;
    private String nombreJugador1;
    private String nombreJugador2;

    public TennisGame1(String nombreJugador1, String nombreJugador2) {
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
        int tempPuntaje=0;
        if (m_puntaje1 == m_puntaje2)
        {
            switch (m_puntaje1)
            {
                case 0:
                        puntaje = "Amor-Todos";
                    break;
                case 1:
                        puntaje = "Quince-Todos";
                    break;
                case 2:
                        puntaje = "Treinta-Todos";
                    break;
                default:
                        puntaje = "Deuce";
                    break;
                
            }
        }
        else if (m_puntaje1 >=4 || m_puntaje2 >=4)
        {
            int minusResult = m_puntaje1 - m_puntaje2;
            if (minusResult==1) puntaje ="Ventaja jugador1";
            else if (minusResult ==-1) puntaje ="Ventaja jugador2";
            else if (minusResult>=2) puntaje = "Gana jugador1";
            else puntaje ="Gana jugador2";
        }
        else
        {
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
        }
        return puntaje;
    }
}
