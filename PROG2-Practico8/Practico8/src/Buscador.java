import java.util.Collection;

public class Buscador<T extends Identificable<K>, K> {
    public T buscar(Collection<? extends T> elements, K id) {
        for (T element : elements) {
            if (element.tieneMismoID(id)) {
                return element;
            }
        }
        return null;
    }
}