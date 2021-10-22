###ARRAY LIST


import java.util.*;
public class ArrayListLoopExample {
    public static void main(String args[]) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(3);
        al.add(17);
        al.add(6);
        al.add(9);
        al.add(7);
        System.out.println("Using Advanced For Loop");   
        
        for (Integer num : al) {         
            System.out.println(num);   
        }
    }
}





##LINKED LIST


import java.util.*;
  
public class Test {
  
    public static void main(String args[])
    {
        LinkedList<String> ll  = new LinkedList<String>();
        ll.add("A");
        ll.add("B");
        ll.addLast("C");
        ll.addFirst("D");
        ll.add(2, "E");
        System.out.println(ll);
        ll.remove("B");
        ll.remove(3);
        ll.removeFirst();
        ll.removeLast();
  
        System.out.println(ll);
    }
}




###HASHSET


import java.util.*;
  
class HashSetDemo {
  
    
    public static void main(String[] args)
    {
        HashSet<String> h = new HashSet<String>();
        h.add("India");
        h.add("Australia");
        h.add("South Africa");
        h.add("India"); 
        System.out.println(h);
        System.out.println("List contains India or not:"+ h.contains("India"));
        h.remove("Australia");
        System.out.println("List after removing Australia:" + h);
        System.out.println("Iterating over list:");
        Iterator<String> i = h.iterator();
        while (i.hasNext())
            System.out.println(i.next());
    }
}





###PRIORITY QUEUE


import java.util.*;
  
class HashSetDemo {
  
    
    public static void main(String[] args)
    {
        HashSet<String> h = new HashSet<String>();
        h.add("India");
        h.add("Australia");
        h.add("South Africa");
        h.add("India");
        System.out.println(h);
        System.out.println("List contains India or not:"  + h.contains("India"));      
        h.remove("Australia");
        System.out.println("List after removing Australia:" + h);
        System.out.println("Iterating over list:");
        Iterator<String> i = h.iterator();
        while (i.hasNext())
            System.out.println(i.next());
    }
}




###STACK

import java.util.Stack;
 public class StackExample
 {
 
 public static void main(String argvs[])
 {
     
     Stack<Integer> stk = new Stack<Integer>()
     stk.push(9);
     stk.push(5);
     stk.push(7);
     stk.push(14);
     stk.push(29);
     int size = stk.size();
     System.out.println("The size of the stack is: " + size);
     System.out.println("The stack contains: " + stk);
 }
 } 

