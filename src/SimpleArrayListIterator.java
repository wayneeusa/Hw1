/**
 * Created by wayne on 1/23/16.
 */

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.*;
import java.lang.*;

public class SimpleArrayListIterator<E> implements Iterator<E> {

    // *** fields ***
    private SimpleArrayList<E> list;  // the list we're iterating over
    private int curPos;            // the position of the next item

    // *** constructor ***
    public SimpleArrayListIterator(SimpleArrayList<E> list) {
        this.list = list;
        curPos = 0;
    }

    // *** methods ***

    public boolean hasNext() {
        return curPos < list.size();
    }

    public E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        E result = list.get(curPos);
        curPos++;
        return result;
    }
    /*
    public void remove() {
        throw new UnsupportedOperationException();
        }
        */

}


