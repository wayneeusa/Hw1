/**
 * Created by wayne on 1/23/16.
 */

import java.util.ArrayList;
import java.util.*;

public class SimpleArrayList<E> implements ListADT<E>  {

    ArrayList<E> list = new ArrayList<E>();
    private int numItems;


    public SimpleArrayList() {


        numItems = 0;
    }



    public void add(E item) {

        list.add(item);
        numItems++;

    }

    public void add(int pos, E item) {

        list.add(pos, item);
        numItems++;
    }

    public int size() {

        return list.size();
    }

    public boolean isEmpty() {

        return numItems == 0;
    }

    public E remove(int pos) {

        E temp = (E) list.get(pos);
        list.remove(pos);
        return temp;

    }

    public Iterator<Object> iterator() {
        return new SimpleArrayListIterator(this);
    }

}
