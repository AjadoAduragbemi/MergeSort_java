package mergesort;

import java.util.*;

/**
 *
 * @author Aduragbemi Joseph (Wells)
 */
public class Main {
    public static void main(String[] args) {
        Integer[] iList = {11,5,8,2,3,1,13,7,4,};
        MergeSort<Integer> items = new MergeSort<>(iList);
        
        Vector<Integer> resI = items.mergeSort();
        
        Iterator iIt = resI.iterator();
        while(iIt.hasNext()){
            System.out.print(iIt.next() + ", ");
        }
        System.out.println();
        
        
        
        String[] sList = {"Oliver Queen","Barry Allen",
                          "Bruce Wayne","Princess Diana",
                          "Clark Kent", "Alan Scott",
                          "J'onn j'onzz", "..."};
        MergeSort sItems = new MergeSort();
        sItems.getElems(sList);
        
        Vector resS = sItems.mergeSort();
        Iterator sIt = resS.iterator();
        while(sIt.hasNext()){
            System.out.println(sIt.next());
        }
    }   
}
