import java.util.*;

/**
 * Created by Nicolas on 6/2/2016.
 */
public class Mazo {

    public List<Map<Integer, List<Carta>>> listCarta = new LinkedList();

    public Mazo(Carta carta){
        listCarta = carta.cargarCartas();
    }

    public List<Map<Integer, List<Carta>>> getListCarta() {
        return listCarta;
    }


    @Override
    public String toString() {
        return "Mazo{" +
                ", setCarta=" + listCarta +
                '}';
    }
}
