import java.util.*;
public class SimpleStack{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        GenSimpleStack<String> stack=new GenSimpleStack<>();
        while(true){
            n=sc.nextInt();
            switch (n){
                case 1:
                    try{
                        stack.push(sc.next());
                    }catch(StackFullException e){
                        System.out.print("[Full-5] ");
 //                       System.out.print(e.toString());
                    }
                    break;
                case 2:
                    try{
                        stack.pop();
                    }catch(StackEmptyException e){
                        System.out.print("[Empty] ");
                    }
                    break;
                case 0:
                    System.exit(1);
                    break;
                default:
                    System.exit(1);
            }
        }
    }
}
interface IGenSimpleStack<T>{
    void push(T n);
    void pop();
}
class GenSimpleStack<T>{
    int size=5; 
    ArrayList<T> arr=new ArrayList<>();
    //T[] arr=new T[5];
    int index=-1;
    public void push(T n) throws StackFullException{
        if(index!=size-1){
            arr.add(n);
            index++;
        }else{
            throw new StackFullException();
            //System.out.print("[Full-5] ");
        }
        //System.out.println(arr.toString());
    }
    public void pop() throws StackEmptyException{
        if(index==-1){
            throw new StackEmptyException();
            //System.out.print("[Empty] ");
        }else{
            System.out.print(arr.get(index)+" ");
            /*for(int i=index;i>=0;i--){
                System.out.print(arr.get(i)+" ");
            }*/
            arr.remove(index);
            //System.out.println(arr.toString());
            index--;
        }
    }
}

/* Declare StackFullException class */
class StackFullException extends Exception{
    public StackFullException(){
        super();
    }
    /*public void toString(){
        return "[Full-5] "
    }*/
}
class StackEmptyException extends Exception{
    public StackEmptyException(){
        super();
    }

}
