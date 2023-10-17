// Basic operations such as adding, deleting , modifying and iterating the data using LinkedList

import java.util.*;
public class ImplementationOfLinkedList {
    public static void main(String[] args) {
        //Creating a linked list
        LinkedList<String> list = new LinkedList();
        //Adding elements without specifying their indices
        list.add("a");
        list.add("b");
        list.add("c");
        //Adding elements with specifying their index          
        list.add(3,"d");
         System.out.println(list);              //[a, b, c, d]

         //modifying the values of nodes 
         list.set(0,"A");
         System.out.println(list);              //[A, b, c, d]

         //removing a node (this can be done either by specifying the element or their index)
         list.remove(0);
         list.remove("c");
         System.out.println(list);              //[b, d]


         //Iterationg through a linkedlist (We can also use a usual for each loop )

         for(int i=0;i<list.size();i++){        //b
            System.out.println(list.get(i));    //d
         }

         //Converting the list into an Array
         LinkedList<String> list2 = new LinkedList();
         list2.add("Hello");
         list2.add("guys");
         list2.add("how");
         list2.add("are");
         list2.add("you");
         list2.add("doing?");
         Object[] arr = list2.toArray();
         for(Object i : arr){
            System.out.println(i);
         }
         /* The Output for the above snippet of code is as follows :
          * Hello
            guys
            how
            are
            you
            doing?
          */
    }
    
}
