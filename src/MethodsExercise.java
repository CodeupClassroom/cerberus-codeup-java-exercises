public class MethodsExercise {

    public static void main(String[] args) {
        double result = addition(1, 2);
        System.out.println(result);

        result = multiplication(2, 5);
        System.out.println(result);

        doSomeFactorials();
    }

    private static double addition(int a, int b) {
        return a + b;
    }

    private static double multiplication(int a, int b) {
//        return a * b;
//        int sum = 0;
//        for (int i = 0; i < b; i++) {
//            sum += a;
//        }
//        return sum;
        if(b == 0) {
            return 0;
        }
        if(b == 1) {
            return a;
        }
        return a + multiplication(a, b - 1);
    }

    private static void doSomeFactorials() {
        /*
        1. Prompt the user to enter an integer from 1 to 10.

        2. Display the factorial of the number entered by the user.

        3. Ask if the user wants to continue.

        4. Use a for loop to calculate the factorial.

        5. Assume that the user will enter an integer, but verify it’s between 1 and 10.

        6. Use the long type to store the factorial.

        7. Continue only if the user agrees to.

         */
    }
}
