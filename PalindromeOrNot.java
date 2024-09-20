//Palindrome Check: Determine if a LinkedList is a palindrome.

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class PalindromeOrNot {
    
    public static void main(String[] args) {
        
        LinkedList<Character> list=new LinkedList<>();
        list.add('R');
        list.add('A');
        list.add('C');
        list.add('E');
        list.add('C');
        list.add('A');
        list.add('R');

        if(checkPalindrome(list)){
            System.out.println("Given Character Linked List is Palindrome");
        }
        else{
            System.out.println("Given Character Linked List is not Palindrome");
        }
    }

    private static boolean checkPalindrome(LinkedList<Character> list) {
        
        List<Character> reversedList = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--){
            reversedList.add(list.get(i));
        }

        Iterator<Character> itr=list.iterator();
        Iterator<Character> itr2=reversedList.iterator();
        while(itr.hasNext()){
            if(itr.next()!=itr2.next()){
                return false;
            }
        }

        return true;
    }
}
