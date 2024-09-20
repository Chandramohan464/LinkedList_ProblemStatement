// Intersection of Two LinkedLists: Find the intersection point of two LinkedLists.

import java.util.LinkedList;

public class IntersectionList {
    
    public static void main(String[] args) {
        
        LinkedList<Integer> list1=new LinkedList<>();
        LinkedList<Integer> list2=new LinkedList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list2.add(7);

        LinkedList<Integer> intersection=findIntersectionElements(list1,list2);

        System.out.println("Intersected LinkedList is: "+intersection);
    }

    private static LinkedList<Integer> findIntersectionElements(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        
        LinkedList<Integer> intersection=new LinkedList<>();

        for (Integer integer : list1) {
            if(list2.contains(integer)&&!intersection.contains(integer)){
                intersection.add(integer);
            }
        }

        return intersection;
    }
}
