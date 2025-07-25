package TaskLambdaExpressionsandFunctionalInterface;


@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class Sample1 {
    public static void main(String[] args) {
        
        MathOperation addition = (int x, int y) -> x + y;
        MathOperation subtraction = (int x, int y) -> x - y;
        MathOperation multiplication = (int x, int y) -> x * y;

        
        System.out.println("Addition: " + addition.operate(10, 20));
        System.out.println("Subtraction: " + subtraction.operate(30, 15));
        System.out.println("Multiplication: " + multiplication.operate(5, 6));
    }
}



//Task 11: Lambda with Functional Interface
// Create a FunctionalInterface named MathOperation
//o Method: int operate(int a, int b)
// Use lambda expressions for:
//o Addition
//o Subtraction
//o Multiplication
// Call each lambda in main().
