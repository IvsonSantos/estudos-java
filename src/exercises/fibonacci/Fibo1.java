package exercises.fibonacci;

public class Fibo1 {

    /*
    Input: N = 10
    Output: 0 1 1 2 3 5 8 13 21 34

    Input: N = 15
    Output: 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377
     */
    static void Fibonacci(int n) {
        int num1 = 0;
        int num2 = 1;
        int counter = 0;

        while (counter < n) {
            System.out.print(num1 + " ");
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            counter++;
        }
    }

    public static void main(String args[]) {
        int N = 15;
        Fibonacci(N);
    }
}
