

import java.util.*;

public class HashSetDemo {
   public static void main(String args[]) {
   // create hash set
   HashSet <String> newset = new HashSet <String>();
                  
   // populate hash set
   newset.add("Hi"); 
   newset.add("I am");
   newset.add("betping");  
      
   // create an iterator
   Iterator iterator = newset.iterator(); 
      
   // check values
   while (iterator.hasNext()){
   System.out.println("Value: "+iterator.next() + " ");  
   }
   }    
}

