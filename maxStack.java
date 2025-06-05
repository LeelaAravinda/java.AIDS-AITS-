import java.util.Stack;
class maxStack{
    Stack<Integer> stack;
    Stack<Integer> maxStack;
    public maxStack(){
       stack=new Stack<>();
       maxStack=new Stack<>();
    }
void push(int value){
    stack.push(value);
    if(maxStack.isEmpty()||value >=maxStack.peek()){
       maxStack.push(value);
       }else{
            maxStack.push(maxStack.peek());
    }
}
public void pop(){
       stack.pop();
       maxStack.pop();
}
public int top(){
       return stack.peek();
}
public int getMax(){
        return maxStack.peek();
  }
}