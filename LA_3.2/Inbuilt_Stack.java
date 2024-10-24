import java.util.*;
public class StackMain {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        final int MAX = 5;
        Stack<String> stack = new Stack<String>();
        while (true) {
            System.out.println("Enter 1 for push,2 for pop,3 for peek,0 for exit");
            int ch =sc.nextInt();
            switch(ch){
                case 0:
                    System.out.println("Exiting");
                    System.exit(1);
                    break;
                case 1:
                    if(stack.size()==MAX){
                        System.out.println("stack is full");
                    }
                    else{
                        stack.push(sc.next());
                    }
                    break;
                case 2:
                    try{
                        String s=stack.pop();
                        System.out.println("popped element is "+s);
                    }
                    catch(EmptyStackException e){
                        System.out.println("stack is empty");
                    }
                    break;
                case 3:
                    try{
                        String c=stack.peek();
                        System.out.println("Stack top element is "+c);
                    }
                    catch(EmptyStackException se){
                        System.out.println("Stack is empty no peek element");
                    }
                    break;
                default:
                    System.out.println("invalid input");
                    break;
            }
        }
    }

} 