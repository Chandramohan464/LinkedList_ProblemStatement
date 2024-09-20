// Merge Sorted Lists: Merge two sorted LinkedLists into one sorted list.

import java.util.Collections;
import java.util.LinkedList;

public class MergeSortedList {
    
    public static void main(String[] args) {
        
        LinkedList<Integer> list1=new LinkedList<>();
        list1.add(1);
        list1.add(3);
        list1.add(5);

        LinkedList<Integer> list2=new LinkedList<>();
        list2.add(2);
        list2.add(4);
        list2.add(6);

        mergeAndSortList(list1,list2);
    }

    private static void mergeAndSortList(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        
        LinkedList<Integer> mergedList = new LinkedList<>();
        mergedList.addAll(list1);
        mergedList.addAll(list2);
        Collections.sort(mergedList);
        System.out.println(mergedList);
    }
}
