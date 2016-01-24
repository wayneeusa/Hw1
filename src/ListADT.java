/**
 * Created by wayne on 1/23/16.
 */
public interface ListADT<E> {

    void add(E item);

    void add(int pos, E item);

    int size();

    boolean isEmpty();

    E remove(int pos);

}
