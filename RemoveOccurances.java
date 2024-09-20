//Remove All Occurrences: Remove all occurrences of a given value in a LinkedList.

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;;

public class RemoveOccurances {
    
    public static void main(String[] args) {
        
        LinkedList<Integer> list=new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(2);
        list.add(1);
        list.add(3);

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element to be removed");
        int removingElement=sc.nextInt();

        Iterator<Integer> itr=list.iterator();
        while(itr.hasNext()){
            if(itr.next()==removingElement){
                itr.remove();
            }
        }

        System.out.println(list);
        sc.close();
    }
}
