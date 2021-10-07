import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TennisTest {

    private int jugador1Puntaje;
    private int jugador2Puntaje;
    private String puntajeEsperado;

    public TennisTest(int jugador1Puntaje, int jugador2Puntaje, String puntajeEsperado) {
        this.jugador1Puntaje = jugador1Puntaje;
        this.jugador2Puntaje = jugador2Puntaje;
        this.puntajeEsperado = puntajeEsperado;
    }
    
    @Parameters
    public static Collection<Object[]> getTodosPuntajes() {
        return Arrays.asList(new Object[][] {
                { 0, 0, "Amor-Todos" },
                { 1, 1, "Quince-Todos" },
                { 2, 2, "Treinta-Todos"},
                { 3, 3, "Deuce"},
                { 4, 4, "Deuce"},
                
                { 1, 0, "Quince-Amor"},
                { 0, 1, "Amor-Quince"},
                { 2, 0, "Treinta-Amor"},
                { 0, 2, "Amor-Treinta"},
                { 3, 0, "Cuarenta-Amor"},
                { 0, 3, "Amor-Cuarenta"},
                { 4, 0, "Gana jugador1"},
                { 0, 4, "Gana jugador2"},
                
                { 2, 1, "Treinta-Quince"},
                { 1, 2, "Quince-Treinta"},
                { 3, 1, "Cuarenta-Quince"},
                { 1, 3, "Quince-Cuarenta"},
                { 4, 1, "Gana jugador1"},
                { 1, 4, "Gana jugador2"},

                { 3, 2, "Cuarenta-Treinta"},
                { 2, 3, "Treinta-Cuarenta"},
                { 4, 2, "Gana jugador1"},
                { 2, 4, "Gana jugador2"},
                
                { 4, 3, "Ventaja jugador1"},
                { 3, 4, "Ventaja jugador2"},
                { 5, 4, "Ventaja jugador1"},
                { 4, 5, "Ventaja jugador2"},
                { 15, 14, "Ventaja jugador1"},
                { 14, 15, "Ventaja jugador2"},

                { 6, 4, "Gana jugador1"},
                { 4, 6, "Gana jugador2"},
                { 16, 14, "Gana jugador1"},
                { 14, 16, "Gana jugador2"},
        });
    }

    public void checkTodosPuntajes(TennisGame game) {
        int puntajeMayor = Math.max(this.jugador1Puntaje, this.jugador2Puntaje);
        for (int i = 0; i < puntajeMayor; i++) {
            if (i < this.jugador1Puntaje)
                game.ganoPunto("jugador1");
            if (i < this.jugador2Puntaje)
                game.ganoPunto("jugador2");
        }
        assertEquals(this.puntajeEsperado, game.getPuntaje());
    }

    @Test
    public void checkTodosPuntajesTennisGame1() {
        TennisGame1Refactored game = new TennisGame1Refactored("jugador1", "jugador2");
        checkTodosPuntajes(game);
    }

    @Test
    public void checkTodosPuntajesTennisGame2() {
        TennisGame2 game = new TennisGame2("jugador1", "jugador2");
        checkTodosPuntajes(game);
    }

    @Test
    public void checkTodosPuntajesTennisGame3() {
        TennisGame3 game = new TennisGame3("jugador1", "jugador2");
        checkTodosPuntajes(game);
    }

}
