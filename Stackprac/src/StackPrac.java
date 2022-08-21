import java.util.ArrayList;
public class StackPrac {
    private int topOfStack;

    static ArrayList myStack= new ArrayList<>();
    public StackPrac() {

        this.topOfStack = -1;

    }
    public void push(int y) {
       myStack.add(y);
       topOfStack++;
    }
    public void pop() {
        myStack.remove(topOfStack);
        topOfStack--;
    }

    public void peek() {

        System.out.println(myStack.get(topOfStack));
    }
    public String toString() {
        return myStack.toString();
    }

    public static void main(String[] args) {
       StackPrac Stack = new StackPrac();
       Stack.push(45);
       Stack.push(48);
       Stack.push(422);
       Stack.pop();
       Stack.peek();
       System.out.println(myStack.toString());
    }
}