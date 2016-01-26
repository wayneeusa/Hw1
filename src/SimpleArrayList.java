/**
 * Created by wayne on 1/23/16.
 */

import java.util.ArrayList;
import java.util.*;
import java.util.Iterator;

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

    public E get(int pos){

        return list.get(pos);
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

    @Override
    public String toString() {

        String returnList = "";

        for (int i = 0; i < this.size(); i++) {

             returnList = returnList + " " + this.get(i);

        }

        return returnList;

    }
}
