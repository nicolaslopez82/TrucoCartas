import java.util.*;

/**
 * Created by Nicolas on 6/1/2016.
 */
public class Carta implements Comparable{

    private String palo;

    private int numero;

    //Valor 4
    public static final int VALOR_CUATROS = 1;

    //Valor 5
    public static final int VALOR_CINCOS = 2;

    //Valor 6
    public static final int VALOR_SEIS = 3;

    //Valor 7 Basto $ Copa
    public static final int VALOR_SIETES = 4;

    //Valor 10
    public static final int VALOR_REYES_DIEZ = 5;

    //Valor 11
    public static final int VALOR_REYES_ONCE = 6;

    //Valor 12
    public static final int VALOR_REYES_DOCE = 7;

    //Valor Ancho Falso
    public static final int VALOR_ANCHO_FALSO = 8;

    //Valor 2
    public static final int VALOR_DOS = 9;

    //Valor 3
    public static final int VALOR_TRES = 10;

    //Valor 7 Oro
    public static final int VALOR_SIETE_ORO = 11;

    //Valor 7 Espada
    public static final int VALOR_SIETE_ESPADA = 12;

    //Valor 1 Palo
    public static final int VALOR_ANCHO_BASTO = 13;

    //Valor 1 Espada
    public static final int VALOR_ANCHO_ESPADA = 14;

    //Valores de palos.
    public static final String VALOR_ESPADA = "Espada";

    public static final String VALOR_ORO = "Oro";

    public static final String VALOR_COPA = "Copa";

    public static final String VALOR_BASTO = "Basto";



    public Carta(){}

    private Carta(String palo, int numero){
        super();
        this.palo = palo;
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public List<Map<Integer, List<Carta>>> cargarCartas(){

        List<Map<Integer, List<Carta>>> listCartas = new LinkedList();

        listCartas.add(cargarValorCuatros());
        listCartas.add(cargarValorCincos());
        listCartas.add(cargarValorSeis());
        listCartas.add(cargarValorSietes());
        listCartas.add(cargarValorDiez());
        listCartas.add(cargarValorOnce());
        listCartas.add(cargarValorDoce());
        listCartas.add(cargarValorAnchosFalsos());
        listCartas.add(cargarValorDos());
        listCartas.add(cargarValorTres());
        listCartas.add(cargarValorSieteOro());
        listCartas.add(cargarValorSieteEspada());
        listCartas.add(cargarValorAnchoBasto());
        listCartas.add(cargarValorAnchoEspada());

        return listCartas;
    }

    private Map<Integer, List<Carta>> cargarValorCuatros(){

        Map<Integer, List<Carta>> mapCarta = new HashMap<>();
        List<Carta> cartaList = new LinkedList<Carta>();

        cartaList.add(new Carta(VALOR_ESPADA, 4));
        cartaList.add(new Carta(VALOR_ORO, 4));
        cartaList.add(new Carta(VALOR_COPA, 4));
        cartaList.add(new Carta(VALOR_BASTO, 4));

        mapCarta.put(VALOR_CUATROS, cartaList );
        return mapCarta;
    }

    private Map<Integer, List<Carta>> cargarValorCincos(){

        Map<Integer, List<Carta>> mapCarta = new HashMap<>();
        List<Carta> cartaList = new LinkedList();

        cartaList.add(new Carta(VALOR_ESPADA, 5));
        cartaList.add(new Carta(VALOR_ORO, 5));
        cartaList.add(new Carta(VALOR_COPA, 5));
        cartaList.add(new Carta(VALOR_BASTO, 5));

        mapCarta.put(VALOR_CINCOS, cartaList );
        return mapCarta;
    }

    private Map<Integer, List<Carta>> cargarValorSeis(){

        Map<Integer, List<Carta>> mapCarta = new HashMap<>();
        List<Carta> cartaList = new LinkedList();

        cartaList.add(new Carta(VALOR_ESPADA, 6));
        cartaList.add(new Carta(VALOR_ORO, 6));
        cartaList.add(new Carta(VALOR_COPA, 6));
        cartaList.add(new Carta(VALOR_BASTO, 6));

        mapCarta.put(VALOR_SEIS, cartaList );
        return mapCarta;
    }

    private Map<Integer, List<Carta>> cargarValorSietes(){

        Map<Integer, List<Carta>> mapCarta = new HashMap<>();
        List<Carta> cartaList = new LinkedList();

        cartaList.add(new Carta(VALOR_COPA, 7));
        cartaList.add(new Carta(VALOR_BASTO, 7));

        mapCarta.put(VALOR_SIETES, cartaList );
        return mapCarta;
    }

    private Map<Integer, List<Carta>> cargarValorDiez(){

        Map<Integer, List<Carta>> mapCarta = new HashMap<>();
        List<Carta> cartaList = new LinkedList();

        cartaList.add(new Carta(VALOR_ESPADA, 10));
        cartaList.add(new Carta(VALOR_ORO, 10));
        cartaList.add(new Carta(VALOR_COPA, 10));
        cartaList.add(new Carta(VALOR_BASTO, 10));

        mapCarta.put(VALOR_REYES_DIEZ, cartaList );
        return mapCarta;
    }

    private Map<Integer, List<Carta>> cargarValorOnce(){

        Map<Integer, List<Carta>> mapCarta = new HashMap<>();
        List<Carta> cartaList = new LinkedList();

        cartaList.add(new Carta(VALOR_ESPADA, 11));
        cartaList.add(new Carta(VALOR_ORO, 11));
        cartaList.add(new Carta(VALOR_COPA, 11));
        cartaList.add(new Carta(VALOR_BASTO, 11));

        mapCarta.put(VALOR_REYES_ONCE, cartaList );
        return mapCarta;
    }

    private Map<Integer, List<Carta>> cargarValorDoce(){

        Map<Integer, List<Carta>> mapCarta = new HashMap<>();
        List<Carta> cartaList = new LinkedList();

        cartaList.add(new Carta(VALOR_ESPADA, 12));
        cartaList.add(new Carta(VALOR_ORO, 12));
        cartaList.add(new Carta(VALOR_COPA, 12));
        cartaList.add(new Carta(VALOR_BASTO, 12));

        mapCarta.put(VALOR_REYES_DOCE, cartaList );
        return mapCarta;
    }

    private Map<Integer, List<Carta>> cargarValorAnchosFalsos(){

        Map<Integer, List<Carta>> mapCarta = new HashMap<>();
        List<Carta> cartaList = new LinkedList();

        cartaList.add(new Carta(VALOR_ORO, 1));
        cartaList.add(new Carta(VALOR_COPA, 1));

        mapCarta.put(VALOR_ANCHO_FALSO, cartaList );
        return mapCarta;
    }

    private Map<Integer, List<Carta>> cargarValorDos(){

        Map<Integer, List<Carta>> mapCarta = new HashMap<>();
        List<Carta> cartaList = new LinkedList();

        cartaList.add(new Carta(VALOR_ESPADA, 2));
        cartaList.add(new Carta(VALOR_ORO, 2));
        cartaList.add(new Carta(VALOR_COPA, 2));
        cartaList.add(new Carta(VALOR_BASTO, 2));

        mapCarta.put(VALOR_DOS, cartaList );
        return mapCarta;
    }

    private Map<Integer, List<Carta>> cargarValorTres(){

        Map<Integer, List<Carta>> mapCarta = new HashMap<>();
        List<Carta> cartaList = new LinkedList();

        cartaList.add(new Carta(VALOR_ESPADA, 3));
        cartaList.add(new Carta(VALOR_ORO, 3));
        cartaList.add(new Carta(VALOR_COPA, 3));
        cartaList.add(new Carta(VALOR_BASTO, 3));

        mapCarta.put(VALOR_TRES, cartaList );
        return mapCarta;
    }

    private Map<Integer, List<Carta>> cargarValorSieteOro(){

        Map<Integer, List<Carta>> mapCarta = new HashMap<>();
        List<Carta> cartaList = new LinkedList();

        cartaList.add(new Carta(VALOR_ORO, 7));

        mapCarta.put(VALOR_SIETE_ORO, cartaList );
        return mapCarta;
    }

    private Map<Integer, List<Carta>> cargarValorSieteEspada(){

        Map<Integer, List<Carta>> mapCarta = new HashMap<>();
        List<Carta> cartaList = new LinkedList();

        cartaList.add(new Carta(VALOR_ESPADA, 7));

        mapCarta.put(VALOR_SIETE_ESPADA, cartaList );
        return mapCarta;
    }

    private Map<Integer, List<Carta>> cargarValorAnchoBasto(){

        Map<Integer, List<Carta>> mapCarta = new HashMap<>();
        List<Carta> cartaList = new LinkedList();

        cartaList.add(new Carta(VALOR_BASTO, 1));

        mapCarta.put(VALOR_ANCHO_BASTO, cartaList );
        return mapCarta;
    }

    private Map<Integer, List<Carta>> cargarValorAnchoEspada(){

        Map<Integer, List<Carta>> mapCarta = new HashMap<>();
        List<Carta> cartaList = new LinkedList();

        cartaList.add(new Carta(VALOR_ESPADA, 1));

        mapCarta.put(VALOR_ANCHO_ESPADA, cartaList );
        return mapCarta;
    }


    @Override
    public String toString() {
        return "Carta{" +
                "palo='" + palo + '\'' +
                ", numero=" + numero +
                '}';
    }

    @Override
    public int compareTo(Object o) {

        Carta cartaO = (Carta) o;

        //ascending order
        return this.getNumero() - cartaO.getNumero();

        //descending order
        //return cartaO.getNumero() - this.getNumero();
    }
}
