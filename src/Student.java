import java.util.Stack;

public class Student {

    public static void main(String[] args) {
        // Create a stack
        Stack<String> stackOfCards = new Stack<>();

        // push
        stackOfCards.push("Jack");
        stackOfCards.push("King");
        stackOfCards.push("Queen");
        stackOfCards.push("Ace");

        System.out.println("original stack : " + stackOfCards);

        // pop
        String cardAtTop =  stackOfCards.pop();
        System.out.println("pop card at top : " + cardAtTop);
        System.out.println("pop then stack is : " + stackOfCards);

        // peek
        String peekAboo = stackOfCards.peek();
        System.out.println("peek is " + peekAboo);
        System.out.println("peek then stack is " + stackOfCards);
    }
}
