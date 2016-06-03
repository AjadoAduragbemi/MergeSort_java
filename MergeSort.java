import java.util.*;

public class MergeSort<T extends Comparable<T>> {
    private Vector<T> vec_list;
    
    private Vector<T> mergeSort(Vector<T> left, Vector<T> right){
        /* sort then merge */
        Vector<T> result = new Vector<>();
        int l_index = 0, r_index = 0;
        
        while(l_index < left.size() && r_index < right.size()){
            if(left.get(l_index).compareTo(right.get(r_index)) < 0){
                result.addElement(left.get(l_index));
                l_index++;
            } else {
                result.addElement(right.get(r_index));
                r_index++;
            }
        }
        
        while(l_index < left.size()){
            result.addElement(left.get(l_index));
            l_index++;
        }
        
        while(r_index < right.size()){
            result.addElement(right.get(r_index));
            r_index++;
        }
        return  result;
    }
    
    private Vector<T> mSort(Vector<T> list){
        int list_len = list.size();
        int mid = list_len/2;
        Vector<T> left = new Vector<>(),
                  right = new Vector<>();
        
        if(mid < 1) return list;
        
        /* append first half to left */
        for(int i = 0; i < mid; i++){
            left.addElement(list.get(i));
        }
        /* append 2nd half to right */
        for(int i = mid; i < list_len; i++){
            right.addElement(list.get(i));
        }
        
        left = mSort(left);
        right = mSort(right);
        
        return mergeSort(left, right);
    }
    
    public MergeSort(){}
    public MergeSort(T[] list_items){
        getElems(list_items);
    }
    
    public Vector<T> mergeSort(){
        return mSort(vec_list);
    }
    
    public void getElems(T[] arr){
        vec_list = new Vector<>();
        /* initialize vector with array content */
        for(T i : arr){
            vec_list.addElement(i);
        }
    }
}
