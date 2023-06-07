import java.util.Comparator;

public class ComparaArticuloPorUnidades implements Comparator<Articulo> {
    public int compare(Articulo articulo1, Articulo articulo2) {
        return Double.compare(articulo2.getExistencias(), articulo1.getExistencias());
    }
}
