import java.util.Stack;

public class DailyWear {

        public static void main(String[] args) {
            // Create a stack
            Stack<String> stackOfClothes = new Stack<>();

            stackOfClothes.push("Jeans");
            stackOfClothes.push("Blouse");
            stackOfClothes.push("Coat");
            stackOfClothes.push("Sweater");

            System.out.println("original stack : " + stackOfClothes);

            String clothesAtTop =  stackOfClothes.pop();
            System.out.println("pop card at top : " + clothesAtTop);
            System.out.println("pop then stack is : " + stackOfClothes);

            String peekAboo = stackOfClothes.peek();
            System.out.println("peek is " + peekAboo);
            System.out.println("peek then stack is " + stackOfClothes);
        }

}

