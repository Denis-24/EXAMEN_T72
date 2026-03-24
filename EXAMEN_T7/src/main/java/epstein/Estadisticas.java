package epstein;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Estadisticas implements Informes{
    private Map<Famoso,Integer> estadisticas = new HashMap<>();

    public Estadisticas(Map<Famoso, Integer> estadisticas) {
        this.estadisticas = estadisticas;
    }


    @Override
    public void verPoliticos() {

    }

    @Override
    public void informesJuzgado() {

    }

    @Override
    public void verRanking() {

    }

    public Map<String, Integer> getEstadisticas() {
        return estadisticas;
    }

    public void setEstadisticas(Map<String, Integer> estadisticas) {
        this.estadisticas = estadisticas;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Estadisticas that = (Estadisticas) o;
        return Objects.equals(estadisticas, that.estadisticas);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(estadisticas);
    }
}
