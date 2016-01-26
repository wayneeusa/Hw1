import java.util.Iterator;

/**
 * Created by wayne on 1/23/16.
 */
public class findIntersection {


    public static void main(String[] args){

        ListADT<String> list1 = new SimpleArrayList<>();

        ListADT<String> list2 = new SimpleArrayList<>();



        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("D");

        list2.add("Z");
        list2.add("D");
        list2.add("Y");
        list2.add("B");
        list2.add("X");

        System.out.println(list1.toString());
       System.out.println( intersection(list1, list2).toString());

        //System.out.println(list1);








    }

    public static <E> ListADT<E> intersection(ListADT<E> list1, ListADT<E> list2) {

        ListADT<E> resultList = new SimpleArrayList<E>();

        SimpleArrayListIterator itr = new SimpleArrayListIterator((SimpleArrayList) list1);

        SimpleArrayListIterator itr2 = new SimpleArrayListIterator((SimpleArrayList) list2);

        while (itr.hasNext()) {
            Object nextLetter = itr.next();
            while (itr2.hasNext()) {
                Object nextLetter2 = itr2.next();

                if (nextLetter == nextLetter2){
                    resultList.add((E) nextLetter);
                }


            }
        }

            return resultList;

    }



}
