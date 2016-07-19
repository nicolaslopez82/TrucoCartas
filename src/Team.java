import java.util.List;

/**
 * Created by Nicolas on 5/29/2016.
 */
public class Team {

    private String name;
    private List<Jugador> jugadorList;

    public Team(String name, List<Jugador> jugadorList) {
        this.name = name;
        this.jugadorList = jugadorList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", jugadorList=" + jugadorList +
                '}';
    }

    public List<Jugador> getJugadorList() {
        return jugadorList;
    }

    public void setJugadorList(List<Jugador> jugadorList) {
        this.jugadorList = jugadorList;
    }
}
