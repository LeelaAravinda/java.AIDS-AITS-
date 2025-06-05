public class MaxStackMain {
    public static void main(String[] args) {
        maxStack maxStack = new maxStack();
        maxStack.push(10);
        maxStack.push(20);
        maxStack.push(5);
		maxStack.pop();
        System.out.println("Top element: " + maxStack.top()); 
        System.out.println("Maximum element: " + maxStack.getMax()); 
	}
}