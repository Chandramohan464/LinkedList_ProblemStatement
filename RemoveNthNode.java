//Remove Nth Node from End: Remove the Nth node from the end of a LinkedList.

import java.util.LinkedList;
import java.util.Scanner;

public class RemoveNthNode {
    
    public static void removeNthNode(LinkedList<Integer> list,int n){

        int size=list.size();

        if(n>0&&n<=size){
            int indexToRemove=size-n;
            list.remove(indexToRemove);
        }
        else{
            System.out.println("Invalid input");
        }
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Enter the index to remove from last node");
        int n=sc.nextInt();
        removeNthNode(list,n);

        System.out.println(list);
        sc.close();
    }
}
