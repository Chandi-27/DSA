public class stack {
    private static Object[] stackarray;
    private static int size;
    private int top;
    public stack(int size){
        this.size=size;
        this.top=-1;
        stackarray=new Object[size];
    }
    public void push(Object value)
    {
        if(top==size-1){
            System.out.println("stack is full");
        }
        else{
            top++;
            stackarray[top]=value;
        }
    }
    public Object pop()
    {
        if(top==-1){
            System.out.println("Stack is empty");
        }
        else{
            int oldtop=top;
            top--;
            stackarray[oldtop]=null;
            return stackarray[top];
        }
        return top;
    }
    // public Object pop()
    // {
    //     if(top==-1){
    //         System.out.println("Stack is empty");
    //     }
    //     else{
    //         int oldtop=top;
    //         top--;
    //         stackarray[oldtop]=null;
    //         return stackarray[oldtop];
    //     }
    // }
    public Object peek()
    {
        return stackarray[top];
    }
    public static void main(String args[]){
        stack s=new stack(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.pop();
		for(int i=0;i<size;i++){
            System.out.println(stackarray[i]);
        }
    }
    
}
