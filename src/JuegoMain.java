import java.util.*;

/**
 * Created by Nicolas on 5/22/2016.
 */
public class JuegoMain {

    public static void main(String [] arg)
    {
        Jugador jugador_1 = new Jugador();
        jugador_1.setName("Nicolas");
        jugador_1.setScore(3);
        System.out.println(jugador_1.toString());

        Jugador jugador_2 = new Jugador("Jon Snow", 0);
        System.out.println(jugador_2.toString());


        Mazo mazo = new Mazo(new Carta());
        //System.out.println(mazo.toString());

        //Iterating over the employees in the set
        System.out.println("Set after sorting: ");

        for(Map<Integer, List<Carta>> maldito: mazo.getListCarta()){
            System.out.println("Valor Carta Truco: " + maldito.keySet() + " --- Valor Carta: " + maldito.values());
        }
    }
}
