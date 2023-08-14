

import java.util.Stack;



public class Stack1 {
    
    public static void main(String[] args)
    {
 
        // Default initialization of Stack
        Stack stack1 = new Stack();
 
        // Initialization of Stack
        // using Generics
        Stack<String> stack2 = new Stack<String>();
 
        // pushing the elements
        stack1.push("Hey");
        stack1.push("Good");
        stack1.push("morning");
 
        stack2.push("Dude");
        stack2.push("all,");
        stack2.push("good");
 
          // Printing the Stack Elements
        System.out.println(stack1);
        System.out.println(stack2);
        System.out.println("Poppy" +stack1.pop());
}
}
