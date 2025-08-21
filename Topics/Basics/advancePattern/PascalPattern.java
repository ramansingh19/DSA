package advancePattern;

public class PascalPattern {
        // Function to find factorial (needed for binomial coefficient)
        public static int factorial(int n) {
            int fact = 1;
            for (int i = 2; i <= n; i++) {
                fact *= i;
            }
            return fact;
        }

        // Function to calculate Binomial Coefficient: nCr = n! / (r! * (n-r)!)
        public static int binomialCoeff(int n, int r) {
            return factorial(n) / (factorial(r) * factorial(n - r));
        }

        // Main method to print Pascal's Triangle
        public static void printPascalsTriangle(int rows) {
            for (int i = 0; i < rows; i++) {
                // Print leading spaces for pyramid shape
                for (int space = 0; space < rows - i; space++) {
                    System.out.print(" ");
                }

                // Print values
                for (int j = 0; j <= i; j++) {
                    System.out.print(binomialCoeff(i, j) + " ");
                }

                System.out.println();
            }
        }

        public static void main(String[] args) {
//            int n = 5;
            factorial(7);// You can change this
            printPascalsTriangle(7);
        }
}

