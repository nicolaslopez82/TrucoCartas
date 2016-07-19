/**
 * Created by Nicolas on 5/29/2016.
 */
public class Jugador {

    private static int id = 0;
    private String name;
    private int score;

    public Jugador(){
        id++;
    };

    public Jugador(String name, int score) {
        id++;
        this.name = name;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Jugador)) return false;

        Jugador jugador = (Jugador) o;

        if (getScore() != jugador.getScore()) return false;
        return getName().equals(jugador.getName());

    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getScore();
        return result;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "name='" + name + '\'' +
                "id='" + id + '\'' +
                ", score=" + score +
                '}';
    }
}
