import java.util.Stack;
public class StackDemo
{
    public static void main(String[] args)
    {
        Stack<Integer> stack = new Stack<Integer>();

        stack.push(25);
        stack.push(70);
        stack.push(35);
        stack.push(40);
        stack.push(45);
        stack.push(50);

        System.out.println("Elements of stack: " + stack);

        System.out.println("Elements at the top: " + stack.peek());

        System.out.println("Position of element 50: " + stack.search(50));

        System.out.println();

        while(stack.size() > 0)
        {
            System.out.println("Removed element: " + stack.pop());
        }

        System.out.println("Is stack empty: " + stack.empty());
    }
}